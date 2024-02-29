/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author home
 */
public class model_commande {

    /**
     * @return the id_unique
     */
    public String getId_unique() {
        return id_unique;
    }

    /**
     * @param id_unique the id_unique to set
     */
    public void setId_unique(String id_unique) {
        this.id_unique = id_unique;
    }

    /**
     * @return the id_client
     */
    public String getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    /**
     * @return the facture
     */
    public String getFacture() {
        return facture;
    }

    /**
     * @param facture the facture to set
     */
    public void setFacture(String facture) {
        this.facture = facture;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the nombre_article
     */
    public int getNombre_article() {
        return nombre_article;
    }

    /**
     * @param nombre_article the nombre_article to set
     */
    public void setNombre_article(int nombre_article) {
        this.nombre_article = nombre_article;
    }
    
    private String facture;
    private String date;
    private int total;
    private int nombre_article;
    private String id_unique;
    private String id_client;
    
    public model_commande(){}
    
    public model_commande(String facture, String date, int total, int nombre_article){
        this.facture = facture;
        this.date = date;
        this.total = total;
        this.nombre_article = nombre_article;
    }
    
    public model_commande(String facture, String date, int total, int nombre_article, String id_unique){
        this.facture = facture;
        this.date = date;
        this.total = total;
        this.nombre_article = nombre_article;
        this.id_unique = id_unique;
    }
    
    
    public model_commande(String facture, String date, int total, int nombre_article, String id_unique,String id_client){
        this.facture = facture;
        this.date = date;
        this.total = total;
        this.nombre_article = nombre_article;
        this.id_unique = id_unique;
        this.id_client = id_client;
    }
}
