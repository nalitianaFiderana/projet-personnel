/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control;

import Component.EventMenuSelected;
import Component.csvWriter;
import Component.sqliteDriver;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComponent;
import page.AchatMarchandise;
import page.GArticle;
import page.GClient;
import page.GFournisseur;
import page.GInventaire;
import page.InventaireDetail;
import page.dashboard;
import page.pointDeVente;
import page.recherche;

/**
 *
 * @author home
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private dashboard dash;
    private recherche search;
    
    private pointDeVente pointV;
    private GClient Gcli;
    private AchatMarchandise AchMar;
    private GArticle Gart;
    private GFournisseur Gfou;
    private GInventaire Ginv;
    private InventaireDetail invD;
    public static Main instance;
    public static csvWriter csv;
    public static sqliteDriver db;
    
    
    public Main() {
        initComponents();
        newBD bd = new newBD();
        db = new sqliteDriver();
        csv = new csvWriter();
        if(bd.readData("base").isEmpty()){ bd.create();}
        if(instance == null){
            instance = this;
        }
        //initialisation
        dash = new dashboard();
        search = new recherche();
        Gcli = new GClient();
        AchMar = new AchatMarchandise();
        Gart = new GArticle();
        Gfou = new GFournisseur();
        Ginv = new GInventaire();
        
        this.setBackground(new Color(255,24,36));
        menu2.initMoving(Main.this);
        header1.resizeBTN(Main.this);
        init();
        //sp.getVerticalScrollBar().setUI(new scrollbar());
        menu2.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index){
                switch(index){
                    case 1:
                        pointV = new pointDeVente();
                        setForm(pointV);
                        break;
                    case 2:
                        setForm(Gcli);
                        break;
                    case 5:
                        setForm(AchMar);
                        break;
                    case 8:
                        setForm(Gart);
                        break;
                    case 9:
                        setForm(Ginv);
                        break;
                    case 10:
                        setForm(Gfou);
                        break;
                    default:
                        break;
                }
            }
        });
        //System.out.println("mety leizy"+header1.valueIsChanged());
        header1.getRenderSearchBar().addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                setForm(search);
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
            
        });
    }
    
    public void init(){
        setForm(dash);
    }
    public String Money(String chiffre){
        int j = 0;
        String s = "";
        for(int i = chiffre.length()-1;i>=0;i--){
            if(j == 3){
                s = chiffre.charAt(i) + " " + s;
                j = 0;
            }else{
                s = chiffre.charAt(i) + s;
            }
            j++;
        }
            return s;
    }
    public void redirection(int i, String param){
        String[] pm = param.split("_");
        switch(i){
            case 1:
                pointV = new pointDeVente();
                setForm(pointV);
                break;
            case 2:
                setForm(Gcli);
                break;
            case 5:
                setForm(AchMar);
                break;
            case 8:
                setForm(Gart);
                break;
            case 9:
                setForm(Ginv);
                break;
            case 10:
                setForm(Gfou);
                break;
            case 11:
                invD = new InventaireDetail(pm);
                setForm(invD);
                break;
            default:
                break;
                
        }
    }
    
    public void setForm(JComponent comp){
        main_panel.removeAll();
        main_panel.add(comp);
        main_panel.repaint();
        main_panel.revalidate();
        System.out.print(comp);
        System.out.println();
    }
    public GInventaire getGinv(){return this.Ginv;}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        menu2 = new Component.Menu();
        header1 = new Component.Header();
        main_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setPreferredSize(new java.awt.Dimension(1000, 575));

        menu2.setPreferredSize(new java.awt.Dimension(225, 575));

        main_panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                    .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Header header1;
    private javax.swing.JPanel main_panel;
    private Component.Menu menu2;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
