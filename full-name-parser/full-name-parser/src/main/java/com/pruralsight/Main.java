package com.pruralsight;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String fullName = myScanner.nextLine().trim();

        String[] words = fullName.split(" ");


        int wordLength = words.length;


        if (wordLength == 2) {
            String firstName = words[0];
            String lastName = words[1];
            System.out.println("First Name" + " " + firstName);
            System.out.println("Last Name" + " " + lastName);
        }else if (wordLength == 3) {
            String firstName = words[0];
            String middleName = words[1];
            String lastName = words[2];
            System.out.println("First Name:" + " " + firstName);
            System.out.println("Middle Name:" + " " + middleName);
            System.out.println("Last Name: " + " " + lastName);

        }
    }
}
