/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.utils;

import java.awt.BorderLayout;
import oefentoetsen.toets3.opdracht4.dieren.Dier;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oefentoetsen.toets3.opdracht4.dieren.Eend;
import oefentoetsen.toets3.opdracht4.dieren.Leeuw;

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
    
    public ArrayList<T> getArrayList(){
        return lijst;
    }
    
    
            
    
    
    /**
     * Opdracht 4E
     * Vergeet niet dat wat je schrijft serializeble moet zijn
     * de makkelijkste oplossing is om LevendWezen Serializeble te laten implementeren
     */
    public void write(){
        File file = new File("exhibits.dat");
        try{    
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            ObjectOutputStream writeFile = new ObjectOutputStream(fileoutputstream); 
            writeFile.writeObject(this);
        } catch (IOException ex) {
            Logger.getLogger(Exhibit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
    /**
     * 
     * @return 
     */
    public static Exhibit read(){
        Exhibit exhibit = new Exhibit();
        File file = new File("exhibits.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            exhibit = (Exhibit) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             System.out.println("IOE exception");
        }catch(ClassNotFoundException c){
             System.out.println("Class not found");
        }
        
        
        return exhibit;
        
    }
    
    public void print(){
        System.out.println(this.lijst.toString());
    }
    
   
    
    
}