package scalcu;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class CalculatorGUI extends javax.swing.JFrame {

    private JTextField textField;

    public CalculatorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setSize(300, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setEditable(false);
        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 5, 10, 10));

        String[] buttonLabels = {
            
            "←", "CE", "C", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
                  "0", ".", "="
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorGUI().setVisible(true);
        });
    }
}
