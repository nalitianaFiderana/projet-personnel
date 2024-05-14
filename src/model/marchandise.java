/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author home
 */
public class marchandise{

    /**
     * @return the Unite
     */
    public String getUnite() {
        return Unite;
    }

    /**
     * @param Unite the Unite to set
     */
    public void setUnite(String Unite) {
        this.Unite = Unite;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the nombre
     */
    public int getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the prixAchat
     */
    public int getPrixAchat() {
        return prixAchat;
    }

    /**
     * @param prixAchat the prixAchat to set
     */
    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    /**
     * @return the prixVente
     */
    public int getPrixVente() {
        return prixVente;
    }

    /**
     * @param prixVente the prixVente to set
     */
    
    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getFournisseurName() {
        return fournisseurName;
    }
    
    private String nom;
    private int nombre;
    private String type;
    private int prixAchat;
    private int prixVente;
    private String Unite;
    private String fournisseurName;
    private String date;
    
    
    public marchandise(String nom,int nombre,String type,int prixAchat,int prixVente, String Unite){
        this.nom = nom;
        this.nombre = nombre;
        this.type = type;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.Unite = Unite;
    }
    public marchandise(String nom,int nombre,String type,int prixVente, String Unite){
        this.nom = nom;
        this.nombre = nombre;
        this.type = type;
        this.prixVente = prixVente;
        this.Unite = Unite;
    }
    public marchandise(String nom,int nombre,String type,int prixAchat,int prixVente, String Unite, String fournisseurName){
        this.fournisseurName = fournisseurName;
        this.nom = nom;
        this.nombre = nombre;
        this.type = type;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.Unite = Unite;
    }
    
    public marchandise(String date,String nom,int nombre,String type,int prixAchat,int prixVente, String Unite, String fournisseurName){
        this.date = date;
        this.fournisseurName = fournisseurName;
        this.nom = nom;
        this.nombre = nombre;
        this.type = type;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.Unite = Unite;
    }
    
    public marchandise(){}
}
