/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.dieren;

import oefentoetsen.toets3.opdracht4.interfaces.Roofdier;
import oefentoetsen.toets3.opdracht4.interfaces.Vlieger;

/**
 *
 * @author Peter
 */
public class Arend extends Dier implements Roofdier, Vlieger{
    private String name;
    
    
    
    public Arend(String name){
        super(name);
    }
}
