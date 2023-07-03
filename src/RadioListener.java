import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioListener implements ActionListener {

    private JLabel label3;
    private JLabel label4;
    private JRadioButton radioButton;

    public RadioListener(JLabel label3, JLabel label4, JRadioButton radioButton){
        this.label3 = label3;
        this.label4 = label4;
        this.radioButton = radioButton;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JRadioButton sourceRadio = (JRadioButton) actionEvent.getSource();
        if (radioButton == sourceRadio) {
            label3.setText("radio 1 selecionado");
            label4.setText(("radio 2 nao selecionado"));
        } else {
            label4.setText("radio 2 selecionado");
            label3.setText(("radio 1 nao selecionado"));
        }
    }
}
