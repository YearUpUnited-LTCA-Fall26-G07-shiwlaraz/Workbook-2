package com.pruralsight;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myScanner =  new Scanner(System.in);
        System.out.println("Please Enter Your full name: ");
        String fullName = myScanner.nextLine();
        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String fullDate = myScanner.nextLine();
        System.out.println("How many tickets would you like? ");
        int tickets = myScanner.nextInt();

        String[] parseName = fullName.split(" ");
        String firstName = parseName[0];
    //    System.out.print(firstName);

        String secondName = parseName[1];
    //    System.out.print(secondName);

        String[] parseDate = fullDate.split("[/]");
        int month  = Integer.parseInt(parseDate[0]);

    //    System.out.print(month);
        String[] parseMonth = fullDate.split("[/]");
        int date  = Integer.parseInt(parseDate[1]);

    //    System.out.print(date);
        String[] parseYear = fullDate.split("[/]");
        int year  = Integer.parseInt(parseDate[2]);

    //    System.out.print(year);

    //    System.out.print("1 ticket reserved for 2023-05-13 under Johnson, Geri");
        System.out.print(tickets +" ticket reserved for " + year + "-" + month + "-" + month + " under " + secondName + ", " + firstName);

    }
}
