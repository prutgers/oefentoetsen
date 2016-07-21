/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets2;
import java.util.*;
/**
 *
 * @author Peter
 */
public class TestDatum extends Object {          
    public void testDeDatum() {
        Date d1 = new Date();
        Date d2 = new Date(349324);
        Date d3 = d1;
        Date d4 = new Date(349324);
        
        /**
         * Equals kijkt of een object dezelfde waarde heeft
         * == bekijkt of iets het zelfde object is (of naar het zelfde object verwijst dus)
         */
        System.out.println("(1) " + (d1 == d2)); // false Nooit true want verschillend object door new
        System.out.println("(2) " + (d2 == d4)); // false Verschillend object ondanks dat ze dezelfde waarde hebben
        System.out.println("(3) " + d1.equals(d2)); // false Is wel gelijkt op de volgende datum (349324) naar meestal dus niet
        System.out.println("(4) " + d2.equals(d4)); // true  gelijke waarde dus waar
        
        //extra
        System.out.println("(5) equals " + d1.equals(d3)); // true    Gelijke waarde     
        System.out.println("(6) == " + (d1 == d3));        // true      Verwijst naar het zelfde object (zelfde referentie) dus true
    }        
}


