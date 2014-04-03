/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant.jsf;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import restaurant.bean.MenuItemFacade;
import restaurant.entity.MenuItem;

@Named("menuItemController")
@SessionScoped
public class MenuItemController implements Serializable{
    @Inject
    private MenuItemFacade ejbFacade;

    public MenuItemController() {
    }

    public List<MenuItem> getAllMenuItems(){
        return ejbFacade.findAll();
    }
}
