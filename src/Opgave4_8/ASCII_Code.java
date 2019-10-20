package Opgave4_8;

import java.util.Scanner;

// Find the character of an ASCII code
// write a program that receives a character and displays its ASCII code
public class ASCII_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initialize new scanner object
        System.out.println("Please enter a character");
        int i = sc.next().charAt(0); // Takes a char, then converts it into the ASCII CODE
        System.out.println("The ASCII code for the character is "+ "" + i); // Shouts out the ASCII code
    }
}
