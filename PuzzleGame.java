import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
import static java.lang.System.exit;
public class PuzzleGame  implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
JButton reset,exit,coun,help;  
int count;
        
JFrame frm;
Container con;
PuzzleGame(){  
    count=0;
    frm = new JFrame();
    con= frm.getContentPane();
   con.setLayout(new BorderLayout());
 ImageIcon img = new ImageIcon("C:\\Users\\meemr\\Desktop\\hell.jpg");
  frm.setIconImage(img.getImage());
    Panel pnl = new Panel();
    pnl.setLayout(new GridLayout(3,3,5,5));
 help=new JButton("Help");
 b1=new JButton("1");  
 b1.setBackground(Color.WHITE);
 b2=new JButton(" "); 
 
        b2.setIcon(img);
b2.setBackground(Color.DARK_GRAY);
 b3=new JButton("3");  
 b3.setBackground(Color.WHITE);
 b4=new JButton("4"); 
b4.setBackground(Color.WHITE); 
 b5=new JButton("5");
 b5.setBackground(Color.WHITE);
 b6=new JButton("6"); 
b6.setBackground(Color.WHITE); 
 b7=new JButton("7"); 
b7.setBackground(Color.WHITE); 
 b8=new JButton("8");  
 b8.setBackground(Color.WHITE);
 b9=new JButton("2"); 
b9.setBackground(Color.WHITE); 
 reset =new JButton("Reset");  
  exit=new JButton("Exit");
coun = new JButton("Moves");
    
pnl.add(b1);
pnl.add(b2);
pnl.add(b3);
pnl.add(b4);
pnl.add(b5);
pnl.add(b6);
pnl.add(b7);
pnl.add(b8);
pnl.add(b9); 
 

b1.addActionListener(this);  
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this);  
b6.addActionListener(this);  
b7.addActionListener(this);  
b8.addActionListener(this);  
b9.addActionListener(this);  
reset.addActionListener(this);  
  exit.addActionListener(this);
  help.addActionListener(this);
con.add(pnl,BorderLayout.CENTER);
con.add(reset,BorderLayout.NORTH);
con.add(exit,BorderLayout.SOUTH);
con.add(coun,BorderLayout.WEST);
con.add(help,BorderLayout.EAST);
help.setBackground(Color.lightGray);
reset.setBackground(Color.lightGray);
exit.setBackground(Color.lightGray);
coun.setBackground(Color.lightGray);
con.setBackground(Color.lightGray);
con.setForeground(Color.lightGray);  

frm.setSize(430,400); 
frm.setResizable(false);
 frm.setTitle("Puzzle Game Sec-B");
 
frm.setVisible(true);  
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}//end of constructor  
  
@Override
public void actionPerformed(ActionEvent e){  
count++; 
ImageIcon img = new ImageIcon("C:\\Users\\meemr\\Desktop\\hell.jpg");
if(e.getSource()==b1){  
String s=b1.getLabel();  

if(b2.getLabel().equals(" "))
{
    b2.setLabel(s);
    b1.setLabel(" ") ;
    
   if(b1.getLabel().equals(" ")){
    b1.setIcon(img);
    b2.setIcon(null);
   b2.setBackground(Color.WHITE);}
}  
else if(b4.getLabel().equals(" "))
{
    b4.setLabel(s);
    b1.setLabel(" ");
       if(b1.getLabel().equals(" ")){
      
    b1.setIcon(img);
    b4.setIcon(null);
   b4.setBackground(Color.WHITE);}
}  
 }//end of if  
  
if(e.getSource()==b3)
{  
String s=b3.getLabel();  
if(b2.getLabel().equals(" "))
{ b2.setLabel(s); 
b3.setLabel(" ");
   if(b3.getLabel().equals(" ")){
    b3.setIcon(img);
    b2.setIcon(null);
    b2.setBackground(Color.WHITE);}
}  
else
    if(b6.getLabel().equals(" "))
{ b6.setLabel(s); 
b3.setLabel(" ");
   if(b3.getLabel().equals(" ")){
    b3.setIcon(img);
    b6.setIcon(null);
    b6.setBackground(Color.WHITE);}}  
 }//end of if  
  
if(e.getSource()==b2)
{  
String s=b2.getLabel(); 

if(b1.getLabel().equals(" "))
{ b1.setLabel(s); 
b2.setLabel(" ");
   if(b2.getLabel().equals(" ")){
    b2.setIcon(img);
    b1.setIcon(null);
    b1.setBackground(Color.WHITE);}}  
else
    if(b3.getLabel().equals(" "))
{ b3.setLabel(s); 
b2.setLabel(" ");
   if(b2.getLabel().equals(" ")){
    b2.setIcon(img);
    b3.setIcon(null);
    b3.setBackground(Color.WHITE);}} 
    
else
        if(b5.getLabel().equals(" "))
        { b5.setLabel(s);
        b2.setLabel(" ");
      if(b2.getLabel().equals(" ")){
    b2.setIcon(img);
    b5.setIcon(null);
    b5.setBackground(Color.WHITE);}}  
 }//end of if  
  
if(e.getSource()==b4)
{  
String s=b4.getLabel();  
if(b1.getLabel().equals(" "))
{ b1.setLabel(s);
b4.setLabel(" ");
if(b4.getLabel().equals(" ")){
    b4.setIcon(img);
    b1.setIcon(null);
    b1.setBackground(Color.WHITE);}}  
else 
    if(b7.getLabel().equals(" "))
    { b7.setLabel(s);
    b4.setLabel(" ");
    if(b4.getLabel().equals(" ")){
    b4.setIcon(img);
    b7.setIcon(null);
    b7.setBackground(Color.WHITE);}}  
else 
        if(b5.getLabel().equals(" "))
{ b5.setLabel(s);
b4.setLabel(" ");
if(b4.getLabel().equals(" ")){
    b4.setIcon(img);
    b5.setIcon(null);
    b5.setBackground(Color.WHITE);}}  
 }//end of if  
  
if(e.getSource()==b5)
{  
String s=b5.getLabel();  
if(b2.getLabel().equals(" "))
{ b2.setLabel(s);
b5.setLabel(" ");
if(b5.getLabel().equals(" ")){
    b5.setIcon(img);
    b2.setIcon(null);
    b2.setBackground(Color.WHITE);}}  
else
    if(b4.getLabel().equals(" "))
    { b4.setLabel(s);
    b5.setLabel(" ");
   if(b5.getLabel().equals(" ")){
    b5.setIcon(img);
    b4.setIcon(null);
    b4.setBackground(Color.WHITE);}}  
else 
        if(b6.getLabel().equals(" "))
        { b6.setLabel(s);
        b5.setLabel(" ");
       if(b5.getLabel().equals(" ")){
    b5.setIcon(img);
    b6.setIcon(null);
    b6.setBackground(Color.WHITE);}}  
else 
            if(b8.getLabel().equals(" "))
            { b8.setLabel(s); 
            b5.setLabel(" ");
            if(b5.getLabel().equals(" ")){
    b5.setIcon(img);
    b8.setIcon(null);
    b8.setBackground(Color.WHITE);}}  
 }//end of if  
  
if(e.getSource()==b6){  
  
String s=b6.getLabel(); 

if(b9.getLabel().equals(" "))
{ b9.setLabel(s);
b6.setLabel(" ");
if(b6.getLabel().equals(" ")){
    b6.setIcon(img);
    b9.setIcon(null);
    b9.setBackground(Color.WHITE);}}  
else 
    if(b3.getLabel().equals(" "))
    { b3.setLabel(s);
    b6.setLabel(" ");
    if(b6.getLabel().equals(" ")){
    b6.setIcon(img);
    b3.setIcon(null);
    b3.setBackground(Color.WHITE);
    }
    }  
else
        if(b5.getLabel().equals(" "))
        { b5.setLabel(s);
        b6.setLabel(" ");
       if(b6.getLabel().equals(" ")){
    b6.setIcon(img);
    b5.setIcon(null);
    b5.setBackground(Color.WHITE);}}  
  
 }//end of if  
  
if(e.getSource()==b7)
{  
String s=b7.getLabel();  

if(b4.getLabel().equals(" "))
{ b4.setLabel(s); 
b7.setLabel(" ");
if(b7.getLabel().equals(" ")){
    b7.setIcon(img);
    b4.setIcon(null);
    b4.setBackground(Color.WHITE);}}  
else 
    if(b8.getLabel().equals(" "))
{ b8.setLabel(s);
b7.setLabel(" ");
if(b7.getLabel().equals(" ")){
    b7.setIcon(img);
    b8.setIcon(null);
    b8.setBackground(Color.WHITE);}}  
  
 }//end of if  
  
if(e.getSource()==b8){  
String s=b8.getLabel(); 

if(b7.getLabel().equals(" "))
{ b7.setLabel(s); 
b8.setLabel(" ");
if(b8.getLabel().equals(" ")){
    b8.setIcon(img);
    b7.setIcon(null);
    b7.setBackground(Color.WHITE);}
}  
else 
    if(b9.getLabel().equals(" "))
    { b9.setLabel(s);
    b8.setLabel(" ");
  if(b8.getLabel().equals(" ")){
    b8.setIcon(img);
    b9.setIcon(null);
    b9.setBackground(Color.WHITE);}}  
else 
        if(b5.getLabel().equals(" "))
{ b5.setLabel(s);
b8.setLabel(" ");
if(b8.getLabel().equals(" ")){
    b8.setIcon(img);
    b5.setIcon(null);
    b5.setBackground(Color.WHITE);}}  
  
 }//end of if  
  
if(e.getSource()==b9){  
String s=b9.getLabel();  
if(b6.getLabel().equals(" "))
{ b6.setLabel(s);
b9.setLabel(" ");
if(b9.getLabel().equals(" ")){
    b9.setIcon(img);
    b6.setIcon(null);
    b6.setBackground(Color.WHITE);}}  
else
    if(b8.getLabel().equals(" "))
    { b8.setLabel(s);
    b9.setLabel(" ");
   if(b9.getLabel().equals(" ")){
    b9.setIcon(img);
    b8.setIcon(null);
    b8.setBackground(Color.WHITE);}}  
}
if(e.getSource()==reset){
   
  
b4.setLabel("1");  
b9.setLabel("4");  
b1.setLabel("5");  
b3.setLabel("7");  
b5.setLabel("2");  
b6.setLabel("8");  
b7.setLabel("3");  
b8.setLabel("6");
b2.setLabel(" ");
b2.setIcon(img);
b1.setIcon(null);
b3.setIcon(null);
b4.setIcon(null);
b5.setIcon(null);
b6.setIcon(null);
b7.setIcon(null);
b8.setIcon(null);
b9.setIcon(null);
count=0;
}  

if(count==100){
     JOptionPane.showMessageDialog(null,"Out of Moves"); 
   JOptionPane.showMessageDialog(null,"      You Loss  \n\n      Try Again ");
    
}
if(e.getSource()== help){
    JFrame frm1= new JFrame();
    Container con1= frm1.getContentPane();
    JButton btn = new JButton("Inside");
    con1.setLayout(new FlowLayout());
    con.add(btn);
    btn.addActionListener(this);
   frm1.setVisible(true);
   frm1.setSize(200, 300);
   frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

if(e.getSource()==exit){
    exit(1);
}
coun.setText("Moves: "+count+"");

if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()  
.equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")  
&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()  
.equals("8")&&b9.getLabel().equals(" ")){   
JOptionPane.showMessageDialog(null,"Congratulation\n\n     You Won");  
}  
 }//end of if  
  
//end of actionPerformed  
   
  
public static void main(String[] args){  
PuzzleGame obj = new PuzzleGame();  
}
}