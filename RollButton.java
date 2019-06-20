import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/** @see https://stackoverflow.com/a/14410594/230513 */
public class RollButton {

    private static final int N = 64;

    private void display() {
        JFrame f = new JFrame("RollButton");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(new GridLayout());
        p.setBorder(BorderFactory.createEmptyBorder(N, N, N, N));
        p.add(createButton(UIManager.getIcon("ERROR_ICON")));
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    private JButton createButton(Icon icon) {
        JButton b = new JButton();
        b.setBorderPainted(false);
        b.setText("");
        // https://stackoverflow.com/a/14410597/230513
        b.setIcon(new ImageIcon(new BufferedImage(icon.getIconWidth(),
            icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB)));
        b.setRolloverEnabled(true);
        b.setRolloverIcon(icon);
        return b;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new RollButton().display();
            }
        });
    }
}

