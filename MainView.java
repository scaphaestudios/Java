import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.*;
import java.awt.event.MouseMotionListener;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.*;

public class MainView extends SlidingPanel1  implements Runnable,MouseMotionListener,ActionListener
{
    JFrame frame;
  JButton b1,b2,b3;
    JPanel panel1,panel2,panel3;
    JButton btn1;
     int X = 20;
     int Y = 50;
    boolean x=false;
    boolean y=false;
    int p1x = 1364;
   int p1y = 0;
    int p2x = -798;
   int p2y = 0;
     int p3x = 0;
   int p3y = -768;
    
    
    public static void main(String[] args)
    {
        MainView example = new MainView();
        SwingUtilities.invokeLater(example);
    }

    
    
    
    
    public void run()
    {
        frame = new JFrame("My JFrame Example");
         
        JButton btn = new JButton("Settings");
        btn.setBounds(100, 200, 120, 40);
        
         panel1 = new JPanel();
      panel1.setLayout(null);
      panel1.setBackground(Color.YELLOW);
      panel1.add(btn);
      panel1.setBounds(p3x, p3y, 1350, 770);
      
      
      b1 = new JButton();
        
          b1.setBounds(650, 1, 15, 5);
      
        
         b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
            ((JButton) e.getSource()).setEnabled(false);
            new Timer(1, new ActionListener(){
                
                
                
               public void actionPerformed(ActionEvent e) {
                   
                  p3y = panel1.getY()+1; 
                  panel1.setLocation(p3x, p3y);
                  
                  if (p3y ==-100) 
                  
                  {
                      
                     ((Timer) e.getSource()).stop();
               System.out.println("Timer stopped");
            }
               }
            }).start();
         }
      });
         
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.red);
        panel2.setBounds(p2x, p2y, 800, 720);
        
        b2 = new JButton();
        
          b2.setBounds(0, 350, 15, 5);
          
          b2.addActionListener(new ActionListener() 
      {
        public void actionPerformed(ActionEvent e) 
        {
            ((JButton) e.getSource()).setEnabled(false);
            new Timer(1, new ActionListener() 
            {
               public void actionPerformed(ActionEvent e) 
                {
                    p2x = panel2.getX() + 1;
                  panel2.setLocation(p2x, p2y);
                  //if (panel2.getX() + panel2.getWidth() == 0) 
                    
                  if ( p2x == -100 && p2y == 0)
                    {
                     ((Timer) e.getSource()).stop();
                    System.out.println("Timer stopped");
                    }
                }
            }).start();
        }
        
       });
          
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.blue);
        panel3.setBounds(p1x, p1y, 800, 720);
        
        b3 = new JButton();
        
          b3.setBounds(1350, 350, 15, 5);
          
          b3.addActionListener(new ActionListener() 
      {
        public void actionPerformed(ActionEvent e) 
        {
            ((JButton) e.getSource()).setEnabled(false);
            new Timer(1, new ActionListener() 
            {
               public void actionPerformed(ActionEvent e) 
                {
                    p2x = panel3.getX() - 1;
                  panel3.setLocation(p2x, p2y);
                  //if (panel2.getX() + panel2.getWidth() == 0) 
                    
                  if ( p2x == 100 && p2y == 0)
                    {
                     ((Timer) e.getSource()).stop();
                    System.out.println("Timer stopped");
                    }
                }
            }).start();
        }
        
       });
          
          
        
        ImageIcon ic1 = new ImageIcon("E:\\ci.png");
        
        //Button One 
        
        btn1 =new JButton(ic1);
        btn1.setBounds(X,Y,100,50);
        btn1.setOpaque(false);
   
       btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        btn1.setVisible(true);
        btn1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
         btn1.addMouseMotionListener(this);
         btn1.addActionListener(this);
        
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        
         frame.add(btn1);
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        
        
        
        JFXPanel jfxPanel = new JFXPanel();
            frame.add(jfxPanel);


       Platform.runLater(() -> {
       WebView webView = new WebView();
       jfxPanel.setScene(new Scene(webView));
       webView.getEngine().load("http://www.google.com/");
});
      
       
       
       
       
       
       
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);

   
    } 
       public void mouseDragged(MouseEvent e) {
           X = e.getX()+X;
           Y = e.getY()+Y;
           btn1.setBounds(X, Y, 100, 50);
         x=true;
}

@Override
public void mouseMoved(MouseEvent e) {

    
    
     btn1.setLocation(300, 420);

}

  
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
      if(e.getSource()==btn1 && x==true){
          
        btn1.setLocation(300, 420);
          
      }  
      
        
       
    }

     
}