import Controller.Login_Controller;

import java.awt.Font;

import javax.swing.*;

public class Gui extends MainFrame{
    
    private JLabel lOGINLabel, usernameLabel, passwordLabel;   
    private JTextField UsernameField;
    private JPasswordField passwordField;
    private JButton btnSignIn, btnRegister;
    
    public Gui(){
        super("LOGIN", 277, 271);

    }
    
    public void component(){

        lOGINLabel = new JLabel("LOGIN");
        setFont(lOGINLabel, 12);
        setFontStyle(lOGINLabel, Font.BOLD);
        boundedAdd(lOGINLabel, 46, 26, 37, 16);

        usernameLabel = new JLabel("Username");
        setFont(usernameLabel, 12);
        setFontStyle(usernameLabel, Font.BOLD);
        boundedAdd(usernameLabel, 46, 62, 58, 15);

        passwordLabel = new JLabel("Password");
        setFont(passwordLabel, 12);
        setFontStyle(passwordLabel, Font.BOLD);
        boundedAdd(passwordLabel, 46, 138, 56, 15);

        UsernameField = new JTextField();
        boundedAdd(UsernameField, 46, 97, 185, 21);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 46, 173, 183, 20);

        btnSignIn = new JButton("Sign In");
        boundedAdd(btnSignIn, 174, 223, 78, 24);

        btnRegister = new JButton("Register");
        boundedAdd(btnRegister,61,223,78,24);
    }

    private void setFont(JLabel lOGINLabel, int i) {
    }

    protected void event(){
        btnSignIn.addActionListener(e -> {
            String username = UsernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (Login_Controller.login(username, password)) {
                new Verif().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Username atau Password Salah",
                        "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }

        });

        btnRegister.addActionListener(e -> {
            new RegisterFrame().setVisible(true);
            dispose();
        });
    }

    }

