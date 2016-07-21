/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets1;

/**
 *
 * @author Peter
 */
public class Opdracht17 {
    
    public static void main(String[] args) { 
        /** Maak een dubbel array van 10 bij 10
         * LET OP je maakt hier een lege matrix dus alle velden zijn 0
         */
        double[][] matrix = new double[10][10];
        
        //Maak de klasse Opdracht17 zodat je de methode kan aanroepen
        Opdracht17 o17 = new Opdracht17();
        
        //Declareer double som;
        double som; 
        
        //bereken de som met de meegegeven matrix
        som = o17.somHoofdDiagonaal(matrix);
        System.out.println("De some van matrix is " + som);
        
        //Zet waardes in de Matrix en geef de waarde me die geset moet worden
        matrix = o17.setHoofdDiagonaal(matrix, 4);
        som = o17.somHoofdDiagonaal(matrix);
        System.out.println("De some van matrix is " + som);
        
    }
    
    
    /**
     * Antwoord op opdracht 17
     */
    public double somHoofdDiagonaal(double[][] matrix){ 
        //declareer double som je mag ook double som = 0 doen dan wordt deze automatisch getypecast naar een double.
        double som = 0.0; 
        /**Bij de hoofddiagonaal is het middelste rij van linksboven naar rechter beneden. 
         * De coordinaten hiervan zijn [0,0][1,1][2,2] aka [i,i] dus je hebt aan 1 for loop genoeg.
         */
        
        for(int i = 0; i < matrix.length; i++){ 
            som += matrix[i][i]; 
        } 
        return som;
    }
    
    public double[][] setHoofdDiagonaal(double[][] matrix, int j){ 
        
        for(int i = 0; i < matrix.length; i++){ 
            //int j wordt automatisch naar een double gecast
            matrix[i][i] = j;
        } 
        return matrix;
    }

}
