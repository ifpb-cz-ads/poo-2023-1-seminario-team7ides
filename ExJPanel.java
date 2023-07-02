
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*; 
  

public class ExJPanel {
    public static void main(String[] args) {
        JPanel painel= new JPanel();
        JButton botao= new JButton("Botão");
        painel.add(botao);
        JFrame f= new JFrame("Panel Exemplo");
        f.getContentPane().add(painel);
        f.pack();
        f.setSize(300, 250);
        f.setVisible(true);
    }
}