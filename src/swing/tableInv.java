/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class tableInv extends JTable{
    
    public tableInv(){
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable j, Object o, boolean bln, boolean bln1, int i, int i1){
                tableHeader header = new tableHeader(o +"");
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

    public void add(Object[] data){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(data);
    }
    
    public void removeR(int row){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.removeRow(row);
    }
    
    public List<Object[]> getList(){
        List<Object[]> list = new ArrayList();
        DefaultTableModel model = (DefaultTableModel) getModel();
        boolean fin;
        for(int i=0;i<model.getRowCount();i++){
            final Object[] col = {"","","","","","",""};
            fin = false;
            for(int j=1;j<model.getColumnCount();j++){
                if(model.getValueAt(i, j) instanceof String){
                    String elet = (String) model.getValueAt(i, j);
                    if(fin = elet.isBlank()){
                        break;
                    }else{
                        col[j-1] = elet;
                    }
                }else{
                    int elet =(int) model.getValueAt(i, j);
                    if(fin = (elet == 0)){
                        break;
                    }else{
                        col[j-1] = elet;
                    }
                }
            }
            if(!fin){
                list.add(col);
            }else{
                break;
            }
        }
        return list;
        
    }
    
    public void Update(){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addTableModelListener((TableModelEvent e) -> {
            if(e.getType() == TableModelEvent.UPDATE){
                int row = e.getFirstRow();
                int column = e.getColumn();
                if(column >= 3 && column <= 5){
                    if(isInt((String) model.getValueAt(row, column))){
                        int pu = (isInt((String) model.getValueAt(row, 3))) ? Integer.parseInt((String) model.getValueAt(row, 3)) : 0;
                        int pv = (isInt((String) model.getValueAt(row, 4))) ? Integer.parseInt((String) model.getValueAt(row, 4)) : 0;
                        int nb = (isInt((String) model.getValueAt(row, 5))) ? Integer.parseInt((String) model.getValueAt(row, 5)) : 0;
                        
                        model.setValueAt(pu*nb, row, 7);
                        model.setValueAt((pv == 0 || pu == 0) ? 0 : ((pv-pu)*100)/pu,row, 6);
                    }else{
                        model.setValueAt("0", row, column);
                        JOptionPane.showMessageDialog(this, "Ce champ doit etre representee en chiffre", "Info", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                System.out.print("Changement lig : "+row+" col : "+column+"  "+model.getValueAt(row, column));
            }
        });
    }
    
    public boolean isInt(String v){
        if(v == null) return false;
        for(int i=0;i<v.length();i++){
            if(!chiffre(v.substring(i, i+1))) return false;
        }
        return true;
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
