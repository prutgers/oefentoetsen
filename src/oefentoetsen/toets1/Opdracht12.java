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
public class Opdracht12 {
    public static void main(String[] args){    
        String s = "aaa";    
        StringBuilder sb = new StringBuilder("bbb");    
        //Main String s          --> "aaa"
        //Main StringBuilder sb  --> "bbb"
        //testRefs String s --> bestaat nog niet
        //testRefs StringBuilder sb --> bestaat nog niet
        
        //maak een instantie van Opdracht12 aan zodat we zijn methodes kunnen gebruiken
        Opdracht12 o12 = new Opdracht12();
        
        //roep methode testRefs aan en geef String s en het StringBuilder object sb mee
        o12.testRefs(s, sb);
        
        //Print de het antwoord op opdracht12 uit
        System.out.println("");
        System.out.println("Antwoord op de opdracht 12 hieronder");
        System.out.println("Main s = " + s + " Main sb = " + sb);
        /**
         * Waarom is de uitkomst s = aaa en sb = bbbaaab?
         * Dit gaat om referencing laten we beginnen met string s
         * String is wordt doorgeven aan de methode maar wordt binnen de methode 
         * meteen veranderd dit geld echter alleen binnen deze methode.
         * 
         * sb is een ander verhaal de StringBuilder is een object. SB refereerd aan een 
         * StringBuilder. De StringBuilder kan je manipuleren en later weer oproepen en dan
         * zijn de veranderingen blijvend. sb = null is een beetje gemeen eigenlijk zeg je hier dat
         * sb nu verwijst naar een ander object namelijk het object null. Je kunt het zien als
         * sb = new StringBuilder("ccc");
         * Nu heb je eigenlijk 2 StringBuilders sb. De ene verwijst naar de bbbaaabbb en de andere naar
         * ccc. 
         *
         */
    }
    
    public void testRefs(String s, StringBuilder sb){    
        //Main String s en testRefs String s --> "aaa"
        //Main StringBuilder sb en testRefs StringBuilder sb  --> "bbb"
        
        s = s + sb.toString(); 
        //Main String s --> "aaa"
        //testRefs String s --> "aaabbb"
        //Main StringBuilder sb en testRefs StringBuilder sb  --> "bbb"
        
        sb.append(s);    
        //Main String s --> "aaa"
        //testRefs String s --> "aaabbb"
        //Main StringBuilder sb en testRefs StringBuilder sb  --> "bbbaaabbb"
        
        s = null;
        //Main String s --> "aaa"
        //testRefs String s --> null
        //Main StringBuilder sb en testRefs StringBuilder sb  --> "bbbaaabbb"
        
        sb = null; //Nu verwijst deze sb naar null, het is een beetje hetzelfde
                   //als hier invullen sb = new StringBuilder();
        //Main String s --> "aaa"
        //testRefs String s --> "aaabbb"
        //Main StringBuilder sb --> "bbbaaabbb"
        //testRefs StringBuilder sb --> null
        
        //print String s en Stringbuilder sb uit zoals ze zijn in de methode testRefs
        System.out.println("testRefs s = " + s + " testRefs sb = " + sb);
    }  
    
    
     
}
