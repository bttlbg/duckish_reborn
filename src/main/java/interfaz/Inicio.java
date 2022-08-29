package interfaz;

import javax.swing.*;
import java.awt.*;


public class Inicio extends JFrame {
    public Inicio() {
        this.setLayout(null);
        this.setSize(400, 450);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Duckish");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Duckish");
        title.setBounds(105, 70, 200, 50);
        title.setFont(new Font("Roboto", Font.BOLD, 50));
        add(title);

        final JButton signIn = new JButton("Sign In");
        signIn.setBounds(100, 180, 200, 40);
        signIn.setFocusPainted(false);
        signIn.addActionListener(e -> {
            new Login();
            dispose();
        });
        add(signIn);

        final JButton signUp = new JButton("Sign Up");
        signUp.setBounds(100, 240,200, 40);
        signUp.setFocusPainted(false);
        signUp.addActionListener(e -> {
            new Registro();
            dispose();
        });
        add(signUp);
    }
}
