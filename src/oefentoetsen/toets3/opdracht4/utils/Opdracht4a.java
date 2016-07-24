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
    
    
    //Returned een lijst van Roofdieren, krijgt een lijst van LevendeWezens
    public ArrayList<Roofdier> getRoofdier(ArrayList<LevendWezen> lijst) {
        
        //maak een nieuwe lijst die alleen roofdieren accepteert
        ArrayList<Roofdier> roofdierLijst = new ArrayList<>();
        //Cycle door de lijst 
        for(LevendWezen wezen : lijst){
            //Bekijken of het wezen uit de lijst een instantie is van Roofdier
            if(wezen instanceof Roofdier){
                //Voeg het roofdier toe aan de lijst
                //BELANGRIJK vergeet niet het wezen te type casten naar een Roofdier want
                //Java weet niet dat het een roofdier is en de roofdierLijst mag alleen Roofdieren bevatten
                roofdierLijst.add((Roofdier) wezen);
            }
        }
        //returned de roofdierenLijst
        return roofdierLijst;
    }
}
