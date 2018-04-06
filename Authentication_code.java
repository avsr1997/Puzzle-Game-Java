import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Basic_implement implements ActionListener{
    JFrame x1,x2,x3,x4,x5,x6;
    JLabel username,password,error,sample;
    JTextField tf1,tf2,tf3,tf4;
    JPasswordField tp1,tp2,tp3,tp4;
    JProgressBar jb;
    JButton sample1,sample2,sample3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;
    JButton d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25; 
    JButton Login,Start,Next,Easy,Medium,Legendry;
    JMenuBar mbar;
    JMenu file,level,tools,about;
    JMenuItem newgame,playagain,exit,easy,medium,legendry,enter_cheat,aboutgame,aboutdeveloper;
    
    Image icon;
    Icon change;
    Icon picture1,picture2,picture3;
    Icon p1,p2,p3,p4,p5,p6,p7,p8,p9;
    Icon q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16;
    Icon r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25;
    
    boolean b,c,d;
    
    //GAME STARTS FROM HERE
   
    public static void main(String[] args) 
    {
        Basic_implement basic_implement =new Basic_implement();
        basic_implement.first(0);
    }
    
    public void first(int a)
    {
        x1=new JFrame();
        
        username=new JLabel("User-ID");
        username.setBounds(10, 110,100, 30);
        x1.add(username);
        
        tf1=new JTextField(4);
        tf1.setBounds(110, 110, 40, 30);
        x1.add(tf1);
        
        tf2=new JTextField(4);
        tf2.setBounds(160, 110, 40, 30);
        x1.add(tf2);
        
        tf3=new JTextField(4);
        tf3.setBounds(210, 110, 40, 30);
        x1.add(tf3);
        
        tf4=new JTextField(4);
        tf4.setBounds(260, 110, 40, 30);
        x1.add(tf4);
        
        password=new JLabel("GAME-KEY");
        password.setBounds(10, 150, 100, 30);
        x1.add(password);
        
        tp1=new JPasswordField(10);
        tp1.setBounds(110, 150, 40, 30);
        x1.add(tp1);
        
        tp1=new JPasswordField(10);
        tp1.setBounds(160, 150, 40, 30);
        x1.add(tp1);
        
        tp1=new JPasswordField(10);
        tp1.setBounds(210, 150, 40, 30);
        x1.add(tp1);
        
        tp1=new JPasswordField(10);
        tp1.setBounds(260, 150, 40, 30);
        x1.add(tp1);
       
        Login=new JButton("LOGIN");
        Login.setBounds(150, 200,100,50);
        x1.add(Login);
        
        error=new JLabel();
        error.setBounds(100, 300, 200, 30);
        x1.add(error);
        
        x1.setTitle("developer-ajay");
        x1.setSize(500,500);
        x1.setLayout(null);
        x1.setVisible(true);
        x1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Login.addActionListener(this);
    }