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
 * 
 * 
 */
public class Main {
    public static void main(String Args[]){
        writeExhibitFile();
        readExhibitFile();
        
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
