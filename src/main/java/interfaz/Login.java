package interfaz;

import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {
    public Login() {
        this.setLayout(null);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setTitle("Duckish - Log In");

        final JButton back = new JButton(" \uF80C ");
        back.setBounds(0, 0, 50, 30);
        back.setFont(new Font("VictorMono Nerd Font", Font.PLAIN, 16));
        back.setBorderPainted(false);
        back.addActionListener(e -> {
            new Inicio();
            this.dispose();
        });
        add(back);

        JLabel title = new JLabel("Duckish");
        title.setBounds(100, 70, 200, 50);
        title.setFont(new Font("Roboto", Font.BOLD, 50));
        add(title);

        JLabel usernameLB = new JLabel("Username");
        usernameLB.setBounds(100, 175, 63, 16);
        add(usernameLB);

        JTextField usernameTF = new JTextField();
        usernameTF.setBounds(100, 200, 250, 30);
        add(usernameTF);

        JLabel passwordLB = new JLabel("Password");
        passwordLB.setBounds(100, 250, 70, 16);
        add(passwordLB);

        JPasswordField passwordTF = new JPasswordField();
        passwordTF.setBounds(100, 275, 250, 30);
        add((passwordTF));

        final JButton logIn = new JButton("Log In");
        logIn.setFocusPainted(false);
        logIn.setBounds(100, 350, 200, 40);
        logIn.addActionListener(e -> {

            /*CRUD myCRUD = new CRUD("ichi","gc");//Cambiar esto
            myCRUD.connect();
            myCRUD.useDataBase();
            Employee emp = myCRUD.searchEmployee(usernameTF.getText());
            String hash = DButilities.encriptPWD(String.valueOf(passwordTF.getPassword()));
            if (emp.getPassword().equals(hash)) {
                myCRUD.disconnect();
                SystemUI myS = new SystemUI(emp);
                myS.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Incorrect Credentials. Press ok to cotinue.");
            }*/
        });
        add(logIn);
    }
}
