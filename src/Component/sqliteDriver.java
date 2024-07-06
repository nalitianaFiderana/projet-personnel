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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.marchandise;
import model.model_cli;
import model.model_commande;
import model.model_inv;
/**
 *
 * @author home
 */
public class sqliteDriver {
    private PreparedStatement prepare;
    private ResultSet result;
    
    public sqliteDriver(){}
    
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/reviewApp","perso","nalitiana");
        }catch(ClassNotFoundException | SQLException e){
          System.out.println("Erreur a la BD");
          e.printStackTrace();
          return null;
        }
    }
    
    public void createClient(String nom, String prenom, String adresse, String telephone, long date){
        try{
            
            prepare = (PreparedStatement) connect().prepareStatement("insert client(nom,prenom,adresse,telephone,crediteur,reste,totalAchat) values (?,?,?,?,?,?,?)");
            prepare.setString(1, nom);
            prepare.setString(2, prenom);
            prepare.setString(3, prenom + date);
            prepare.setString(4, adresse);
            prepare.setString(5,telephone);
            prepare.setInt(6, 0);
            prepare.setInt(7,0);
            prepare.setInt(8,0);
            prepare.executeUpdate();
            prepare.close();
        }catch(SQLException e){
        }
    }
    
    public void createCommande(int total, int nombre_article, String id_unique,String id_client){
        
    }
    public int getNbrInv(){
        String sql = "SELECT MAX(id) AS nb_inv FROM inventaire";
        try{
            prepare = this.connect().prepareStatement(sql);
            result =  prepare.executeQuery();
            if (result.next()){System.out.println(result.getInt("nb_inv")+" eto eh");return result.getInt("nb_inv");}
            return 0;
        }catch(Exception e){e.printStackTrace();}
        return 0;
    }
    
    public void insertInv(String libelle, int total, int benefice, String date,String executeur){
        String sql = "INSERT INTO inventaire (libelle,total,benefice,date,executeur) VALUES (?,?,?,?,?)";
        try{
            prepare = this.connect().prepareStatement(sql);
            prepare.setString(1,libelle);
            prepare.setInt(2,total);
            prepare.setInt(3,benefice);
            prepare.setString(4,date);
            prepare.setString(5, executeur);
            prepare.executeUpdate();
        }catch(Exception e){e.printStackTrace();}
    }
    
    public  List<model_inv> getInventaire(String param){
        String sql = "";
        List<model_inv> list = new ArrayList<model_inv>();
        if(!param.isEmpty()){
           if(!param.contains(" ")){
            String[] tab = param.split(" ");
            sql = "SELECT * FROM inventaire WHERE date = "+tab[0]+" and executeur = "+tab[1];
           }else{
               sql = "SELECT * FROM inventaire WHERE date = "+param;
           }
        }else{sql = "SELECT * FROM inventaire";}
        try{
            prepare = this.connect().prepareStatement(sql);
            result = prepare.executeQuery();
            while(result.next()){
                model_inv inv = new model_inv(result.getString("libelle"),result.getInt("total"),result.getInt("benefice"),result.getString("executeur"),result.getString("date"));
                list.add(inv);
            }
        }catch(Exception e){e.printStackTrace();}
        return list;
    }
    
    public boolean supprLib(String lib){
        String sql = "DELETE FROM inventaire WHERE libelle = ?";
        try{
            prepare = this.connect().prepareStatement(sql);
            prepare.setString(1, lib);
            prepare.executeUpdate();
        }catch(Exception e){e.printStackTrace(); return false;}
        return true;
    }
    
    public boolean isAdmin(String name, String pass, javax.swing.JPanel main){
        String sql = "SELECT * FROM user WHERE username = ? and password = ? ";
        
        try{
            if(name.isEmpty() && pass.isEmpty()){
                System.out.println("remplir les champs");
                JOptionPane.showMessageDialog(main, "Veuillez Remplir tous les champs", "Erreur!", JOptionPane.ERROR_MESSAGE);
            }else{
                prepare = this.connect().prepareStatement(sql);
                prepare.setString(1,name);
                prepare.setString(2,pass);
                result = prepare.executeQuery();
                if(result.next()){
                    System.out.println("entrer dans la bd");
                    JOptionPane.showMessageDialog(main, "vous êtes connecter", "Information", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }else{
                    System.out.println("il n'existe pas");
                  JOptionPane.showMessageDialog(main, "vous n'êtes pas encore un utilisateur, veuiller vous inscrire", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch(Exception e){e.printStackTrace();}
        return false;
    }
    
    public void addUser(String name, String pass,String email,javax.swing.JPanel main){
        if(pass.isEmpty() && name.isEmpty() && email.isEmpty()){
            JOptionPane.showMessageDialog(main, "Veuiller remplir les champs", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String sql = "INSERT INTO user (username,email,password) VALUES (?,?,?)";
            try{
                prepare = this.connect().prepareStatement(sql);
                prepare.setString(1,name);
                prepare.setString(2,email);
                prepare.setString(3,pass);
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(main, name+" est enregistré en tant qu'utilisateur", "Information", JOptionPane.INFORMATION_MESSAGE);
                
            }catch(Exception e){e.printStackTrace();}
            
        }
    }
    
    public void sell(model_cli client, marchandise[] march, model_commande comm){
        try{
            Statement st = (Statement) connect().createStatement();
            String id_uniqueCli;
            result = st.executeQuery("select * from client where nom = '" + client.getNom() + "'");
            if(result.wasNull()){
                long date = new Date().getTime();
                createClient(client.getNom(),client.getPrenom(), client.getAdresse(),client.getNumeroTel(), date);
                id_uniqueCli = client.getPrenom() + date;
                
            }else{
            }
        }catch(SQLException e){
        }
    };
}
