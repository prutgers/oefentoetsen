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
public class Opdracht15 {
    public static void main(String[] args) { 
        //Maak een Opdracht15 object en roep direct de methode displayNumber(n) aan
        new Opdracht15().displayNumber(30);
    }
    public void displayNumber(int n){
        //Deze voor loopt loopt van 1 TOT n (dus print N niet meer uit)
        for(int i = 1; i<n; i++){
            System.out.print(i + " ");
            //Zodra de modulus van i 0 is dus bij 7, 14, 21, 28 etc sla een regel over
            if(i%7 == 0){
                System.out.println();
            }
        }
    }
}
