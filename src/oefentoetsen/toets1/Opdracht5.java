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
public class Opdracht5 {
    public static void main(String args[]){
        Opdracht5 o5 = new Opdracht5();
        
        //opdracht 5 en 5a zijn precies gelijk behalve de opmaak
        //run methode opdracht5
        o5.opdracht5();
        
        //run methode opdracht5a
        o5.opdracht5A();
    }
    
    
     //Zie opdracht 5a
    public void opdracht5() {
        int i = 0;
        for (i = 0; i < 10; i++); // <<-- is de punt komma maar het is dus een leeg statemant
        System.out.println("opdracht 5");
        System.out.println(i + 4); 
        
        // de volgende output gaat 104 opleveren omdat het dan als een string gezien wordt
        //System.out.println("Nu is zowel i als 4 een string: " + i + 4);
    }
    
    public void opdracht5A(){
        int i = 0;
        for(i = 0; i < 10; i++){
            ; // <<-- is de punt komma maar het is dus een leeg statemant
        }
        System.out.println("opdracht 5A");
        System.out.println(i + 4);
        
        // de volgende output gaat 104 opleveren omdat het dan als een string gezien wordt
        //System.out.println("Nu is zowel i als 4 een string: " + i + 4);
    }
}
