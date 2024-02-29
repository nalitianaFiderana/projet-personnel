/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class table extends JTable{
    public table(){
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable j, Object o, boolean bln, boolean bln1, int i, int i1){
                tableHeader header = new tableHeader(o +"");
                if(i1 == 4){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class,new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable j, Object o, boolean selected, boolean bln1, int i, int i1){
                if(i1 != 4){
                  Component com = super.getTableCellRendererComponent(j, o, selected, bln1, i, i1);
                  com.setBackground(Color.WHITE);
                  setBorder(noFocusBorder);
                  com.setForeground((selected ? new Color(13,113,102) : new Color(102,102,102)));
                  return com;
                }else{
                    return new cellV();
                }
            }
        });
    }
    

    public void add(Object[] data){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(data);
    }
    
}
