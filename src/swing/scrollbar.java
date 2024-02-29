/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author home
 */
public class scrollbar extends BasicScrollBarUI{
    private boolean hor;
    
    public scrollbar(boolean h){
        hor = h;
    }
    
    private static final int THUMB_WIDTH = 10;
    
    @Override
    protected JButton createDecreaseButton(int orientation){
       return new JButton(){
           @Override
           public Dimension getPreferredSize(){
               return new Dimension(0,0);
           }
       };
    }
    
    @Override
    protected JButton createIncreaseButton(int orientation){
       return new JButton(){
           @Override
           public Dimension getPreferredSize(){
               return new Dimension(0,0);
           }
       };
    }
    
    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(trackBounds.x, trackBounds.y, !hor ? THUMB_WIDTH : trackBounds.width, hor ? THUMB_WIDTH : trackBounds.height);
    }
    
    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle th){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(th.x, th.y, !hor ? THUMB_WIDTH : th.width, hor ? THUMB_WIDTH : th.height);
    }
}
