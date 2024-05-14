/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import Component.EventPersonneSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;


/**
 *
 * @author lenovo
 */
public class listNormal<E extends Object> extends JList<E>  {
    private final DefaultListModel model;
    private int selectedIndex = -1;
    
    private EventPersonneSelected event;
    
    public void addEventPersonneSelected(EventPersonneSelected e){
        this.event = e;
    }
    
    public listNormal(){  
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if(o instanceof type typ){
                        selectedIndex = index;
                        if(event != null){
                            event.selected(index,typ);
                        }
                    }else{
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
            @Override
            public void mouseExited(MouseEvent me){
            }
        });
    }
    /**
     *
     * @return
     */
    @Override
    public ListCellRenderer<? super E> getCellRenderer(){
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
               String data;
               if(o instanceof String){
                    data = (String) o;
                }else{
                    data = new String();
                }
               type label = new type(data);
               label.setSelected(selectedIndex == index);
               return label;
            }
        };
    }
    
    public void addItem(String data){
        this.model.addElement(data);
    }
    
}
