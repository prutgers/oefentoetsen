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
public class Main {
    public static void main(String Args[]){
        maakExhibitFile();
    }
    
    public static void maakExhibitFile(){
        Exhibit e = new Exhibit();
            e.voegToe(new Leeuw());
            e.printExhibit();
            System.out.println("yay");
        
    }
}
