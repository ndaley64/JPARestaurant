/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import restaurant.entity.MenuItem;
import restaurant.jsf.MenuItemController;

/**
 *
 * @author ndaley
 */
@Named(value = "menuItemBean")
@SessionScoped
public class MenuItemBean implements Serializable{
    private List<MenuItem> menuItems;
    @Inject
    private MenuItemController mic;
    private MenuItem selected;
    private List<MenuItem> filteredMenuItems;
    
    public MenuItemBean() {
    }
    
    @PostConstruct
    public void init(){
        menuItems = mic.getAllMenuItems();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItemController getAc() {
        return mic;
    }

    public void setAc(MenuItemController ac) {
        this.mic = ac;
    }

    public MenuItem getSelected() {
        return selected;
    }

    public void setSelected(MenuItem selected) {
        this.selected = selected;
    }

    public List<MenuItem> getFilteredMenuItems() {
        return filteredMenuItems;
    }

    public void setFilteredMenuItems(List<MenuItem> filteredMenuItems) {
        this.filteredMenuItems = filteredMenuItems;
    }
    
}
