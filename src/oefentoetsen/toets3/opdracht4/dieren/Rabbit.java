/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.dieren;

/**
 *
 * @author Peter
 * 
 * Deze klasse is gemaakt om een Rabbit aan te maken die in een Exhibit wordt gestopt
 * en de naam Xzibit heeft.
 * Xzibit is een Rabbit in een Exhibit.
 * 
 * y0 ik ben ben Xzibit, Xzibit het konijn,
 * ik kan in een Exhibit en rappen vind ik fijn.
 * 
 * 
 * 
 */
public class Rabbit extends Dier {
    
     //Maak een Rabbit en geef hem een naam 
    public Rabbit(String name){
         //De naam van de Rabbit wordt doorgegeven aan de super (Dier in dit geval)
        //en wordt daar opgeslagen
        //Het konijn geeft ook nog een topsnelheid mee totaal onzinnig maar gewoon omdat het kan
        
        super("Rabbit " + name, 55);
    }
    
}
