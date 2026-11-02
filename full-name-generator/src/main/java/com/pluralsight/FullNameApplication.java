package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter The Name: ");
        String firstName = myScanner.nextLine().trim();
        System.out.println("Enter The Initial: ");
        String middleName = myScanner.next();
        myScanner.nextLine();
        System.out.println("Enter The LasTname: ");
        String lastName = myScanner.nextLine().trim();
        System.out.println("Enter The Suffix: ");
        String suffix = myScanner.nextLine().trim();

        String fullName = firstName;
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        System.out.println("Full Name " + fullName);

    }
}
