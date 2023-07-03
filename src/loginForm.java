import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class loginForm {
    private JPanel panel1;
    private JTextField login;
    private JPasswordField senha;
    private JButton entrar;
    private static String OK = "ok";
    private static String HELP = "help";

    public loginForm() {
        entrar.setActionCommand(OK);
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* Logica do login aqui */
                String cmd = e.getActionCommand();

                if (OK.equals(cmd)) { //Process the password.
                    char[] input = senha.getPassword();
                    if (isPasswordCorrect(input)) {
                        JOptionPane.showMessageDialog(panel1,
                                "Senha correta. Entrou.");
                    } else {
                        JOptionPane.showMessageDialog(panel1,
                                "Senha incorreta. Tente novamente.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    //Zero out the possible password, for security.
                    Arrays.fill(input, '0');

                    senha.selectAll();
                    resetFocus();
                }
            }
        });
    }

    private static boolean isPasswordCorrect(char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = {'a', 'd', 'm', 'i', 'n'};

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(input, correctPassword);
        }

        //Zero out the password.
        Arrays.fill(correctPassword, '0');

        return isCorrect;
    }

    protected void resetFocus() {
        senha.requestFocusInWindow();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        login = new JTextField();
        login.setText("admin");
        login.setToolTipText("login");
        panel1.add(login, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, -1), null, 0, false));
        senha = new JPasswordField();
        senha.setText("");
        senha.setToolTipText("senha");
        panel1.add(senha, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, -1), null, 0, false));
        entrar = new JButton();
        entrar.setText("Entrar");
        panel1.add(entrar, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("exemplo");
        frame.setContentPane(new loginForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
