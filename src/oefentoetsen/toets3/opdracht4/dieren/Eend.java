/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.dieren;

import oefentoetsen.toets3.opdracht4.interfaces.Vlieger;
import oefentoetsen.toets3.opdracht4.interfaces.Zwemmer;

/**
 *
 * @author Peter
 */
public class Eend extends Dier implements Zwemmer, Vlieger {
    private String name;
    
    public Eend(){
        
    }
    
    public Eend(String name){
        this.name = name;
    }
    
    
}
