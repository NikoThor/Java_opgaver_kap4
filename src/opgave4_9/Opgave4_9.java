package opgave4_9;

import java.util.Scanner;

public class Opgave4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character");
        String a = input.nextLine();
        char ch = a.charAt(0);
            System.out.println("The character entered is " + ch);
            System.out.println(" the Unicode for character " + ch + " " + a.codePointAt(0));
    }
}
