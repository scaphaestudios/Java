
import java.awt.Dimension;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

 public class SwingFx extends Application implements Runnable {
  private WebEngine webEngine;
         @Override
         public void start(Stage stage) {
             final SwingNode swingNode = new SwingNode();
             createAndSetSwingContent(swingNode);

             StackPane pane = new StackPane();
             pane.getChildren().add(swingNode);

             stage.setScene(new Scene(pane, 1000, 500));
             stage.show();
         }

         private void createAndSetSwingContent(final SwingNode swingNode) {
             SwingUtilities.invokeLater(new Runnable() {
                 @Override
                 public void run() {
                     
                   
                     
                     JPanel frm = new JPanel();
                     swingNode.setContent(frm);
                     
                     JButton btn =new JButton("Click me!");
                      btn.setBounds(2, 20, 100, 100);
                    frm.add(btn);
                    
                             }
             });
         }
 
         public static void main(String[] args) {
             launch(args);
         }
         public void run() {
        // setup UI
        JFrame frame = new JFrame();
       
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(1024, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFXPanel jfxPanel = new JFXPanel();
        frame.getContentPane().add(jfxPanel);
        frame.pack();

        Platform.runLater(() -> {
            WebView view = new WebView();
           view.getEngine();

            jfxPanel.setScene(new Scene(view));
        
        });

        loadURL("http://www.google.com");
    }
 public void loadURL(final String url) {
        Platform.runLater(() -> {
            webEngine.load(url);
        });
    }
}
     