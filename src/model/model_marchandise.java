/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author home
 */
public class model_marchandise {
    private static int id;
    public model_marchandise(){
        ++id;
    }
    
    public int getId(){
        return this.id;
    }
}
