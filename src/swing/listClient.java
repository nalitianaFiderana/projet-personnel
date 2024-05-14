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
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import model.model_cli;

/**
 *
 * @author home
 * @param <E>
 */
public class listClient<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    
    private EventPersonneSelected event;
    
    public void addEventPersonneSelected(EventPersonneSelected e){
        this.event = e;
    }
    
    public listClient(){  
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if(o instanceof model_cli cli){
                        selectedIndex = index;
                        if(event != null){
                            event.selected(index,cli);
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
               model_cli data;
               if(o instanceof model_cli){
                    data = (model_cli) o;
                }else{
                    data = new model_cli();
                }
               ClientItem item = new ClientItem(data,index+1);
               item.setSelected(selectedIndex == index);
               return item;
            }
        };
    }
    
    public void addItem(model_cli data){
        this.model.addElement(data);
    }
    
}
