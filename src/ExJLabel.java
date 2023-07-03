import javax.swing.JFrame;
import javax.swing.*; 

public class ExJLabel {
    public static void main(String[] args) {
        JFrame f= new JFrame("JLabel Exemplo");
        JLabel l1= new JLabel("Texto 1");
        JLabel l2= new JLabel("Texto 2");
        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        f.add(l1);
        f.add(l2);
        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
