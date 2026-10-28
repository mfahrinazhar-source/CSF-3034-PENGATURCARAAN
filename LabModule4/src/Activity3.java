


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE AGE BASE ON BIRTHYEAR
 * DESCRIPTION: DISPLAY OUTPUT USING JOPTIONPANE
 * DATE: 28/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS * @author ASUS
 * @author ASUS
 */

import javax.swing.JOptionPane;

public class Activity3 {
    
    public static void main(String [] args){
        
        String ic = JOptionPane.showInputDialog("Enter IC: ");
        
        String year = ic.substring(0,2);
        int iyear = Integer.parseInt(year);
        
        String month = ic.substring(2,4);
        int imonth = Integer.parseInt(month);
        
        String day = ic.substring(4,6);
        int iday = Integer.parseInt(day);
        
        int birthdate =  2000 + iyear;
        
        final int CURAGE = 2026 - birthdate;
        
  

        JOptionPane.showMessageDialog(null,"YOUR DATE IS: "+iday+"|"+imonth+"|"+birthdate+"\nYOUR AGE NOW: "+CURAGE);
        
        
        
    }
    
}
