

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE OVERAGE FEE
 * DESCRIPTION: DISPLAY OUTPUT USING SCANNER
 * DATE: 22/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS
 */

import java.util.Scanner;



public class Activity2 {
    
    public static void main(String[]args){
        
        
        System.out.println("*****************************");
        System.out.println("MY CELL PHONE OVERAGE FEE");
        System.out.println("*****************************");
        //get input
        Scanner input =  new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF EXCESS MINUTES: ");
        double minutes = input.nextDouble();
        
        //calculate
        double fee = minutes * 0.35;
        
        System.out.printf("OVERAGE FEE = RM%.2f",fee);
        System.out.println("\n");
        
        //display output
       
       
       
    }
    
}
