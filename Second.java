public void second_1(int a)
    {
        x2=new JFrame();
            
        jb=new JProgressBar(0,100); 
        jb.setBounds(10, 380, 450, 20);
        jb.setValue(0);
        jb.setStringPainted(true);
        jb.setForeground(Color.BLACK);
        x2.add(jb);
            
        Start=new JButton("Start");                             
        Start.setBounds(130,405,100,50);
        x2.add(Start);
            
        x2.setTitle("developer-ajay");
        x2.setSize(500,500);
        x2.setLayout(null);
        x2.setVisible(true);
        x2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x1.dispose();
            
            
        Start.addActionListener(this);
    }
    public void second_2(int a)
    {
        int i=0;
        while(i<101)
        {
            jb.setValue(i);
            i=i+10;
        }
        
        Next=new JButton("Next");
        Next.setBounds(230,405,100,50);
        x2.add(Next);
            
            
        Next.addActionListener(this);
    }