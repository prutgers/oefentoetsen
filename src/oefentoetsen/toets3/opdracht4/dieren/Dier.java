/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.dieren;

import oefentoetsen.toets3.opdracht4.interfaces.Roofdier;
import java.util.ArrayList;
import oefentoetsen.toets3.opdracht4.utils.LevendWezen;

/**
 *
 * @author Peter
 */
public abstract class Dier extends LevendWezen {
    private String name;
    private int snelheid;
    
    
    public Dier(String name){
        this.name = name;
    }
    
    public Dier(String name, int snelheid){
        this.name = name;
        this.snelheid = snelheid;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    
    
    public String getName(){
        return name;
        
    }
}
