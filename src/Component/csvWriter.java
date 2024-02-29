/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author home
 */
public class csvWriter {
    public csvWriter(){}
    
    public void writeThis(List<Object[]> lists,String date,int longueurTab,String nameFile){
        String currentDirectory = System.getProperty("user.dir");
        
        

        // Concaténez le nom du fichier CSV
        String csvFilePath = currentDirectory + "/"+nameFile+".csv";

        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFilePath))) {
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
            }

            System.out.println("Le fichier CSV a été créé avec succès dans le répertoire courant.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
