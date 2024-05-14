/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author home
 */
public class buttonV extends JLabel{

    /**
     * @return the eleg
     */
    public boolean isEleg() {
        return eleg;
    }

    /**
     * @param eleg the eleg to set
     */
    public void setEleg(boolean eleg) {
        this.eleg = eleg;
    }
    
    private boolean eleg = false;
    
    public buttonV(){
        setText("Voir+");
        setFont(new Font("sansserif",1,15));
    }
    
    @Override
    public void paintComponent(Graphics gr){
        Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        if(!isEleg()){
            GradientPaint g = new GradientPaint(0,0,new Color(204,0,0),0,getHeight(),new Color(51,51,255));
            g2.setPaint(g);
        }else{
            g2.setPaint(Color.darkGray);
        }
        g2.fillRoundRect(0,0, getWidth(),getHeight(),15,15);
        super.paintComponent(gr);
    }

}
