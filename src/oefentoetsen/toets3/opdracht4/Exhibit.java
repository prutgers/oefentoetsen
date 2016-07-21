/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter
 * @param <T>
 */
/**
 * Opdracht 4D
 * Maak van public class Exhibit<T extends Dier> 
 * public class Exhibit<T extends LevendWezen> 
 */
public class Exhibit <T extends Dier> implements Serializable {
    ArrayList<T> lijst;
    
    public Exhibit(){
        this.lijst = new ArrayList<T>();
    }
    
    public void voegToe(T param){
        lijst.add(param);
    }
    
    
    /**
     * Opdracht 4E
     * Vergeet niet dat wat je schrijft serializeble moet zijn
     * de makkelijkste oplossing is om LevendWezen Serializeble te laten implementeren
     */
    public void printExhibit(){
        File fn = new File("exhibits.dat");
        try(    FileOutputStream fns = new FileOutputStream(fn); 
                ObjectOutputStream outfile = new ObjectOutputStream(fns);) {
            outfile.writeObject(this);
            
        } catch (IOException ex) {
            Logger.getLogger(Exhibit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}