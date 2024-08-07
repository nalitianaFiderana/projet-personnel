/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package page;

import control.Main;
import javax.swing.border.EmptyBorder;
import swing.scrollbar;

/**
 *
 * @author lenovo
 */
public class InventaireDetail extends javax.swing.JPanel {

    /**
     * Creates new form InventaireDetail
     */
    public InventaireDetail() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUI(new scrollbar(false));
        jScrollPane1.setBorder(new EmptyBorder(0,0,0,0));
    }
    public InventaireDetail(String[] param) {
        initComponents();
        libellle.setText(param[0]);
        execu.setText(param[1]);
        date.setText(this.toDate(param[2]));
        benef.setText("Bénéfice : " +Main.instance.Money(param[3])+" Ar");
        jScrollPane1.getVerticalScrollBar().setUI(new scrollbar(false));
        jScrollPane1.setBorder(new EmptyBorder(0,0,0,0));
        int i = 0;
        for(String[] list : Main.csv.readData(param[0])){
            Object[] o = {++i,list[0],list[1],list[2],list[3],list[4],list[5],list[6]};
            tableInv1.add(o);  
        }
    }
    
    private String toDate(String d){
        String[] dt = d.split("/");
        System.out.println(d.length());
        String s = "";
        switch(dt[1]){
            case "1" -> s = "janvier";
            case "2" -> s = "février";
            case "3" -> s = "mars";
            case "4" -> s = "avril";
            case "5" -> s = "mai";
            case "6" -> s = "juin";
            case "7" -> s = "juillet";
            case "8" -> s = "août";
            case "9" -> s = "septembre";
            case "10" -> s = "octobre";
            case "11" -> s = "novembre";
            case "12" -> s = "décembre";
            default -> {
            }
        }
        return dt[0] + " " + s + " " + dt[2];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInv1 = new swing.tableInv();
        panelBorder1 = new swing.PanelBorder();
        libellle = new javax.swing.JLabel();
        execu = new javax.swing.JLabel();
        benef = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        tableInv1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nom", "Type", "Prix unitaire", "Prix de vente", "Nombre", "Bénéfice %", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInv1);

        panelBorder1.setBackground(new java.awt.Color(204, 204, 255));

        libellle.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        libellle.setForeground(new java.awt.Color(255, 255, 255));
        libellle.setText("Libellé");

        execu.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        execu.setForeground(new java.awt.Color(102, 153, 255));
        execu.setText("Executeur");

        benef.setFont(new java.awt.Font("Nakula", 1, 14)); // NOI18N
        benef.setForeground(new java.awt.Color(0, 204, 51));
        benef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        benef.setText("Benefice : 0");

        date.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("23 mai 2024");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(libellle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(execu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(benef, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(benef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(libellle)
                                .addGap(8, 8, 8)
                                .addComponent(execu)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel benef;
    private javax.swing.JLabel date;
    private javax.swing.JLabel execu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel libellle;
    private swing.PanelBorder panelBorder1;
    private swing.tableInv tableInv1;
    // End of variables declaration//GEN-END:variables
}
