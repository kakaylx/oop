package QT;

import java.io.File;

public class database {  // No parentheses after the class name
    public static void main(String[] args) {
        // Create a File object for the users.txt file
        File file = new File("users.txt");

        // Print the absolute path of the file
        System.out.println("User file path: " + file.getAbsolutePath());
    }
}
