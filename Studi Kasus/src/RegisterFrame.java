import Controller.Login_Controller;
import Entity.User_Entity;

import javax.swing.*;
import java.awt.*;

public class RegisterFrame extends MainFrame{
    private JLabel namaLabel, userLabel, passLabel,  daftarLabel;
    private JTextField namaField, userField,  passField, pinField;
    private JButton daftarButton;

    public RegisterFrame() {
        super("Register", 400, 400);
    }

    protected void component(){
        namaLabel = new JLabel("Nama");
        setFontSize(namaLabel, 15);
        setFontStyle(namaLabel, Font.PLAIN);
        boundedAdd(namaLabel, 33, 47, 43, 21);

        userLabel = new JLabel("Username");
        setFontSize(userLabel, 15);
        setFontStyle(userLabel, Font.PLAIN);
        boundedAdd(userLabel, 34, 90, 72, 21);

        passLabel = new JLabel("Password");
        setFontSize(passLabel, 15);
        setFontStyle(passLabel, Font.PLAIN);
        boundedAdd(passLabel, 34, 170, 67, 21);

        namaField = new JTextField();
        boundedAdd(namaField, 145, 44, 217, 28);

        userField = new JTextField();
        boundedAdd(userField, 145, 83, 217, 28);

        passField = new JTextField();
        boundedAdd(passField, 145, 167, 217, 28);

        daftarButton = new JButton("Daftar");
        boundedAdd(daftarButton, 252, 291, 84, 25);
    }

    protected void event() {
        daftarButton.addActionListener(e -> {
            String nama = namaField.getText();
            String username = userField.getText();
            String password = passField.getText();
            User_Entity akunBaru = new User_Entity(nama, username, password);

            if (Login_Controller.register(akunBaru)){
                new Gui().setVisible(true);
                dispose();
            }else {
                JOptionPane.showMessageDialog(null, "Akun sudah pernah dibuat");
            }
        });
    }
}
