/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.adem.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author Adem
 */
@SessionScoped
@Named(value = "falanBean")
public class FalanBean implements Serializable{
    
    public FalanBean(){
        
    }
    
}
