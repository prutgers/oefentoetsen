/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.utils;

import oefentoetsen.toets3.opdracht4.dieren.Dier;
import oefentoetsen.toets3.opdracht4.dieren.Leeuw;
import oefentoetsen.toets3.opdracht4.dieren.Arend;
import oefentoetsen.toets3.opdracht4.dieren.Eend;

/**
 *
 * @author Peter
 */
public class Opdracht4c {
    
    /**
     * Elke dier moet een naam mee krijgen aangezien er geen constructor is 
     * zonder naam. Maar je mag er vanuit gaan dat er een default constructor is 
     * en dan is bijvoorbeeld: leeuwenkooi.voegToe(new Leeuw()); natuurlijk goed.
     */
    
    
    public void opdracht4C() {
        //Mag wel new Exhibit<Leeuw>() maar hoeft niet
        Exhibit<Leeuw> leeuwenkooi = new Exhibit<Leeuw>();
        leeuwenkooi.voegToe(new Leeuw("Arie"));
        
        Exhibit<Arend> vogelnest = new Exhibit<>();
        vogelnest.voegToe(new Arend("Ekstertje"));

        Exhibit<Dier> vanAllesWat = new Exhibit<>();
        vanAllesWat.voegToe(new Leeuw("Joke"));
        vanAllesWat.voegToe(new Leeuw("Bassie"));
        vanAllesWat.voegToe(new Arend("Arend"));
        vanAllesWat.voegToe(new Eend("Donald"));
    }
    
    
    public Exhibit<Leeuw> maakLeeuwLijst(){
        Exhibit<Leeuw> leeuwenkooi = new Exhibit<Leeuw>();
        leeuwenkooi.voegToe(new Leeuw("Leo"));
        leeuwenkooi.voegToe(new Leeuw("Loeki"));
        leeuwenkooi.voegToe(new Leeuw("Paul"));
        return leeuwenkooi;
    }
}
