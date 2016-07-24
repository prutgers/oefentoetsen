/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4.utils;

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

//Je wilt zorgen dat exhibit alleen Dieren toegevoegd kunnen worden
//hiervoor zorg je door er T extends Dier neer te zetten
public class Exhibit <T extends Dier> implements Serializable {
    //Maak ArrayList
    ArrayList<T> lijst = new ArrayList<T>();
    
    //Setter methode om dier toe te voegen aan de dieren lijst
    public void voegToe(T param){
        lijst.add(param);
    }
    
    //getter methode om lijst met dieren op te halen
    public ArrayList<T> getArrayList(){
        return lijst;
    }
    
    
            
    
    
    /**
     * Opdracht 4E
     * Vergeet niet dat wat je schrijft serializeble moet zijn in dit geval schrijven we de klasse Exhibit weg
     * dus moet Exhibit serializeble zijn.
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
     * Dit is geen opdracht, maar toch even leuk om te doen schrijf een methode die 
     * Het weggeschrijven bestand exhibits.dat weer op haalt
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