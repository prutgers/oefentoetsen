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
public class Opdracht14 {
    public static void main(String[] args){
        int i = 4;
        int j = 5;
        
        //Je kan direct de methode printSum(i, j) omdat deze static is
        printSum(i, j);
        
    }
    
    public static void printSum(int i, int j){
        int som = i + j;
        System.out.println("De som is " + som);
        
        //Alternatief is sneller maar misschien niet duidelijker
        //Belangrijk! Vergeet niet de haakjes om de (i+j) anders is de output -->> De som is 45
        System.out.println("De som is " + (i + j));
        
        //Deze onderste is dus fout!
        System.out.println("De som is " + i + j);
    }
    
}
