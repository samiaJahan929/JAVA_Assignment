package Assignment;

import java.util.Scanner;

public class Check_Binary_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string binary Number: ");
        String string = scanner.next();
        boolean status = true;

        for (int i = 0; i < string.length(); i++) {
            char chars = string.charAt(i);
            if (chars != '0' && chars != '1') {
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println(" is a binary number");
        } else {
            System.out.println(" is not a binary number");
        }
        scanner.close();
    }
}
