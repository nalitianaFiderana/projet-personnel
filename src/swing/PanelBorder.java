/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author home
 */
public class PanelBorder extends JPanel{
    
    public PanelBorder() {
        setOpaque(false);
        setBackground(new Color(198, 208, 251));
    }
    
    @Override
    protected void paintComponent(Graphics grph){
        Graphics2D g2 = (Graphics2D) grph;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0,0, getWidth(),getHeight(),15,15);
        super.paintComponent(grph);
    }
        
}
