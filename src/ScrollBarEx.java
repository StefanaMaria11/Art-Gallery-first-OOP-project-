import javax.swing.*;
import java.awt.*;

import static java.awt.AWTEventMulticaster.add;

public class ScrollBarEx {
    private JPanel panel1;
    private JScrollPane Main;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Scrollbar s = new Scrollbar();
        //s.setMaximum(800);
        //s.setMinimum(1);
        s.setBounds(1500,  0 , 20, 800);
        //add(s);
    }

}
