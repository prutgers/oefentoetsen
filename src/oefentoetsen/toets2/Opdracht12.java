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
public class Opdracht12 {
    //denk er aan dat deze String static is haal static weg en zie het verschil
    //String j = "";
    static String j = ""; 
    
    /**
     * Als de methode static is mag je NIET een static variable gebruiken.
     */
    public void method( int i){  
        try{   
            if(i == 2){     
                throw new Exception();   
            }   
            j += "1";  
        }  catch (Exception e){   
            j += "2";   
            return;  
        }  finally {   
            j += "3";  
        }  
        j += "4"; 
    }
     
    public void printJ(){
        System.out.println("De waarde van j: " + j);
    }
}
