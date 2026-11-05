


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: DISPLAY TYPE NUMBER
 * DESCRIPTION: DISPLAY OUTPUT USING SCANNER
 * DATE: 05/11/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS
 */



import java.util.Scanner;


public class DisplayTypeNumber {


    public static void main(String[] args) {
        
        //GET INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int num = input.nextInt();
        
        
        //DISPLAY MULTIPLE OUTPUT USING LOOPING
        if  (num > 0){
            System.out.println("YOUR NUMBER IS POSITIVE");
        }
        else if (num < 0) {
            System.out.println("YOUR NUMBER IS NEGATIVE");
        }
        else{
            System.out.println("YOUR NUMBER IS ZERO");
        }
        
        
        // TODO code application logic here
    }
    
}
