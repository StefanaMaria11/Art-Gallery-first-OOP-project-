import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp{
    public static JFrame f = new JFrame("Sign Up");
    public static Color c1 = new Color(255, 255, 204);
    private  JTextField field1;
    private JTextField field2,field3,field4,field5,field6,field7,field8;

    public  String getField1() {
        return field1.getText();
    }

    public  String getField2() {
        return field2.getText();
    }

    public  String getField3() {
        return field3.getText();
    }

    public  String getField4() {
        return field4.getText();
    }

    public  String getField5() {
        return field5.getText();
    }

    public  String getField6() {
        return field6.getText();
    }

    public  String getField7() {
        return field7.getText();
    }

    public  String getField8() {
        return field8.getText();
    }

    public  void main(String args[]) {
        showWindow();
    }

    public void showWindow() {
        f.getContentPane().setBackground(c1);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);

        JLabel title = new JLabel("Sign Up");
        title.setBounds(400, 20, 500, 30);
        title.setFont(new Font ("Century Gothic", Font.PLAIN,20));
        f.add(title);

        JLabel fName=new JLabel("First name");
        fName.setBounds(200,70,500,25);
        fName.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(fName);

        JLabel LName=new JLabel("Last name");
        LName.setBounds(200,120,500,25);
        LName.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(LName);

        JLabel email=new JLabel("Email address");
        email.setBounds(170,170,500,25);
        email.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(email);

        JLabel logAdd=new JLabel("Usser");
        logAdd.setBounds(250,220,500,25);
        logAdd.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(logAdd);

        JLabel logPass=new JLabel("Log in password");
        logPass.setBounds(150,270,500,25);
        logPass.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(logPass);

        JLabel addr=new JLabel("Address");
        addr.setBounds(220,320,500,25);
        addr.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(addr);

        JLabel town=new JLabel("Town");
        town.setBounds(240,370,500,25);
        town.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(town);

        JLabel country=new JLabel("Country");
        country.setBounds(220,420,500,25);
        country.setFont(new Font ("Century Gothic", Font.ITALIC,18));
        f.add(country);

        JButton confirm = new JButton("confirm");
        confirm.setBounds(400, 500, 100, 25);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.c.registration(getField1(),getField2(),getField3(),getField4(),getField5(),getField6(),getField7(),getField8());
            }
        });
        f.add(confirm);

        field1 = new JTextField();
        field1.setBounds(300, 70, 400, 25);
        f.add(field1);

        field2 = new JTextField();
        field2.setBounds(300, 120, 400, 25);
        f.add(field2);

        field3 = new JTextField();
        field3.setBounds(300, 170, 400, 25);
        f.add(field3);

        field4 = new JTextField();
        field4.setBounds(300, 220, 400, 25);
        f.add(field4);

        field5 = new JTextField();
        field5.setBounds(300, 270, 400, 25);
        f.add(field5);

        field6 = new JTextField();
        field6.setBounds(300, 320, 400, 25);
        f.add(field6);

        field7 = new JTextField();
        field7.setBounds(300, 370, 400, 25);
        f.add(field7);

        field8 = new JTextField();
        field8.setBounds(300, 420, 400, 25);
        f.add(field8);

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
