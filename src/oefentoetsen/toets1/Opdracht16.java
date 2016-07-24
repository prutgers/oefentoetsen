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
public class Opdracht16 {
    public static void main(String[] args) { 
        double array[];
        
        //De index van het kleinste getal is 3 in dit voorbeeld
        array = new double[] {10,20,30,7,50,60,71,80,90,7};
        System.out.println(new Opdracht16().indexVanKleinsteElementB(array));
    }
       
     
     //Deze methode geeft het de INDEX terug van het eerste kleinste getal en niet het kleinste getal zelf
     
    public int indexVanKleinsteElementB(double[] array){
        int index = 0;
        for(int i = 0; i <array.length; i++){
            
            //slaat het index nummer op van het kleinste getal
            if(array[index] > array[i]){
                index = i;
            }
        }
        return index;
    }
}
