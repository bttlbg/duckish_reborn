package interfaz;

import controladores.ControladorRegistro;
import obj.Empleado;

import javax.swing.*;
import java.awt.*;


public class Registro extends JFrame {
    public Registro() {
        this.setLayout(null);
        this.setSize(660, 550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setTitle("Duckish - Sign Up");

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
        title.setBounds(100, 50, 200, 50);
        title.setFont(new Font("Roboto", Font.BOLD, 50));
        add(title);

        JLabel nameLB = new JLabel("Name");
        nameLB.setBounds(100, 170, 51, 16);
        add(nameLB);

        JTextField nameTF = new JTextField();
        nameTF.setBounds(100, 203, 200, 30);
        add(nameTF);

        JLabel passwordLB = new JLabel("Password");
        passwordLB.setBounds(100, 256, 70, 16);
        add(passwordLB);

        JPasswordField passwordTF = new JPasswordField();
        passwordTF.setBounds(100, 289, 200, 30);
        add(passwordTF);

        JLabel positionLB = new JLabel("Position");
        positionLB.setBounds(100, 336, 51, 16);
        add(positionLB);

        JComboBox<String> positionCB = new JComboBox<>();
        positionCB.setBounds(100, 369, 200, 30);
        add(positionCB);
        positionCB.addItem("");
        positionCB.addItem("Cashier");
        positionCB.addItem("Manager");

        JLabel lastNameLB = new JLabel("Last name");
        lastNameLB.setBounds(411,170, 70, 16);
        add(lastNameLB);

        JTextField lastNameTF = new JTextField();
        lastNameTF.setBounds(411, 203, 200, 30);
        add(lastNameTF);

        JLabel confirmPasswordLB = new JLabel("Confirm password");
        confirmPasswordLB.setBounds(411, 256, 130, 16);
        add(confirmPasswordLB);

        JPasswordField confirmPasswordTF = new JPasswordField();
        confirmPasswordTF.setBounds(411, 289, 200, 30);
        add(confirmPasswordTF);

        JLabel usernameLB = new JLabel("Username");
        usernameLB.setBounds(411, 337, 200, 16);
        add(usernameLB);

        JTextField usernameTF = new JTextField();
        usernameTF.setBounds(411, 371, 200, 30);
        add(usernameTF);

        final JButton signUp = new JButton("Sign Up");
        signUp.setBounds(157, 452, 300, 40);
        signUp.addActionListener(e -> {
            /* Recuperar la informacion del JFrame, almacenarla en un
            * objeto empleado y enviarsela al controlador */

            //Empleado employee = new Empleado();
            //employee.setFirstName(nameTF.getText());
            //employee.setLastName(lastNameTF.getText());
            //boolean pwdFlag = employee.setPassword(passwordTF.getPassword(), confirmPasswordTF.getPassword());
            //employee.setJobTitle(Objects.requireNonNull(positionCB.getSelectedItem()).toString());
            //boolean usrFlag = employee.setUsername(usernameTF.getText());

            // Enviar el empleado al controlador*/
            //new ControladorRegistro(employee);

        });
        add(signUp);

    }
}
