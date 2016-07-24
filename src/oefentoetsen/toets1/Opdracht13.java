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
public class Opdracht13 {
      public static void main(String[] args) {  
          //Maar een arraylist en initieer deze voor een int
          int list[] = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < list.length; i++) {
            //i wordt steeds terug gezet naar de index van de vorige en begint op 1
            //en aangezien dit na elkaar gebeurd is de vorige steeds 1
            list[i] = list[i - 1];            
            System.out.print(list[i] + " ");
        }
       
      }
}
