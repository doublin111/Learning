package SwingApps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 18-Jun-17.
 */
public class CelsiusConverter {
    private JPanel CelsiusConverter;
    private JTextField tempInput;
    private JButton convertButton;
    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;

    public CelsiusConverter() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int tempFahr = (int) ((Double.parseDouble(tempInput.getText()))
                        * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CelsiusConverter");
        frame.setContentPane(new CelsiusConverter().CelsiusConverter);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
