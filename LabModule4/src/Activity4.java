


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CONVERT WORD TO UPPERCASE AND LOWERCASE AND CALCULATE NUMBER OF CHARACTER 
 * DESCRIPTION: DISPLAY OUTPUT USING JOPTIONPANE
 * DATE: 29/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS
 */




import javax.swing.JOptionPane;


public class Activity4 {
    
    public static void main (String [] args){
        
        String word = JOptionPane.showInputDialog("Enter a word: ");
       
        
  

        JOptionPane.showMessageDialog(null,"The word has  been entered: "+word
                +"\nThe word in lower case: "
                +word.toLowerCase()+"\nThe word in uppercase: "
                +word.toUpperCase()+"\nThe total number of character is: "+word.length());
        
    }
        
        
    
}
