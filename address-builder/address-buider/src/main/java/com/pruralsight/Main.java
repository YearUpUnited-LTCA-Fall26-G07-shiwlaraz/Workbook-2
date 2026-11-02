package com.pruralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide the following information:");

        System.out.print("Full name:");
        String fullName = myScanner.nextLine();

        //System.out.println(fullName);
        System.out.print("Billing Street:");
        String billingStreet = myScanner.nextLine();
        //System.out.println(billingStreet);

        System.out.print("Billing City:");
        String billingCity = myScanner.nextLine();
        //System.out.println(billingCity);

        System.out.print("Billing State:");
        String billingState = myScanner.nextLine();
        //System.out.println(billingState);

        System.out.print("Billing Zip:");
        String billingZip = myScanner.nextLine();
        //System.out.println(billingZip);

        System.out.print("Shipping Street:");
        String shippingStreet = myScanner.nextLine();
        //System.out.println(shippingStreet);

        System.out.print("Shipping City:");
        String shippingCity = myScanner.nextLine();
        //System.out.println(billingCity);

        System.out.print("Shipping State:");
        String shippingState = myScanner.nextLine();
        //System.out.println(shippingState);

        System.out.print("Shipping Zip:");
        String shippingZip = myScanner.nextLine();
        //System.out.println(shippingZip);

        StringBuilder address = new StringBuilder();

        address.append(fullName + "\n\n");
        address.append("billingAddress:\n");
        address.append(billingStreet + "\n");
        address.append(billingCity+ ", "+billingState+" "+ billingZip + "\n");
        address.append("\n");
        address.append("ShippingAddress: \n");
        address.append(shippingStreet + "\n");
        address.append(shippingCity+ ", "+ shippingState+" "+ shippingZip + "\n");

        System.out.print(address);
    }
}
