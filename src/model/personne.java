/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author home
 */
public class personne {

    /**
     * @return the person_typ
     */
    public personne_type getPerson_typ() {
        return person_typ;
    }

    /**
     * @param person_typ the person_typ to set
     */
    public void setPerson_typ(personne_type person_typ) {
        this.person_typ = person_typ;
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
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the numeroTel
     */
    public String getNumeroTel() {
        return numeroTel;
    }

    /**
     * @param numeroTel the numeroTel to set
     */
    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }
    private String nom;
    private String prenom;
    private String adresse;
    private String numeroTel;
    private personne_type person_typ;
    
    public static enum personne_type{
        FOURNISSEUR,CLIENT
    }
    
    public personne(String nom, String prenom,String adresse,String numeroTel, personne_type person_typ){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroTel = numeroTel;
        this.person_typ = person_typ;
    }
    
    public personne(){}
    
}
