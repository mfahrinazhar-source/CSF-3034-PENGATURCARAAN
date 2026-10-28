
import javax.swing.JOptionPane;

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
public class Activity3 {
    
    public static void main (String[]agrs){
        
        String stemp = JOptionPane.showInputDialog("Enter tempature: ");
        double cels = Double.parseDouble(stemp);
        
        
        
        double fahrenheit = 9/5 * cels + 32;
            
       
        JOptionPane.showMessageDialog(null,fahrenheit);
        
    }
    
}
