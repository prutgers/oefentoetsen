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
public class Opdracht8 {
    public static void main(String args[]){
        int size = 10;
        
        int[] arr = new int[size]; // gelijk aan int[] arr = new int[10];
        for (int i = 0 ; i < size ; ++i) {
            //Print 10 keer 0 uit, want array is alleen declareerd niet geinitializeerd
            System.out.println("i is: " + i + " arr[i] is: " + arr[i]);
        }
    }
}
