


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE GROSS PAY
 * DESCRIPTION: GET INPUT USING SCANNER
 * DATE: 22/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * 
 *
 * @author ASUS
 */


import java.util.Scanner;


public class Activity1i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get input from user
        
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter hours: ");
        double hours = input.nextDouble();
        
        System.out.print("Enter pay per hour: RM ");
        double pay = input.nextDouble();
        
        double gpay = hours*pay;
        
        System.out.printf("Your pay is : RM%.2f",gpay);
        
        
        // TODO code application logic here
    }
    
}
