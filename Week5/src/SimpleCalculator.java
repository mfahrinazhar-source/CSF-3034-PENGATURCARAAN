

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
  * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATOR 
 * DESCRIPTION: DISPLAY OUTPUT USING SCANNER AND SWITCH CASE
 * DATE: 05/11/2026
 * MODIFIED DATE: -
 * @author ASUS
 */



import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] agrs){
        
        
        //GET INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("CHOOSE CHOICE\n1.ADD\n2.SUBSTRACT\n3.MULTIPLY\n4.DIVIDE\nENTER CHOICE: ");
        int choice = input.nextInt();
        
        System.out.println("ENTER FIRST NUMBER: ");
        int num1 = input.nextInt();
        
        System.out.println("ENTER SECOND NUMBER: ");
        int num2 = input.nextInt();
        
        //MENU DRIVEN
        
        switch(choice){
            
            case 1:
                System.out.println("RESULT: "+(num1+num2));
                break;
            case 2:
                System.out.println("RESULT: "+(num1-num2));
                break;
            case 3:
                System.out.println("RESULT: "+(num1*num2));
                break;
            case 4:
                System.out.println("RESULT: "+(num1/num2));
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
       
    }
    
}
