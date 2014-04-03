/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import restaurant.entity.Menuitems;

/**
 *
 * @author ndaley
 */
@Stateless
public class MenuitemsFacade extends AbstractFacade<Menuitems> {
    @PersistenceContext(unitName = "com.mycompany_Restaurant_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuitemsFacade() {
        super(Menuitems.class);
    }
    
}
