package puzzle_game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Puzzle_Game implements ActionListener
{
    JLabel w1,w2,w3;
    JButton l1,l2,l3;
    JFrame x1,x2,x3,x4,x5,x6,x7,x8,x9;
    JTextField tf1,tf2,tf3,tf4;
    JProgressBar jb;
    JButton sample1,sample2,sample3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,e1,e2,e3;
    JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,m1,m2,m3;
    JButton d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,h1,h2,h3; 
    JButton Login,Start,Next,Easy,Medium,Legendary,Submit;
    JMenuBar mbar;
    JMenu file,level,tools,change_picture,about;
    JMenuItem newgame,playagain,exit,change_level,sm1,sm2,sm3,aboutgame,aboutdeveloper;

    Image icon;
    Icon change;
    Icon picture1,picture2,picture3;
    Icon ep1,ep2,ep3,mp1,mp2,mp3,hp1,hp2,hp3;
    Icon p1,p2,p3,p4,p5,p6,p7,p8,p9;
    Icon q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16;
    Icon r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25;
    
    boolean b,c,d;
    
    Timer t=new Timer(100,new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            int i=0;
            if(jb.getValue()<100)
            {
                jb.setValue(jb.getValue()+1);
            }
            else if(i==0)
            {
                t.stop();
                Next=new JButton("Next");
                Next.setBackground(Color.ORANGE);
                Next.setBounds(230,405,100,50);
                x2.add(Next);
                new_method();
            }
        }
    });
    
    public void new_method()
    {
         Next.addActionListener(this);
    }
    
    Timer t1=new Timer(1000,new ActionListener() 
    {
        @Override 
        public void actionPerformed(ActionEvent e) 
        {
            int i=Integer.parseInt(l1.getText());
            if(i<=100&&i>0)
            {
                l1.setText(Integer.toString(i-1));
            }
            else if(i==0)
            {
                t1.stop();
                JOptionPane.showMessageDialog(x4, "Time Over");
            }
        }
    });
    
    Timer t2=new Timer(1500,new ActionListener() 
    {
        @Override 
        public void actionPerformed(ActionEvent e) 
        {
            int i=Integer.parseInt(l2.getText());
            if(i<=150&&i>0)
            {
                l2.setText(Integer.toString(i-1));
            }
            else if(i==0)
            {
                t2.stop();
                JOptionPane.showMessageDialog(x5, "Time Over");
            }
        }
    });
    
    Timer t3=new Timer(2000,new ActionListener() 
    {
        @Override 
        public void actionPerformed(ActionEvent e) 
        {
            int i=Integer.parseInt(l3.getText());
            if(i<=200&&i>0)
            {
                l3.setText(Integer.toString(i-1));
            }
            else if(i==0)
            {
                t3.stop();
                JOptionPane.showMessageDialog(x6, "Time Over");
            }
        }
    });
    
    public static void main(String[] args) 
    {
        Puzzle_Game obj=new Puzzle_Game();
        obj.first(0);
    }
    
    public void menu()
    {
        mbar=new JMenuBar();
        if(b==true)
        {
            x4.setJMenuBar(mbar);
        }
        else if(c==true)
        {
            x5.setJMenuBar(mbar);
        }
        else if(d==true)
        {
            x6.setJMenuBar(mbar);
        }
        
        file=new JMenu("File");
        mbar.add(file);
        
        level=new JMenu("Level");
        mbar.add(level);
        
        tools=new JMenu("Tools");
        mbar.add(tools);
        
        change_picture=new JMenu("Change Picture");
        tools.add(change_picture);
        sm1=new JMenuItem("Easy");
        sm2=new JMenuItem("Medium");
        sm3=new JMenuItem("Legendary");
        change_picture.add(sm1);
        change_picture.add(sm2);
        change_picture.add(sm3);

        about=new JMenu("About");
        mbar.add(about);
        
        newgame=new JMenuItem("New Game");
        file.add(newgame);
        playagain=new JMenuItem("Play Again");
        file.add(playagain);
        exit=new JMenuItem("Exit");
        file.add(exit);
        
        change_level=new JMenuItem("Change Level");
        level.add(change_level);

        aboutgame=new JMenuItem("About Game");
        about.add(aboutgame);
                
        aboutdeveloper=new JMenuItem("About Developer");
        about.add(aboutdeveloper);
        
        newgame.addActionListener(this);
        playagain.addActionListener(this);
        exit.addActionListener(this);
        change_level.addActionListener(this);
        sm1.addActionListener(this);
        sm2.addActionListener(this);
        sm3.addActionListener(this);
        aboutgame.addActionListener(this);
        aboutdeveloper.addActionListener(this);
    }
    
    public void first(int a)
    {
        x1=new JFrame();

        tf1=new JTextField(10);
        tf1.setBounds(110,350, 40, 30);
        x1.add(tf1);
        
        tf2=new JTextField(10);
        tf2.setBounds(160, 350, 40, 30);
        x1.add(tf2);
        
        tf3=new JTextField(10);
        tf3.setBounds(210, 350, 40, 30);
        x1.add(tf3);
        
        tf4=new JTextField(10);
        tf4.setBounds(260, 350, 40, 30);
        x1.add(tf4);
       
        Login=new JButton("LOGIN");
        Login.setBackground(Color.ORANGE);
        Login.setBounds(150, 400,100,50);
        x1.add(Login);
        
        w1 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("background_frame_1.jpg")));
        w1.setBounds(0, 0, 500, 500);
        x1.add(w1);
        
        x1.setTitle("Puzzle World");
        x1.setResizable(false);
        x1.setSize(500,500);
        x1.setLayout(null);
        x1.setLocationRelativeTo(null);
        x1.setVisible(true);
        x1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Login.addActionListener(this);
    }
    
    public void second(int a)
    {
        x2=new JFrame();
            
        jb=new JProgressBar(0,100); 
        jb.setBounds(10, 380, 450, 20);
        jb.setValue(0);
        jb.setStringPainted(true);
        jb.setForeground(Color.RED);
        x2.add(jb);
            
        Start=new JButton("Start");
        Start.setBackground(Color.ORANGE);
        Start.setBounds(130,405,100,50);
        x2.add(Start);
        
        w2 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("background_frame_2.jpeg")));
        w2.setBounds(0, 0, 500, 500);
        x2.add(w2);
            
        x2.setTitle("Puzzle World");
        x2.setResizable(false);
        x2.setSize(500,500);
        x2.setLayout(null);
        x2.setLocationRelativeTo(null);
        x2.setVisible(true);
        x2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x1.dispose();            
            
        Start.addActionListener(this);
    }
    
    public void third(int a)
    {
        x3=new JFrame();
            
        Easy=new JButton("Easy");
        Easy.setBackground(Color.ORANGE);
        Easy.setBounds(150, 80, 200, 50);
        x3.add(Easy);
            
        Medium=new JButton("Medium");
        Medium.setBackground(Color.ORANGE);
        Medium.setBounds(150, 180, 200, 50);
        x3.add(Medium);
            
        Legendary=new JButton("Legendary");
        Legendary.setBackground(Color.ORANGE);
        Legendary.setBounds(150, 280, 200, 50);
        x3.add(Legendary);
        
        w3 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("background_frame_2.jpeg")));
        w3.setBounds(0, 0, 500, 500);
        x3.add(w3);
            
        x3.setTitle("Puzzle World");
        x3.setResizable(false);
        x3.setSize(500,500);
        x3.setLayout(null);
        x3.setLocationRelativeTo(null);
        x3.setVisible(true);
        x3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x2.dispose();            
            
        Easy.addActionListener(this);
        Medium.addActionListener(this);
        Legendary.addActionListener(this);
    }
    
    public void easy(int a)
    {
        t1.start();t2.stop();t3.stop();
        x4=new JFrame();
        b=true;
        menu();
      
        l1=new JButton("100");
        l1.setBackground(Color.ORANGE);
        l1.setBounds(560, 50, 100, 50);
        x4.add(l1);
        
        sample1= new JButton(picture1);
        sample1.setBounds(510, 130, 200, 200);
        x4.add(sample1);
        
        b1=new JButton(p5);                             
        b1.setBounds(40, 80, 100, 100);
        x4.add(b1);
        
        b2=new JButton(p8);
        b2.setBounds(140, 80, 100, 100);
        x4.add(b2);
        
        b3=new JButton(p2);
        b3.setBounds(240, 80, 100, 100);
        x4.add(b3);
        
        b4=new JButton(p7);
        b4.setBounds(40, 180, 100, 100);
        x4.add(b4);
        
        b5=new JButton(p4);
        b5.setBounds(140, 180, 100, 100);
        x4.add(b5);
        
        b6=new JButton(p1);
        b6.setBounds(240, 180, 100, 100);
        x4.add(b6);
        
        b7=new JButton(p3);
        b7.setBounds(40, 280, 100, 100);
        x4.add(b7);
        
        b8=new JButton(p6);
        b8.setBounds(140, 280, 100, 100);
        x4.add(b8);
        
        b9=new JButton(p9);
        b9.setBounds(240, 280, 100, 100);
        x4.add(b9);
        
        Submit=new JButton("Submit");
        Submit.setBackground(Color.ORANGE);
        Submit.setBounds(560,350 , 100, 50);
        x4.add(Submit);
        
        change=b9.getIcon();
        
        x4.setTitle("Puzzle World");
        x4.setResizable(false);
        x4.setSize(800,533);
        x4.setLayout(null);
        x4.setLocationRelativeTo(null);
        x4.setVisible(true);
        x4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x3.dispose();            
            
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        Submit.addActionListener(this);
    }
    
    public void medium(int a)
    {
        t2.start();t1.stop();t3.stop();
        x5=new JFrame(); 
        c=true;
        menu();
       
        l2=new JButton("150");
        l2.setBackground(Color.ORANGE);
        l2.setBounds(610, 100, 100, 50);
        x5.add(l2);

        sample2=new JButton(picture2);
        sample2.setBounds(560, 180, 200, 200);
        x5.add(sample2);
        
        c1=new JButton(q7);                             
        c1.setBounds(40, 80, 100, 100);
        x5.add(c1);
            
        c2=new JButton(q12);                             
        c2.setBounds(140, 80, 100, 100);
        x5.add(c2);
            
        c3=new JButton(q13);                             
        c3.setBounds(240, 80, 100, 100);
        x5.add(c3);
        
        c4=new JButton(q6);                             
        c4.setBounds(340, 80, 100, 100);
        x5.add(c4);
            
        c5=new JButton(q2);                             
        c5.setBounds(40, 180, 100, 100);
        x5.add(c5);
            
        c6=new JButton(q4);                             
        c6.setBounds(140, 180, 100, 100);
        x5.add(c6);
            
        c7=new JButton(q10);                             
        c7.setBounds(240, 180, 100, 100);
        x5.add(c7);
        
        c8=new JButton(q3);                             
        c8.setBounds(340, 180, 100, 100);
        x5.add(c8);
            
        c9=new JButton(q11);                             
        c9.setBounds(40, 280, 100, 100);
        x5.add(c9);
            
        c10=new JButton(q14);                             
        c10.setBounds(140, 280, 100, 100);
        x5.add(c10);
            
        c11=new JButton(q1);                             
        c11.setBounds(240, 280, 100, 100);
        x5.add(c11);
        
        c12=new JButton(q8);                             
        c12.setBounds(340, 280, 100, 100);
        x5.add(c12);
            
        c13=new JButton(q15);                             
        c13.setBounds(40, 380, 100, 100);
        x5.add(c13);
            
        c14=new JButton(q5);                             
        c14.setBounds(140, 380, 100, 100);
        x5.add(c14);
            
        c15=new JButton(q9);                             
        c15.setBounds(240, 380, 100, 100);
        x5.add(c15);
        
        c16=new JButton(q16);                             
        c16.setBounds(340, 380, 100, 100);
        x5.add(c16);
        
        Submit=new JButton("Submit");
        Submit.setBackground(Color.ORANGE);
        Submit.setBounds(610, 400, 100, 50);
        x5.add(Submit);
        
        change=c16.getIcon();
            
        x5.setTitle("Puzzle World");
        x5.setResizable(false);
        x5.setSize(850,600);
        x5.setLayout(null);
        x5.setLocationRelativeTo(null);
        x5.setVisible(true);
        x5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x3.dispose();            
            
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);
        c6.addActionListener(this);
        c7.addActionListener(this);
        c8.addActionListener(this);
        c9.addActionListener(this);
        c10.addActionListener(this);
        c11.addActionListener(this);
        c12.addActionListener(this);
        c13.addActionListener(this);
        c14.addActionListener(this);
        c15.addActionListener(this);
        c16.addActionListener(this);
        Submit.addActionListener(this);
    }
    
    public void legendary(int a)
    {
        t3.start();t1.stop();t2.stop();
        x6=new JFrame();
        d=true;
        menu();

        l3=new JButton("200");
        l3.setBackground(Color.ORANGE);
        l3.setBounds(660, 150, 100, 50);
        x6.add(l3);

        sample3=new JButton(picture3);
        sample3.setBounds(610, 230, 200, 200);
        x6.add(sample3);
            
        d1=new JButton(r1);                             
        d1.setBounds(40, 80, 100, 100);
        x6.add(d1);
            
        d2=new JButton(r5);                             
        d2.setBounds(140, 80, 100, 100);
        x6.add(d2);
            
        d3=new JButton(r21);                             
        d3.setBounds(240, 80, 100, 100);
        x6.add(d3);
        
        d4=new JButton(r11);                             
        d4.setBounds(340, 80, 100, 100);
        x6.add(d4);
        
        d5=new JButton(r4);                             
        d5.setBounds(440, 80, 100, 100);
        x6.add(d5);
            
        d6=new JButton(r10);                             
        d6.setBounds(40, 180, 100, 100);
        x6.add(d6);
            
        d7=new JButton(r12);                             
        d7.setBounds(140, 180, 100, 100);
        x6.add(d7);
            
        d8=new JButton(r7);                             
        d8.setBounds(240, 180, 100, 100);
        x6.add(d8);
        
        d9=new JButton(r13);                             
        d9.setBounds(340, 180, 100, 100);
        x6.add(d9);
        
        d10=new JButton(r2);                             
        d10.setBounds(440, 180, 100, 100);
        x6.add(d10);
            
        d11=new JButton(r3);                             
        d11.setBounds(40, 280, 100, 100);
        x6.add(d11);
            
        d12=new JButton(r20);                             
        d12.setBounds(140, 280, 100, 100);
        x6.add(d12);
            
        d13=new JButton(r16);                             
        d13.setBounds(240, 280, 100, 100);
        x6.add(d13);
        
        d14=new JButton(r24);                             
        d14.setBounds(340, 280, 100, 100);
        x6.add(d14);
        
        d15=new JButton(r17);                             
        d15.setBounds(440, 280, 100, 100);
        x6.add(d15);
            
        d16=new JButton(r19);                             
        d16.setBounds(40, 380, 100, 100);
        x6.add(d16);
            
        d17=new JButton(r6);                             
        d17.setBounds(140, 380, 100, 100);
        x6.add(d17);
            
        d18=new JButton(r22);                             
        d18.setBounds(240, 380, 100, 100);
        x6.add(d18);
        
        d19=new JButton(r15);                             
        d19.setBounds(340, 380, 100, 100);
        x6.add(d19);
        
        d20=new JButton(r9);                             
        d20.setBounds(440, 380, 100, 100);
        x6.add(d20);
            
        d21=new JButton(r18);                             
        d21.setBounds(40, 480, 100, 100);
        x6.add(d21);
            
        d22=new JButton(r14);                             
        d22.setBounds(140, 480, 100, 100);
        x6.add(d22);
            
        d23=new JButton(r23);                             
        d23.setBounds(240, 480, 100, 100);
        x6.add(d23);
        
        d24=new JButton(r8);                             
        d24.setBounds(340, 480, 100, 100);
        x6.add(d24);
        
        d25=new JButton(r25);                             
        d25.setBounds(440, 480, 100, 100);
        x6.add(d25);
        
        change=d25.getIcon();
        
        Submit=new JButton("Submit");
        Submit.setBackground(Color.ORANGE);
        Submit.setBounds(660, 450, 100, 50);
        x6.add(Submit);
            
        x6.setTitle("Puzzle World");
        x6.setResizable(false);
        x6.setSize(900,700);
        x6.setLayout(null);
        x6.setLocationRelativeTo(null);
        x6.setVisible(true);
        x6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x3.dispose();
                        
        d1.addActionListener(this);
        d2.addActionListener(this);
        d3.addActionListener(this);
        d4.addActionListener(this);
        d5.addActionListener(this);
        d6.addActionListener(this);
        d7.addActionListener(this);
        d8.addActionListener(this);
        d9.addActionListener(this);
        d10.addActionListener(this);
        d11.addActionListener(this);
        d12.addActionListener(this);
        d13.addActionListener(this);
        d14.addActionListener(this);
        d15.addActionListener(this);
        d16.addActionListener(this);
        d17.addActionListener(this);
        d18.addActionListener(this);
        d19.addActionListener(this);
        d20.addActionListener(this);
        d21.addActionListener(this);
        d22.addActionListener(this);
        d23.addActionListener(this);
        d24.addActionListener(this);
        d25.addActionListener(this);
        Submit.addActionListener(this);
    }
    
    public void picture_easy_selection()
    {
        x7=new JFrame();
        
        ep1=new ImageIcon(getClass().getClassLoader().getResource("e1.jpg"));
        ep2=new ImageIcon(getClass().getClassLoader().getResource("e2.jpeg"));
        ep3=new ImageIcon(getClass().getClassLoader().getResource("e3.jpeg"));
        
        e1=new JButton(ep1);
        e1.setBounds(50, 130, 200, 200);
        x7.add(e1);
            
        e2=new JButton(ep2);
        e2.setBounds(300, 130, 200, 200);
        x7.add(e2);
            
        e3=new JButton(ep3);
        e3.setBounds(550, 130, 200, 200);
        x7.add(e3);
            
        x7.setTitle("Puzzle World");
        x7.setResizable(false);
        x7.setSize(800,533);
        x7.setLayout(null);
        x7.setLocationRelativeTo(null);
        x7.setVisible(true);
        x7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x3.dispose();
            
        e1.addActionListener(this);
        e2.addActionListener(this);
        e3.addActionListener(this);
    }
    
    public void picture_medium_selection()
    {
        x8=new JFrame();
        
        mp1=new ImageIcon(getClass().getClassLoader().getResource("m1.jpg"));
        mp2=new ImageIcon(getClass().getClassLoader().getResource("m2.jpeg"));
        mp3=new ImageIcon(getClass().getClassLoader().getResource("m3.jpeg"));
            
        m1=new JButton(mp1);
        m1.setBounds(50, 130, 200, 200);
        x8.add(m1);
            
        m2=new JButton(mp2);
        m2.setBounds(300, 130, 200, 200);
        x8.add(m2);
            
        m3=new JButton(mp3);
        m3.setBounds(550, 130, 200, 200);
        x8.add(m3);
            
        x8.setTitle("Puzzle World");
        x8.setResizable(false);
        x8.setSize(800,533);
        x8.setLayout(null);
        x8.setLocationRelativeTo(null);
        x8.setVisible(true);
        x8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x3.dispose();
            
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
    }
    
    public void picture_legendary_selection()
    {
        x9=new JFrame();
        
        hp1=new ImageIcon(getClass().getClassLoader().getResource("h1.jpg"));
        hp2=new ImageIcon(getClass().getClassLoader().getResource("h2.jpeg"));
        hp3=new ImageIcon(getClass().getClassLoader().getResource("h3.jpg"));
            
        h1=new JButton(hp1);
        h1.setBounds(50, 130, 200, 200);
        x9.add(h1);
            
        h2=new JButton(hp2);
        h2.setBounds(300, 130, 200, 200);
        x9.add(h2);
            
        h3=new JButton(hp3);
        h3.setBounds(550, 130, 200, 200);
        x9.add(h3);
            
        x9.setTitle("Puzzle World");
        x9.setResizable(false);
        x9.setSize(800,533);
        x9.setLayout(null);
        x9.setLocationRelativeTo(null);
        x9.setVisible(true);
        x9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x3.dispose();
            
        h1.addActionListener(this);
        h2.addActionListener(this);
        h3.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==Login&&"1234".equals(tf1.getText())&&"1234".equals(tf2.getText())&&"1234".equals(tf3.getText())&&"1234".equals(tf4.getText())) 
        {
            second(0);
        }
        else if(e.getSource()==Start)
        {
            t.start();
        }
        else if(e.getSource()==Next)
        {
            third(0);
        }
        else if(e.getSource()==Easy)
        {
            picture_easy_selection();
        }
        else if(e.getSource()==Medium)
        {
            picture_medium_selection();
        }
        else if(e.getSource()==Legendary)
        {
            picture_legendary_selection();
        }
        else if(e.getSource()==e1)
        {
            picture1=new ImageIcon(getClass().getClassLoader().getResource("e1.jpg"));
            p1=new ImageIcon(getClass().getClassLoader().getResource("1.gif"));
            p2=new ImageIcon(getClass().getClassLoader().getResource("2.gif"));
            p3=new ImageIcon(getClass().getClassLoader().getResource("3.gif"));
            p4=new ImageIcon(getClass().getClassLoader().getResource("4.gif"));
            p5=new ImageIcon(getClass().getClassLoader().getResource("5.gif"));
            p6=new ImageIcon(getClass().getClassLoader().getResource("6.gif"));
            p7=new ImageIcon(getClass().getClassLoader().getResource("7.gif"));
            p8=new ImageIcon(getClass().getClassLoader().getResource("8.gif"));
            p9=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            easy(0);
            x7.dispose();
        }
        else if(e.getSource()==e2)
        {
            picture1=new ImageIcon(getClass().getClassLoader().getResource("e2.jpeg"));
            p1=new ImageIcon(getClass().getClassLoader().getResource("9.gif"));
            p2=new ImageIcon(getClass().getClassLoader().getResource("10.gif"));
            p3=new ImageIcon(getClass().getClassLoader().getResource("11.gif"));
            p4=new ImageIcon(getClass().getClassLoader().getResource("12.gif"));
            p5=new ImageIcon(getClass().getClassLoader().getResource("13.gif"));
            p6=new ImageIcon(getClass().getClassLoader().getResource("14.gif"));
            p7=new ImageIcon(getClass().getClassLoader().getResource("15.gif"));
            p8=new ImageIcon(getClass().getClassLoader().getResource("16.gif"));
            p9=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            easy(0);
            x7.dispose();
        }
        else if(e.getSource()==e3)
        {
            picture1=new ImageIcon(getClass().getClassLoader().getResource("e3.jpeg"));
            p1=new ImageIcon(getClass().getClassLoader().getResource("17.gif"));
            p2=new ImageIcon(getClass().getClassLoader().getResource("18.gif"));
            p3=new ImageIcon(getClass().getClassLoader().getResource("19.gif"));
            p4=new ImageIcon(getClass().getClassLoader().getResource("20.gif"));
            p5=new ImageIcon(getClass().getClassLoader().getResource("21.gif"));
            p6=new ImageIcon(getClass().getClassLoader().getResource("22.gif"));
            p7=new ImageIcon(getClass().getClassLoader().getResource("23.gif"));
            p8=new ImageIcon(getClass().getClassLoader().getResource("24.gif"));
            p9=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            easy(0);
            x7.dispose();
        }
        else if(e.getSource()==m1)
        {
            picture2=new ImageIcon(getClass().getClassLoader().getResource("m1.jpg"));
            q1=new ImageIcon(getClass().getClassLoader().getResource("101.gif"));
            q2=new ImageIcon(getClass().getClassLoader().getResource("102.gif"));
            q3=new ImageIcon(getClass().getClassLoader().getResource("103.gif"));
            q4=new ImageIcon(getClass().getClassLoader().getResource("104.gif"));
            q5=new ImageIcon(getClass().getClassLoader().getResource("105.gif"));
            q6=new ImageIcon(getClass().getClassLoader().getResource("106.gif"));
            q7=new ImageIcon(getClass().getClassLoader().getResource("107.gif"));
            q8=new ImageIcon(getClass().getClassLoader().getResource("108.gif"));
            q9=new ImageIcon(getClass().getClassLoader().getResource("109.gif"));
            q10=new ImageIcon(getClass().getClassLoader().getResource("110.gif"));
            q11=new ImageIcon(getClass().getClassLoader().getResource("111.gif"));
            q12=new ImageIcon(getClass().getClassLoader().getResource("112.gif"));
            q13=new ImageIcon(getClass().getClassLoader().getResource("113.gif"));
            q14=new ImageIcon(getClass().getClassLoader().getResource("114.gif"));
            q15=new ImageIcon(getClass().getClassLoader().getResource("115.gif"));
            q16=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            medium(0);
            x8.dispose();
        }
        else if(e.getSource()==m2)
        {
            picture2=new ImageIcon(getClass().getClassLoader().getResource("m2.jpeg"));
            q1=new ImageIcon(getClass().getClassLoader().getResource("116.gif"));
            q2=new ImageIcon(getClass().getClassLoader().getResource("117.gif"));
            q3=new ImageIcon(getClass().getClassLoader().getResource("118.gif"));
            q4=new ImageIcon(getClass().getClassLoader().getResource("119.gif"));
            q5=new ImageIcon(getClass().getClassLoader().getResource("120.gif"));
            q6=new ImageIcon(getClass().getClassLoader().getResource("121.gif"));
            q7=new ImageIcon(getClass().getClassLoader().getResource("122.gif"));
            q8=new ImageIcon(getClass().getClassLoader().getResource("123.gif"));
            q9=new ImageIcon(getClass().getClassLoader().getResource("124.gif"));
            q10=new ImageIcon(getClass().getClassLoader().getResource("125.gif"));
            q11=new ImageIcon(getClass().getClassLoader().getResource("126.gif"));
            q12=new ImageIcon(getClass().getClassLoader().getResource("127.gif"));
            q13=new ImageIcon(getClass().getClassLoader().getResource("128.gif"));
            q14=new ImageIcon(getClass().getClassLoader().getResource("129.gif"));
            q15=new ImageIcon(getClass().getClassLoader().getResource("130.gif"));
            q16=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            medium(0);
            x8.dispose();
        }
        else if(e.getSource()==m3)
        {
            picture2=new ImageIcon(getClass().getClassLoader().getResource("m3.jpeg"));
            q1=new ImageIcon(getClass().getClassLoader().getResource("131.gif"));
            q2=new ImageIcon(getClass().getClassLoader().getResource("132.gif"));
            q3=new ImageIcon(getClass().getClassLoader().getResource("133.gif"));
            q4=new ImageIcon(getClass().getClassLoader().getResource("134.gif"));
            q5=new ImageIcon(getClass().getClassLoader().getResource("135.gif"));
            q6=new ImageIcon(getClass().getClassLoader().getResource("136.gif"));
            q7=new ImageIcon(getClass().getClassLoader().getResource("137.gif"));
            q8=new ImageIcon(getClass().getClassLoader().getResource("138.gif"));
            q9=new ImageIcon(getClass().getClassLoader().getResource("139.gif"));
            q10=new ImageIcon(getClass().getClassLoader().getResource("140.gif"));
            q11=new ImageIcon(getClass().getClassLoader().getResource("141.gif"));
            q12=new ImageIcon(getClass().getClassLoader().getResource("142.gif"));
            q13=new ImageIcon(getClass().getClassLoader().getResource("143.gif"));
            q14=new ImageIcon(getClass().getClassLoader().getResource("144.gif"));
            q15=new ImageIcon(getClass().getClassLoader().getResource("145.gif"));
            q16=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            medium(0);
            x8.dispose();
        }
        else if(e.getSource()==h1)
        {
            picture3=new ImageIcon(getClass().getClassLoader().getResource("h1.jpg"));
            r1=new ImageIcon(getClass().getClassLoader().getResource("201.gif"));
            r2=new ImageIcon(getClass().getClassLoader().getResource("202.gif"));
            r3=new ImageIcon(getClass().getClassLoader().getResource("203.gif"));
            r4=new ImageIcon(getClass().getClassLoader().getResource("204.gif"));
            r5=new ImageIcon(getClass().getClassLoader().getResource("205.gif"));
            r6=new ImageIcon(getClass().getClassLoader().getResource("206.gif"));
            r7=new ImageIcon(getClass().getClassLoader().getResource("207.gif"));
            r8=new ImageIcon(getClass().getClassLoader().getResource("208.gif"));
            r9=new ImageIcon(getClass().getClassLoader().getResource("209.gif"));
            r10=new ImageIcon(getClass().getClassLoader().getResource("210.gif"));
            r11=new ImageIcon(getClass().getClassLoader().getResource("211.gif"));
            r12=new ImageIcon(getClass().getClassLoader().getResource("212.gif"));
            r13=new ImageIcon(getClass().getClassLoader().getResource("213.gif"));
            r14=new ImageIcon(getClass().getClassLoader().getResource("214.gif"));
            r15=new ImageIcon(getClass().getClassLoader().getResource("215.gif"));
            r16=new ImageIcon(getClass().getClassLoader().getResource("216.gif"));
            r17=new ImageIcon(getClass().getClassLoader().getResource("217.gif"));
            r18=new ImageIcon(getClass().getClassLoader().getResource("218.gif"));
            r19=new ImageIcon(getClass().getClassLoader().getResource("219.gif"));
            r20=new ImageIcon(getClass().getClassLoader().getResource("220.gif"));
            r21=new ImageIcon(getClass().getClassLoader().getResource("221.gif"));
            r22=new ImageIcon(getClass().getClassLoader().getResource("222.gif"));
            r23=new ImageIcon(getClass().getClassLoader().getResource("223.gif"));
            r24=new ImageIcon(getClass().getClassLoader().getResource("224.gif"));
            r25=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            legendary(0);
            x9.dispose();
        }
        else if(e.getSource()==h2)
        {
            picture3=new ImageIcon(getClass().getClassLoader().getResource("h2.jpeg"));
            r1=new ImageIcon(getClass().getClassLoader().getResource("225.gif"));
            r2=new ImageIcon(getClass().getClassLoader().getResource("226.gif"));
            r3=new ImageIcon(getClass().getClassLoader().getResource("227.gif"));
            r4=new ImageIcon(getClass().getClassLoader().getResource("228.gif"));
            r5=new ImageIcon(getClass().getClassLoader().getResource("229.gif"));
            r6=new ImageIcon(getClass().getClassLoader().getResource("230.gif"));
            r7=new ImageIcon(getClass().getClassLoader().getResource("231.gif"));
            r8=new ImageIcon(getClass().getClassLoader().getResource("232.gif"));
            r9=new ImageIcon(getClass().getClassLoader().getResource("233.gif"));
            r10=new ImageIcon(getClass().getClassLoader().getResource("234.gif"));
            r11=new ImageIcon(getClass().getClassLoader().getResource("235.gif"));
            r12=new ImageIcon(getClass().getClassLoader().getResource("236.gif"));
            r13=new ImageIcon(getClass().getClassLoader().getResource("237.gif"));
            r14=new ImageIcon(getClass().getClassLoader().getResource("238.gif"));
            r15=new ImageIcon(getClass().getClassLoader().getResource("239.gif"));
            r16=new ImageIcon(getClass().getClassLoader().getResource("240.gif"));
            r17=new ImageIcon(getClass().getClassLoader().getResource("241.gif"));
            r18=new ImageIcon(getClass().getClassLoader().getResource("242.gif"));
            r19=new ImageIcon(getClass().getClassLoader().getResource("243.gif"));
            r20=new ImageIcon(getClass().getClassLoader().getResource("244.gif"));
            r21=new ImageIcon(getClass().getClassLoader().getResource("245.gif"));
            r22=new ImageIcon(getClass().getClassLoader().getResource("246.gif"));
            r23=new ImageIcon(getClass().getClassLoader().getResource("247.gif"));
            r24=new ImageIcon(getClass().getClassLoader().getResource("248.gif"));
            r25=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            legendary(0);
            x9.dispose();
        }
        else if(e.getSource()==h3)
        {
            picture3=new ImageIcon(getClass().getClassLoader().getResource("h3.jpg"));
            r1=new ImageIcon(getClass().getClassLoader().getResource("249.gif"));
            r2=new ImageIcon(getClass().getClassLoader().getResource("250.gif"));
            r3=new ImageIcon(getClass().getClassLoader().getResource("251.gif"));
            r4=new ImageIcon(getClass().getClassLoader().getResource("252.gif"));
            r5=new ImageIcon(getClass().getClassLoader().getResource("253.gif"));
            r6=new ImageIcon(getClass().getClassLoader().getResource("254.gif"));
            r7=new ImageIcon(getClass().getClassLoader().getResource("255.gif"));
            r8=new ImageIcon(getClass().getClassLoader().getResource("256.gif"));
            r9=new ImageIcon(getClass().getClassLoader().getResource("257.gif"));
            r10=new ImageIcon(getClass().getClassLoader().getResource("258.gif"));
            r11=new ImageIcon(getClass().getClassLoader().getResource("259.gif"));
            r12=new ImageIcon(getClass().getClassLoader().getResource("260.gif"));
            r13=new ImageIcon(getClass().getClassLoader().getResource("261.gif"));
            r14=new ImageIcon(getClass().getClassLoader().getResource("262.gif"));
            r15=new ImageIcon(getClass().getClassLoader().getResource("263.gif"));
            r16=new ImageIcon(getClass().getClassLoader().getResource("264.gif"));
            r17=new ImageIcon(getClass().getClassLoader().getResource("265.gif"));
            r18=new ImageIcon(getClass().getClassLoader().getResource("266.gif"));
            r19=new ImageIcon(getClass().getClassLoader().getResource("267.gif"));
            r20=new ImageIcon(getClass().getClassLoader().getResource("268.gif"));
            r21=new ImageIcon(getClass().getClassLoader().getResource("269.gif"));
            r22=new ImageIcon(getClass().getClassLoader().getResource("270.gif"));
            r23=new ImageIcon(getClass().getClassLoader().getResource("271.gif"));
            r24=new ImageIcon(getClass().getClassLoader().getResource("271.gif"));
            r25=new ImageIcon(getClass().getClassLoader().getResource("swap.jpg"));
            
            legendary(0);
            x9.dispose();
        }
        else if(e.getSource()==newgame) 
        {
            if(b==true)
            {
                x4.dispose();
            }
            else if(c==true)
            {
                x5.dispose();
            }
            else if(d==true)
            {
                x6.dispose();
            }
            b=c=d=false;
            first(0);
        }
        else if(e.getSource()==playagain)
        {
            if(b==true)
            {
                x4.dispose();
                b=false;
                easy(0);
            }
            else if(c==true)
            {
                x5.dispose();
                c=false;
                medium(0);
            }
            else if(d==true)
            {
                x6.dispose();
                d=false;
                legendary(0);
            }
        }
        else if(e.getSource()==exit)
        {
            if(b==true)
            {
                int a=JOptionPane.showConfirmDialog(x4, "Are You Sure");
                if(a==JOptionPane.YES_OPTION)
                {
                    b=false;
                    x4.dispose();
                }    
            }
            else if(c==true)
            {
                int a=JOptionPane.showConfirmDialog(x5, "Are You Sure");
                if(a==JOptionPane.YES_OPTION)
                {
                    c=false;
                    x5.dispose();
                }
            }
            else if(d==true)
            {
                int a=JOptionPane.showConfirmDialog(x6, "Are You Sure");
                if(a==JOptionPane.YES_OPTION)
                {
                    d=false;
                    x6.dispose();
                }
            }
        }
        else if(e.getSource()==change_level)
        {
            if(b==true)
            {
                third(0);
                x4.dispose();
            }
            else if(c==true)
            {
                third(0);
                x5.dispose();
            }
            else if(d==true)
            {
                third(0);
                x6.dispose();
            }
            b=c=d=false;
        }
        else if(e.getSource()==sm1)
        {
            if(b==true)
            {
                picture_easy_selection();
                x4.dispose();
            }
            else if(c==true)
            {
                picture_easy_selection();
                x5.dispose();
            }
            else if(d==true)
            {
                picture_easy_selection();
                x6.dispose();
            }
            b=c=d=false;
        }
        else if(e.getSource()==sm2)
        {
            if(b==true)
            {
                picture_medium_selection();
                x4.dispose();
            }
            else if(c==true)
            {
                picture_medium_selection();
                x5.dispose();
            }
            else if(d==true)
            {
                picture_medium_selection();
                x6.dispose();
            }
            b=c=d=false;
        }
        else if(e.getSource()==sm3)
        {
            if(b==true)
            {
                picture_legendary_selection();
                x4.dispose();
            }
            else if(c==true)
            {
                picture_legendary_selection();
                x5.dispose();
            }
            else if(d==true)
            {
                picture_legendary_selection();
                x6.dispose();
            }
            b=c=d=false;
        }
        else if(e.getSource()==aboutgame)
        {
            if(b==true)
            {
                JOptionPane.showMessageDialog(x4, "Java Swing Application");
            }
            else if(c==true)
            {
                JOptionPane.showMessageDialog(x5, "Java Swing Application");
            }
            else if(d==true)
            {
                JOptionPane.showMessageDialog(x6, "Java Swing Application");
            }    
        }
        else if(e.getSource()==aboutdeveloper)
        {
           if(b==true)
            {
                JOptionPane.showMessageDialog(x4, "Version 1.0\nDeveloped by: Ajayveer Singh\nRegistered to: ajayveer.rathore@sitpune.edu.in");
            }
            else if(c==true)
            {
                JOptionPane.showMessageDialog(x5, "Version 1.0\nDeveloped By: Ajayveer Singh\nRegistered to: ajayveer.rathore@sitpune.edu.in");
            }
            else if(d==true)
            {
                JOptionPane.showMessageDialog(x6, "Version 1.0\nDeveloped By: Ajayveer Singh\nRegistered to: ajayveer.rathore@sitpune.edu.in");
            }    
        }
        else if (e.getSource()==b1)
        {
            Icon temp =b1.getIcon();
            if(b2.getIcon()==change)
            {
                b1.setIcon(change);
                b2.setIcon(temp);
            }
            else if(b4.getIcon()==change)
            {
                b1.setIcon(change);
                b4.setIcon(temp);
            }
        }
        else if (e.getSource()==b2)
        {
            Icon temp =b2.getIcon();
            if(b1.getIcon()==change)
            {
                b2.setIcon(change);
                b1.setIcon(temp);
            }
            else if(b3.getIcon()==change)
            {
                b2.setIcon(change);
                b3.setIcon(temp);
            }
            else if(b5.getIcon()==change)
            {
                b2.setIcon(change);
                b5.setIcon(temp);
            }
        }
        else if (e.getSource()==b3)
        {
            Icon temp =b3.getIcon();
            if(b2.getIcon()==change)
            {
                b3.setIcon(change);
                b2.setIcon(temp);
            }
            else if(b6.getIcon()==change)
            {
                b3.setIcon(change);
                b6.setIcon(temp);
            }
        }
        else if (e.getSource()==b4)
        {
            Icon temp =b4.getIcon();
            if(b1.getIcon()==change)
            {
                b4.setIcon(change);
                b1.setIcon(temp);
            }
            else if(b5.getIcon()==change)
            {
                b4.setIcon(change);
                b5.setIcon(temp);
            }
            else if(b7.getIcon()==change)
            {
                b4.setIcon(change);
                b7.setIcon(temp);
            }
        }
        else if (e.getSource()==b5)
        {
            Icon temp =b5.getIcon();
            if(b2.getIcon()==change)
            {
                b5.setIcon(change);
                b2.setIcon(temp);
            }
            else if(b4.getIcon()==change)
            {
                b5.setIcon(change);
                b4.setIcon(temp);
            }
            else if(b6.getIcon()==change)
            {
                b5.setIcon(change);
                b6.setIcon(temp);
            }
            else if(b8.getIcon()==change)
            {
                b5.setIcon(change);
                b8.setIcon(temp);
            }
        }
        else if (e.getSource()==b6)
        {
            Icon temp =b6.getIcon();
            if(b3.getIcon()==change)
            {
                b6.setIcon(change);
                b3.setIcon(temp);
            }
            else if(b5.getIcon()==change)
            {
                b6.setIcon(change);
                b5.setIcon(temp);
            }
            else if(b9.getIcon()==change)
            {
                b6.setIcon(change);
                b9.setIcon(temp);
            }
        }
        else if (e.getSource()==b7)
        {
            Icon temp =b7.getIcon();
            if(b4.getIcon()==change)
            {
                b7.setIcon(change);
                b4.setIcon(temp);
            }
            else if(b8.getIcon()==change)
            {
                b7.setIcon(change);
                b8.setIcon(temp);
            }
        }
        else if (e.getSource()==b8)
        {
            Icon temp =b8.getIcon();
            if(b5.getIcon()==change)
            {
                b8.setIcon(change);
                b5.setIcon(temp);
            }
            else if(b7.getIcon()==change)
            {
                b8.setIcon(change);
                b7.setIcon(temp);
            }
            else if(b9.getIcon()==change)
            {
                b8.setIcon(change);
                b9.setIcon(temp);
            }
        }
        else if (e.getSource()==b9)
        {
            Icon temp =b9.getIcon();
            if(b6.getIcon()==change)
            {
                b9.setIcon(change);
                b6.setIcon(temp);
            }
            else if(b8.getIcon()==change)
            {
                b9.setIcon(change);
                b8.setIcon(temp);
            }
        }
        else if(e.getSource()==c1)
        {
            Icon temp =c1.getIcon();
            if(c2.getIcon()==change)
            {
                c1.setIcon(change);
                c2.setIcon(temp);
            }
            else if(c5.getIcon()==change)
            {
                c1.setIcon(change);
                c5.setIcon(temp);
            }
        }
        else if(e.getSource()==c2)
        {
            Icon temp =c2.getIcon();
            if(c1.getIcon()==change)
            {
                c2.setIcon(change);
                c1.setIcon(temp);
            }
            else if(c3.getIcon()==change)
            {
                c2.setIcon(change);
                c3.setIcon(temp);
            }
            else if(c6.getIcon()==change)
            {
                c2.setIcon(change);
                c6.setIcon(temp);
            }
        }
        else if(e.getSource()==c3)
        {
            Icon temp =c3.getIcon();
            if(c2.getIcon()==change)
            {
                c3.setIcon(change);
                c2.setIcon(temp);
            }
            else if(c4.getIcon()==change)
            {
                c3.setIcon(change);
                c4.setIcon(temp);
            }
            else if(c7.getIcon()==change)
            {
                c3.setIcon(change);
                c7.setIcon(temp);
            }
        }
        else if(e.getSource()==c4)
        {
            Icon temp =c4.getIcon();
            if(c3.getIcon()==change)
            {
                c4.setIcon(change);
                c3.setIcon(temp);
            }
            else if(c8.getIcon()==change)
            {
                c4.setIcon(change);
                c8.setIcon(temp);
            }
        }
        else if(e.getSource()==c5)
        {
            Icon temp =c5.getIcon();
            if(c1.getIcon()==change)
            {
                c5.setIcon(change);
                c1.setIcon(temp);
            }
            else if(c6.getIcon()==change)
            {
                c5.setIcon(change);
                c6.setIcon(temp);
            }
            else if(c9.getIcon()==change)
            {
                c5.setIcon(change);
                c9.setIcon(temp);
            }
        }
        else if(e.getSource()==c6)
        {
            Icon temp =c6.getIcon();
            if(c2.getIcon()==change)
            {
                c6.setIcon(change);
                c2.setIcon(temp);
            }
            else if(c5.getIcon()==change)
            {
                c6.setIcon(change);
                c5.setIcon(temp);
            }
            else if(c7.getIcon()==change)
            {
                c6.setIcon(change);
                c7.setIcon(temp);
            }
            else if(c10.getIcon()==change)
            {
                c6.setIcon(change);
                c10.setIcon(temp);
            }
        }
        else if(e.getSource()==c7)
        {
            Icon temp =c7.getIcon();
            if(c3.getIcon()==change)
            {
                c7.setIcon(change);
                c3.setIcon(temp);
            }
            else if(c6.getIcon()==change)
            {
                c7.setIcon(change);
                c6.setIcon(temp);
            }
            else if(c8.getIcon()==change)
            {
                c7.setIcon(change);
                c8.setIcon(temp);
            }
            else if(c11.getIcon()==change)
            {
                c7.setIcon(change);
                c11.setIcon(temp);
            }
        }
        else if(e.getSource()==c8)
        {
            Icon temp =c8.getIcon();
            if(c4.getIcon()==change)
            {
                c8.setIcon(change);
                c4.setIcon(temp);
            }
            else if(c7.getIcon()==change)
            {
                c8.setIcon(change);
                c7.setIcon(temp);
            }
            else if(c12.getIcon()==change)
            {
                c8.setIcon(change);
                c12.setIcon(temp);
            }
        }
        else if(e.getSource()==c9)
        {
            Icon temp =c9.getIcon();
            if(c5.getIcon()==change)
            {
                c9.setIcon(change);
                c5.setIcon(temp);
            }
            else if(c10.getIcon()==change)
            {
                c9.setIcon(change);
                c10.setIcon(temp);
            }
            else if(c13.getIcon()==change)
            {
                c9.setIcon(change);
                c13.setIcon(temp);
            }
        }
        else if(e.getSource()==c10)
        {
            Icon temp =c10.getIcon();
            if(c6.getIcon()==change)
            {
                c10.setIcon(change);
                c6.setIcon(temp);
            }
            else if(c9.getIcon()==change)
            {
                c10.setIcon(change);
                c9.setIcon(temp);
            }
            else if(c11.getIcon()==change)
            {
                c10.setIcon(change);
                c11.setIcon(temp);
            }
            else if(c14.getIcon()==change)
            {
                c10.setIcon(change);
                c14.setIcon(temp);
            }
        }
        else if(e.getSource()==c11)
        {
            Icon temp =c11.getIcon();
            if(c7.getIcon()==change)
            {
                c11.setIcon(change);
                c7.setIcon(temp);
            }
            else if(c10.getIcon()==change)
            {
                c11.setIcon(change);
                c10.setIcon(temp);
            }
            else if(c12.getIcon()==change)
            {
                c11.setIcon(change);
                c12.setIcon(temp);
            }
            else if(c15.getIcon()==change)
            {
                c11.setIcon(change);
                c15.setIcon(temp);
            }
        }
        else if(e.getSource()==c12)
        {
            Icon temp =c12.getIcon();
            if(c8.getIcon()==change)
            {
                c12.setIcon(change);
                c8.setIcon(temp);
            }
            else if(c11.getIcon()==change)
            {
                c12.setIcon(change);
                c11.setIcon(temp);
            }
            else if(c16.getIcon()==change)
            {
                c12.setIcon(change);
                c16.setIcon(temp);
            }
        }
        else if(e.getSource()==c13)
        {
            Icon temp =c13.getIcon();
            if(c9.getIcon()==change)
            {
                c13.setIcon(change);
                c9.setIcon(temp);
            }
            else if(c14.getIcon()==change)
            {
                c13.setIcon(change);
                c14.setIcon(temp);
            }
        }
        else if(e.getSource()==c14)
        {
            Icon temp =c14.getIcon();
            if(c10.getIcon()==change)
            {
                c14.setIcon(change);
                c10.setIcon(temp);
            }
            else if(c13.getIcon()==change)
            {
                c14.setIcon(change);
                c13.setIcon(temp);
            }
            else if(c15.getIcon()==change)
            {
                c14.setIcon(change);
                c15.setIcon(temp);
            }
        }
        else if(e.getSource()==c15)
        {
            Icon temp =c15.getIcon();
            if(c11.getIcon()==change)
            {
                c15.setIcon(change);
                c11.setIcon(temp);
            }
            else if(c14.getIcon()==change)
            {
                c15.setIcon(change);
                c14.setIcon(temp);
            }
            else if(c16.getIcon()==change)
            {
                c15.setIcon(change);
                c16.setIcon(temp);
            }
        }
        else if(e.getSource()==c16)
        {
            Icon temp =c16.getIcon();
            if(c12.getIcon()==change)
            {
                c16.setIcon(change);
                c12.setIcon(temp);
            }
            else if(c15.getIcon()==change)
            {
                c16.setIcon(change);
                c15.setIcon(temp);
            }
        }
        else if(e.getSource()==d1)
        {
            Icon temp =d1.getIcon();
            if(d2.getIcon()==change)
            {
                d1.setIcon(change);
                d2.setIcon(temp);
            }
            else if(d6.getIcon()==change)
            {
                d1.setIcon(change);
                d6.setIcon(temp);
            }
        }
        else if(e.getSource()==d2)
        {
            Icon temp =d2.getIcon();
            if(d1.getIcon()==change)
            {
                d2.setIcon(change);
                d1.setIcon(temp);
            }
            else if(d3.getIcon()==change)
            {
                d2.setIcon(change);
                d3.setIcon(temp);
            }
            else if(d7.getIcon()==change)
            {
                d2.setIcon(change);
                d7.setIcon(temp);
            }
        }
        else if(e.getSource()==d3)
        {
            Icon temp =d3.getIcon();
            if(d2.getIcon()==change)
            {
                d3.setIcon(change);
                d2.setIcon(temp);
            }
            else if(d4.getIcon()==change)
            {
                d3.setIcon(change);
                d4.setIcon(temp);
            }
            else if(d8.getIcon()==change)
            {
                d3.setIcon(change);
                d8.setIcon(temp);
            }
        }
        else if(e.getSource()==d4)
        {
            Icon temp =d4.getIcon();
            if(d3.getIcon()==change)
            {
                d4.setIcon(change);
                d3.setIcon(temp);
            }
            else if(d5.getIcon()==change)
            {
                d4.setIcon(change);
                d5.setIcon(temp);
            }
            else if(d9.getIcon()==change)
            {
                d4.setIcon(change);
                d9.setIcon(temp);
            }
        }
        else if(e.getSource()==d5)
        {
            Icon temp =d5.getIcon();
            if(d4.getIcon()==change)
            {
                d5.setIcon(change);
                d4.setIcon(temp);
            }
            else if(d10.getIcon()==change)
            {
                d5.setIcon(change);
                d10.setIcon(temp);
            }
        }
        else if(e.getSource()==d6)
        {
            Icon temp =d6.getIcon();
            if(d1.getIcon()==change)
            {
                d6.setIcon(change);
                d1.setIcon(temp);
            }
            else if(d7.getIcon()==change)
            {
                d6.setIcon(change);
                d7.setIcon(temp);
            }
            else if(d11.getIcon()==change)
            {
                d6.setIcon(change);
                d11.setIcon(temp);
            }
        }
        else if(e.getSource()==d7)
        {
            Icon temp =d7.getIcon();
            if(d2.getIcon()==change)
            {
                d7.setIcon(change);
                d2.setIcon(temp);
            }
            else if(d6.getIcon()==change)
            {
                d7.setIcon(change);
                d6.setIcon(temp);
            }
            else if(d8.getIcon()==change)
            {
                d7.setIcon(change);
                d8.setIcon(temp);
            }
            else if(d12.getIcon()==change)
            {
                d7.setIcon(change);
                d12.setIcon(temp);
            }
        }
        else if(e.getSource()==d8)
        {
            Icon temp =d8.getIcon();
            if(d3.getIcon()==change)
            {
                d8.setIcon(change);
                d3.setIcon(temp);
            }
            else if(d7.getIcon()==change)
            {
                d8.setIcon(change);
                d7.setIcon(temp);
            }
            else if(d9.getIcon()==change)
            {
                d8.setIcon(change);
                d9.setIcon(temp);
            }
            else if(d13.getIcon()==change)
            {
                d8.setIcon(change);
                d13.setIcon(temp);
            }
        }
        else if(e.getSource()==d9)
        {
            Icon temp =d9.getIcon();
            if(d4.getIcon()==change)
            {
                d9.setIcon(change);
                d4.setIcon(temp);
            }
            else if(d8.getIcon()==change)
            {
                d9.setIcon(change);
                d8.setIcon(temp);
            }
            else if(d10.getIcon()==change)
            {
                d9.setIcon(change);
                d10.setIcon(temp);
            }
            else if(d14.getIcon()==change)
            {
                d9.setIcon(change);
                d14.setIcon(temp);
            }
        }
        else if(e.getSource()==d10)
        {
            Icon temp =d10.getIcon();
            if(d5.getIcon()==change)
            {
                d10.setIcon(change);
                d5.setIcon(temp);
            }
            else if(d9.getIcon()==change)
            {
                d10.setIcon(change);
                d9.setIcon(temp);
            }
            else if(d15.getIcon()==change)
            {
                d10.setIcon(change);
                d15.setIcon(temp);
            }
        }
        else if(e.getSource()==d11)
        {
            Icon temp =d11.getIcon();
            if(d6.getIcon()==change)
            {
                d11.setIcon(change);
                d6.setIcon(temp);
            }
            else if(d12.getIcon()==change)
            {
                d11.setIcon(change);
                d12.setIcon(temp);
            }
            else if(d16.getIcon()==change)
            {
                d11.setIcon(change);
                d16.setIcon(temp);
            }
        }
        else if(e.getSource()==d12)
        {
            Icon temp =d12.getIcon();
            if(d7.getIcon()==change)
            {
                d12.setIcon(change);
                d7.setIcon(temp);
            }
            else if(d11.getIcon()==change)
            {
                d12.setIcon(change);
                d11.setIcon(temp);
            }
            else if(d13.getIcon()==change)
            {
                d12.setIcon(change);
                d13.setIcon(temp);
            }
            else if(d17.getIcon()==change)
            {
                d12.setIcon(change);
                d17.setIcon(temp);
            }
        }
        else if(e.getSource()==d13)
        {
            Icon temp =d13.getIcon();
            if(d8.getIcon()==change)
            {
                d13.setIcon(change);
                d8.setIcon(temp);
            }
            else if(d12.getIcon()==change)
            {
                d13.setIcon(change);
                d12.setIcon(temp);
            }
            else if(d14.getIcon()==change)
            {
                d13.setIcon(change);
                d14.setIcon(temp);
            }
            else if(d18.getIcon()==change)
            {
                d13.setIcon(change);
                d18.setIcon(temp);
            }
        }
        else if(e.getSource()==d14)
        {
            Icon temp =d14.getIcon();
            if(d9.getIcon()==change)
            {
                d14.setIcon(change);
                d9.setIcon(temp);
            }
            else if(d13.getIcon()==change)
            {
                d14.setIcon(change);
                d13.setIcon(temp);
            }
            else if(d15.getIcon()==change)
            {
                d14.setIcon(change);
                d15.setIcon(temp);
            }
            else if(d19.getIcon()==change)
            {
                d14.setIcon(change);
                d19.setIcon(temp);
            }
        }
        else if(e.getSource()==d15)
        {
            Icon temp =d15.getIcon();
            if(d10.getIcon()==change)
            {
                d15.setIcon(change);
                d10.setIcon(temp);
            }
            else if(d14.getIcon()==change)
            {
                d15.setIcon(change);
                d14.setIcon(temp);
            }
            else if(d20.getIcon()==change)
            {
                d15.setIcon(change);
                d20.setIcon(temp);
            }
        }
        else if(e.getSource()==d16)
        {
            Icon temp =d16.getIcon();
            if(d11.getIcon()==change)
            {
                d16.setIcon(change);
                d11.setIcon(temp);
            }
            else if(d17.getIcon()==change)
            {
                d16.setIcon(change);
                d17.setIcon(temp);
            }
            else if(d21.getIcon()==change)
            {
                d16.setIcon(change);
                d21.setIcon(temp);
            }
        }
        else if(e.getSource()==d17)
        {
            Icon temp =d17.getIcon();
            if(d12.getIcon()==change)
            {
                d17.setIcon(change);
                d12.setIcon(temp);
            }
            else if(d16.getIcon()==change)
            {
                d17.setIcon(change);
                d16.setIcon(temp);
            }
            else if(d18.getIcon()==change)
            {
                d17.setIcon(change);
                d18.setIcon(temp);
            }
            else if(d22.getIcon()==change)
            {
                d17.setIcon(change);
                d22.setIcon(temp);
            }
        }
        else if(e.getSource()==d18)
        {
            Icon temp =d18.getIcon();
            if(d13.getIcon()==change)
            {
                d18.setIcon(change);
                d13.setIcon(temp);
            }
            else if(d17.getIcon()==change)
            {
                d18.setIcon(change);
                d17.setIcon(temp);
            }
            else if(d19.getIcon()==change)
            {
                d18.setIcon(change);
                d19.setIcon(temp);
            }
            else if(d23.getIcon()==change)
            {
                d18.setIcon(change);
                d23.setIcon(temp);
            }
        }
        else if(e.getSource()==d19)
        {
            Icon temp =d19.getIcon();
            if(d14.getIcon()==change)
            {
                d19.setIcon(change);
                d14.setIcon(temp);
            }
            else if(d18.getIcon()==change)
            {
                d19.setIcon(change);
                d18.setIcon(temp);
            }
            else if(d20.getIcon()==change)
            {
                d19.setIcon(change);
                d20.setIcon(temp);
            }
            else if(d24.getIcon()==change)
            {
                d19.setIcon(change);
                d24.setIcon(temp);
            }
        }
        else if(e.getSource()==d20)
        {
            Icon temp =d20.getIcon();
            if(d15.getIcon()==change)
            {
                d20.setIcon(change);
                d15.setIcon(temp);
            }
            else if(d19.getIcon()==change)
            {
                d20.setIcon(change);
                d19.setIcon(temp);
            }
            else if(d25.getIcon()==change)
            {
                d20.setIcon(change);
                d25.setIcon(temp);
            }
        }
        else if(e.getSource()==d21)
        {
            Icon temp =d21.getIcon();
            if(d16.getIcon()==change)
            {
                d21.setIcon(change);
                d16.setIcon(temp);
            }
            else if(d22.getIcon()==change)
            {
                d21.setIcon(change);
                d22.setIcon(temp);
            }
        }
        else if(e.getSource()==d22)
        {
            Icon temp =d22.getIcon();
            if(d17.getIcon()==change)
            {
                d22.setIcon(change);
                d17.setIcon(temp);
            }
            else if(d21.getIcon()==change)
            {
                d22.setIcon(change);
                d21.setIcon(temp);
            }
            else if(d23.getIcon()==change)
            {
                d22.setIcon(change);
                d23.setIcon(temp);
            }
        }
        else if(e.getSource()==d23)
        {
            Icon temp =d23.getIcon();
            if(d18.getIcon()==change)
            {
                d23.setIcon(change);
                d18.setIcon(temp);
            }
            else if(d22.getIcon()==change)
            {
                d23.setIcon(change);
                d22.setIcon(temp);
            }
            else if(d24.getIcon()==change)
            {
                d23.setIcon(change);
                d24.setIcon(temp);
            }
        }
        else if(e.getSource()==d24)
        {
            Icon temp =d24.getIcon();
            if(d19.getIcon()==change)
            {
                d24.setIcon(change);
                d19.setIcon(temp);
            }
            else if(d23.getIcon()==change)
            {
                d24.setIcon(change);
                d23.setIcon(temp);
            }
            else if(d25.getIcon()==change)
            {
                d24.setIcon(change);
                d25.setIcon(temp);
            }
        }
        else if(e.getSource()==d25)
        {
            Icon temp =d25.getIcon();
            if(d20.getIcon()==change)
            {
                d25.setIcon(change);
                d20.setIcon(temp);
            }
            else if(d24.getIcon()==change)
            {
                d25.setIcon(change);
                d24.setIcon(temp);
            }
        }
        else if(e.getSource()==Submit)
        {
            if(b==true)
            {
                if(b1.getIcon()==p1&&b2.getIcon()==p2&&b3.getIcon()==p3&&b4.getIcon()==p4&&b5.getIcon()==p5&&b6.getIcon()==p6&&b7.getIcon()==p7&&b8.getIcon()==p8)
                {
                    JOptionPane.showMessageDialog(x4, "You Win");
                }
            }
            else if(c==true)
            {
                if(c1.getIcon()==q1&&c2.getIcon()==q2&&c3.getIcon()==q3&&c4.getIcon()==q4&&c5.getIcon()==q5&&c6.getIcon()==q6&&c7.getIcon()==q7&&c8.getIcon()==q8&&c9.getIcon()==q9&&c10.getIcon()==q10&&c11.getIcon()==q11&&c12.getIcon()==q12&&c13.getIcon()==q13&&c14.getIcon()==q14&&c15.getIcon()==q15)
                {
                    JOptionPane.showMessageDialog(x5, "You Win");
                }
            }
            else if(d==true)
            {
                if(d1.getIcon()==r1&&d2.getIcon()==r2&&d3.getIcon()==r3&&d4.getIcon()==r4&&d5.getIcon()==r5&&d6.getIcon()==r6&&d7.getIcon()==r7&&d8.getIcon()==r8&&d9.getIcon()==r9&&d10.getIcon()==r10&&d11.getIcon()==r11&&d12.getIcon()==r12&&d13.getIcon()==r13&&d14.getIcon()==r14&&d15.getIcon()==r15&&d16.getIcon()==r16&&d17.getIcon()==r17&&d18.getIcon()==r18&&d19.getIcon()==r19&&d20.getIcon()==r20&&d21.getIcon()==r21&&d22.getIcon()==r22&&d23.getIcon()==r23&&d24.getIcon()==r24)
                {
                    JOptionPane.showMessageDialog(x6, "You Win");
                }
            }
        }
        else if(e.getSource()==sm1)
        {
            
        }
        else if(e.getSource()==sm2)
        {
            
        }
        else if(e.getSource()==sm3)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(x1, "Incorrect ID");
        }
    }
}