import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {

    public static JFrame f = new JFrame("Paintings");
    JPanel panel=new JPanel();
    JScrollPane scrollPane=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    JPanel contentPane = new JPanel(null);
    public  Color c1 = new Color(255,255,204);

    public MainPage () {
    }

    public void showWindow(){

        f.setSize(1600,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(null);
        f.setVisible(true);

        f.getContentPane().setBackground( c1 );


        Icon daVinci = new ImageIcon("da Vinci.jpg");
        Icon vincent = new ImageIcon("Van Gogh.jpg");
        Icon picasso = new ImageIcon("picasso.jpg");
        Icon caravaggio = new ImageIcon("caravaggio.jpg");
        Icon claude = new ImageIcon("claude.jpg");
        Icon rembrandt = new ImageIcon("rembrandt.jpg");
        Icon pierre = new ImageIcon("pierre.jpg");
        Icon johannes = new ImageIcon("johannes.jpg");


        JButton p1=new JButton(daVinci);
        JButton p2=new JButton(vincent);
        JButton p3=new JButton(picasso);
        JButton p4=new JButton(caravaggio);
        JButton p5=new JButton(claude);
        JButton p6=new JButton(rembrandt);
        JButton p7=new JButton(pierre);
        JButton p8=new JButton(johannes);

        PaintingFrame paint1 = new PaintingFrame("1", "Dama cu Hermina","da Vinci.jpg");
        PaintingFrame paint2 = new PaintingFrame("2", "Noapte Instelata","Van Gogh.jpg");
        PaintingFrame paint3 = new PaintingFrame("3", "Batranul chitarist","picasso.jpg");
        PaintingFrame paint4 = new PaintingFrame("4", "Iudita tăind capul lui Holofern","caravaggio.jpg");
        PaintingFrame paint5 = new PaintingFrame("5", "La promenade","claude.jpg");
        PaintingFrame paint6 = new PaintingFrame("6", "Autoportret","rembrandt.jpg");
        PaintingFrame paint7 = new PaintingFrame("7", "Dejunul vâslașilor","pierre.jpg");
        PaintingFrame paint8 = new PaintingFrame("8", "Fata cu turban","johannes.jpg");

        p1.setBounds(50,100,95,30);
        p1.setSize(222, 300);
        f.add(p1);
        p1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint1.setVisible(true);

                //paint1.
            }
        });

        p2.setBounds(300,100,95,30);
        p2.setSize(454, 300);
        f.add(p2);
        p2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint2.setVisible(true);
                //paint1.
            }
        });

        p3.setBounds(800,100,95,30);
        p3.setSize(183, 276);
        f.add(p3);
        p3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint3.setVisible(true);
                //paint1.
            }
        });

        p4.setBounds(1000,100,95,30);
        p4.setSize(400, 258);
        f.add(p4);
        p4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint4.setVisible(true);
                //paint1.
            }
        });

        p5.setBounds(50,450,95,30);
        p5.setSize(255, 198);
        f.add(p5);
        p5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint5.setVisible(true);
                //paint1.
            }
        });

        p6.setBounds(450,450,95,30);
        p6.setSize(232, 300);
        f.add(p6);
        p6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint6.setVisible(true);
                //paint1.
            }
        });

        p7.setBounds(800,450,95,30);
        p7.setSize(300, 198);
        f.add(p7);
        p7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint7.setVisible(true);
                //paint1.
            }
        });

        p8.setBounds(1150,450,95,30);
        p8.setSize(255, 300);
        f.add(p8);
        p8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                paint8.setVisible(true);
                //paint1.
            }
        });

        JLabel label1;
        label1=new JLabel("ART GALLERY");
        label1.setBounds(600,20,500,25);
        label1.setForeground(Color.BLUE);
        label1.setFont(new Font ("Century Gothic", Font.PLAIN,30));
        f.add(label1);

//        Main aux=new Main();                    //pentru a apela functia la click
//        p1.addActionListener(aux);


        JButton sign_upButton = new JButton("sign up");
        JButton log_inButton = new JButton("log in");

        sign_upButton.setBounds(1100, 20, 100, 30);
        sign_upButton.setBackground(Color.WHITE);
        f.add(sign_upButton);
        sign_upButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                SignUp signUp = new SignUp();
                signUp.showWindow();
                //paint1.
            }
        });

        log_inButton.setBounds(1200, 20, 100, 30);
        log_inButton.setBackground(Color.WHITE);
        f.add(log_inButton);
        log_inButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                LogIn logIn = new LogIn();
                logIn.showWindow();
                //paint1.
            }
        });

        Icon cartImg = new ImageIcon("cart.jpg");
        JButton cart = new JButton(cartImg);
        cart.setBounds(1300, 20, 100, 30);
        cart.setSize(28,30);
        f.add(cart);

        cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                Cart cos = new Cart();
                cos.showWindow();

            }
        });

        // Scrollbar s = new Scrollbar();
        // s.setBounds(1510, 0, 20, 800);
        //f.add(s);

        f.setSize(1600,800);                //frame
        f.setLayout(null);
        f.setVisible(true);

        getName();
    }

    public void getName(){
        Main.c.connection();
        DBConnection conn = new DBConnection();
        JLabel pName1 = new JLabel(conn.selectPaintingById("1"));
        JLabel pName2 = new JLabel(conn.selectPaintingById("2"));
        JLabel pName3 = new JLabel(conn.selectPaintingById("3"));
        JLabel pName4 = new JLabel(conn.selectPaintingById("4"));
        JLabel pName5 = new JLabel(conn.selectPaintingById("5"));
        JLabel pName6 = new JLabel(conn.selectPaintingById("6"));
        JLabel pName7 = new JLabel(conn.selectPaintingById("7"));
        JLabel pName8 = new JLabel(conn.selectPaintingById("8"));

        //pName1.setBounds();
    }
}
