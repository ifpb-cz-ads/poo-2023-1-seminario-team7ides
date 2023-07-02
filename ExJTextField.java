import javax.swing.JFrame;
import javax.swing.JTextField;

public class ExJTextField {
    public static void main(String[] args) {
        JFrame f= new JFrame("JTextField Exemplo");
        JTextField t1= new JTextField("Digite o nome");
        JTextField t2= new JTextField("Digite o sobrenome");
        t1.setBounds(50, 100, 200, 30);
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);

    }
}
