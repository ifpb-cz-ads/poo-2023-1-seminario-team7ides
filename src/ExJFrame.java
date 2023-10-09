import javax.swing.JFrame;

public class ExJFrame {
    public static void main(String[] args) {
        JFrame f1= new JFrame("Meu primeiro JFrame"); // cria uma janela inicialmente invisível, com o título especificado
        f1.setSize(300, 250); // Define o tamanho da janela
        f1.setVisible(true); // Permite que o Frame fique visivel na tela
    }
}