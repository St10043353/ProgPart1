/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpart1registerandlogin;

/**
 *
 * @author lab_services_student
 */


import javax.swing.JOptionPane;

public class Progpart1registerandlogin {

     
    public static void main(String[] args) {
     String[] options = {"Register", "Login"};
        int choice = JOptionPane.showOptionDialog(null, "Welcome! Would you like to register or login?", "Registration and Login", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if (choice == JOptionPane.YES_OPTION) {
            // Registration logic
            JOptionPane.showMessageDialog(null, "Welcome!! You have selected registration.");
            
            String firstName = JOptionPane.showInputDialog(null, "Enter your first name:");
            String lastName = JOptionPane.showInputDialog(null, "Enter your last name:");
            
            String username = "";
            boolean isUsernameValid = false;
            while (!isUsernameValid) {
                username = JOptionPane.showInputDialog(null, "Enter a username (no more than 5 characters long and contains an underscore):");
                isUsernameValid = username.contains("_") && username.length() <= 5;
                if (!isUsernameValid) {
                    JOptionPane.showMessageDialog(null, "“Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
                }
            }
            
            
             String password = "";
            boolean isPasswordValid = false;
            while (!isPasswordValid) {
                password = JOptionPane.showInputDialog(null, "Enter a password (at least 8 characters long, contains a capital letter, a number, and a special character):");
                isPasswordValid = password.length() >= 8 &&
                        password.matches(".*[A-Z].*") &&
                        password.matches(".*[0-9].*") &&
                        password.matches(".*[!@#$%^&*()].*");
                if (!isPasswordValid) {
                    JOptionPane.showMessageDialog(null, "Invalid password. Please try again.");
                }
            }
          
            
            JOptionPane.showMessageDialog(null, "Registration successful! \nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nUsername: " + username );
        } else if (choice == JOptionPane.NO_OPTION) {
            // Login logic
            JOptionPane.showMessageDialog(null, "You have selected login.");
      
        } else if (choice == JOptionPane.NO_OPTION) {
            
            // Login logic
            
            
            JOptionPane.showMessageDialog(null, "You have selected login.");
        }

        // Prompt the user to enter a username
        String username = JOptionPane.showInputDialog(null, "Enter your username :");
        
        //  this is to check if the username is valid for login logic
        boolean isUsernameValid = username.contains("_") && username.length() <= 5;
        
        // Prompt the user to enter a password
        String password = JOptionPane.showInputDialog(null, "Enter your password :");
        
        // Check if the password meets the requirements
        boolean isPasswordValid = password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*()].*");
        
        // Display a message based on the validation result
        if (isUsernameValid && isPasswordValid) {
            JOptionPane.showMessageDialog(null, "Welcome back!! You have successfully logged in!");
        } else if (!isUsernameValid) {
            JOptionPane.showMessageDialog(null, "Invalid username. Please try again.");
        } else if (!isPasswordValid) {
            JOptionPane.showMessageDialog(null, "Invalid password. Please try again.");
        }
    }
}

  
 // Reference 

// W3schools,W3schools.2023.How to use java:Refsnes Data in Norway.Available on W3schools at: https://www.w3schools.com/html/html_scripts.asp
// W3schools,W3schools.2023.How to use java:Refsnes Data in Norway.Available on W3schools at: https://www.w3schools.com/java/java_ref_keywords.asp
// W3schools,W3schools.2023.How to use java:Refsnes Data in Norway.Available on W3schools at: https://www.w3schools.com/java/java_ref_string.asp
// W3schools,W3schools.2023.How to use java:Refsnes Data in Norway.Available on W3schools at: https://www.w3schools.com/java/java_ref_math.asp
// W3schools,W3schools.2023.How to use java:Refsnes Data in Norway.Available on W3schools at: https://www.w3schools.com/java/java_howto_reverse_string.asp
// Farrell,J.2018.Ninth edition:Java programming.United States of America    
    

