package QT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class info extends JFrame {
    private JPanel sideMenu; // Store the side menu as an instance variable

    public info() {
        // Create the panel with the background image
        JPanel imagePanel = new JPanel() {
            private Image backgroundImage = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\info.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        imagePanel.setLayout(null);

        // Create the hamburger button
        ImageIcon acc = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\hbi-removebg-preview.png");
        Image accb = acc.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(accb);

        JButton hamburgerButton = new JButton(scaledImageIcon);
        hamburgerButton.setBounds(920, 10, 50, 50);
        hamburgerButton.setBorderPainted(false);
        hamburgerButton.setContentAreaFilled(false);
        hamburgerButton.setFocusPainted(false);

        // Add action listener to toggle the menu
        hamburgerButton.addActionListener(e -> toggleMenu());

        // Add components to the image panel
        imagePanel.add(hamburgerButton);

        // Create the side menu and add it to the panel
        sideMenu = createSideMenu();
        imagePanel.add(sideMenu);
        
        ImageIcon image = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\logo-removebg-preview.png");
        Image icon = image.getImage();
        Image scaledImage = icon.getScaledInstance(500, 300, Image.SCALE_SMOOTH);  // Scale the background image
        ImageIcon imageIcon = new ImageIcon(scaledImage);  // Create a new ImageIcon with the scaled image

        JLabel label = new JLabel(imageIcon);
        label.setBounds(250, 60, 500, 300);  // Position the background image (adjust as needed)
        imagePanel.add(label); 
        
        JLabel label1 = new JLabel("<html>"
        		+ "<div style='text-align: center;'>"
        		+ "Founded in 2015, <i><b>Cute Tea</b></i> was born from a simple dream: "
        		+ "to create a cozy haven where people could "
                + "enjoy the perfect blend of premium teas and creamy goodness."
                + " Inspired by the growing love for milk tea and a "
                + "passion for creativity, the founders wanted to craft"
                + "more than just beverages—they wanted to share moments of joy in every cup.</div></html>");

        label1.setBounds(260, 390, 450, 200); // Adjust height for the wrapped text
        label1.setFont(new Font("Serif", Font.PLAIN, 18)); // Set readable font and size
        label1.setForeground(Color.WHITE); // Set text color
        label1.setVerticalAlignment(JLabel.TOP); // Align text to the top of the label
        imagePanel.add(label1);

        setTitle("Cute Tea");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(imagePanel);
        setVisible(true);
    }

    // Method to toggle the visibility of the side menu
    private void toggleMenu() {
        sideMenu.setVisible(!sideMenu.isVisible()); // Toggle visibility
    }

    // Method to create the side menu panel
    private JPanel createSideMenu() {
        JPanel sideMenu = new JPanel();
        sideMenu.setLayout(null);
        sideMenu.setBackground(new Color(0x123456)); // Set dark background for side menu
        sideMenu.setBounds(780, 0, 200, 600); // Set position and size for the side menu

        // Add menu items
        JButton profileButton = new JButton("Profile");
        profileButton.setBounds(20, 100, 160, 40);
        profileButton.setFont(new Font("Serif", Font.PLAIN, 18));
        profileButton.setBackground(new Color(0x123456));
        profileButton.setForeground(Color.WHITE);
        profileButton.addActionListener(e -> {
            setVisible(false);
            new profile(); // Ensure the profile class exists
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

        JButton logoutButton = new JButton("Log Out");
        logoutButton.setBounds(20, 220, 160, 40);
        logoutButton.setFont(new Font("Serif", Font.PLAIN, 18));
        logoutButton.setBackground(new Color(0x123456));
        logoutButton.setForeground(Color.WHITE);

        // Add action listener for logout
        logoutButton.addActionListener(e -> {
            setVisible(false);
            new Home();
            JOptionPane.showMessageDialog(info.this, "Logged Out");
        });
        sideMenu.add(logoutButton);

        // Initially hide the side menu
        sideMenu.setVisible(false);
        return sideMenu;
    }

    public static void main(String[] args) {
        new info();
    }
}


