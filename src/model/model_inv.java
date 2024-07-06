/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class model_inv {

        public String libelle;
        public int total;
        public int benefice;
        public String executeur;
        public String date;
        
        public model_inv(String libelle, int total, int benefice, String executeur, String date){
            this.libelle = libelle;
            this.total = total;
            this.benefice = benefice;
            this.executeur = executeur;
            this.date = date;
        }
}
