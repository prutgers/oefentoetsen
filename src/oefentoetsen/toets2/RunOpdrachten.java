/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets2;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class RunOpdrachten {
    public static void main(String[] args){    
        
        RunOpdrachten RO = new RunOpdrachten();
        

        //opdracht3
        //Cirkel cirkel = new Cirkel(1.0);
        //cirkel.printRaduis();
        
        //opdracht 9 oefentoets 2
        //System.out.println(new SubClass());
        
        //Opdracht 10 oefentoets 2 zie methode
        //RO.opdracht10();
        
        //opdracht 11
        //new TestDatum().testDeDatum();
        
        //opdracht 12 zie methode
        //RO.opdracht12();
        
        //Aanroepen methode opdracht13 voor opdracht13
        //RO.opdracht13();
        
        //opdracht14 wordt overgeslagen (aangezien die stof niet meer behandeld wordt)
        
        //opdracht15
        
     }
    
    public void opdracht10(){
        Auto a = new SportAuto();
        SportAuto b = new SportAuto();
        /** Het aanroepen van de VARIABELE verwijst naar de gedeclareerde klasse in dit geval Auto en is dus 8
         * het aanroepen van een methode geld voor de geinitieerde klasse in dit geval SportAuto en is dus SportAuto
         */
        System.out.println("Auto a =  new SportAuto() " + a.gearRatio+" "+ a.accelerate());
        
        /** Nu worden de methodes aangeroepen en aangezien Auto a geinitialiseerd is als SportAuto pakt hij nu
         * de methodes van de SportAuto dus is het antwoord 9 SportAuto
         */        
        System.out.println("Auto a =  new SportAuto() " +  a.getGearRatio()+" "+ a.accelerate());
        
        
        System.out.println("SportAuto b = new SportAuto() " + b.gearRatio+" "+ b.accelerate());
        System.out.println("SportAuto b = new SportAuto() " + b.getGearRatio()+" "+ b.accelerate());
    }
    
    
    public void opdracht12(){
        
        //Hierbij zie je wat static doet
        new Opdracht12().printJ();
        
        Opdracht12 o12 = new Opdracht12();
        o12.method(1);
        o12.method(2);
        o12.printJ();
        
        /** Doordat de variable j in de Klasse Opdracht12 static is kan geeft die 
         * ook hier het zeflde weer namelijk 13423 
         * Verander de variabele in niet static (haal static weg) en zie het verschil
         */
        
        new Opdracht12().printJ();
    }



    public void opdracht13(){
        Scanner input = new Scanner(System.in);
        Boolean exit = false;
        Driehoek toets213 = new Driehoek();
        while(!exit){
            System.out.println("Kies 1 voor tijd of 2 of exit");
            int inputVanUser = input.nextInt();
            if(inputVanUser == 1){
                System.out.println("De datum is waarom het object is gemaakt is " + toets213.getDate());
            } else {
                exit = true;
            }
                    
        }
        
    }
}
