/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4;

/**
 *
 * @author Peter
 */
public class opdracht4c {
    
    
    public void opdracht4C() {
        //Mag wel new Exhibit<Leeuw>() maar hoeft niet
        Exhibit<Leeuw> leeuwenkooi = new Exhibit<Leeuw>();
        leeuwenkooi.voegToe(new Leeuw());
        
        Exhibit<Arend> vogelnest = new Exhibit<>();
        vogelnest.voegToe(new Arend());

        Exhibit<Dier> vanAllesWat = new Exhibit<>();
        vanAllesWat.voegToe(new Leeuw());
        vanAllesWat.voegToe(new Leeuw());
        vanAllesWat.voegToe(new Arend());
        vanAllesWat.voegToe(new Eend());
    }
    
    
    public Exhibit<Leeuw> maakLeeuwLijst(){
        Exhibit<Leeuw> leeuwenkooi = new Exhibit<Leeuw>();
        leeuwenkooi.voegToe(new Leeuw());
        leeuwenkooi.voegToe(new Leeuw());
        leeuwenkooi.voegToe(new Leeuw());
        leeuwenkooi.voegToe(new Leeuw());
        
        return leeuwenkooi;
}
