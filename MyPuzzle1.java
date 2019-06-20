import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*; 

/**
 *
 * @author meemr
 */ 
public class MyPuzzle1 implements ActionListener{ 
    
    JFrame frame3,frame1,frame2 ;  
    Container con ;
    Container co;

    JButton pl, ext;

JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,close,reset,b11,btn1,btn2,btn3,btn4;
JLabel lbl,lb2,lb3,l1;
Icon move ;

Icon level1=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\nfc.jpg");  
Icon level2=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\numb.png");  
Icon level3=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a.png");  
Icon ic1=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo7.png");  
Icon ic2=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo3.png");  
Icon ic3=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo2.png");  
Icon ic4=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo5.png");  
Icon ic5=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo1.png");  
Icon ic6=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo4.png");  
Icon ic7=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo6.png");  
Icon ic8=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo8.png");  
Icon ic9=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\logo9.png");  
  
Icon ic11=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\3.png");  
Icon ic12=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\7.png");  
Icon ic13=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\2.png");  
Icon ic14=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\9.png");  
Icon ic15=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\4.png");  
Icon ic16=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\8.png");  
Icon ic17=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\5.png");  
Icon ic18=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\6.png");  
Icon ic19=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\1.png");  
  
Icon ic21=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a1.png");  
Icon ic22=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a2.png");  
Icon ic23=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a3.png");  
Icon ic24=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a4.png");  
Icon ic25=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a5.png");  
Icon ic26=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a6.png");  
Icon ic27=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a7.png");  
Icon ic28=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a8.png");  
Icon ic29=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\a9.png");  
  int count;
  int left;
 
  public MyPuzzle1(){
      
      MyPuz();
      
      
  }
  
  
public void MyPuz(){ 
    frame2 = new JFrame();
    Container con2= frame2.getContentPane();
    frame2.setExtendedState(frame2.getExtendedState() | frame2.MAXIMIZED_BOTH);
con2.setLayout(null);
frame2.setLayout(null);
    JLabel bkg0=new JLabel(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\new.jpg"));
    frame2.add(bkg0);
    frame2.setTitle("Levels");
    bkg0.setSize(1500,1000);
    bkg0.setLayout(new FlowLayout());
 
    l1 =new JLabel(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\slect.png"));
    bkg0.add(l1);
    
    btn1 = new JButton(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\01.png"));
    btn1.setBackground(Color.BLACK);
    bkg0.add(btn1);
    btn2 = new JButton(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\02.png"));
    bkg0.add(btn2);
    btn2.setBackground(Color.BLACK);
    btn3 =new JButton(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\03.png"));
    bkg0.add(btn3);
    btn3.setBackground(Color.BLACK);
    btn4 = new JButton(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\back.png"));
    bkg0.add(btn4);
    btn4.setBackground(Color.BLACK);
    frame2.setVisible(false);
    
frame1 = new JFrame();

co = frame1.getContentPane();
 frame1.setExtendedState(frame1.getExtendedState() | frame1.MAXIMIZED_BOTH);
co.setLayout(null);
frame1.setLayout(null);
 

    JLabel bkg=new JLabel(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\new.jpg"));
    frame1.add(bkg);
    bkg.setSize(1800,1000);
    bkg.setLayout(new FlowLayout());

    
   pl = new JButton(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\play1.png"));
pl.setBackground(Color.BLACK);
Font myFont = new Font("Serif", Font.BOLD, 22);

pl.setFont(myFont);
bkg.add(pl);
   
    b11=new JButton(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\level.png"));
    Font myFont4 = new Font("Serif", Font.BOLD, 22);
     b11.setBackground(Color.BLACK);
    b11.setSize(100,100);
    b11.setFont(myFont4);
    b11.setBounds(300,100,100,300);
    
    bkg.add(b11);
    


ext = new JButton("EXIT");

ext = new JButton(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\exx.png"));
ext.setBackground(Color.BLACK);

ext.setFont(myFont);    
    pl.addActionListener(this);
    ext.addActionListener(this);
    //co.add(pl);
    
    bkg.add(ext);
  //  co.add(ext);
    frame1.setVisible(true);
 
   
    
    
    
    
 frame3 = new JFrame();
co = frame3.getContentPane();
co.setLayout(null);
JLabel l=new JLabel(new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\new.jpg"));
   
    l.setSize(1800,1100);
   
    l.setLayout(null);
    co.add(l);
 frame3.add(co);
   
   frame3.setResizable(true);
    frame3.setExtendedState(frame3.getExtendedState() | frame3.MAXIMIZED_BOTH);
   frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   
   
   
   frame3.setTitle("NFC-IET");
 
   count=0;
   left=100;
b1=new JButton(ic1);  
b1.setBounds(10,80,100,100);  
b2=new JButton(ic2);  
b2.setBounds(110,80,100,100);  
b3=new JButton(ic3);  
b3.setBounds(210,80,100,100);  
b4=new JButton(ic4);  
b4.setBounds(10,180,100,100);  
b5=new JButton(ic5);  
b5.setBounds(110,180,100,100);  
b6=new JButton(ic6);  
b6.setBounds(210,180,100,100);  
b7=new JButton(ic7);  
b7.setBounds(10,280,100,100);  
b8=new JButton(ic8);  
b8.setBounds(110,280,100,100);  
b9=new JButton(ic9);  
b9.setBounds(210,280,100,100); 
move = b9.getIcon();
sample=new JButton(level1);  
sample.setBounds(880,100,200,200);  
  lbl=new JLabel();
  lbl.setText("Moves : 0");
  lbl.setForeground(Color.BLACK);
  lbl.setBounds(555,380,70,50);
  lbl.setSize(200, 100);
  lbl.setFont(myFont);
  Font myFonto = new Font("Georgia", Font.BOLD, 18);
lbl.setFont(myFonto);
  lb2=new JLabel();
  lb2.setText("Moves Left   : 100");
  lb2.setForeground(Color.LIGHT_GRAY);
  lb2.setBounds(880,25,0,0);
  
  
  lb2.setSize(200, 100);
lb2.setFont(myFonto);

lb3=new JLabel();
  lb3.setText("Total Moves : 100");
  lb3.setForeground(Color.LIGHT_GRAY);
  lb3.setBounds(880,1,50,50);
  lb3.setSize(200, 100);
lb3.setFont(myFonto);



JLabel l1=new JLabel("Picture");  
l1.setBounds(816,200,70,20); 
l1.setForeground(Color.BLACK);
Font myFont1 = new Font("Georgia", Font.BOLD, 16);
l1.setFont(myFont1);
JLabel l2=new JLabel(" NFC-IET BSCS-2K16");  
l2.setBounds(30,26,500,20);
l2.setForeground(Color.BLACK);
Font myFont2 = new Font("Georgia", Font.BOLD, 26);
l2.setFont(myFont2);
JLabel l3=new JLabel("Next Level");
Font myFont3 = new Font("Georgia", Font.BOLD, 16);
l3.setFont(myFont3);
l3.setForeground(Color.BLACK);
l3.setBounds(880,320,200,20);  
  
  reset = new JButton("Reset");
  reset.setBounds(870,400,50,50);  
reset.setSize(100, 40);
reset.setFont(myFont3);
reset.setBackground(Color.WHITE);
close=new JButton("Main Manu");
close.setFont(myFont3);

close.setBounds(985,400,50,50);  
close.setSize(140, 40);
close.setBackground(Color.WHITE);



l.add(b1);l.add(b2);l.add(b3);l.add(b4);l.add(b5);l.add(b6);l.add(b7);l.add(b8);  
l.add(b9);l.add(sample);l.add(l1);l.add(l2);l.add(close);l.add(l3); l.add(lbl); 
l.add(reset);l.add(lb2);l.add(lb3);


b1.addActionListener(this); b2.addActionListener(this);  
 b3.addActionListener(this); b4.addActionListener(this);   
b5.addActionListener(this); b6.addActionListener(this);  
 b7.addActionListener(this); b8.addActionListener(this);  
 b9.addActionListener(this); close.addActionListener(this);
  reset.addActionListener(this);
sample.addActionListener(this);  b11.addActionListener(this);
btn1.addActionListener(this);btn2.addActionListener(this);
btn3.addActionListener(this); btn4.addActionListener(this);


ImageIcon co=new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\nfc.jpg"); 
 frame3.setIconImage(co.getImage());
  

}
public void actionPerformed(ActionEvent e)
{  
    if(e.getSource() == b11){
        
        frame1.setVisible(false);
        frame2.setVisible(true);
        frame3.setVisible(false);
        
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    if(e.getSource()== btn1){
       
        frame2.setVisible(false);
        frame1.setVisible(false);
        frame3.setVisible(true);
        
        count=0;
        left=100;
        sample.setIcon(level1);
         
b1.setIcon(ic1);  
b2.setIcon(ic2);  
b3.setIcon(ic3);  
b4.setIcon(ic4);  
b5.setIcon(ic5);  
b6.setIcon(ic6);  
b7.setIcon(ic7);  
b8.setIcon(ic8);  
b9.setIcon(ic9);  
move=b9.getIcon(); 
        
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    if(e.getSource()==btn2){
        
        
        frame2.setVisible(false);
        frame1.setVisible(false);
        frame3.setVisible(true);
        
        count=0;
        left=100;
        sample.setIcon(level2);
         b1.setIcon(ic11);  
b2.setIcon(ic12);  
b3.setIcon(ic13);  
b4.setIcon(ic14);  
b5.setIcon(ic15);  
b6.setIcon(ic16);  
b7.setIcon(ic17);  
b8.setIcon(ic18);  
b9.setIcon(ic19);  
move=b6.getIcon();  
        
frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    if(e.getSource() == btn3){
    
    frame2.setVisible(false);
        frame1.setVisible(false);
        frame3.setVisible(true);
        
        count=0;
        left=100;
    sample.setIcon(level3);  
b1.setIcon(ic21);  
b2.setIcon(ic22);  
b3.setIcon(ic23);  
b4.setIcon(ic24);  
b5.setIcon(ic25);  
b6.setIcon(ic26);  
b7.setIcon(ic27);  
b8.setIcon(ic28);  
b9.setIcon(ic29);  
move=b6.getIcon();  
    
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    if(e.getSource() == pl)
    {
     frame1.setVisible(false);   
  
frame3.setVisible(true);  

frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    


    }
    if(e.getSource() == ext)
    {
        System.exit(0);
    }
    
    
    
    
    
if(e.getSource()==b1){  
    Icon s1=b1.getIcon();  
      if(b2.getIcon()==move){  
        b2.setIcon(s1);  
        b1.setIcon(move);  
      } else if(b4.getIcon()==move){  
                    b4.setIcon(s1);  
                    b1.setIcon(move);  
                   } 
      count++;
      left--;
  }//end of if  
  
if(e.getSource()==b2){  
    Icon s1=b2.getIcon();  
      if(b1.getIcon()==move){  
        b1.setIcon(s1);  
        b2.setIcon(move);  
      } else if(b5.getIcon()==move){  
                    b5.setIcon(s1);  
                    b2.setIcon(move);  
                   }  
         else if(b3.getIcon()==move){  
                    b3.setIcon(s1);  
                    b2.setIcon(move);  
                   }
      count++;
      left--;
  }//end of if  
  
if(e.getSource()==b3){  
    Icon s1=b3.getIcon();  
      if(b2.getIcon()==move){  
        b2.setIcon(s1);  
        b3.setIcon(move);  
      } else if(b6.getIcon()==move){  
                    b6.setIcon(s1);  
                    b3.setIcon(move);  
                   }  
      count++;
      left--;
  }//end of if  
  
if(e.getSource()==b4){  
    Icon s1=b4.getIcon();  
      if(b1.getIcon()==move){  
        b1.setIcon(s1);  
        b4.setIcon(move);  
      } else if(b5.getIcon()==move){  
                    b5.setIcon(s1);  
                    b4.setIcon(move);  
                   }  
         else if(b7.getIcon()==move){  
                    b7.setIcon(s1);  
                    b4.setIcon(move);  
                   }  
      count++;
      left--;
  }//end of if  
  
if(e.getSource()==b5){  
    Icon s1=b5.getIcon();  
      if(b2.getIcon()==move){  
        b2.setIcon(s1);  
        b5.setIcon(move);  
      } else if(b4.getIcon()==move){  
                    b4.setIcon(s1);  
                    b5.setIcon(move); 
                   }  
         else if(b6.getIcon()==move){  
                    b6.setIcon(s1);  
                    b5.setIcon(move);  
                   }  
          else if(b8.getIcon()==move){  
                    b8.setIcon(s1);  
                    b5.setIcon(move);  
                   }
      count++;
      left--;
  }//end of if  
  
if(e.getSource()==b6){  
    Icon s1=b6.getIcon();  
      if(b3.getIcon()==move){  
        b3.setIcon(s1);  
        b6.setIcon(move);  
      } else if(b5.getIcon()==move){  
                    b5.setIcon(s1);  
                    b6.setIcon(move);  
                   }  
         else if(b9.getIcon()==move){  
                    b9.setIcon(s1);  
                    b6.setIcon(move);  
                   } 
      count++;
      left--;
}//end of if  
  
if(e.getSource()==b7){  
    Icon s1=b7.getIcon();  
      if(b4.getIcon()==move){  
        b4.setIcon(s1);  
        b7.setIcon(move);  
      } else if(b8.getIcon()==move){  
                    b8.setIcon(s1);  
                    b7.setIcon(move);  
                   } 
      count++;
      left--;
 }//end of if  
  
   if(e.getSource()==b8){  
    Icon s1=b8.getIcon();  
      if(b7.getIcon()==move){  
        b7.setIcon(s1);  
        b8.setIcon(move);  
      } else if(b5.getIcon()==move){  
                    b5.setIcon(s1);  
                    b8.setIcon(move);  
                   }  
         else if(b9.getIcon()==move){  
                    b9.setIcon(s1);  
                    b8.setIcon(move);  
                   }  
              count++;
              left--;
  }//end of if  
  
 if(e.getSource()==b9){  
    Icon s1=b9.getIcon();  
      if(b8.getIcon()==move){  
        b8.setIcon(s1);  
        b9.setIcon(move);  
      } else if(b6.getIcon()==move){  
                    b6.setIcon(s1);  
                    b9.setIcon(move);  
                   }  
      count++;
      left--;
  }//end of if  
  
if(e.getSource()==sample){  
    count=0;
    left=100;
Icon s1=sample.getIcon();  
 if(s1==level3){  
sample.setIcon(level1);  
b1.setIcon(ic1);  
b2.setIcon(ic2);  
b3.setIcon(ic3);  
b4.setIcon(ic4);  
b5.setIcon(ic5);  
b6.setIcon(ic6);  
b7.setIcon(ic7);  
b8.setIcon(ic8);  
b9.setIcon(ic9);  
move=b9.getIcon();  
 
}//eof if  
else if(s1==level1){  
sample.setIcon(level2);  
b1.setIcon(ic11);  
b2.setIcon(ic12);  
b3.setIcon(ic13);  
b4.setIcon(ic14);  
b5.setIcon(ic15);  
b6.setIcon(ic16);  
b7.setIcon(ic17);  
b8.setIcon(ic18);  
b9.setIcon(ic19);  
move=b6.getIcon();  
  
}//eof else  
else{  
sample.setIcon(level3);  
b1.setIcon(ic21);  
b2.setIcon(ic22);  
b3.setIcon(ic23);  
b4.setIcon(ic24);  
b5.setIcon(ic25);  
b6.setIcon(ic26);  
b7.setIcon(ic27);  
b8.setIcon(ic28);  
b9.setIcon(ic29);  
move=b6.getIcon();  
 
}//eof else  
  
}
if(e.getSource()==close){
     
    frame3.setVisible(false);
    frame1.setVisible(true);
    
   
}//
if(e.getSource()== reset){
    count = 0;
    left =100 ;
    
    if(sample.getIcon().equals(level1)){  
    
   count=0;
  left=100;
b1.setIcon(ic1);  
b2.setIcon(ic2);  
b3.setIcon(ic3);  
b4.setIcon(ic4);  
b5.setIcon(ic5);  
b6.setIcon(ic6);  
b7.setIcon(ic7);  
b8.setIcon(ic8);  
b9.setIcon(ic9);  
move=b9.getIcon();  
 
}//eof if  
else if(sample.getIcon().equals(level2)){ 
   
    count=0;
    left=100;
b1.setIcon(ic11);  
b2.setIcon(ic12);  
b3.setIcon(ic13);  
b4.setIcon(ic14);  
b5.setIcon(ic15);  
b6.setIcon(ic16);  
b7.setIcon(ic17);  
b8.setIcon(ic18);  
b9.setIcon(ic19);  
move=b6.getIcon();  
  
}//eof else  
else{    
    count=0;
    left=100;
b1.setIcon(ic21);  
b2.setIcon(ic22);  
b3.setIcon(ic23);  
b4.setIcon(ic24);  
b5.setIcon(ic25);  
b6.setIcon(ic26);  
b7.setIcon(ic27);  
b8.setIcon(ic28);  
b9.setIcon(ic29);  
move=b6.getIcon();  
 
}//eof else  
  
}
if(e.getSource()==close){
    
     frame1.setVisible(true);
    frame3.setVisible(false);
frame2.setVisible(false);

frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   
}
    

   lbl.setText("Moves: "+count+"");
   lbl.setForeground(Color.BLACK);
   Font myFont4 = new Font("Serif", Font.BOLD, 22);
   lbl.setFont(myFont4);
   lb2.setText("Moves Left   : "+left);
  lb2.setForeground(Color.BLACK);
if(left==0){
    
   
  
   Icon i = new ImageIcon("C:\\Users\\meemr\\Desktop\\pzl\\i.png");
   JOptionPane.showMessageDialog(
                        null,
                        "You are Out of Moves ",
                        "Sorry !!!", JOptionPane.INFORMATION_MESSAGE,
                        i);
 
}
  
  
  
}
 
  
public static void main(String args[]){  
         MyPuzzle1 obj = new MyPuzzle1();
         obj.MyPuz();
         
}
}