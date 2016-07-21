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
public class Opdracht1 {
    
    
    public static void main(String[] args){    
    int count = 0, sum = 0;
    do{
        if(count % 3 == 0) {
            System.out.println("Deze sla ik over, Count: " + count);
            System.out.println("Som " + sum);
            continue; // eindigt de do loop
        }
        sum+=count;
    }while(count++ < 11); // aanwezigheid van een leeg statement
        System.out.println(sum);
    
    }
}
