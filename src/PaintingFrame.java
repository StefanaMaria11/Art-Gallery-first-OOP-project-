import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintingFrame {

    private String id;
    public String title;
    private String imageFile;


    public JFrame f = new JFrame("Painting");
    public PaintingFrame(String id, String title, String imageFile) {
        this.id = id;
        this.title = title;
        this.imageFile= imageFile;

        showWindow();
        f.setVisible(false);
    }

    public void setVisible(boolean visibility) {
        f.setVisible(visibility);
    }
    public Color c1 = new Color(225,225,225);

    public void showWindow(){

        f.setTitle(title);

        f.getContentPane().setBackground( c1 );

        f.setSize(1600,800);
        f.setLayout(null);
        f.setVisible(true);

        DBConnection c = new DBConnection();

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(imageFile));
        Dimension size = label.getPreferredSize();
        label.setBounds(50, 50, size.width, size.height);
        f.add(label);

        JLabel dimension = new JLabel("Dimensions: ");
        dimension.setBounds(50, 360, 100, 30);
        dimension.setFont(new Font("Italic",Font.PLAIN,16));
        f.add(dimension);

        JLabel movement = new JLabel("Movement: ");
        movement.setBounds(56, 385, 100, 30);
        movement.setFont(new Font("Italic",Font.PLAIN,16));
        f.add(movement);

        JLabel price = new JLabel("Price: ");
        price.setBounds(92, 410, 100, 30);
        price.setFont(new Font("Italic",Font.PLAIN,16));
        f.add(price);

        JLabel dimensionDB = new JLabel();
        dimensionDB.setText(c.painting_size(id));
        dimensionDB.setBounds(150, 360, 300, 30);
        dimensionDB.setFont(new Font("Italic",Font.PLAIN,16));
        f.add(dimensionDB);

        JLabel movementDB = new JLabel();
        movementDB.setText(c.painting_movement(id));
        movementDB.setBounds(150, 385, 500, 30);
        movementDB.setFont(new Font("Italic",Font.PLAIN,16));
        f.add(movementDB);

        JLabel priceDB = new JLabel();
        priceDB.setText(c.painting_price(id));
        priceDB.setBounds(150, 410, 300, 30);
        priceDB.setFont(new Font("Italic",Font.PLAIN,16));
        f.add(priceDB);

        JButton add_to_cart = new JButton("Add to cart");
        add_to_cart.setBounds(100, 450, 100, 30);
        add_to_cart.setBackground(Color.WHITE);
        f.add(add_to_cart);
        add_to_cart.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Main.c.addCos(title,id);
            }
        });

        JLabel description = new JLabel(); //JLabel Creation
        description.setText(c.selectDescriptionById(id));
        description.setBounds(550, 100, 700, 500);
        description.setFont(new Font("Italic",Font.ITALIC,20));
        description.setVerticalAlignment(JLabel.TOP);
        f.add(description);

        JLabel painting_description = new JLabel();
        painting_description.setText(c.paintingDescriptionById(id));
        painting_description.setBounds(550, 400, 700, 500);
        painting_description.setFont(new Font("Italic",Font.ITALIC,20));
        painting_description.setVerticalAlignment(JLabel.TOP);
        f.add(painting_description);

        JLabel label1 = new JLabel();
        label1.setText(c.selectPaintingById(id));
        label1.setBounds(700, 30, 1000, 30);
        label1.setFont(new Font("Italic",Font.BOLD,20));
        label1.setVerticalAlignment(JLabel.TOP);
        f.add(label1);

        JLabel label2 = new JLabel(" made by ");
        label2.setBounds(750, 50, 100, 30);
        label2.setFont(new Font("Italic",Font.ITALIC,16));
        f.add(label2);

        JLabel label3 = new JLabel();
        label3.setText(c.showAuthorName(id));
        label3.setBounds(830, 50, 200, 30);
        label3.setFont(new Font("Italic",Font.ITALIC,16));
        f.add(label3);

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

        JButton button=new JButton("BACK");
        button.setBounds(50,20,95,30);
        f.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                MainPage.f.setVisible(true);

            }
        });

    }

}
