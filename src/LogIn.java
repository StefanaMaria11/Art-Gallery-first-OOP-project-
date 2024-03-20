import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn {
    public JFrame f = new JFrame("Log In");
    public Color c1 = new Color(255, 255, 204);
    private JTextField field1, field2;
    public String getField1() {
        return field1.getText();
    }

    public String getField2() {
        return field2.getText();
    }

    public void showWindow() {
        f.getContentPane().setBackground(c1);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);

        JLabel title = new JLabel("LOG IN");
        title.setBounds(400, 20, 500, 30);
        title.setFont(new Font ("Century Gothic", Font.PLAIN,20));
        f.add(title);

        JLabel usser_nameName=new JLabel("Usser name");
        usser_nameName.setBounds(190,70,500,25);
        usser_nameName.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(usser_nameName);

        JLabel password=new JLabel("Password");
        password.setBounds(200,120,500,25);
        password.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(password);

        field1 = new JTextField();
        field1.setBounds(300, 70, 400, 25);
        f.add(field1);

        field2 = new JTextField();
        field2.setBounds(300, 120, 400, 25);
        f.add(field2);

        JButton confirm = new JButton("confirm");
        confirm.setBounds(400, 300, 100, 25);
        f.add(confirm);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if( Main.c.accountSearch(getField1(),getField2())==false){
                   JOptionPane.showMessageDialog(null,"The account does not exist!");
                   f.setVisible(false);
                   SignUp sign = new SignUp();
                   sign.showWindow();

               }
            }
        });

        JButton button=new JButton("BACK");
        button.setBounds(50,20,95,30);
        f.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                Main main = new Main();
                MainPage.f.setVisible(true);

            }
        });

    }
}
