


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE DISTANCE,HOUR,MINUTES,SECOND
 * DESCRIPTION: DISPLAY OUTPUT USING JOPTIONPANE
 * DATE: 29/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS
 */


import javax.swing.JOptionPane;


public class Activity5 {
    
    public static void main(String[] args){
        
        //get input from user
        String sdistance = JOptionPane.showInputDialog("Enter distance in meter: ");
        double distance = Double.parseDouble(sdistance);
        
        String shour = JOptionPane.showInputDialog("Enter time in hour: ");
        double hour = Double.parseDouble(shour);
        
        String sminute = JOptionPane.showInputDialog("Enter time in minute: ");
        double minute= Double.parseDouble(sminute);
        
        String ssecond = JOptionPane.showInputDialog("Enter time  in second: ");
        double second = Double.parseDouble(ssecond);
        
        //calculate totalsec
        double totalsec = hour*3600+minute*60+second;
        double speed1 = distance/totalsec;  
        double speed2 = (distance/1000)/(totalsec/3600); 
        double speed3 = (distance/1609)/(totalsec/3600);
        
        
     // display output
        
        JOptionPane.showMessageDialog(null,String.format("The speed in m/s is: %.2f"
                +"\nThe speed in km/h is: %.2f"
                + "\nThe speed in miles/h is : %.2f",speed1,speed2,speed3));
        
    }
    
}
