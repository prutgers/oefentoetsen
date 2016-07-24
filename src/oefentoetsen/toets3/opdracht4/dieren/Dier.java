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
 * 
 * De klasse dier wordt door ieder dier geextend zodat ieder dier
 * op Dier niveau een snelheid en een naam kan krijgen.
 */
public abstract class Dier extends LevendWezen {
    //Naam van het dier
    private String name;
    //Top snelheid van het dier in KM/uur
    private int speed;
    
    
    public Dier(String name){
        this.name = name;
    }
    
    public Dier(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    
    //Getter voor name
    public String getName(){
        return name;
        
    }
    
    //Getter voor speed
    public int getSpeed(){
        return this.speed;
    }
}
