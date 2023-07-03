import javax.swing.JButton;
import javax.swing.JFrame;
/*
 
import javax.swing.JOptionPane; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/

public class ExJButton {
    public static void main(String[] args) {
        JFrame f= new JFrame("Exemplo de Botão");
        JButton botao= new JButton("Clique aqui");
        botao.setBounds(50, 50, 150, 30);
        /* 
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "ola mundo");
            }
        });
        */
        
        f.add(botao);
        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
