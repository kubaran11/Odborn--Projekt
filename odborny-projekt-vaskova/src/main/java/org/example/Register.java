package org.example;

import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {
    JPanel panel;
    JLabel nameLabel, emailLabel, passwordLabel;
    JTextField nameText, emailText;
    JPasswordField passwordText;
    JButton registerButton;

    public Register() throws HeadlessException {
        setTitle("Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 350);
        //setIconImage
        //setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);


        panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints g = new GridBagConstraints();

        nameLabel = new JLabel("Name:");
            g.gridx = 0;
            g.gridy = 0;
            g.gridwidth = 1;
            g.gridheight = 1;
        panel.add(nameLabel, g);


        emailLabel = new JLabel("Email:");
            g.gridx = 0;
            g.gridy = 1;
            g.gridwidth = 1;
            g.gridheight = 1;
        panel.add(emailLabel, g);


        passwordLabel = new JLabel("Password:");
            g.gridx = 0;
            g.gridy = 2;
            g.gridwidth = 1;
            g.gridheight = 1;
        panel.add(passwordLabel, g);


        nameText = new JTextField();
            g.gridx = 1;
            g.gridy = 0;
            g.gridwidth = 2;
            g.gridheight = 1;
            g.fill = GridBagConstraints.HORIZONTAL;
            nameText.setColumns(20);
            // ZMNĚNIT barvu pozadi na firemni barvy
            nameText.setBackground(Color.getHSBColor(192,237,251));
        panel.add(nameText, g);


        emailText = new JTextField();
            g.gridx = 1;
            g.gridy = 1;
            g.gridwidth = 2;
            g.gridheight = 1;
            g.fill = GridBagConstraints.HORIZONTAL;
            emailText.setColumns(20);
            // ZMNĚNIT barvu pozadi na firemni barvy
            emailText.setBackground(Color.getHSBColor(192,237,251));
        panel.add(emailText, g);


        passwordText = new JPasswordField();
            g.gridx = 1;
            g.gridy = 2;
            g.gridwidth = 2;
            g.gridheight = 1;
            passwordText.setColumns(20);
            g.fill = GridBagConstraints.HORIZONTAL;
            // ZMNĚNIT barvu pozadi na firemni barvy
            passwordText.setBackground(Color.getHSBColor(192,237,251));
        panel.add(passwordText, g);


        registerButton = new JButton();
            registerButton.setText("Register");
            g.gridx = 1;
            g.gridy = 3;
            g.gridwidth = 2;
            g.gridheight = 1;
            // ZMNĚNIT barvu pozadi na firemni barvy
            registerButton.setBackground(Color.getHSBColor(192,237,251));
        panel.add(registerButton, g);
        //Doplnit ActionListener, ktery zavre okno,
        //do databaze zada noveho cloveka POKUD jeho email obsahuje "@savencia.com" a zadané jmeno sedi se jmenem v zadanem emailu
        //jinak vypise chybu



        add(panel);
    }
}