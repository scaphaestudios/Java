import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class SlidingPanel {

   JPanel panel1,panel2,panel4;
   
   int x = 0;
   int y = -350;
   int z = 350;

   public void makeUI() {
      panel1 = new JPanel();
      panel1.setLayout(null);
      panel1.setBackground(Color.RED);
      panel1.setBounds(z, x, 400, 400);
      
      panel2 = new JPanel();
      panel2.setLayout(null);
      panel2.setBackground(Color.BLUE);
      panel2.setBounds(y, x, 400, 400);
      
      panel4 = new JPanel();
      panel4.setLayout(null);
      panel4.setBackground(Color.YELLOW);
      panel4.setBounds(x, y, 400, 400);

      JButton b1 = new JButton("sleft");
      JButton b2 = new JButton("sright");
      JButton b3 = new JButton("sup");
      JButton b4 = new JButton("sdown");
      
      panel1.add(b1);
      panel2.add(b2);
      panel4.add(b4);
      
      b1.setBounds(10, 160, 50, 30);
      b2.setBounds(350, 160, 50, 30);
      b4.setBounds(160, 350, 60, 30);
      
      //Slide Left
      
      b1.addActionListener(new ActionListener() 
      {
        public void actionPerformed(ActionEvent e) 
        {
            ((JButton) e.getSource()).setEnabled(false);
            new Timer(1, new ActionListener() 
            {
               public void actionPerformed(ActionEvent e) 
                {
                    y = panel1.getX() - 1;
                  panel1.setLocation(y, x);
                  //if (panel1.getX() + panel1.getWidth() == 0) 
                    
                  if (x == 0 && y == 0)
                    {
                     ((Timer) e.getSource()).stop();
                    System.out.println("Timer stopped");
                    }
                }
            }).start();
        }
        
       });
      
      //Slide Right
      
      b2.addActionListener(new ActionListener() 
      {
        public void actionPerformed(ActionEvent e) 
        {
            ((JButton) e.getSource()).setEnabled(false);
            new Timer(1, new ActionListener() 
            {
               public void actionPerformed(ActionEvent e) 
                {
                    y = panel2.getX() + 1;
                  panel2.setLocation(y, x);
                  //if (panel2.getX() + panel2.getWidth() == 0) 
                    
                  if ( x == 0 && y == 0)
                    {
                     ((Timer) e.getSource()).stop();
                    System.out.println("Timer stopped");
                    }
                }
            }).start();
        }
        
       });
      
      
      //Slide Down
      
      b4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
            ((JButton) e.getSource()).setEnabled(false);
            new Timer(1, new ActionListener(){
                
                
                
               public void actionPerformed(ActionEvent e) {
                   
                  y = panel4.getY()+1; 
                  panel4.setLocation(x, y);
                  
                  if (x ==0 && y ==0) 
                  
                  {
                      
                     ((Timer) e.getSource()).stop();
               System.out.println("Timer stopped");
            }
               }
            }).start();
         }
      });
     
      
      JFrame frame = new JFrame("Sliding Panel");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400, 400);
      frame.setLocationRelativeTo(null);
      frame.setLayout(null);
      frame.add(panel1);
      frame.add(panel2);
      frame.add(panel4);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new SlidingPanel().makeUI();
         }
      });
   }
}


