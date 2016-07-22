/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.opdracht16.TemplatePattern;

/**
 *
 * @author Peter
 */
public abstract class TemplateClass {
    public void theTemplateMethod(){ // de template methode
        method1();
        method2();
    } //de abstracte methoden die in de template methode gebruikt moeten worden
        
    abstract public void method1();
    abstract public void method2();
}
