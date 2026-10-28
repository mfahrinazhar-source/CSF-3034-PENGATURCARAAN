

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
* AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE OVERAGE FEE
 * DESCRIPTION: DISPLAY OUTPUT USING SCANNER
 * DATE: 22/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS * @author ASUS
 */



import java.util.Scanner;


public class Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //GET INPUT FROM USER
        System.out.print("ENTER FIRST NUMBER : ");
        int num1 = input.nextInt();
        
        System.out.print("ENTER SECOND NUMBER 2: ");
        int num2 = input.nextInt();
        
        int squ1 = num1 * num1;
        int squ2 = num2 * num2;
        int sum = squ1 + squ2;
        int diff = squ1 - squ2;
        
        System.out.println("the square of first number : "+squ1);
        System.out.println("the square of first number : "+squ2);
        System.out.println("the sum of both number : "+sum);
        System.out.println("the different between both squared number : "+diff);
        
        
    }
    
}
