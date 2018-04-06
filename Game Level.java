 public void third(int a)
    {
        x3=new JFrame();
            
        Easy=new JButton("Easy");
        Easy.setBounds(150, 80, 200, 50);
        x3.add(Easy);
            
        Medium=new JButton("Medium");
        Medium.setBounds(150, 180, 200, 50);
        x3.add(Medium);
            
        Legendry=new JButton("Legendry");
        Legendry.setBounds(150, 280, 200, 50);
        x3.add(Legendry);
            
        x3.setTitle("developer-ajay");
        x3.setSize(500,500);
        x3.setLayout(null);
        x3.setVisible(true);
        x3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x2.dispose();
            
            
        Easy.addActionListener(this);
        Medium.addActionListener(this);
        Legendry.addActionListener(this);
    }
    public void easy(int a)
    {
        x4=new JFrame();
        b=true;
        
        mbar=new JMenuBar();
        x4.setJMenuBar(mbar);
        
        file=new JMenu("File");
        mbar.add(file);
        
        level=new JMenu("Level");
        mbar.add(level);
        
        tools=new JMenu("Tools");
        mbar.add(tools);
        
        about=new JMenu("About");
        mbar.add(about);
        
        newgame=new JMenuItem("New Game");
        file.add(newgame);
        playagain=new JMenuItem("Play Again");
        file.add(playagain);
        exit=new JMenuItem("Exit");
        file.add(exit);
        
        easy=new JMenuItem("Easy");
        level.add(easy);
        medium=new JMenuItem("Medium");
        level.add(medium);
        legendry=new JMenuItem("Legendry");
        level.add(legendry);
        
        enter_cheat=new JMenuItem("Cheat Code");
        tools.add(enter_cheat);
        
        aboutgame=new JMenuItem("About Game");
        about.add(aboutgame);
                
        aboutdeveloper=new JMenuItem("About Developer");
        about.add(aboutdeveloper);
        
        sample=new JLabel("Sample Picture");
        sample.setBounds(570,330,100,30);
        x4.add(sample);
        
        sample1= new JButton(picture1);
        sample1.setBounds(510, 130, 200, 200);
        x4.add(sample1);
        
        b1=new JButton(p1);                             
        b1.setBounds(40, 80, 100, 100);
        x4.add(b1);
        
        b2=new JButton(p2);
        b2.setBounds(140, 80, 100, 100);
        x4.add(b2);
        
        b3=new JButton(p3);
        b3.setBounds(240, 80, 100, 100);
        x4.add(b3);
        
        b4=new JButton(p4);
        b4.setBounds(40, 180, 100, 100);
        x4.add(b4);
        
        b5=new JButton(p5);
        b5.setBounds(140, 180, 100, 100);
        x4.add(b5);
        
        b6=new JButton(p6);
        b6.setBounds(240, 180, 100, 100);
        x4.add(b6);
        
        b7=new JButton(p7);
        b7.setBounds(40, 280, 100, 100);
        x4.add(b7);
        
        b8=new JButton(p8);
        b8.setBounds(140, 280, 100, 100);
        x4.add(b8);
        
        b9=new JButton(p9);
        b9.setBounds(240, 280, 100, 100);
        x4.add(b9);
        
        change=b9.getIcon();
        
        x4.setTitle("developer-ajay");
        x4.setSize(1000,700);
        x4.setLayout(null);
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
        newgame.addActionListener(this);
        playagain.addActionListener(this);
        exit.addActionListener(this);
        easy.addActionListener(this);
        medium.addActionListener(this);
        legendry.addActionListener(this);
        enter_cheat.addActionListener(this);
        aboutgame.addActionListener(this);
        aboutdeveloper.addActionListener(this);
    }
    public void medium(int a)
    {
        x5=new JFrame(); 
        c=true;
        
        mbar=new JMenuBar();
        x5.setJMenuBar(mbar);
        
        file=new JMenu("File");
        mbar.add(file);
        
        level=new JMenu("Level");
        mbar.add(level);
        
        tools=new JMenu("Tools");
        mbar.add(tools);
        
        about=new JMenu("About");
        mbar.add(about);
        
        newgame=new JMenuItem("New Game");
        file.add(newgame);
        playagain=new JMenuItem("Play Again");
        file.add(playagain);
        exit=new JMenuItem("Exit");
        file.add(exit);
        
        easy=new JMenuItem("Easy");
        level.add(easy);
        medium=new JMenuItem("Medium");
        level.add(medium);
        legendry=new JMenuItem("Legendry");
        level.add(legendry);
        
        enter_cheat=new JMenuItem("Cheat Code");
        tools.add(enter_cheat);
        
        aboutgame=new JMenuItem("About Game");
        about.add(aboutgame);
        
        aboutdeveloper=new JMenuItem("About Developer");
        about.add(aboutdeveloper);
        
        sample=new JLabel("Sample Picture");
        sample.setBounds(670,380,100,30);
        x5.add(sample);
        
        sample2=new JButton(picture2);
        sample2.setBounds(610, 180, 200, 200);
        x5.add(sample2);
        
        c1=new JButton(q1);                             
        c1.setBounds(40, 80, 100, 100);
        x5.add(c1);
            
        c2=new JButton(q2);                             
        c2.setBounds(140, 80, 100, 100);
        x5.add(c2);
            
        c3=new JButton(q3);                             
        c3.setBounds(240, 80, 100, 100);
        x5.add(c3);
        
        c4=new JButton(q4);                             
        c4.setBounds(340, 80, 100, 100);
        x5.add(c4);
            
        c5=new JButton(q5);                             
        c5.setBounds(40, 180, 100, 100);
        x5.add(c5);
            
        c6=new JButton(q6);                             
        c6.setBounds(140, 180, 100, 100);
        x5.add(c6);
            
        c7=new JButton(q7);                             
        c7.setBounds(240, 180, 100, 100);
        x5.add(c7);
        
        c8=new JButton(q8);                             
        c8.setBounds(340, 180, 100, 100);
        x5.add(c8);
            
        c9=new JButton(q9);                             
        c9.setBounds(40, 280, 100, 100);
        x5.add(c9);
            
        c10=new JButton(q10);                             
        c10.setBounds(140, 280, 100, 100);
        x5.add(c10);
            
        c11=new JButton(q11);                             
        c11.setBounds(240, 280, 100, 100);
        x5.add(c11);
        
        c12=new JButton(q12);                             
        c12.setBounds(340, 280, 100, 100);
        x5.add(c12);
            
        c13=new JButton(q13);                             
        c13.setBounds(40, 380, 100, 100);
        x5.add(c13);
            
        c14=new JButton(q14);                             
        c14.setBounds(140, 380, 100, 100);
        x5.add(c14);
            
        c15=new JButton(q15);                             
        c15.setBounds(240, 380, 100, 100);
        x5.add(c15);
        
        c16=new JButton(q16);                             
        c16.setBounds(340, 380, 100, 100);
        x5.add(c16);
        
        change=c16.getIcon();
            
        x5.setTitle("developer-ajay");
        x5.setSize(1000,700);
        x5.setLayout(null);
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
        newgame.addActionListener(this);
        playagain.addActionListener(this);
        exit.addActionListener(this);
        easy.addActionListener(this);
        medium.addActionListener(this);
        legendry.addActionListener(this);
        enter_cheat.addActionListener(this);
        aboutgame.addActionListener(this);
        aboutdeveloper.addActionListener(this);
    }
    public void legendry(int a)
    {
        x6=new JFrame();
        d=true;
        
        mbar=new JMenuBar();
        x6.setJMenuBar(mbar);
        
        file=new JMenu("File");
        mbar.add(file);
        
        level=new JMenu("Level");
        mbar.add(level);
        
        tools=new JMenu("Tools");
        mbar.add(tools);
        
        about=new JMenu("About");
        mbar.add(about);
        
        newgame=new JMenuItem("New Game");
        file.add(newgame);
        playagain=new JMenuItem("Play Again");
        file.add(playagain);
        exit=new JMenuItem("Exit");
        file.add(exit);
        
        easy=new JMenuItem("Easy");
        level.add(easy);
        medium=new JMenuItem("Medium");
        level.add(medium);
        legendry=new JMenuItem("Legendry");
        level.add(legendry);
        
        enter_cheat=new JMenuItem("Cheat Code");
        tools.add(enter_cheat);
        
        aboutgame=new JMenuItem("About Game");
        about.add(aboutgame);
        
        aboutdeveloper=new JMenuItem("About Developer");
        about.add(aboutdeveloper);
        
        sample=new JLabel("Sample Picture");
        sample.setBounds(670,430,100,30);
        x6.add(sample);
        
        sample3=new JButton(picture3);
        sample3.setBounds(610, 230, 200, 200);
        x6.add(sample3);
            
        d1=new JButton(r1);                             
        d1.setBounds(40, 80, 100, 100);
        x6.add(d1);
            
        d2=new JButton(r2);                             
        d2.setBounds(140, 80, 100, 100);
        x6.add(d2);
            
        d3=new JButton(r3);                             
        d3.setBounds(240, 80, 100, 100);
        x6.add(d3);
        
        d4=new JButton(r4);                             
        d4.setBounds(340, 80, 100, 100);
        x6.add(d4);
        
        d5=new JButton(r5);                             
        d5.setBounds(440, 80, 100, 100);
        x6.add(d5);
            
        d6=new JButton(r6);                             
        d6.setBounds(40, 180, 100, 100);
        x6.add(d6);
            
        d7=new JButton(r7);                             
        d7.setBounds(140, 180, 100, 100);
        x6.add(d7);
            
        d8=new JButton(r8);                             
        d8.setBounds(240, 180, 100, 100);
        x6.add(d8);
        
        d9=new JButton(r9);                             
        d9.setBounds(340, 180, 100, 100);
        x6.add(d9);
        
        d10=new JButton(r10);                             
        d10.setBounds(440, 180, 100, 100);
        x6.add(d10);
            
        d11=new JButton(r11);                             
        d11.setBounds(40, 280, 100, 100);
        x6.add(d11);
            
        d12=new JButton(r12);                             
        d12.setBounds(140, 280, 100, 100);
        x6.add(d12);
            
        d13=new JButton(r13);                             
        d13.setBounds(240, 280, 100, 100);
        x6.add(d13);
        
        d14=new JButton(r14);                             
        d14.setBounds(340, 280, 100, 100);
        x6.add(d14);
        
        d15=new JButton(r15);                             
        d15.setBounds(440, 280, 100, 100);
        x6.add(d15);
            
        d16=new JButton(r16);                             
        d16.setBounds(40, 380, 100, 100);
        x6.add(d16);
            
        d17=new JButton(r17);                             
        d17.setBounds(140, 380, 100, 100);
        x6.add(d17);
            
        d18=new JButton(r18);                             
        d18.setBounds(240, 380, 100, 100);
        x6.add(d18);
        
        d19=new JButton(r19);                             
        d19.setBounds(340, 380, 100, 100);
        x6.add(d19);
        
        d20=new JButton(r20);                             
        d20.setBounds(440, 380, 100, 100);
        x6.add(d20);
            
        d21=new JButton(r21);                             
        d21.setBounds(40, 480, 100, 100);
        x6.add(d21);
            
        d22=new JButton(r22);                             
        d22.setBounds(140, 480, 100, 100);
        x6.add(d22);
            
        d23=new JButton(r23);                             
        d23.setBounds(240, 480, 100, 100);
        x6.add(d23);
        
        d24=new JButton(r24);                             
        d24.setBounds(340, 480, 100, 100);
        x6.add(d24);
        
        d25=new JButton(r25);                             
        d25.setBounds(440, 480, 100, 100);
        x6.add(d25);
        
        change=d25.getIcon();
            
        x6.setTitle("developer-ajay");
        x6.setSize(1000,700);
        x6.setLayout(null);
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
        newgame.addActionListener(this);
        playagain.addActionListener(this);
        exit.addActionListener(this);
        easy.addActionListener(this);
        medium.addActionListener(this);
        legendry.addActionListener(this);
        enter_cheat.addActionListener(this);
        aboutgame.addActionListener(this);
        aboutdeveloper.addActionListener(this);
    }