package QT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

public class menu extends JFrame {
    
    private JPanel sideMenu; // Declare sideMenu globally to toggle visibility later
    private JTextArea receiptArea;
    
    menu(){
        // Main panel setup
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(0x123456));  // Background color of the panel
        panel.setSize(700, 500);
        
        
        ImageIcon logo = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\logo-removebg-preview.png");
        Image logom = logo.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);  // Scale the image
        ImageIcon scaledqt = new ImageIcon(logom);

        JButton qt = new JButton(scaledqt);
        qt.setBounds(10, 0, 80, 80);  // Set the button size and position
        qt.setBorderPainted(false);  // Removes the border around the button
        qt.setContentAreaFilled(false);  // Makes the button background transparent
        qt.setFocusPainted(false);  // Removes focus paint
        
        
        qt.addActionListener(e -> {
        	setVisible(false);
        	new info();
        });
        
        panel.add(qt);
        
        // Hamburger icon setup (Image button)
        ImageIcon acc = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\gujf-removebg-preview.png");
        Image accb = acc.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);  // Scale the image
        ImageIcon scaledImageIcon = new ImageIcon(accb);

        JButton hamburgerButton = new JButton(scaledImageIcon);
        hamburgerButton.setBounds(920, 10, 50, 50);  // Set the button size and position
        hamburgerButton.setBorderPainted(false);  // Removes the border around the button
        hamburgerButton.setContentAreaFilled(false);  // Makes the button background transparent
        hamburgerButton.setFocusPainted(false);  // Removes focus paint
        
        hamburgerButton.addActionListener(e -> toggleMenu());
        
        // Add the button to the panel
        panel.add(hamburgerButton);

        // Adding a "Menu" label
        JLabel lmenu = new JLabel("Menu");
        lmenu.setBounds(20, 80, 200, 40);  // Adjust position to avoid overlap
        lmenu.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 35));  // Set font style and size
        lmenu.setForeground(Color.BLACK);  // Set the text color to black
        panel.add(lmenu);
        
        ImageIcon im = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\wintermelon.png");
        Image ic = im.getImage();
        Image scaledImagew = ic.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon winter = new ImageIcon(scaledImagew);  
        
        JToggleButton wintermelon = new JToggleButton(winter);
        wintermelon.setBounds(30, 140, 120, 120); 
        wintermelon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Check if the button for French Fries is selected and update receipt
                if (wintermelon.isSelected()) {
                	 int quantity = 0;
                     quantity++;                   
                     receiptArea.append("Wintermelon             ₱100\n" + " " + quantity);
                }
            }
        });
        panel.add(wintermelon);
        
        JLabel win = new JLabel("Wintermelon");
        win.setBounds(48, 225, 100, 100);
        win.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        win.setForeground(new Color(0x123456));
        panel.add(win);
        
        ImageIcon imc = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\caramel.png");
        Image icm = imc.getImage();
        Image scaledImagec = icm.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon car = new ImageIcon(scaledImagec);  
        
        JToggleButton caramel = new JToggleButton(car);
        caramel.setBounds(176, 140, 120, 120);  
        caramel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (caramel.isSelected()) {
                    int quantity = 0;
                    quantity++;
                    receiptArea.append("\n Caramel             ₱110\n" + " " + quantity);      
                }
            }
        });
        panel.add(caramel);
        
        JLabel carm = new JLabel("Caramel");
        carm.setBounds(210, 225, 100, 100);
        carm.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        carm.setForeground(new Color(0x123456));
        panel.add(carm);
        
        ImageIcon o = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\oreo.jpg");
        Image or = o.getImage();
        Image scaledImageo = or.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon ore = new ImageIcon(scaledImageo);  
        
        JToggleButton oreo = new JToggleButton(ore);
        oreo.setBounds(324, 140, 120, 120);  
        oreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Check if the button for French Fries is selected and update receipt
                if (oreo.isSelected()) {
                	 int quantity = 0;
                     quantity++;
                     receiptArea.append("Oreo             ₱120\n" + " " + quantity);
                }
            }
        });
        panel.add(oreo);
        
        JLabel oreol = new JLabel("Oreo");
        oreol.setBounds(370, 225, 100, 100);
        oreol.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        oreol.setForeground(new Color(0x123456));
        panel.add(oreol);
        
        ImageIcon m = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\matcha.png");
        Image ma = m.getImage();
        Image scaledImagem = ma.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon mat = new ImageIcon(scaledImagem);  
        
        JToggleButton matcha = new JToggleButton(mat);
        matcha.setBounds(470, 140, 120, 120);  
        matcha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Check if the button for French Fries is selected and update receipt
                if (matcha.isSelected()) {
                	 int quantity = 0;
                     quantity++;
                    receiptArea.append("Matcha             ₱130\n" + " " + quantity);
                }
            }
        });
        panel.add(matcha);
        
        JLabel matchal = new JLabel("Matcha");
        matchal.setBounds(510, 225, 100, 100);
        matchal.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        matchal.setForeground(new Color(0x123456));
        panel.add(matchal);
        
        ImageIcon ch = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\choco.jpg");
        Image cho = ch.getImage();
        Image scaledImagech = cho.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon choco = new ImageIcon(scaledImagech);  
        
        JToggleButton chocolate = new JToggleButton(choco);
        chocolate.setBounds(30, 300, 120, 120);  
        chocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Check if the button for French Fries is selected and update receipt
                if (chocolate.isSelected()) {
                	 int quantity = 0;
                     quantity++;
                    receiptArea.append("Chocolate             ₱100\n" + " " + quantity );
                }
            }
        });
        panel.add(chocolate);
        
        JLabel choc = new JLabel("Chocolate");
        choc.setBounds(55, 385, 100, 100);
        choc.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        choc.setForeground(new Color(0x123456));
        panel.add(choc);
        
        ImageIcon rv = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\red velvet.png");
        Image redv = rv.getImage();
        Image scaledImagerv = redv.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon red = new ImageIcon(scaledImagerv);  
        
        JToggleButton redvel = new JToggleButton(red);
        redvel.setBounds(176, 300, 120, 120);  
        redvel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Check if the button for French Fries is selected and update receipt
                if (redvel.isSelected()) {
                	 int quantity = 0;
                     quantity++;
                    receiptArea.append("Red Velvet             ₱120\n" + " " + quantity);
                   
                }
            }
        });
     
          
        panel.add(redvel);
        
        JLabel redl = new JLabel("Red Velvet");
        redl.setBounds(200, 385, 100, 100);
        redl.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        redl.setForeground(new Color(0x123456));
        panel.add(redl);
        
        ImageIcon r = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\ramen.png");
        Image ra = r.getImage();
        Image scaledImagera = ra.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon ram = new ImageIcon(scaledImagera);  
        
        JToggleButton ramen = new JToggleButton(ram);
        ramen.setBounds(324, 300, 120, 120); 
        ramen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Check if the button for French Fries is selected and update receipt
                if (ramen.isSelected()) {
                	 int quantity = 0;
                     quantity++;
                    receiptArea.append("Ramen             ₱100\n" + " " + quantity);
                    
                }
            }
        });
        panel.add(ramen);
        
        JLabel rmn = new JLabel("Ramen");
        rmn.setBounds(360, 385, 100, 100);
        rmn.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        rmn.setForeground(new Color(0x123456));
        panel.add(rmn);
        
        ImageIcon f = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\fries.png");
        Image fr = f.getImage();
        Image scaledImagef = fr.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
        ImageIcon fri = new ImageIcon(scaledImagef);  
        
        JToggleButton fries = new JToggleButton(fri);
        fries.setBounds(470, 300, 120, 120);  
        fries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Check if the button for French Fries is selected and update receipt
                if (fries.isSelected()) {
                	 int quantity = 0;
                     quantity++;
                	receiptArea.append("French Fries         ₱75\n" + " " + quantity);
                       }
            }
        });
        panel.add(fries);
        
        JLabel ffries = new JLabel("French Fries");
        ffries.setBounds(490, 385, 100, 100);
        ffries.setFont(new Font("Sarif", Font.ITALIC | Font.BOLD,13));
        ffries.setForeground(new Color(0x123456));
        panel.add(ffries);
        
        receiptArea = new JTextArea();
        receiptArea.setBounds(645, 95, 305, 400);
        receiptArea.setEditable(false); // Make it read-only
        receiptArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Add the receipt area to the frame
        panel.add(receiptArea);
        
        JButton checkout = new JButton("Check Out");
        checkout.setBounds(845, 510, 100, 25);
        checkout.setFont(new Font("SansSarif", Font.PLAIN, 13));
        checkout.setBackground(new Color(0x123456));
        checkout.setForeground(Color.white);
        panel.add(checkout);
        
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear previous receipt
                receiptArea.setText("");

                
                int totalCost = 0;
                StringBuilder receipt = new StringBuilder("");

                // Check which items are selected and update the receipt
                if (wintermelon.isSelected()) {
                    receipt.append("Wintermelon           ₱100\n");
                    totalCost += 100;
                }
                if (caramel.isSelected()) {
                    receipt.append("Caramel             ₱110\n");
                    totalCost += 110;
                }
                if (oreo.isSelected()) {
                    receipt.append("Oreo             ₱120\n");
                    totalCost += 120;
                }
                if (matcha.isSelected()) {
                    receipt.append("Matcha             ₱130\n");
                    totalCost += 130;
                }
                if (chocolate.isSelected()) {
                	receipt.append("Chocolate          ₱100\n");
                	totalCost += 100;
                }
                if (redvel.isSelected()) { 
                	receipt.append("Red Velvet            ₱120\n");
                	totalCost += 120;
                }
                if (ramen.isSelected()) {
                	receipt.append("Ramen              ₱100\n");
                	totalCost += 100;
                }
                if (fries.isSelected()) {
                	receipt.append("French Fries          ₱75\n");
                	totalCost += 75;
                }

                // Append the total cost to the receipt
                receipt.append("\nTotal: ₱").append(totalCost);

                // Display the receipt in the text area
                receiptArea.setText(receipt.toString());
            }
        });

        ImageIcon image = new ImageIcon("C:\\Users\\Chuwi\\Desktop\\kakaylx\\qt\\bg.png");
        Image icon = image.getImage();
        Image scaledImage = icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);  // Scale the background image
        ImageIcon imageIcon = new ImageIcon(scaledImage);  // Create a new ImageIcon with the scaled image

        JLabel label = new JLabel(imageIcon);
        label.setBounds(10, 80, 600, 465);  // Position the background image (adjust as needed)
        panel.add(label);  // Add the JLabel to the panel
        
        JLabel alabel = new JLabel(imageIcon);
        alabel.setBounds(625, 80, 346, 465);  // Position the background image (adjust as needed)
        panel.add(alabel);
        
    
        
        // Create and add the side menu
        sideMenu = createSideMenu();
        getContentPane().add(sideMenu);  // Adding the side menu to the frame
        
        // Setting up the JFrame
        setTitle("Cute Tea");
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

    // Method to create the side menu panel
    private JPanel createSideMenu() {
        JPanel sideMenu = new JPanel();
        sideMenu.setLayout(null);
        sideMenu.setBackground(new Color(0x123456));  // Set dark background for side menu
        sideMenu.setBounds(780, 0, 200, 600);  // Set position and size for the side menu

        // Add menu items to the side menu
        JButton homeButton = new JButton("Profile");
        homeButton.setBounds(20, 100, 160, 40);
        homeButton.setFont(new Font("Serif", Font.PLAIN, 18));
        homeButton.setBackground(new Color(0x123456));
        homeButton.setForeground(Color.WHITE);
        homeButton.addActionListener(e -> {
            setVisible(false); 
            new profile();
        });
        sideMenu.add(homeButton);

        JButton aboutus = new JButton("About us");
        aboutus.setBounds(20, 160, 160, 40);
        aboutus.setFont(new Font("Serif", Font.PLAIN, 18));
        aboutus.setBackground(new Color(0x123456));
        aboutus.setForeground(Color.WHITE);
        aboutus.addActionListener(e -> {
            setVisible(false); 
            new info();
        });
        sideMenu.add(aboutus);

        JButton logoutButton = new JButton("Log Out");
        logoutButton.setBounds(20, 220, 160, 40);
        logoutButton.setFont(new Font("Serif", Font.PLAIN, 18));
        logoutButton.setBackground(new Color(0x123456));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.addActionListener(e -> {
            setVisible(false); 
            new Home();
            JOptionPane.showMessageDialog(menu.this, "Logged Out");
        });
        sideMenu.add(logoutButton);

        // Initially hide the side menu
        sideMenu.setVisible(false);
        return sideMenu;
    }

    public static void main(String[] args) {
        new menu();  // Create and display the Menu frame
    }
}
