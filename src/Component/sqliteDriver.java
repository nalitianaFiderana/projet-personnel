/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import model.marchandise;
import model.model_cli;
import model.model_commande;
/**
 *
 * @author home
 */
public class sqliteDriver {
    private PreparedStatement pst;
    private ResultSet rs;
    
    public sqliteDriver(){}
    
    public static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/gestion_entreprise";
            return (Connection) DriverManager.getConnection(url,"root", "");
        }catch(ClassNotFoundException | SQLException e){
          System.out.println("Erreur a la BD");
          e.printStackTrace();
          return null;
        }
    }
    
    public void createClient(String nom, String prenom, String adresse, String telephone, long date){
        try{
            
            pst = (PreparedStatement) connect().prepareStatement("insert client(nom,prenom,adresse,telephone,crediteur,reste,totalAchat) values (?,?,?,?,?,?,?)");
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.setString(3, prenom + date);
            pst.setString(4, adresse);
            pst.setString(5,telephone);
            pst.setInt(6, 0);
            pst.setInt(7,0);
            pst.setInt(8,0);
            pst.executeUpdate();
            pst.close();
        }catch(SQLException e){
        }
    }
    
    public void createCommande(int total, int nombre_article, String id_unique,String id_client){
        
    }
    
    public void sell(model_cli client, marchandise[] march, model_commande comm){
        try{
            Statement st = (Statement) connect().createStatement();
            String id_uniqueCli;
            rs = st.executeQuery("select * from client where nom = '" + client.getNom() + "'");
            if(rs.wasNull()){
                long date = new Date().getTime();
                createClient(client.getNom(),client.getPrenom(), client.getAdresse(),client.getNumeroTel(), date);
                id_uniqueCli = client.getPrenom() + date;
                
            }else{
            }
        }catch(SQLException e){
        }
    };
}
