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
public class Opdracht11 {
    public static void main(String args[]){
        //Maak een Opdracht11 object
        Opdracht11 o11 = new Opdracht11();
        //roep methode printlnInPrintln() aan
        o11.printlnInPrintln();
     }
    
    public void printlnInPrintln(){
        String s = "dit is de String"; 
        System.out.println("Dit is main " + s + printWat1()); //eerst methode printWat1 uitvoeren voor dat deze hele println geprint wordt
    }

    public String printWat1() { 
        System.out.println("Dit is println in printWat1" + printWat2() ); //eerst methode printWat2 uitvoeren voor dat deze hele println geprint wordt
        return " :return van printWat1"; //Geef de zin " :return van printWat1 terug"
    }
    public String printWat2() { 
        System.out.println("Dit is println in printWat2"); //Uitprinten
        return " :return van printWat2"; //Geef de zin " :return van printWat2 terug
    } 
}
