/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Component.csvWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author lenovo
 */
public class newBD extends csvWriter{
    public newBD(){}
    public void create(){
        try (PrintWriter writer = new PrintWriter(new FileWriter(getPath("base")))) {
            // Écriture de l'en-tête
            
            writer.println("nombre de facture,0,0");
            writer.println("nombre de client,0,0");
            writer.println("nombre d'inventaire,0,0");
            writer.println("nombre de marchandise,0,0");
            writer.println("Capital,0,0");
            writer.println("Stock,0,0");
            writer.println("Benefice,0,0");
            System.out.println("Le fichier CSV a été créé avec succès dans le répertoire courant.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(getPath("data")))) {
            writer.println("gros,laitier");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
