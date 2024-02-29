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

/**
 *
 * @author home
 */
public class tableNorm extends JTable{

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

    /**
     * @return the posAction
     */
    public int getPosAction() {
        return posAction;
    }

    /**
     * @param posAction the posAction to set
     */
    public void setPosAction(int posAction) {
        this.posAction = posAction;
    }
    
    private int posAction = 0;
    
    private boolean eleg;
    
    public tableNorm(){
        
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(25);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable j, Object o, boolean bln, boolean bln1, int i, int i1){
                tableHeader header = new tableHeader(o +"");
                if(i1 == getPosAction() || i1 == 0){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class,new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable j, Object o, boolean selected, boolean bln1, int i, int i1){
                if(i1 != getPosAction()){
                    Component com = super.getTableCellRendererComponent(j, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(i1 == 0){
                        setHorizontalAlignment(JLabel.CENTER);
                    }
                    com.setForeground((selected ? new Color(13,113,102) : new Color(102,102,102)));
                    return com;
                }else{
                    return new cellSuppr();
                }
            }
        });
    }
    
    public tableNorm(boolean r){
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable j, Object o, boolean bln, boolean bln1, int i, int i1){
                tableHeader header = !eleg ? new tableHeader(o +"") : new tableHeader(o + "",eleg);
                return header;
            }
        });
        setDefaultRenderer(Object.class,new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable j, Object o, boolean selected, boolean bln1, int i, int i1){
                Component com = super.getTableCellRendererComponent(j, o, selected, bln1, i, i1);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if(i1 == 0){
                    setHorizontalAlignment(JLabel.CENTER);
                }
                com.setForeground((selected ? new Color(13,113,102) : new Color(102,102,102)));
                return com;
            }
        });
    }
}
