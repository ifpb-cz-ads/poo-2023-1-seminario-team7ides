import statements;
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample1 {

    JFrame frameObj;

    // constructor
    GridLayoutExample1() {
        frameObj = new JFrame();

        // creating 9 buttons
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");


        frameObj.add(btn1);
        frameObj.add(btn2);
        frameObj.add(btn3);
        frameObj.add(btn4);
        frameObj.add(btn5);


        frameObj.setLayout(new GridLayout(3, 3, 20, 25));
        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
    }

    // main method
    public static void main(String argvs[]) {
        new GridLayoutExample1();
    }
}
