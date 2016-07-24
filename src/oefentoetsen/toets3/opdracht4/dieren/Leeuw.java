/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.dieren;

import oefentoetsen.toets3.opdracht4.interfaces.Roofdier;

/**
 *
 * @author Peter
 * Deze klasse is deel geimplementeerd voor de lol zodat je beesten een naam kan geven
 */
public class Leeuw extends Dier implements Roofdier{
   
     //Maak een Leeuw en geef hem een naam 
    public Leeuw(String name){
         //De naam van de Leeuw wordt doorgegeven aan de super (Dier in dit geval)
        //en wordt daar opgeslagen
        super("Leeuw " + name);
    }
}
