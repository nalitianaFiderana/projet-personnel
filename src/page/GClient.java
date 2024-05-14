/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package page;

import swing.scrollbar;

/**
 *
 * @author home
 */
public class GClient extends javax.swing.JPanel {

    /**
     * Creates new form GClient
     */
    public GClient() {
        initComponents();
        tableNorm2.setPosAction(5);
        tableNorm1.setPosAction(5);
        jScrollPane1.getVerticalScrollBar().setUI(new scrollbar(false));
        jScrollPane2.getVerticalScrollBar().setUI(new scrollbar(false));
        jScrollPane3.getVerticalScrollBar().setUI(new scrollbar(false));
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
        listClient1 = new swing.listClient<>();
        panelBorder1 = new swing.PanelBorder();
        panelBorder2 = new swing.PanelBorder();
        name = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        telephone = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableNorm2 = new swing.tableNorm();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNorm1 = new swing.tableNorm();
        jLabel3 = new javax.swing.JLabel();
        sommeTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sommeTotaldate = new javax.swing.JLabel();

        jScrollPane1.setBackground(new java.awt.Color(50, 47, 47));
        jScrollPane1.setBorder(null);

        listClient1.setBackground(new java.awt.Color(42, 41, 41));
        listClient1.setBorder(null);
        jScrollPane1.setViewportView(listClient1);

        panelBorder1.setBackground(new java.awt.Color(44, 62, 80));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setText("nom");

        adresse.setBackground(new java.awt.Color(153, 153, 153));
        adresse.setForeground(new java.awt.Color(153, 153, 153));
        adresse.setText("adresse");

        telephone.setBackground(new java.awt.Color(204, 204, 204));
        telephone.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        telephone.setForeground(new java.awt.Color(102, 102, 102));
        telephone.setText("numero");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adresse)
                .addGap(75, 75, 75)
                .addComponent(telephone)
                .addGap(16, 16, 16))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(adresse)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setBorder(null);

        tableNorm2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Numero facture", "Date", "Somme total", "Total article", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableNorm2);
        if (tableNorm2.getColumnModel().getColumnCount() > 0) {
            tableNorm2.getColumnModel().getColumn(0).setPreferredWidth(15);
            tableNorm2.getColumnModel().getColumn(1).setPreferredWidth(25);
            tableNorm2.getColumnModel().getColumn(2).setPreferredWidth(30);
            tableNorm2.getColumnModel().getColumn(3).setPreferredWidth(25);
            tableNorm2.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Liste des achats du client");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Liste des articles achetes le :  JJ/MM/AAAA");
        jLabel2.setMaximumSize(new java.awt.Dimension(111, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(111, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(111, 16));

        tableNorm1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nom", "Type", "Prix unitaire", "Total", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableNorm1);
        if (tableNorm1.getColumnModel().getColumnCount() > 0) {
            tableNorm1.getColumnModel().getColumn(0).setPreferredWidth(15);
            tableNorm1.getColumnModel().getColumn(1).setPreferredWidth(20);
            tableNorm1.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("La somme total des achats faite par nom : ");

        sommeTotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sommeTotal.setForeground(new java.awt.Color(102, 255, 255));
        sommeTotal.setText("0000");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("La somme total de l'achat du JJ/MM/AAAA : ");

        sommeTotaldate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sommeTotaldate.setForeground(new java.awt.Color(102, 255, 255));
        sommeTotaldate.setText("0000");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sommeTotaldate)
                            .addComponent(sommeTotal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sommeTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sommeTotaldate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private swing.listClient<String> listClient1;
    private javax.swing.JLabel name;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private javax.swing.JLabel sommeTotal;
    private javax.swing.JLabel sommeTotaldate;
    private swing.tableNorm tableNorm1;
    private swing.tableNorm tableNorm2;
    private javax.swing.JLabel telephone;
    // End of variables declaration//GEN-END:variables
}
