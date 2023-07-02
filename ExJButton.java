import javax.swing.JFrame;
import javax.swing.*; 

public class ExJButton {
    public static void main(String[] args) {
        JFrame f= new JFrame("Exemplo de Botão");
        JButton botao= new JButton("Clique aqui");
        botao.setBounds(50, 100, 95, 30);
        f.add(botao);
        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
