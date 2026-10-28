


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
* AUTHOR: MOHAMAD FAHRIN BIN MOHD AZHAR
 * PROGRAM NAME: CALCULATE OVERAGE FEE
 * DESCRIPTION: DISPLAY OUTPUT USING JOPTIONPANE
 * DATE: 22/10/2026
 * MODIFIED DATE: -
 * VERSION:1.0
 * @author ASUS * @author ASUS
 * @author ASUS
 */

import javax.swing.JOptionPane;

public class Activity2 {
    
    public static void main (String[] args){
        
        String strad = JOptionPane.showInputDialog("Enter radius: ");
        double radius = Double.parseDouble(strad);
        
        
        final double  PI =  3.14159;
        double diemeter =  2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;
        
        JOptionPane.showMessageDialog(null,"The diameter is: "+diemeter+
                "\nThe circumference is: "+circumference+
                "\nThe area is: "+area);
    }
    
}
