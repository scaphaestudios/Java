/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meemr
 */
import java.awt.*;
public class Applet  extends javax.swing.JApplet{
    
    int num;
    public init(){
        
        num = 225;
    }
    
    
    public void paint(Graphics screen){
        
        Graphics2D screen2D = (Graphics2D) screen;
        
        screen2D.drawString("The Square root of " +
                num +
                "is " +
                Math.sqrt(num),1,5);
        
        
    }

    
}
