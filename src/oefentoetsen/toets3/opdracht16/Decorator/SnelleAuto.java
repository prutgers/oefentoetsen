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
public class SnelleAuto implements Featurizer{
    protected Featurizer featurizer;
    public SnelleAuto(Featurizer feat){
        this.featurizer = feat;
    }
    
    @Override
    public String addFeature(){
        return " :Snel: " + featurizer.addFeature();
    }
    
    @Override
    public String toString(){
        return addFeature();
    }
 
}
