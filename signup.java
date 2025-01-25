package QT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signup extends JFrame {
    private Home homeFrame;

    public signup(Home home) {
        homeFrame = home;

        JPanel spanel = new JPanel() {
            private Image backgroundImage = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\sblue.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        spanel.setLayout(null);
        spanel.setSize(700, 500);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(40, 40, 80, 30);
        nameLabel.setFont(new Font("Sarif", Font.PLAIN, 12));
        nameLabel.setForeground(Color.WHITE);
        spanel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(40, 70, 210, 25);
        spanel.add(nameField);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(40, 100, 80, 30);
        usernameLabel.setFont(new Font("Sarif", Font.PLAIN, 12));
        usernameLabel.setForeground(Color.WHITE);
        spanel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(40, 130, 210, 25);
        spanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(40, 160, 80, 30);
        passwordLabel.setFont(new Font("Sarif", Font.PLAIN, 12));
        passwordLabel.setForeground(Color.WHITE);
        spanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(40, 190, 210, 25);
        spanel.add(passwordField);

        JLabel messageLabel = new JLabel(""); 
        messageLabel.setBounds(40, 430, 200, 25);
        spanel.add(messageLabel);

        
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(156, 405, 92, 25);
        registerButton.addActionListener(e -> {
           
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

         
            if (username.isEmpty() || password.isEmpty()) {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Please fill in all fields.");
            } else {
               
                homeFrame.addUser(username, password);

                messageLabel.setForeground(Color.GREEN);
                messageLabel.setText("User registered successfully!");

                usernameField.setText("");
                passwordField.setText("");

                setVisible(false);
                homeFrame.setVisible(true);
            }
        });
        spanel.add(registerButton);

        // "Back to Login" button
        JButton backToLoginButton = new JButton("Back to Login");
        backToLoginButton.setBounds(80, 430, 130, 25);
        backToLoginButton.setFont(new Font("Sarif", Font.PLAIN | Font.ITALIC, 11));
        backToLoginButton.setBackground(new Color(0, 0, 0, 0));
        backToLoginButton.setOpaque(false); 
        backToLoginButton.setBorderPainted(false); 
        backToLoginButton.setForeground(Color.WHITE);
        backToLoginButton.addActionListener(e -> {
            setVisible(false);
            homeFrame.setVisible(true); 
        });
        spanel.add(backToLoginButton);

        setTitle("Cute Tea - Sign Up");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(spanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new signup(new Home()); 
    }
}
