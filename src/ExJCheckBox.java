import javax.swing.*;

public class ExJCheckBox {
    public static void main(String[] args) {
        JFrame f=  new  JFrame( "JCheckBox Exemplo" ); 
        JPanel painel= new JPanel();
        f.add(painel);
        JCheckBox cB1,cB2,cB3;
        cB1= new JCheckBox("Azul");
        cB1.setSelected(true);
        cB2= new JCheckBox("Vermelho");
        cB3= new JCheckBox("Amarelo");
        painel.add(new JLabel("Cor favorita: "));
        painel.add(cB1);
        painel.add(cB2);
        painel.add(cB3);
        f.setSize(400, 250);
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
    }
}