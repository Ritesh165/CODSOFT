import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Login extends JFrame {
    private JPanel loginpanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton LOGINButton;
    LinkedList<Student> loginlist = new LinkedList<Student>();
    public Login(){
        setVisible(true);
        add(loginpanel);
        setSize(500, 500);
        setTitle("Login Form");

        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField1.getText().equals("Admin") && passwordField1.getText().equals("Admin123")){
                    setVisible(false);
                    new register(loginlist);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Wrong Input. Try Again.");
                    textField1.setText("");
                    passwordField1.setText("");
                }
            }
        });
    }
    public static void main(String[] args) {

        Login login = new Login();

        // register.setSize(400,600);
        // register.setTitle("Linked List");

    }
}
