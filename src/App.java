/*
 * Yuepeng Xiong
 * Reverse a String
 * 9/25/24
 * 
 * This program reverses a string.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = ""; // for when user inputs something
        String output = "";// for storing the reverse string
        System.out.println("Please type any string:");
        input = scanner.nextLine();
        scanner.close();

        
        //starts at the length of the string the user inputted, then counts backwards to 0
        // and "adds" the character at the index to output
        for (int i = input.length(); i > 0; i--){
            output += input.charAt(i - 1);

        }

        System.out.println("The reverse string is: " + output);
        


    }
}
