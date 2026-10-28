


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 ** AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE GROSS PAY
 * DESCRIPTION: GET INPUT USING DIALOG BOX
 * DATE: 22/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS
 * 
 
 */

import javax.swing.JOptionPane;


public class Activity1ii {
    
    public static void main(String[]args){
        
        String shour = JOptionPane.showInputDialog("Enter hours: ");
        double hour = Double.parseDouble(shour);
        
        String spay = JOptionPane.showInputDialog("Enter pay per hours: RM");
        double pay = Double.parseDouble(spay);
        
        
        double gpay = hour * pay;
        
        String msg = String.format("YOUR GROSS PAY IS: RM%.2f",gpay);
        JOptionPane.showMessageDialog(null,msg);
        
        //get input from user
    }
    
}
