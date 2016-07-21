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
public class Opdracht19 {
    public static void main(String args[]){
        Opdracht19 o19 = new Opdracht19();
        System.out.println("Als m is 3 som is " + o19.m(3));
        System.out.println("Als m is 1 som is " + o19.m(1));
        System.out.println("Als m is 19 som is " + o19.m(19));
        System.out.println("Als m is 100 som is " + o19.m(100));
    }
    
    
    //Antwoord op vraag 19
    public double m(int i) {    
        double sum = 0;

        /** i is in dit geval je maximum en wilt alles optellen van i is 1 t/m i = i
         * daarom initieer je int j die dandoor loopt zolang die kleiner of gelijk is aan i
         */
        
        for (int j = 1; j <= i; j++) {
            /**
             * Hier staat letterlijk de opdracht
             *                i
             * m(i) =     ---------
             *            (2*i + 1)
             */
            sum += j / (2 * j + 1.0);
            
        }
        return sum; 
    }
}
