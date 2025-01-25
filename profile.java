package QT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class profile extends JFrame {
    private JPanel sideMenu;

    public profile() {
        // Create main panel with a background image
        JPanel panel = new JPanel() {
            private Image backgroundImage = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\bg2.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        panel.setLayout(null);
        
      

        // Profile Editing Section
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 100, 100, 30);
        panel.add(nameLabel);

        JTextField nameField = new JTextField("");
        nameField.setBounds(150, 100, 200, 30);
        panel.add(nameField);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 150, 100, 30);
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField("");
        usernameField.setBounds(150, 150, 200, 30);
        panel.add(usernameField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50, 200, 100, 30);
        panel.add(phoneLabel);

        JTextField phoneField = new JTextField("");
        phoneField.setBounds(150, 200, 200, 30);
        panel.add(phoneField);
        
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 250, 100, 30);
        panel.add(emailLabel);

        JTextField emailField = new JTextField("");
        emailField.setBounds(150, 250, 200, 30);
        panel.add(emailField);
        
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 300, 100, 30);
        panel.add(addressLabel);

        JTextField addressField = new JTextField("");
        addressField.setBounds(150, 300, 200, 30);
        panel.add(addressField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 350, 100, 30);
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField("");
        passwordField.setBounds(150, 350, 200, 30);
        add(passwordField);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(300, 450, 100, 30);
        saveButton.setBackground(new Color(0x123456));
        saveButton.setFont(new Font("SansSarif", Font.PLAIN, 12));
        saveButton.setForeground(Color.WHITE);
        panel.add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate saving the updated profile
                String updatedName = nameField.getText();
                String updatedUsername = usernameField.getText();
                String updatedPhone = phoneField.getText();
                String updatedEmail = emailField.getText();
                String updatedAddress = addressField.getText();
                String updatedPassword = passwordField.getText();

                
                // You can add code here to actually save these details
                JOptionPane.showMessageDialog(profile.this, "Profile updated:\nName: " + updatedName + "\nUsername: " + updatedEmail + "\nPhone: " + updatedPhone + "\nEmail:" + updatedEmail + "\nAddress:" + updatedAddress + "\nPassword:" + updatedPassword);
            }
        });

        // Add logo button
        ImageIcon logo = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\logo-removebg-preview.png");
        Image logom = logo.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);  // Scale the image
        ImageIcon scaledqt = new ImageIcon(logom);

        JButton qt = new JButton(scaledqt);
        qt.setBounds(10, 0, 80, 80);  // Set the button size and position
        qt.setBorderPainted(false);  
        qt.setContentAreaFilled(false);  
        qt.setFocusPainted(false);  
        qt.addActionListener(e -> {
            setVisible(false);
            new info();  
        });

        panel.add(qt);

        // Hamburger button
       
        
      
        
        ImageIcon acc = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\gujf-removebg-preview.png");
        Image accb = acc.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);  
        ImageIcon scaledImageIcon = new ImageIcon(accb);
        
        JButton hamburgerButton = new JButton(scaledImageIcon);
        hamburgerButton.setBounds(920, 10, 50, 50);  
        hamburgerButton.setBorderPainted(false);  
        hamburgerButton.setContentAreaFilled(false);  
        hamburgerButton.setFocusPainted(false);  

        hamburgerButton.addActionListener(e -> toggleMenu());
        panel.add(hamburgerButton);
        

        // Create and add the side menu
        sideMenu = createSideMenu();
        panel.add(sideMenu);

        ImageIcon image = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\bg.png");
        Image icon = image.getImage();
        Image scaledImage = icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);  // Scale the background image
        ImageIcon imageIcon = new ImageIcon(scaledImage);  // Create a new ImageIcon with the scaled image

        JLabel label = new JLabel(imageIcon);
        label.setBounds(10, 80, 960, 465);  // Position the background image (adjust as needed)
        panel.add(label);  // Add the JLabel to the panel
        // Frame setup
        setTitle("Profile Edit - Cute Tea");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        setVisible(true);
    }

	private void toggleMenu() {
        if (sideMenu.isVisible()) {
            sideMenu.setVisible(false);  // Hide the menu
        } else {
            sideMenu.setVisible(true);  // Show the menu
        }
    }

    private JPanel createSideMenu() {
        JPanel sideMenu = new JPanel();
        sideMenu.setLayout(null);
        sideMenu.setBackground(new Color(0x123456));  // Set dark background for side menu
        sideMenu.setBounds(780, 0, 200, 600);  // Set position and size for the side menu

        JButton profileButton = new JButton("Profile");
        profileButton.setBounds(20, 100, 160, 40);
        profileButton.setFont(new Font("Serif", Font.PLAIN, 18));
        profileButton.setBackground(new Color(0x123456));
        profileButton.setForeground(Color.WHITE);
        profileButton.addActionListener(e -> {
            setVisible(false);
            new profile();
        });
        sideMenu.add(profileButton);

        JButton menubutton = new JButton("Menu");
        menubutton.setBounds(20, 160, 160, 40);
        menubutton.setFont(new Font("Serif", Font.PLAIN, 18));
        menubutton.setBackground(new Color(0x123456));
        menubutton.setForeground(Color.WHITE);
        menubutton.addActionListener(e -> {
            setVisible(false);
            new menu();
        });
        sideMenu.add(menubutton);

        JButton aboutus = new JButton("About us");
        aboutus.setBounds(20, 220, 160, 40);
        aboutus.setFont(new Font("Serif", Font.PLAIN, 18));
        aboutus.setBackground(new Color(0x123456));
        aboutus.setForeground(Color.WHITE);

        aboutus.addActionListener(e -> {
            setVisible(false);
            new info();
        });
        sideMenu.add(aboutus);
        
        JButton logoutButton = new JButton("Log Out");
        logoutButton.setBounds(20, 280, 160, 40);
        logoutButton.setFont(new Font("Serif", Font.PLAIN, 18));
        logoutButton.setBackground(new Color(0x123456));
        logoutButton.setForeground(Color.WHITE);

        logoutButton.addActionListener(e -> {
            setVisible(false);
            new Home();
            JOptionPane.showMessageDialog(profile.this, "Logged Out");
        });
        sideMenu.add(logoutButton);

        sideMenu.setVisible(false);
        return sideMenu;
    }

    public static void main(String[] args) {
        new profile();
    }
}
