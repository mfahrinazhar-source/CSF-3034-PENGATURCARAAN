


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
  * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: DISPLAY LEAP YEAR
 * DESCRIPTION: DISPLAY OUTPUT USING JOPTIONPANE
 * DATE: 05/11/2026
 * MODIFIED DATE: -
 * VERSION:1.0 * @author ASUS
 */


import javax.swing.JOptionPane;


public class LeapYear {
    
    public static void main(String[] agrs){
        
        //GET YEAR
        String syear = JOptionPane.showInputDialog("ENTER YEAR: ");
        int year = Integer.parseInt(syear);
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            JOptionPane.showMessageDialog(null, year+" IS A LEAP YEAR!");
        else
            JOptionPane.showMessageDialog(null, year+" IS NOT A LEAP YEAR!");
            
        
        
    }
    
}
