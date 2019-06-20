import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
class MyPuzzle extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;
JLabel lbl;
Icon star ;

Icon samicon1=new ImageIcon("C:\\Users\\meemr\\Desktop\\nfc.jpg");  
Icon samicon2=new ImageIcon("C:\\Users\\meemr\\Desktop\\numb.png");  
Icon samicon3=new ImageIcon("C:\\Users\\meemr\\Desktop\\puzz.jpeg");  
Icon ic1=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo1.png");  
Icon ic2=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo4.png");  
Icon ic3=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo7.png");  
Icon ic4=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo2.png");  
Icon ic5=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo5.png");  
Icon ic6=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo8.png");  
Icon ic7=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo3.png");  
Icon ic8=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo6.png");  
Icon ic9=new ImageIcon("C:\\Users\\meemr\\Desktop\\logo9.png");  
  
Icon ic11=new ImageIcon("C:\\Users\\meemr\\Desktop\\1.png");  
Icon ic12=new ImageIcon("C:\\Users\\meemr\\Desktop\\4.png");  
Icon ic13=new ImageIcon("C:\\Users\\meemr\\Desktop\\7.png");  
Icon ic14=new ImageIcon("C:\\Users\\meemr\\Desktop\\2.png");  
Icon ic15=new ImageIcon("C:\\Users\\meemr\\Desktop\\5.png");  
Icon ic16=new ImageIcon("C:\\Users\\meemr\\Desktop\\8.png");  
Icon ic17=new ImageIcon("C:\\Users\\meemr\\Desktop\\3.png");  
Icon ic18=new ImageIcon("C:\\Users\\meemr\\Desktop\\6.png");  
Icon ic19=new ImageIcon("C:\\Users\\meemr\\Desktop\\9.png");  
  
Icon ic21=new ImageIcon("pic/24.jpg");  
Icon ic22=new ImageIcon("pic/25.jpg");  
Icon ic23=new ImageIcon("pic/21.jpg");  
Icon ic24=new ImageIcon("pic/27.jpg");  
Icon ic25=new ImageIcon("pic/23.jpg");  
Icon ic26=new ImageIcon("pic/29.jpg");  
Icon ic27=new ImageIcon("pic/28.jpg");  
Icon ic28=new ImageIcon("pic/22.jpg");  
Icon ic29=new ImageIcon("pic/26.jpg");  
  int count;
 
MyPuzzle(){  
 
    
super("3in1 Puzzle");  
   count=0;
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
star = b9.getIcon();
sample=new JButton(samicon1);  
sample.setBounds(380,100,200,200);  
  lbl=new JLabel("Moves:     ");
  lbl.setBounds(55,380,70,50);
  lbl.setSize(200, 100);
  Font myFonto = new Font("Serif", Font.BOLD, 22);
lbl.setFont(myFonto);
JLabel l1=new JLabel("Picture");  
l1.setBounds(330,200,70,20); 
l1.setForeground(Color.black);
Font myFont = new Font("Serif", Font.BOLD, 16);
l1.setFont(myFont);
JLabel l2=new JLabel(" NFC-IET BSCS-2K16");  
l2.setBounds(30,26,500,20);
l2.setForeground(Color.black);
Font myFont2 = new Font("Serif", Font.BOLD, 26);
l2.setFont(myFont2);
JLabel l3=new JLabel("Click to Next");

Font myFont3 = new Font("Serif", Font.BOLD, 22);
l3.setFont(myFont3);
l3.setForeground(Color.black);
l3.setBounds(420,320,200,20);  
  
  
starB=new JButton("Exit");  
starB.setBounds(485,400,50,50);  
starB.setSize(80, 40);
starB.setBackground(Color.LIGHT_GRAY);
  
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);  
add(b9);add(sample);add(l1);add(l2);add(starB);add(l3); add(lbl); 
b1.addActionListener(this); b2.addActionListener(this);  
 b3.addActionListener(this); b4.addActionListener(this);   
b5.addActionListener(this); b6.addActionListener(this);  
 b7.addActionListener(this); b8.addActionListener(this);  
 b9.addActionListener(this); starB.addActionListener(this);
  
sample.addActionListener(this);  
setLayout(null);  
setSize(600,500);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}  
  
public void actionPerformed(ActionEvent e)
{  
if(e.getSource()==b1){  
    Icon s1=b1.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b1.setIcon(star);  
      } else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b1.setIcon(star);  
                   } 
      count++;
  }//end of if  
  
if(e.getSource()==b2){  
    Icon s1=b2.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b2.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b2.setIcon(star);  
                   }  
         else if(b3.getIcon()==star){  
                    b3.setIcon(s1);  
                    b2.setIcon(star);  
                   }
      count++;
  }//end of if  
  
if(e.getSource()==b3){  
    Icon s1=b3.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b3.setIcon(star);  
      } else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b3.setIcon(star);  
                   }  
      count++;
  }//end of if  
  
if(e.getSource()==b4){  
    Icon s1=b4.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b4.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b4.setIcon(star);  
                   }  
         else if(b7.getIcon()==star){  
                    b7.setIcon(s1);  
                    b4.setIcon(star);  
                   }  
      count++;
  }//end of if  
  
if(e.getSource()==b5){  
    Icon s1=b5.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b5.setIcon(star);  
      } else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
         else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
          else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b5.setIcon(star);  
                   }
      count++;
  }//end of if  
  
if(e.getSource()==b6){  
    Icon s1=b6.getIcon();  
      if(b3.getIcon()==star){  
        b3.setIcon(s1);  
        b6.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b6.setIcon(star);  
                   }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b6.setIcon(star);  
                   } 
      count++;
}//end of if  
  
if(e.getSource()==b7){  
    Icon s1=b7.getIcon();  
      if(b4.getIcon()==star){  
        b4.setIcon(s1);  
        b7.setIcon(star);  
      } else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b7.setIcon(star);  
                   } 
      count++;
 }//end of if  
  
   if(e.getSource()==b8){  
    Icon s1=b8.getIcon();  
      if(b7.getIcon()==star){  
        b7.setIcon(s1);  
        b8.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b8.setIcon(star);  
                   }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b8.setIcon(star);  
                   }  
              count++;
  }//end of if  
  
 if(e.getSource()==b9){  
    Icon s1=b9.getIcon();  
      if(b8.getIcon()==star){  
        b8.setIcon(s1);  
        b9.setIcon(star);  
      } else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b9.setIcon(star);  
                   }  
      count++;
  }//end of if  
  
if(e.getSource()==sample){  
    count=0;
Icon s1=sample.getIcon();  
 if(s1==samicon3){  
sample.setIcon(samicon1);  
b1.setIcon(ic1);  
b2.setIcon(ic2);  
b3.setIcon(ic3);  
b4.setIcon(ic4);  
b5.setIcon(ic5);  
b6.setIcon(ic6);  
b7.setIcon(ic7);  
b8.setIcon(ic8);  
b9.setIcon(ic9);  
star=b9.getIcon();  
 
}//eof if  
else if(s1==samicon1){  
sample.setIcon(samicon2);  
b1.setIcon(ic11);  
b2.setIcon(ic12);  
b3.setIcon(ic13);  
b4.setIcon(ic14);  
b5.setIcon(ic15);  
b6.setIcon(ic16);  
b7.setIcon(ic17);  
b8.setIcon(ic18);  
b9.setIcon(ic19);  
star=b6.getIcon();  
  
}//eof else  
else{  
sample.setIcon(samicon3);  
b1.setIcon(ic21);  
b2.setIcon(ic22);  
b3.setIcon(ic23);  
b4.setIcon(ic24);  
b5.setIcon(ic25);  
b6.setIcon(ic26);  
b7.setIcon(ic27);  
b8.setIcon(ic28);  
b9.setIcon(ic29);  
star=b6.getIcon();  
 
}//eof else  
  
}
if(e.getSource()==starB){
     
    System.exit(1);
    
   
}//
   lbl.setText("Moves: "+count+"");
}
 
  
public static void main(String args[]){  
    MyPuzzle pic = new MyPuzzle();  
}//end of main  
}//end of class  