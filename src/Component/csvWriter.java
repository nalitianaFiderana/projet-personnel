/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.marchandise;
import model.model_cli;

/**
 *
 * @author home
 */
public class csvWriter {
    
    String currentDirectory = System.getProperty("user.dir");
    
    public csvWriter(){}
    
    public void deleteCSV(String filename){
        String filePath = this.currentDirectory + "/" + filename + ".csv";
        File file = new File(filePath);
        if(file.exists() && file.isFile()){
            if(file.delete()){
                JOptionPane.showMessageDialog(null, "Le fichier csv relatif a été supprimer", "Succès", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Erreur lors de la suppression", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Il n'y a plus de fichier csv relatif", "Erreur 404", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void writeThis(List<Object[]> lists,String date,int longueurTab,String nameFile) throws IOException{

        // Concaténez le nom du fichier CSV
        try (PrintWriter writer = new PrintWriter(new FileWriter(getPath(nameFile)))) {
            // Écriture de l'en-tête
            writer.println(date);
            
            // Données
            for(Object[] list : lists){
                String strCSV = "";
                for(int i=0;i<longueurTab;i++){
                    if(i!=longueurTab-1){
                        strCSV += list[i]+",";
                    }else{
                        strCSV += list[i]+"";
                    }
                }
                writer.print(strCSV);
                writer.println();
            }

            System.out.println("Le fichier CSV a été créé avec succès dans le répertoire courant.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<String[]> readData(String fileName) {
        List<String[]> result = new ArrayList<String[]>();
        try(BufferedReader br = new BufferedReader(new FileReader(getPath(fileName)))){
            for(String line = br.readLine(); line != null; line = br.readLine()){
                String[] oneData = line.split(",");
                result.add(oneData);
            }
            br.close();
        }catch(IOException e){
            System.out.println("erreur lors de la lecture");
        }
        return result;
    }
    public String getPath(String fileName){
        return this.currentDirectory + "/" + fileName + ".csv";
    }
    
    public void addMarchandise(marchandise ma,String date){
        try(FileWriter fw = new FileWriter(getPath("marchandise"),true); BufferedWriter bw = new BufferedWriter(fw)){
            if(this.readData("marchandise").isEmpty()){
                //entete
                bw.write("date,nom,nombre,prix unitaire,prix de vente,type,unite,fournisseur,echeance");
                bw.newLine();
                bw.write(date+","+ma.getNom()+","+ma.getNombre()+","+ma.getPrixAchat()+","+ma.getPrixVente()+","+ma.getType()+","+ma.getUnite()+","+ma.getFournisseurName()+","+ma.getDate());
            }else{
                bw.write(date+","+ma.getNom()+","+ma.getNombre()+","+ma.getPrixAchat()+","+ma.getPrixVente()+","+ma.getType()+","+ma.getUnite()+","+ma.getFournisseurName()+","+ma.getDate());
            }
            bw.newLine();
            bw.close();
        }catch(IOException e){
            System.out.println("erreur lors de l'ecriture de marchandise.csv");
        }
    }
    
    public void addPersonne(model_cli cli,boolean p){
        try(FileWriter fw = new FileWriter(getPath("client_fournisseur"),true); BufferedWriter bw = new BufferedWriter(fw)){
            if(this.readData("client_fournisseur").isEmpty()){
                //entete
                bw.write("nom,prenom,adresse,telephone,crediteur,reste,total achat,client");
                bw.newLine();
                bw.write(cli.getNom()+","+cli.getPrenom()+","+cli.getAdresse()+","+cli.getNumeroTel()+","+cli.isIsCreditor()+","+cli.getResteAPayer()+","+cli.getSommeAchat()+","+ p);
            }else{
                bw.write(cli.getNom()+","+cli.getPrenom()+","+cli.getAdresse()+","+cli.getNumeroTel()+","+cli.isIsCreditor()+","+cli.getResteAPayer()+","+cli.getSommeAchat()+","+p);
            }
            bw.newLine();
            bw.close();
        }catch(IOException e){
            System.out.println("erreur lors de l'ecriture de client_fournisseur.csv");
        }
    }
}
