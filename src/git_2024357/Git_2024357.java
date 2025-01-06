/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024357;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Git_2024357 {

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char letter) {
        return "aeiou".indexOf(letter) != -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kBoard = new Scanner(System.in);

        String name;

        //Do the question for the user to enter a name
        do {
            System.out.println("Enter your Name: ");
            name = kBoard.nextLine();

            // Check if the input contains only letters
            if (name.matches("[a-zA-Z]+")) {
                // Get the first character and check if it starts with a vowel
                char firstChar = Character.toLowerCase(name.charAt(0));

                if ("aeiou".indexOf(firstChar) != -1) {
                    // If the name starts with a vowel, show only the vowel
                    System.out.println("Your name starts with the vowal: " + name.toUpperCase().charAt(0));
                } else {
                    // If the name starts with a consonant, show the name reversed
                    System.out.println("Your name starts with a consonant, the name reversed is: " + new StringBuilder(name).reverse());
                }
                //If the user enter anything else, print the error message
            } else {
                System.out.println("Invalid input. You need to enter a name without numbers or special characters.");
            }
            //while the user enter something that is not a name, keep asking for a name
        } while (!name.matches("[a-zA-Z]+"));

    }
}
