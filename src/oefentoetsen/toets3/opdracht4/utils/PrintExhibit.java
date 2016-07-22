/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.utils;

import java.util.ArrayList;
import oefentoetsen.toets3.opdracht4.dieren.*;
/**
 *
 * @author Peter
 */
public class PrintExhibit {
    
    
    public void printDierenLijst(ArrayList arraylist){
        for(Object o: arraylist){
            if(o instanceof Leeuw) {
                System.out.println(((Leeuw) o).getName());
            }
            if(o instanceof Eend) {
               System.out.println(((Eend) o).getName());
            }
            if(o instanceof Arend) {
               System.out.println(((Arend) o).getName());
            }
            
        }
    }
}
