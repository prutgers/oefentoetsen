/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3;
import java.io.*;

/**
 *
 *  @author Peter
 */

//Voeg aan de klasse toe implements Serializable anders kan je niet schrijven
public class Opdracht1 implements Serializable {
    private int a = 5;  
    private double b = 5.5;  
    private String m = "value is too small";
     
    
    public static void main(String[] args) throws Exception   {    
        Opdracht1 o1 = new Opdracht1();        
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Test.dat"));      
        
        //Schrijf het object van Opdracht1 weg
        output.writeObject(o1);    
        output.close();      
    } 
}
