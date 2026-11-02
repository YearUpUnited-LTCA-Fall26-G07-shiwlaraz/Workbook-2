package com.pruralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner phoneScanner = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(6767676, "iphone", "Verizon", "555-444-6767", "john");


        System.out.print("Please Enter the serial No: ");
        int serialNumber = phoneScanner.nextInt();
        phoneScanner.nextLine();

        System.out.print("Please Enter the model: ");
        String model = phoneScanner.nextLine();

        System.out.print("Please Enter carrier: ");
        String carrier = phoneScanner.nextLine();

        System.out.print("Please Enter Phone number: ");
        String phoneNumber = phoneScanner.nextLine();

        System.out.print("Please Enter the Owner: ");
        String owner = phoneScanner.nextLine();

        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);

        cellPhone1.getSerialNumber();
        cellPhone1.getModel();
        cellPhone1.getCarrier();
        cellPhone1.getPhoneNumber();
        cellPhone1.getOwner();

        cellPhone2.setPhoneNumber("222-222-2222");
        cellPhone2.setOwner("Sasha");


        System.out.println("\n"+ "===== Cell Phone Information =====" + "\n");

        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());

        display(cellPhone1);
        System.out.println("\n");
        display(cellPhone2);
        System.out.println("\n");
        display(cellPhone3);
        System.out.println("\n");

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());





    }
    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }

}
