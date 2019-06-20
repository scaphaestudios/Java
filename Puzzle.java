
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Myeve1 implements ActionListener
{
    int count;
    int flag;
    
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn10;
    JButton btn11;
    JButton btn12;
    
    JButton strt;
    JButton ext;
    JButton rst;
    JButton help;
    JButton exit;
    JButton title;
    
    JButton move;
    JButton turn;
    
    JButton yes;
    JButton no;
    
    JButton l;
    JButton l1;
    JButton l2;
    JButton l3;
    JButton l4;
    JButton ex;
    
    JLabel ar;
    
    JFrame frm;
    JFrame frm1;
    JFrame frm2;
    JFrame fr;
    
    Container c;
    Container con;
    Container con2;
    Container con3;
    
    Myeve1()
    {
        /* 
            START OF FIRST MAIN MENU WINDOW....
        */
        
        frm1 = new JFrame();
        con2 = frm1.getContentPane();
        
        con2.setLayout(new BorderLayout());
        con2.setBackground(Color.CYAN);
        
        JPanel pl = new JPanel();
        pl.setLayout(new FlowLayout());
        
        
        title = new JButton();
        strt = new JButton();
        ext = new JButton();
        Font fnt = new Font("Verdana", Font.BOLD, 72);
        
        title.setFont(fnt);
        ImageIcon im = new ImageIcon("D:\\swap2.png");
        title.setIcon(im);
        title.setBackground(Color.DARK_GRAY);
        //title.setForeground(Color.CYAN);
        
        //strt.setFont(fnt);
        strt.setBackground(Color.DARK_GRAY);
        ImageIcon img = new ImageIcon("D:\\play.png");
        strt.setIcon(img);
        
        //ext.setFont(fnt);
        ext.setBackground(Color.DARK_GRAY);
        ImageIcon img2 = new ImageIcon("D:\\exit2.png");
        ext.setIcon(img2);
        
        pl.add(strt);
        pl.add(ext);
        
        
        con2.add(pl, BorderLayout.CENTER);
        con2.add(title, BorderLayout.NORTH);
        
        strt.addActionListener(this);
        ext.addActionListener(this);
        
        frm1.setSize(600,500);
        frm1.setTitle("THE SWAP HEROS 2 - 226 - SEC(B)");
        frm1.setVisible(true);
        frm1.setLocation(350, 100);
        frm1.setResizable(false);
        ImageIcon img4 = new ImageIcon("D:\\brain.png");
        frm1.setIconImage(img4.getImage());
        frm1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
        /* 
            END OF FIRST MAIN MENU WINDOW....
        */
        
        
        
        fr = new JFrame();
        c = fr.getContentPane();
        c.setLayout(null);
        
        l = new JButton();
        l1 = new JButton();
        l2 = new JButton();
        l3 = new JButton();
        l4 = new JButton();
        ex = new JButton();
        
        JPanel pp = new JPanel();
        pp.setLayout(null);
        
        JLabel b = new JLabel(new ImageIcon("D:\\bc1.jpg"));
        fr.add(b);
        b.setLayout(new FlowLayout());
        b.setSize(1010, 700);
        
        l.setBackground(Color.DARK_GRAY);
        ImageIcon i1 = new ImageIcon("D:\\sl.jpg");
        l.setIcon(i1);
        
        l1.setBackground(Color.white);
        ImageIcon i2 = new ImageIcon("D:\\lev1.png");
        l1.setIcon(i2);
        l1.addActionListener(this);
        
        l2.setBackground(Color.white);
        ImageIcon i3 = new ImageIcon("D:\\lev2.png");
        l2.setIcon(i3);
        l2.addActionListener(this);
        
        l3.setBackground(Color.white);
        ImageIcon i4 = new ImageIcon("D:\\lev3.png");
        l3.setIcon(i4);
        l3.addActionListener(this);
        
        ex.setBackground(Color.white);
        ImageIcon i5 = new ImageIcon("D:\\ex1.png");
        ex.setIcon(i5);
        ex.addActionListener(this);
        
        b.add(l);
        b.add(l1);
        b.add(l2);
        b.add(l3);
        b.add(ex);
        fr.add(b);
        //c.add(b);
        
        
        
        
        
        /* 
            START OF SECOND GAME WINDOW....
        */
        
        frm = new JFrame();
        con = frm.getContentPane();
        
        con.setLayout(new BorderLayout());
        
        JPanel pnl = new JPanel();
        pnl.setLayout(new GridLayout(3,4,12,12));
        pnl.setBackground(Color.GRAY);
        
        btn1 = new JButton();
        
        //ImageIcon img3 = new ImageIcon("D:\\p.png");
        //btn1.setIcon(img3);
        
        btn2 = new JButton("5");
        btn3 = new JButton("10");
        btn4 = new JButton("1");
        btn5 = new JButton("7");
        btn6 = new JButton("2");
        btn7 = new JButton("9");
        btn8 = new JButton("6");
        btn9 = new JButton("3");
        btn10 = new JButton("8");
        btn11 = new JButton("4");
        btn12 = new JButton("11");
        
        
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        btn10.setBackground(Color.white);
        btn11.setBackground(Color.white);
        btn12.setBackground(Color.white);
        
        rst = new JButton();
        rst.setForeground(Color.CYAN);
        rst.setBackground(Color.DARK_GRAY);
        ImageIcon img8 = new ImageIcon("D:\\reset1.png");
        rst.setIcon(img8);
        
        exit = new JButton();
        ImageIcon img10 = new ImageIcon("D:\\exit.png");
        exit.setIcon(img10);
        exit.setBackground(Color.DARK_GRAY);
        
        help = new JButton();
        //help.setForeground(Color.CYAN);
        help.setBackground(Color.DARK_GRAY);
        ImageIcon img7 = new ImageIcon("D:\\help1.jpg");
        help.setIcon(img7);
        
        JPanel pnl2 = new JPanel();
        pnl2.setLayout(new FlowLayout());
        
        move = new JButton();
        turn = new JButton();  
        
        Font font = new Font("Forte", Font.BOLD, 20);
        Font font1 = new Font("Forte", Font.BOLD, 20);
        Font font2 = new Font("Forte", Font.BOLD, 50);
        
        move.setFont(font1);
        move.setForeground(Color.CYAN);
        move.setBackground(Color.DARK_GRAY);
       
        turn.setFont(font);
        turn.setForeground(Color.CYAN);
        turn.setBackground(Color.DARK_GRAY);
        
       // help.setFont(font1);
        //rst.setFont(font);
        //exit.setFont(font1);
        
        btn1.setFont(font2);
        btn2.setFont(font2);
        btn3.setFont(font2);
        btn4.setFont(font2);
        btn5.setFont(font2);
        btn6.setFont(font2);
        btn7.setFont(font2);
        btn8.setFont(font2);
        btn9.setFont(font2);
        btn10.setFont(font2);
        btn11.setFont(font2);
        btn12.setFont(font2);
        
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        pnl.add(btn4);
        pnl.add(btn5);
        pnl.add(btn6);
        pnl.add(btn7);
        pnl.add(btn8);
        pnl.add(btn9);
        pnl.add(btn10);
        pnl.add(btn11);
        pnl.add(btn12);
        
        pnl2.add(move);
        pnl2.add(help);
        
        
        con.add(pnl, BorderLayout.CENTER);
        con.add(pnl2, BorderLayout.NORTH);
        con.add(exit, BorderLayout.SOUTH);
        con.add(turn, BorderLayout.WEST);
        con.add(rst, BorderLayout.EAST);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        rst.addActionListener(this);
        exit.addActionListener(this);
        help.addActionListener(this); 
        title.addActionListener(this);
        
        frm.setSize(700, 500);
        frm.setLocation(350, 100);
        //frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        /* 
            END OF SECOND GAME WINDOW....
        */
        
        
        /* 
            START OF THIRD EXIT MENU WINDOW....
        */
        
        
        frm2 = new JFrame();
        con3 = frm2.getContentPane();
        con3.setLayout(new BorderLayout());
        
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        
        yes = new JButton();
        no = new JButton();
        ar = new JLabel();
        
        ImageIcon img11 = new ImageIcon("D:\\yes.jpg");
        yes.setIcon(img11);
        yes.setBackground(Color.WHITE);
        
        ImageIcon img12 = new ImageIcon("D:\\no.jpg");
        no.setIcon(img12);
        no.setBackground(Color.WHITE);
        
        ar.setText(" ARE YOU SURE?");
        
        ar.setFont(font2);
        ar.setBackground(Color.DARK_GRAY);
        
        yes.addActionListener(this);
        no.addActionListener(this);
        
        p.add(yes);
        p.add(no);
        
        con3.add(p, BorderLayout.CENTER);
        con3.add(ar, BorderLayout.NORTH);
        
        
        /* 
            END OF THIRD EXIT MENU WINDOW....
        */
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        count = 0;
        flag = 120;
        
        
        move.setText("MOVES LEFT: "+flag);
        turn.setText("TURNS: "+count);
        
       
        ImageIcon m = new ImageIcon("D:\\cr.png");
        //btn1.setIcon(m);
        
        if(e.getSource() == title)
        {
            JOptionPane.showMessageDialog(null,"INFO\n> This Game Is Created By Zeeshan Ahmad.     \n> BSCS - 2K16 - 226 - Section(B).     \n> Under The Supervision Of 'Dr.Naeem Aslam'.     \n\nNOTE:\n  Copying Any Of This Content Is ILLEGAL!   \n\n                  ALL RIGHTS RESERVED.");
        }
        
        if(e.getSource() == strt)
        {
            
            
            fr.setSize(1010,700);
            fr.setTitle("THE SWAP HEROS 2 - 226 - SEC(B)");
            fr.setVisible(true);
            //fr.setLocation(350, 100);
            fr.setResizable(true);
            ImageIcon i = new ImageIcon("D:\\brain.png");
            fr.setIconImage(i.getImage());
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frm1.setVisible(false);
            
        }
        
        if(e.getSource() == l1)
        {
            
            btn1.setIcon(m);
            
            frm.setVisible(true);
            frm.setTitle("THE SWAP HEROS 2 - 226 - SEC(B)");
            ImageIcon img5 = new ImageIcon("D:\\brain.png");
            frm.setIconImage(img5.getImage());   
            
            fr.setVisible(false);
            
            JOptionPane.showMessageDialog(null,"WELCOME TO \"THE SWAP HEROS 2\"\n\n RULES:\n\n 1: Arrange All The Numbers In Order.             \n 2: You Have Only 120 Moves.              \n 3: Cross Movement Is Not Allowed.               \n\n                   BEST OF LUCK!!       \n\n             YOU ARE GOOD TO GO!\n\n          Regards: Dr.Naeem Aslam");
        
        }
        if(e.getSource() == ext)
        {
            System.exit(0);
        }
        
        if(e.getSource() == rst)
        {
            btn1.setText(""); btn2.setText("5"); btn3.setText("10"); btn4.setText("1"); btn5.setText("7");
            btn6.setText("2"); btn7.setText("9"); btn8.setText("6"); btn9.setText("3");btn10.setText("12");
            btn11.setText("4"); btn12.setText("11");
            btn1.setIcon(m);btn2.setIcon(null);btn3.setIcon(null);btn4.setIcon(null);btn5.setIcon(null);
            btn6.setIcon(null);btn7.setIcon(null);btn8.setIcon(null);btn9.setIcon(null);btn10.setIcon(null);
            btn11.setIcon(null);btn12.setIcon(null);
        }
        
        if(e.getSource() == exit)
        {   
            frm.setEnabled(false);
            frm2.setSize(450, 250);
            frm2.setLocation(450, 200);
            frm2.setTitle("THE SWAP HEROS 2 - 226 - SEC(B)");
            ImageIcon img5 = new ImageIcon("D:\\brain.png");
            frm2.setIconImage(img5.getImage());
            frm2.setVisible(true);
            frm2.setResizable(false);
            frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
           //JOptionPane.showMessageDialog(null,"  Thank You For Playing!\n\n     Come Back Soon...!\n\n");
           //System.exit(0);
        }
        
        if(e.getSource() == help)
        {
            JOptionPane.showMessageDialog(null,"WELCOME TO \"THE SWAP HEROS 2\"\n\n RULES:\n\n 1: Arrange All The Numbers In Order.             \n 2: You Have Only 120 Moves.              \n 3: Cross Movement Is Not Allowed.               \n\n         BEST OF LUCK & ENJOY!!       \n\n       Regards: Dr.Naeem Aslam", "HELP", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(e.getSource()==btn1)
        {  
            String i=btn1.getText();  
            if(btn2.getText().equals(""))
            {  
                btn2.setText(i);  
                btn1.setText("");
                count++;
                flag--;
               
                if(btn1.getText().equals(""))
                {
                    btn1.setIcon(m);
                    btn2.setIcon(null);
                }
            }  
            else if(btn5.getText().equals(""))
            {  
                btn5.setText(i);  
                btn1.setText("");
                count++;
                flag--;
                if(btn1.getText().equals(""))
                {
                    btn1.setIcon(m);
                    btn5.setIcon(null);
                }
            }
            
            
        }  
        
        if(e.getSource()==btn2)
        {  
            String label=btn2.getText();  
            if(btn1.getText().equals(""))
            {  
                btn1.setText(label);  
                btn2.setText("");
            }
            else
                if(btn2.getText().equals(""))
                {
                    btn2.setIcon(m);
                    btn1.setIcon(null);
                }
              
            else if(btn3.getText().equals(""))
            {  
                btn3.setText(label);  
                btn2.setText(""); 
                }
            else
                if(btn2.getText().equals(""))
                {
                    btn2.setIcon(m);
                    btn3.setIcon(null);
                }
              
        else
            if(btn6.getText().equals(""))
            {  
                btn6.setText(label);  
                btn2.setText("");
                
                if(btn2.getText().equals(""))
                {
                    btn2.setIcon(m);
                    btn6.setIcon(null);
                }
            }  
            count++;
                flag--;
        }     
    
        if(e.getSource()==btn3)
        {  
            String label=btn3.getText();  
            if(btn2.getText().equals(""))
            {  
                btn2.setText(label);  
                btn3.setText("");
                count++;
                flag--;
                if(btn3.getText().equals(""))
                {
                    btn3.setIcon(m);
                    btn2.setIcon(null);
                }
            }  
            if(btn4.getText().equals(""))
            {  
                btn4.setText(label);  
                btn3.setText("");
                count++;
                flag--;
                if(btn3.getText().equals(""))
                {
                    btn3.setIcon(m);
                    btn4.setIcon(null);
                }
            }
            if(btn7.getText().equals(""))
            {  
                btn7.setText(label);  
                btn3.setText("");
                count++;
                flag--;
                if(btn3.getText().equals(""))
                {
                    btn3.setIcon(m);
                    btn7.setIcon(null);
                }
            }
            
        }  
        
        if(e.getSource()==btn4)
        {  
            String label=btn4.getText();  
            if(btn3.getText().equals(""))
            {  
                btn3.setText(label);  
                btn4.setText("");
                count++;
                flag--;
                if(btn4.getText().equals(""))
                {
                    btn4.setIcon(m);
                    btn3.setIcon(null);
                }
            }  
            if(btn8.getText().equals(""))
            {  
                btn8.setText(label);  
                btn4.setText("");
                count++;
                flag--;
                if(btn4.getText().equals(""))
                {
                    btn4.setIcon(m);
                    btn8.setIcon(null);
                }
            }  
   
        }  
    
        if(e.getSource()==btn5)
        {  
            String label=btn5.getText();  
            if(btn1.getText().equals(""))
            {  
                btn1.setText(label);  
                btn5.setText("");
                count++;
                flag--;
                if(btn5.getText().equals(""))
                {
                    btn5.setIcon(m);
                    btn1.setIcon(null);
                }
            }  
            if(btn6.getText().equals(""))
            {  
                btn6.setText(label);  
                btn5.setText("");
                count++;
                flag--;
                if(btn5.getText().equals(""))
                {
                    btn5.setIcon(m);
                    btn6.setIcon(null);
                }
            }  
            if(btn9.getText().equals(""))
            {  
                btn9.setText(label);  
                btn5.setText("");
                count++;
                flag--;
                if(btn5.getText().equals(""))
                {
                    btn5.setIcon(m);
                    btn9.setIcon(null);
                }
            }  
            
             
        }  
    
        if(e.getSource()==btn6)
        {  
            String label=btn6.getText();  
            if(btn2.getText().equals(""))
            {  
                btn2.setText(label);  
                btn6.setText("");
                count++;
                flag--;
                if(btn6.getText().equals(""))
                {
                    btn6.setIcon(m);
                    btn2.setIcon(null);
                }
            }  
            if(btn5.getText().equals(""))
            {  
                btn5.setText(label);  
                btn6.setText("");
                count++;
                flag--;
                if(btn6.getText().equals(""))
                {
                    btn6.setIcon(m);
                    btn5.setIcon(null);
                }
            }  
            if(btn7.getText().equals(""))
            {  
                btn7.setText(label);  
                btn6.setText(""); 
                count++;
                flag--;
                if(btn6.getText().equals(""))
                {
                    btn6.setIcon(m);
                    btn7.setIcon(null);
                }
            }
            if(btn10.getText().equals(""))
            {  
                btn10.setText(label);  
                btn6.setText("");
                count++;
                flag--;
                if(btn6.getText().equals(""))
                {
                    btn6.setIcon(m);
                    btn10.setIcon(null);
                }
            }
            
        }  
    
        if(e.getSource()==btn7)
        {  
            String label=btn7.getText();  
            if(btn3.getText().equals(""))
            {  
                btn3.setText(label);  
                btn7.setText("");
                count++;
                flag--;
                if(btn7.getText().equals(""))
                {
                    btn7.setIcon(m);
                    btn3.setIcon(null);
                }
            }  
            if(btn6.getText().equals(""))
            {  
                btn6.setText(label);  
                btn7.setText("");
                count++;
                flag--;
                if(btn7.getText().equals(""))
                {
                    btn7.setIcon(m);
                    btn6.setIcon(null);
                }
            }
            if(btn8.getText().equals(""))
            {  
                btn8.setText(label);  
                btn7.setText("");
                count++;
                flag--;
                if(btn7.getText().equals(""))
                {
                    btn7.setIcon(m);
                    btn8.setIcon(null);
                }
            }
            if(btn11.getText().equals(""))
            {  
                btn11.setText(label);  
                btn7.setText("");
                count++;
                flag--;
                if(btn7.getText().equals(""))
                {
                    btn7.setIcon(m);
                    btn11.setIcon(null);
                }
            }
            
        }  
       
        if(e.getSource()==btn8)
        {  
            String label=btn8.getText();  
            if(btn4.getText().equals(""))
            {  
                btn4.setText(label);  
                btn8.setText("");
                count++;
                flag--;
                if(btn8.getText().equals(""))
                {
                    btn8.setIcon(m);
                    btn4.setIcon(null);
                }
            }  
            if(btn7.getText().equals(""))
            {  
                btn7.setText(label);  
                btn8.setText("");
                count++;
                flag--;
                if(btn8.getText().equals(""))
                {
                    btn8.setIcon(m);
                    btn7.setIcon(null);
                }
            }  
            if(btn12.getText().equals(""))
            {  
                btn12.setText(label);  
                btn8.setText("");
                count++;
                flag--;
                if(btn8.getText().equals(""))
                {
                    btn8.setIcon(m);
                    btn12.setIcon(null);
                }
            }  
            
        }  
    
        if(e.getSource()==btn9)
        {  
            String label=btn9.getText();  
            if(btn5.getText().equals(""))
            {  
                btn5.setText(label);  
                btn9.setText("");
                count++;
                flag--;
                if(btn9.getText().equals(""))
                {
                    btn9.setIcon(m);
                    btn5.setIcon(null);
                }
            }  
            if(btn10.getText().equals(""))
            {  
                btn10.setText(label);  
                btn9.setText("");  
                count++;
                flag--;
                if(btn9.getText().equals(""))
                {
                    btn9.setIcon(m);
                    btn10.setIcon(null);
                }
            }
            
        }
        
        if(e.getSource()==btn10)
        {  
            String label=btn10.getText();  
            if(btn6.getText().equals(""))
            {  
                btn6.setText(label);  
                btn10.setText("");
                count++;
                flag--;
                if(btn10.getText().equals(""))
                {
                    btn10.setIcon(m);
                    btn6.setIcon(null);
                }
            }  
            if(btn9.getText().equals(""))
            {  
                btn9.setText(label);  
                btn10.setText("");
                count++;
                flag--;
                if(btn10.getText().equals(""))
                {
                    btn10.setIcon(m);
                    btn9.setIcon(null);
                }
            }  
            if(btn11.getText().equals(""))
            {  
                btn11.setText(label);  
                btn10.setText("");
                count++;
                flag--;
                if(btn10.getText().equals(""))
                {
                    btn10.setIcon(m);
                    btn11.setIcon(null);
                }
            }  
           
        }
        
        if(e.getSource()==btn11)
        {  
            String label=btn11.getText();  
            if(btn7.getText().equals(""))
            { 
                btn7.setText(label);  
                btn11.setText("");
                count++;
                flag--;
                if(btn11.getText().equals(""))
                {
                    btn11.setIcon(m);
                    btn7.setIcon(null);
                }
            }  
            if(btn10.getText().equals(""))
            {  
                btn10.setText(label);  
                btn11.setText("");
                count++;
                flag--;
                if(btn11.getText().equals(""))
                {
                    btn11.setIcon(m);
                    btn10.setIcon(null);
                }
            }  
            if(btn12.getText().equals(""))
            {  
                btn12.setText(label);  
                btn11.setText("");
                count++;
                flag--;
                if(btn11.getText().equals(""))
                {
                    btn11.setIcon(m);
                    btn12.setIcon(null);
                }
            } 
            
        }
        
        if(e.getSource()==btn12)
        {  
            String label=btn12.getText();  
            if(btn8.getText().equals(""))
            {  
                btn8.setText(label);  
                btn12.setText("");
                count++;
                flag--;
                if(btn12.getText().equals(""))
                {
                    btn12.setIcon(m);
                    btn8.setIcon(null);
                }
            }  
            if(btn11.getText().equals(""))
            {  
                btn11.setText(label);  
                btn12.setText("");
                count++;
                flag--;
                if(btn12.getText().equals(""))
                {
                    btn12.setIcon(m);
                    btn11.setIcon(null);
                }
            }
          
        }
        
        if(     btn1.getText().equals("1")&&btn2.getText().equals("2")&&btn3.getText().equals("3")
                &&btn4.getText().equals("4")&&btn5.getText().equals("5")&&btn6.getText().equals("6")
                &&btn7.getText().equals("7")&&btn8.getText().equals("8")&&btn9.getText().equals("9")
                &&btn10.getText().equals("10")&&btn11.getText().equals("11")&&btn12.getText().equals("")
          )
        {
            JOptionPane.showMessageDialog(null,"CONGRATULATIONS!!!\n\n              YOU WON!!!");
        }
        
        if(flag == 0)
        {
            JOptionPane.showMessageDialog(null,"      OOPS....\n\n         OUT OF MOVES!!\n              YOU LOSE!!\n       TRY AGAIN LATER...");
            System.exit(0);
            
        }
        
        move.setText("MOVES LEFT: "+flag);
        turn.setText("TURNS: "+count);
        
        if(e.getSource() == yes)
        {
            
            JOptionPane.showMessageDialog(null,"  Thank You For Playing!\n\n     Come Back Soon...!\n\n");
            
            frm2.setVisible(false);
            frm.setVisible(false);
            frm1.setVisible(true);
            
        }
        if(e.getSource() == no)
        {
            frm.setEnabled(true);
            frm2.setVisible(false);
        }
        
    }
    
    public static void main(String [] ab)
    {
        Myeve1 ob = new Myeve1();
    }

}

