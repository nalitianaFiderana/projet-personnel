/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author home
 */
public class model_cli extends personne{

    /**
     * @return the isCreditor
     */
    public boolean isIsCreditor() {
        return isCreditor;
    }

    /**
     * @param isCreditor the isCreditor to set
     */
    public void setIsCreditor(boolean isCreditor) {
        this.isCreditor = isCreditor;
    }

    /**
     * @return the resteAPayer
     */
    public int getResteAPayer() {
        return resteAPayer;
    }

    /**
     * @param resteAPayer the resteAPayer to set
     */
    public void setResteAPayer(int resteAPayer) {
        this.resteAPayer = resteAPayer;
    }

    /**
     * @return the sommeAchat
     */
    public int getSommeAchat() {
        return totalAchat;
    }

    /**
     * @param sommeAchat the sommeAchat to set
     */
    public void setSommeAchat(int sommeAchat) {
        this.totalAchat = sommeAchat;
    }
    
    private boolean isCreditor;
    private int resteAPayer;
    private int totalAchat;
    
    public model_cli(){}
    
    public model_cli(String nom, String prenom, String adresse, String numeroTel, boolean isCreditor, int resteAPayer, int totalAchat)
    {
        super(nom,prenom,adresse,numeroTel,personne.personne_type.CLIENT);
        this.isCreditor = isCreditor;
        this.resteAPayer = resteAPayer;
        this.totalAchat = totalAchat;
    }
    
}
