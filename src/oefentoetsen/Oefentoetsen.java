/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen;

import oefentoetsen.toets2.Driehoek;
import oefentoetsen.toets2.Cirkel;
import java.awt.BorderLayout;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Peter
 */
public class Oefentoetsen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cirkel o3 = new Cirkel(1.0);
        
        
        Toets1 toets1 = new Toets1();
        //toets1.opdracht1();
        //toets1.opdracht4();
        //toets1.opdracht5();
        //toets1.opdracht5A();
        //toets1.opdracht7();
        //toets1.opdracht8();
        //toets1.opdracht9('w');
        //toets1.opdracht10();
        //Opdracht 11 heet PrintlnInPrintln()
        toets1.printlnInPrintln();
        
        //opdracht 9 oefentoets 2
        //System.out.println(new SubClass());
        
        
        
        //opdracht 13 oefentoest 2
        //opdracht13();
        
        //opdracht 6 toest 3
        /*
        Toets36 sets = new Toets36();
        sets.setAdder1();
        sets.setAdder2();
        sets.clearSet();
        */
    }
    
    
    
    
}

    class Toets36 {
        
       
        Set<Object> set1 = new HashSet();
        Set<String> set2 = new HashSet();

        public Toets36(){
            set1.add("rood");
            set1.add("geel");
            set1.add("groen");
            
            set2.add("rood");
            
            set2.add("blauw");
            set2.add("geel");
            System.out.println("set1 " + set1);
            System.out.println("set2 " + set2);
        }
        
        public void setAdder1(){
            set1.addAll(set2);
            System.out.println("set1.addAll(set2) " + set1);
            //Dit kan niet want je weet niet zeker of het een string is
            //set2.addAll(set1);
        }
        public void setAdder2(){
            set1.add(set2);
            System.out.println("set1.add(set2) " + set1);
        }
        
        public void clearSet(){
            set1.clear();
            System.out.println("set1.clear " + set1);
            set2.clear();
            System.out.println("set2.clear " + set2);
        }
                
        
       
       
    }
    
   class Auto{
        public int gearRatio = 8;
        public String accelerate() { return "Auto"; }
        public int getGearRatio() { return gearRatio; }
    }
        
    class SportAuto extends Auto{
        
    }
    

