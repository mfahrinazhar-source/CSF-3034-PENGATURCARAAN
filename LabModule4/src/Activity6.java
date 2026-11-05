


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE PARAMETERS
 * DESCRIPTION: DISPLAY OUTPUT USING SCANNER
 * DATE: 29/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS
 */


import java.util.*;

public class Activity6 {
    
    public static void main(String[] args){
        
        //GET INPUT
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        double x1 = input.nextDouble();
        
        System.out.println("Please enter second number: ");
        double x2 = input.nextDouble();
        
        System.out.println("Please enter third number: ");
        double x3 = input.nextDouble();
      
        
        //CALCULATE MEAN
        double mean = (x1+x2+x3)/3;
        
        //CALCULATE  VARIANCE
        double variance = (Math.pow(x1 - mean, 2)
                + Math.pow(x2 - mean, 2)
                + Math.pow(x3 - mean, 2)) / 3;
        
        //CALCULATE STANDARD DEVIATION
        double stddeviation = Math.sqrt(variance);
        
        System.out.printf("%nMean: %.2f", mean);
        System.out.printf("%nVariance: %.2f", variance);
        System.out.printf("%nStandard deviation: %.2f%n", stddeviation);
        
        

        
        
    }
    
}
