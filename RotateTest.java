import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class RotateTest {

   public static class Frame extends JFrame {

      public Frame() {
         Screen screen = new Screen();

         JLayeredPane pane = new JLayeredPane();
         setUndecorated(false);
         setSize(800, 480);

         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         pane.add(screen, 0, 0);
         pane.setVisible(true);
         add(pane);
      }
   }

   public static void main(String[] args) {
      Frame frame = new Frame();
   }

}