/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets1;

/**
 *
 * @author Peter
 */
public class Opdracht9 {
    public static void main(String args[]){
        char invoer = 'w'; //<<-- set het in te voeren character
        String richting;
        
        //Vanaf hier 
        switch(invoer){
            case 'w': richting = "vooruit";
            break; //zonder break werkt deze functie niet correct
            case 'a': richting = "links";
            break;
            case 's': richting = "achteruit";
            break;
            case 'd': richting = "rechts";
            break;
            default: richting = "geen gevoel van richting";
        }
        // tot hier is het antwoord op de vraag
        
        System.out.println("De richting is: " + richting);
    }
}
