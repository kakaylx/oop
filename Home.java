package QT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Home extends JFrame {

    private ArrayList<String> usernames;
    private ArrayList<String> passwords;

    public Home() {
        usernames = new ArrayList<>();
        passwords = new ArrayList<>();

        loadUsers();

        JPanel gpanel = new JPanel() {
            private Image backgroundImage = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\blue.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        gpanel.setLayout(null);  
        gpanel.setSize(700, 500);
        
        JLabel username = new JLabel("Username:");
        username.setBounds(438, 122, 80, 30);
        username.setFont(new Font("SansSerif", Font.PLAIN, 12));
        username.setForeground(Color.WHITE);
        gpanel.add(username);
        
        JTextField userField = new JTextField();
        userField.setBounds(440, 151, 200, 25);
        gpanel.add(userField);
        
        JLabel password = new JLabel("Password:");
        password.setBounds(438, 194, 80, 30);
        password.setFont(new Font("SansSerif", Font.PLAIN, 12));
        password.setForeground(Color.WHITE);
        gpanel.add(password);
        
        JPasswordField passField = new JPasswordField();
        passField.setBounds(440, 223, 200, 25);
        gpanel.add(passField);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(440, 300, 200, 30);
        gpanel.add(messageLabel);

        JButton login = new JButton("Log In");
        login.setBounds(548, 264, 92, 25);
        login.addActionListener(e -> {
            String usernameh = userField.getText(); 
            String passwordh = new String(passField.getPassword()); 

            boolean loginSuccessful = false;

            for (int i = 0; i < usernames.size(); i++) {
                if (usernameh.equals(usernames.get(i)) && passwordh.equals(passwords.get(i))) {
                    loginSuccessful = true;
                    break;
                }
            }

            if (loginSuccessful) { 
                setVisible(false); 
                new menu(); 
            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Invalid username or password.");
            }
        });
        gpanel.add(login);

        JLabel su = new JLabel("Don't have an account?");
        su.setBounds(448, 378, 143, 30);
        su.setFont(new Font("SansSerif", Font.BOLD, 12));
        su.setForeground(Color.WHITE);
        gpanel.add(su);

        JButton signup = new JButton("Sign Up");
        signup.setBounds(566, 382, 92, 25);
        signup.setFont(new Font("Sarif", Font.BOLD | Font.ITALIC, 12));
        signup.setBackground(new Color(0, 0, 0, 0)); 
        signup.setOpaque(false); 
        signup.setBorderPainted(false); 
        signup.setForeground(Color.WHITE);
        signup.addActionListener(e -> {
           
            setVisible(false); 
            new signup(this);
        });
        gpanel.add(signup);

        setTitle("Cute Tea - Login");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(gpanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Home();  
    }

   
    public void addUser(String username, String password) {
        usernames.add(username);
        passwords.add(password);
        saveUsers();  
        JOptionPane.showMessageDialog(Home.this, "User added:" + username); 
    }

   
    private void loadUsers() {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userPass = line.split(":");
                if (userPass.length == 2) {
                    usernames.add(userPass[0]);
                    passwords.add(userPass[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("No users file found, starting fresh.");
        }
    }

 
    private void saveUsers() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt"))) {
            for (int i = 0; i < usernames.size(); i++) {
                bw.write(usernames.get(i) + ":" + passwords.get(i));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving users.");
        }
    }
    
    

   
    public ArrayList<String> getUsernames() {
        return usernames;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }
    
}
