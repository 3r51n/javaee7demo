/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.adem.db.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.adem.db.entity.Phone;

/**
 *
 * @author Adem
 */
@Stateless
public class PhoneFacade extends AbstractFacade<Phone> {
    @PersistenceContext(unitName = "demoUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PhoneFacade() {
        super(Phone.class);
    }
    
}
