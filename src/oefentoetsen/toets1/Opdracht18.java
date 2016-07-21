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
public class Opdracht18 {
    
 public static void main(String[] args)    {
    Opdracht18 o18 = new Opdracht18();
    int[] lijst1 = {1,2,3,4,5,6};
    int[] lijst2 = {1,7,3,4,5,6};
    
    System.out.println("Lijst1 is oplopend is " + o18.isSortedCheck(lijst1));
    System.out.println("Lijst2 is oplopend is " + o18.isSortedCheck(lijst2));
}

 /**
  * Antwoord op opdracht 18
  */
    public boolean isSortedCheck(int[] lijst) {
        //We gaan er vanuit dat de lijst gesorteerd is en daar maken we een boolean aan die op true staat
        boolean isUpsorted = true;
        /**
         * Nu wil je in de lijst kijken en vergelijk je met de index 1 voor je. Daarom moet je lijst.length-1 neerzetten
         * anders krijg je een indexoutofbounds. 
         */
        for(int i = 0; i < lijst.length-1; i++){ 
            //Zodra het getal in de lijst op positie i+1 kleiner is of gelijk aan (als die gelijk is loopt het niet op)
            // dan zet je de isUpsorted of false en stop je met verder kijken want de lijst is nit van laag naar hoog gesorteerd.
            if(lijst[i+1] <= lijst[i]){
                isUpsorted = false; 
                break; //niet vergeten alternatief is return false;
            }
        }
        return isUpsorted;
    }

}