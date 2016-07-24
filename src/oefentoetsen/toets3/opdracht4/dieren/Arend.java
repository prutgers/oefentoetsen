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
        
    
    //Maak een Arend en geef hem een naam
    public Arend(String name){
        //De naam van de Arend wordt doorgegeven aan de super (Dier in dit geval)
        //en wordt daar opgeslagen
        super("Arend " + name);
    }
}
