/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import Component.EventMenuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import model.Model_menu;

/**
 *
 * @author home
 * @param <E>
 */
public class listMenu<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
        
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected e){
        this.event = e;
    }
    
    public listMenu(){
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if(o instanceof Model_menu){
                        Model_menu menu = (Model_menu) o;
                        if(menu.getType() == Model_menu.menu_type.MENU){
                            selectedIndex = index;
                            if(event != null){
                                event.selected(index);
                            }
                        }
                    }else{
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
            @Override
            public void mouseExited(MouseEvent me){
                overIndex = -1;
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) {
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                if(index != overIndex){
                    Object o = model.getElementAt(index);
                    if(o instanceof Model_menu){
                        Model_menu menu = (Model_menu) o;
                        if(menu.getType() == Model_menu.menu_type.MENU){
                            overIndex = index;
                        }else{
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
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
                Model_menu data;
                if(o instanceof Model_menu){
                    data = (Model_menu) o;
                }else{
                    data = new Model_menu("",o + "", Model_menu.menu_type.EMPTY);
                }
                menuItem item = new menuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }
        };
    }
    
    public void addItem(Model_menu data){
        this.model.addElement(data);
    }
    
    
}
