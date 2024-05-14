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
import model.marchandise;
import model.model_cli;

/**
 *
 * @author home
 */
public class listMarchVente<E extends Object> extends JList<E>  {
    private final DefaultListModel model;
    
    private EventPersonneSelected event;
    
    public void addEventPersonneSelected(EventPersonneSelected e){
        this.event = e;
    }
    
    public listMarchVente(){
        model = new DefaultListModel();
        setModel(model);
        setLayoutOrientation(JList.HORIZONTAL_WRAP);
        setVisibleRowCount(1); // Une seule ligne visible
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me){
                   
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
               marchandise data;
               if(o instanceof marchandise){
                    data = (marchandise) o;
                }else{
                    data = new marchandise();
                }
               renduMarchandise item = new renduMarchandise(data);
               return item;
            }
        };
    }
    
    public void addItem(marchandise data){
        this.model.addElement(data);
    }
    
}
