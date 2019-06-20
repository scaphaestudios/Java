import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class Circle extends JPanel {
   private static final int RADIUS = 300;
   private static final int GAP = 0;
   private static final int PREF_W = 2 * RADIUS + 2 * GAP;
   private static final int PREF_H = PREF_W;
   private static final int SLICES = 150;
   private static final int SIDE = 20;

   public Circle() {
      JPanel panel = new JPanel(null);

      for (int i = 0; i < SLICES; i++) {
         double phi = (i * Math.PI * 2) / SLICES; 
         JButton btn = new JButton();
         btn.setBackground(Color.red);
         int x = (int) (RADIUS * Math.sin(phi) + RADIUS - SIDE / 2) + GAP;
         int y = (int) (RADIUS * Math.cos(phi) + RADIUS - SIDE / 2) + GAP;
         btn.setBounds(x, y, SIDE, SIDE);

         panel.add(btn);
      }

      setLayout(new BorderLayout());
      add(panel);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(PREF_W, PREF_H);
   }

   private static void createAndShowGui() {
      Circle panel = new Circle();

      JFrame frame = new JFrame("PanelsOnCircle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setLocationByPlatform(true);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}