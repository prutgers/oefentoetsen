/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets2;

/**
 *
 * @author Peter
 */
public class Cirkel {
    private double radius;
    public Cirkel(double radius){
        /**
         * radius = radius verwijst niet naar de klasse variable maar naar de methode variabele radius
         * en doet dus helemaal niks. Dit kan je oplossen door het volgende er neer te zetten:
         * this.radius = radius;
         */
        
        radius = radius;
    }
    
    public void printRaduis(){
        //Zal altijd 0.0 uit printen omdat de radius niet gezet is
        System.out.println("Dit is de radius: " + this.radius);
    }
}
