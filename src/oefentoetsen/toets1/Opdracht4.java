/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets1;

/**
 *
 * @author Peter
 * 
 * 
 */
public class Opdracht4 {
    public static void main(String args[]) {
        //Als een array wordt geinitialiseerd maar nog geen waardes heeft zijn deze
        //in het geval van een String null
        String[] dataArr = new String[4];
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";
        for (String data : dataArr) {
            System.out.print(data + " ");
        }
    }
}  

