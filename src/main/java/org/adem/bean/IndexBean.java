/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.adem.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.adem.db.entity.Person;
import org.adem.db.entity.Phone;
import org.adem.service.PersonService;

/**
 *
 * @author Adem
 */
@SessionScoped
@Named(value = "indexBean")
public class IndexBean implements Serializable{

    @Inject
    private PersonService personService;
    @Inject
    private FalanBean falanBean;
    private Person person = new Person();
    private Phone gsm = new Phone();
    private Phone ev = new Phone();
    
    public IndexBean(){
        
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Phone getGsm() {
        return gsm;
    }

    public void setGsm(Phone gsm) {
        this.gsm = gsm;
    }

    public Phone getEv() {
        return ev;
    }

    public void setEv(Phone ev) {
        this.ev = ev;
    }
   
    public void savePerson(){
        List<Phone> phoneList = new ArrayList<Phone>();
        phoneList.add(ev);
        phoneList.add(gsm);
        person.setPhoneList(phoneList);
        personService.save(person);
        person = new Person();
        gsm = new Phone();
        ev = new Phone();
    }
    
}
