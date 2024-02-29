/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author home
 */
public class Model_menu {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public menu_type getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(menu_type type) {
        this.type = type;
    }
    
    public Model_menu(){
    }
    
    public Model_menu(String icon, String name, menu_type type){
        this.icon = icon;
        this.name = name;
        this.type = type;
    }
    
    private String icon;
    private String name;
    private menu_type type; 
    
    public static enum menu_type{
        TITLE,MENU,EMPTY
    }
    
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/ressource/img/icon/"+this.icon+".png"));
    }
}
