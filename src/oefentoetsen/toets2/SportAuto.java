/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets2;

/**
 *
 * @author Peter
 */
public class SportAuto extends Auto {
    public int gearRatio = 9;
        public String accelerate() { 
            return "SportAuto"; 
        }
        public int getGearRatio() { 
            return gearRatio; 
        }
}
