/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import restaurant.entity.MenuItem;

/**
 *
 * @author ndaley
 */
@Stateless
public class MenuItemFacade extends AbstractFacade<MenuItem> {
    @PersistenceContext(unitName = "com.mycompany_Restaurant_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuItemFacade() {
        super(MenuItem.class);
    }
    
}
