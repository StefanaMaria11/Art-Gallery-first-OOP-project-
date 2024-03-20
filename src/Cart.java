import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cart {

    public JFrame f = new JFrame("Cart");
    public Color c1 = new Color(255,255,204);
    private JTable tabel;
    private String[][] rec;
    public void tableW(){

        rec = new String[][]{
                {Main.c.selectPaintingById(Main.c.cartSearch()),Main.c.painting_price(Main.c.cartSearch())},
        };

        String[] header = { "Painting name", "Price"};
        tabel=new JTable(rec,header);

    }
    public void showWindow(){
        f.getContentPane().setBackground( c1 );
        tableW();
        tabel.setBounds(100,300,500,20);
        f.add(tabel);
        f.setSize(1600,1000);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(null);

        JLabel artImg = new JLabel();
        artImg.setIcon(new ImageIcon("art.jpg"));
        Dimension size = artImg.getPreferredSize(); //Gets the size of the image
        artImg.setBounds(650, 50, size.width, size.height);
        f.add(artImg);


        JButton button=new JButton("BACK");
        button.setBounds(50,20,95,30);
        f.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
//                Main main = new Main();
                MainPage.f.setVisible(true);

            }
        });

        JLabel title = new JLabel("CART");
        title.setBounds(700, 20, 500, 30);
        title.setFont(new Font ("Century Gothic", Font.PLAIN,25));
        f.add(title);

        JButton confirm = new JButton("confirm");
        confirm.setBounds(800, 300, 100, 25);
        f.add(confirm);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null,"Your order has been sent");
                    Main.c.deleteFromCart();
                    tabel.setVisible(false);
                f.setVisible(false);
                MainPage.f.setVisible(true);
            }
        });
        f.setVisible(true);
    }

    }

