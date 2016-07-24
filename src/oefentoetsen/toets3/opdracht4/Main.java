/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4;

import oefentoetsen.toets3.opdracht4.utils.Exhibit;
import oefentoetsen.toets3.opdracht4.dieren.*;
import oefentoetsen.toets3.opdracht4.utils.Opdracht4c;

/**
 *
 * @author Peter
 * Opdracht 4a is te vinden in de Utils package met klassenaam Opdracht4a Jager is veranderd naar RoofDier
 * Opdracht 4b is te vinden in de Utils package, met klassenaam Exhibit
 * Opdracht 4c is te vinden in de Utils package met klassenaam Opdracht 4c
 * Opdracht 4d is te vinden in de Utils package met klassenaam Exhibit, in de comments boven aan
 * Opdracht 4e is te vinden in de Utils package met klassenaam Exhibit in de methode write
 * 
 * 
 * 
 */
public class Main {
    public static void main(String Args[]){
        //test de read en write methodes van Exhibit
        writeExhibitFile();
        readExhibitFile();
        
        //Test opdracht4C
        opdracht4c();
        
        
    }
    
    
    
    
    public static void writeExhibitFile(){
        Exhibit e = new Exhibit();
        e.voegToe(new Leeuw("Alex"));
        e.voegToe(new Leeuw("Simba"));
        e.voegToe(new Eend("Donald"));
        e.voegToe(new Rabbit("Xzibit"));
        e.write();
    }    
    
    public static void readExhibitFile(){
        Exhibit e = Exhibit.read();
        e.print();
    }
    
    public static void opdracht4c(){
        Opdracht4c o4c = new Opdracht4c();
        Exhibit exhibit = o4c.maakLeeuwLijst();
        exhibit.print();
    }

}
