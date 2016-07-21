/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht4;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Peter
 */
public class test {
    

   public static void main(String [] args)
   {
       ArrayList<String> al=new ArrayList<String>();
       al.add("Hello");
       al.add("Hi");
       al.add("Howdy");

       try{
         FileOutputStream fos= new FileOutputStream("myfile.txt");
         ObjectOutputStream oos= new ObjectOutputStream(fos);
         oos.writeObject(al);
         oos.close();
         fos.close();
       }catch(IOException ioe){
            ioe.printStackTrace();
        }
   }
}

