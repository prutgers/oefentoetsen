/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.utils;

import java.util.ArrayList;
import oefentoetsen.toets3.opdracht4.interfaces.Roofdier;

/**
 *
 * @author Peter
 */
public class Opdracht4a {
    
    
    
    public ArrayList<Roofdier> getRoofdier(ArrayList<LevendWezen> lijst) {
        ArrayList<Roofdier> roofdierLijst = new ArrayList<>();
        for(LevendWezen wezen : lijst){
            if(wezen instanceof Roofdier){
                roofdierLijst.add((Roofdier) wezen);
            }
        }
        return roofdierLijst;
    }
}
