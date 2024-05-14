/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class date extends javax.swing.JPanel {

    /**
     * Creates new form date
     */
    
    public date() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(198, 208, 251));
        d.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if(!check()) d.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(!check()) d.setText("jj/mm/aaaa");
            }
            
        });
    }
    
    public String getDate(){
        return "jj/mm/aaaa".equals(d.getText()) ? "" : d.getText();
    }
    public void setDate(String s){
        d.setText(s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        d.setColumns(5);
        d.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        d.setForeground(new java.awt.Color(51, 102, 255));
        d.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d.setText("jj/mm/aaaa");
        d.setBorder(null);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
        if(!check()) JOptionPane.showMessageDialog(this, "Mauvais format de date", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_dActionPerformed

    @Override
    protected void paintComponent(Graphics grph){
        Graphics2D g2 = (Graphics2D) grph;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(getBackground());
        g2.fillRoundRect(0,0, getWidth(),getHeight(),15,15);
        g2.setColor(new Color(255,255,255,50));
        g2.drawLine((getWidth()/3)-8, 0, getWidth()/3, getHeight());
        g2.drawLine((getWidth()*2/3)-8, 0, getWidth()*2/3, getHeight());
        g2.drawLine((getWidth()*2/3)-8, 0, getWidth()*2/3, getHeight());
        g2.fillOval(0, -getHeight()/2-8, getWidth(), getHeight());
        g2.fillOval(0, -getHeight()/2, getWidth(), getHeight());
        super.paintComponent(grph);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField d;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
    public boolean check(){
        String dT = d.getText();
        System.out.println(dT);
        if(dT.length() == 10){
            if(("/".equals(dT.substring(2,3))) && ("/".equals(dT.substring(5,6)))){
                System.out.println("/ position ");
                return isDate(dT.substring(0, 2),dT.substring(3,5),dT.substring(6,10));
            }
        }
        return false;
    }
    
    private boolean isDate(String j, String m, String a){
        for(int i = 0;i<j.length();i++){
            if(!chiffre(j.substring(i,i+1))){
                System.out.println("Chiffre jour "+ i);
                return false;
            }
        }
        for(int i = 0;i<m.length();i++){
            if(!chiffre(m.substring(i,i+1))){
                System.out.println("Chiffre mois "+ i);
                return false;
            }
        }
        for(int i = 0;i<a.length();i++){
            if(!chiffre(a.substring(i,i+1))){
                System.out.println("Chiffre annee " + i);
                return false;
            }
        }
        
        int jour = Integer.decode(j);
        int mois = Integer.decode(m);
        
        
        if(mois > 12) return false;
        
        System.out.println("verification finale");
        
        switch(mois){
            case 1:
                if(jour <= 31 && jour > 0) return true;
            case 3:
                if(jour <= 31 && jour > 0) return true;
            case 5:
                if(jour <= 31 && jour > 0) return true;
            case 7:
                if(jour <= 31 && jour > 0) return true;
            case 8:
                if(jour <= 31 && jour > 0) return true;
            case 10:
                if(jour <= 31 && jour > 0) return true;
            case 12:
                if(jour <= 31 && jour > 0) return true;
            default:
                if(jour <= 30 && jour > 0) return true;
        }
        
        System.out.println("verification finale 4");
        
        return false;
    }
    public boolean chiffre(String c){
        return switch (c) {
            case "1" -> true;
            case "2" -> true;
            case "3" -> true;
            case "4" -> true;
            case "5" -> true;
            case "6" -> true;
            case "7" -> true;
            case "8" -> true;
            case "9" -> true;
            case "0" -> true;
            default -> false;
        };
    }
}
