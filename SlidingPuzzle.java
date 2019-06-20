import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.*;
/**
* A PuzzleTile class; this class inherits from JPanel.
*
* The tiles do not have any numbers painted on them yet.
* The only indication you will be able to visibly see at this point
* is that the 0 tile should be white and the rest gray.
* 
* @author Laurissa
* @version 1.0
* @author Paula
* @version 1.1
* @author LiXu
* @version 1.2
*/

public class PuzzleTile extends JPanel {
private String tileNumber; // the number that will display on the tile.

/**
* This constructor takes in the number you would like
* displayed on this panel and saves it as the String
* instance variable tileNumber. It also determines whether the puzzletile wouid be paint in 
* white color or dark gray. 
*
* @param number The number to paint on the panel.
*/

public PuzzleTile(int number) {
super();
if (number == 0) {
this.setBackground(Color.white);
}
else {
this.setBackground(Color.darkGray);
}
this.tileNumber = "" + number;
}

/**
* This is the paintComponent method that is called by the system. it first paint the background color.
* Then it determine the format of the world on the puzzletile. Finally, it draw the tilenumber on it and set the 
* string in center. Also, it set the border.
* @param g the graphics on the panel. 
*/
public void paintComponent(Graphics g){
super.paintComponent(g); // paint the background color.
g.setColor(Color.white); // set the color of the string on the tile.
Font myFont = new Font("Arial", Font.BOLD, 30);
g.setFont(myFont); // set the font of the string on the tile.
FontMetrics a = g.getFontMetrics();
int heigh = a.getHeight();
int wid = a.stringWidth(tileNumber);
g.drawString(tileNumber,(getWidth()-wid)/2,(getHeight()/2+heigh/2)); // set the string in the center of the tile.
this.setBorder(BorderFactory.createLineBorder(Color.white)); // set the border.
}

/**
* This method return the number on the puzzletile.
* @return String the number on the puzzletile
*/
public String getNumber(){
return this.tileNumber;
}

/**
* This method set the number on the puzzletile.
* @param s the number on the puzzletile
*/
public void setNumber(String s){
this.tileNumber = s;
}

}



/**
* A SlidingPuzzle class; this class implements the MouseListener interface.
*
* the class make a 3×3 puzzletile frame using the PuzzleTile class. It could make the puzzletile change
* color when player holds their mouse button over a tile. When the player complete the game, it will 
* generate a window that asks the player whether to play again or exit.
* 
* @author LiXu
* @version 1.0
*/

public class SlidingPuzzle implements MouseListener{
JFrame myFrame;
ArrayList<PuzzleTile> myList = new ArrayList<PuzzleTile>();
PuzzleTile[] square;

/**
* This method create the game window and add the MouseListener to the tile so that when 
* the player holds their mouse on a tile or click the tile, the system could know.
*/
public void go(){
myFrame = new JFrame("Numeric Sliding Puzzle");
square = new PuzzleTile[9];
myFrame.setLayout(new GridLayout(3,3)); //set the frame to be 3×3.
for(int i=0; i < 9; i++){
PuzzleTile aTile = new PuzzleTile(i);
myList.add(aTile);
// generate 9 puzzletiles and add them to an ArrayList. 
}
for(int i=0; i<9; i++ ){
int index= (int)(Math.random()*myList.size()-1);
square[i] = myList.get(index); 
// randomly get a puzzletile from the ArrayList and add it to an array called square.
square[i].addMouseListener(this); // add mouselistener to it.
myFrame.getContentPane().add(square[i]); // add it to the frame.
myList.remove(index); // remove the puzzletile we have just got from the ArrayList.so that next time we won’t get it any more from the ArrayList.
// this for loop make the puzzletile randomly displayed on the frame.

}
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myFrame.setSize(400,400);
myFrame.setVisible(true);
}

/**
* This method just specifies the method mousePressed as this method in the interface 
* is abstract.
* @param e the mouseevent when occurs
*/
public void mousePressed(MouseEvent e){}

/**
* This method just specifies the method mouseReleased as this method in the interface 
* is abstract.
* @param e the mouseevent when occurs
*/
public void mouseReleased(MouseEvent e){}

/**
* This method could change the color of the tile to gray when the mouse button enter a tile.
* @param e the mouseevent when occurs
*/
public void mouseEntered(MouseEvent e){
if(e.getComponent().getBackground()!= Color.WHITE){
e.getComponent().setBackground(Color.GRAY);
// if the color of the tile is not white, turn the color of it to gray when the mouse button enter a tile.
}
}

/**
* This method could change the color of the tile to dark gray when the mouse button exit a tile.
* @param e the mouseevent when occurs
*/
public void mouseExited(MouseEvent e){
if(e.getComponent().getBackground()!= Color.WHITE){
e.getComponent().setBackground(Color.darkGray);
// if the color of the tile is not white, turn the color of it to garkgray when the mouse button exit a tile.
}
}

/**
* This method could make the tile move to the blank when the player click a tile which is around the blank. It also
* checks whether the player has finished the game and asks the player whether to play again or exit.
* @param e the mouseevent when occurs
*/
public void mouseClicked(MouseEvent e){
int num = 0, choice = 0;
boolean done = true;
int x = e.getComponent().getX(); // get the x coordinate of the tile’s origin which player has clicked.
int y = e.getComponent().getY(); // get the y coordinate of the tile’s origin which player has clicked.
for(int i=0; i<9; i++ ){
if (square[i].getBackground()==Color.WHITE){
num = i;
}
} // this for loop get the white tile in the array called square.
int x2 = square[num].getX(); // get the x coordinate of the white tile’s origin.
int y2 = square[num].getY(); // get the y coordinate of the white tile’s origin.
// just finished the ‘move’ of the tile.

for(int i=0; i<9; i++ ){
// check whether the order of the tile is: blank, 1, 2, 3, 4, 5, 6, 7, 8.
if (square[i].getBackground() == Color.WHITE){
continue;
}
if (!square[i].getNumber().equals("" + i)){
done = false;
break;
}
} // check whether the game is over.
if (done == true){
// if the game is over.
choice = JOptionPane.showConfirmDialog (null, "Would you like to play again?", "You have won!!", JOptionPane.YES_NO_CANCEL_OPTION);
// generate a window with 3 buttons: yes, no, cancel.
if (choice == JOptionPane.YES_OPTION){
// if the player clicks yes button.
myFrame.setVisible(false); // make the current frame invisible.
SlidingPuzzle myGame = new SlidingPuzzle();
myGame.go();
// make a new frame just as the former one.
}
if (choice == JOptionPane.NO_OPTION){
// if the player clicks no button.
System.exit(0); // exit the program.
}
} 
}

/**
* This is the main method.
*/
public static void main(String[] args){
SlidingPuzzle myGame = new SlidingPuzzle();
myGame.go();
}
}