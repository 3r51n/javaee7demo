/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.adem.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import org.adem.db.entity.Person;
import org.adem.db.facade.PersonFacade;

/**
 *
 * @author Adem
 */
@Stateless
public class PersonService {
    
    @Inject
    private PersonFacade personFacade;
    
    public void save(Person person){
        personFacade.create(person);
    }
    
}
