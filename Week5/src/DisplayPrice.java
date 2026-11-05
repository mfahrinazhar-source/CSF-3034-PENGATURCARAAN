/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
  * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: DISPLAY PRICE
 * DESCRIPTION: DISPLAY OUTPUT USING SCANNER
 * DATE: 05/11/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS
 */



import java.util.Scanner;

public class DisplayPrice {
    
    public static void main(String[] args){
        
        //GET INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER AGE: ");
        int age = input.nextInt();
        
        //CALCULATE PRICE
        if (age >= 60){   
            System.out.println("RM 10");
        }
        else  if (age >= 18 && age <= 59){ 
            System.out.println("RM 15");
        }
        else if (age >= 6 && age <= 17){ 
            System.out.println("RM 18");
        }
        else{
            System.out.println("FREE");
            
        }
        
      
    }
    
    
    
}
