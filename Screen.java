import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen extends JPanel {

   private JLabel[][] labels = new JLabel[13][24];
   private GridLayout layout;

   public Screen() {

      //setLocation(315,35);
      layout = new GridLayout(13, 24);
      layout.preferredLayoutSize(this);
      //setBounds(315, 65, 243, 350);
      setBounds(315, 65, 243, 350);
      setLayout(layout);

      for (int i = 0; i < 13; i++) {
         for (int j = 0; j < 24; j++) {
            labels[i][j] = new JLabel();
            labels[i][j].setBackground(Color.BLACK);
            add(labels[i][j]);
         }
      }

      //testing new letter
      for (int i = 0; i < 13; i++) {
         for (int j = 0; j < 24; j++) {
            labels[i][j].setText("T");
            labels[i][j].setForeground(Color.GREEN);
         }
      }

      setBackground(Color.black);
      setVisible(true);
      repaint();
   }

   @Override
   public void paintComponent(Graphics g) {
      //Rotates screen graphics to correct orientation
      Graphics2D g2d = (Graphics2D) g;
      int w2 = getWidth() / 2;
      int h2 = getHeight() / 2;
      g2d.rotate(Math.PI / 2, w2, h2);

      super.paintComponent(g);
      setSize(243,350);

   }
}