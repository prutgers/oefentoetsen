/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht16.Decorator;

/**
 *
 * @author Peter
 */
public class Decorator {
    public static void main(String[] args){
        Auto auto = new Auto(new SnelleAuto(new ChromeCar(new Spoiler())));
        System.out.println(auto);
    }
}
