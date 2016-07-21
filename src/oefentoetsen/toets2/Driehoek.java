/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets2;

import java.util.Date;

/**
 *
 * @author Peter
 */

public class Driehoek {
    private final Date datum;
    
    public Driehoek(){
    this.datum = new Date();
        System.out.println(datum);
    }
    
    public Date getDate(){
                        //Typecaste en clone de datum
        Date copyDate = (Date)datum.clone();
        return copyDate;
    }
    
}
