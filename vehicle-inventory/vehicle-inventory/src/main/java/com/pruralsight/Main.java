package com.pruralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[20];
        Scanner vehicleScanner = new Scanner(System.in);

        vehicle[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicle[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicle[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicle[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicle[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicle[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        int vehicleCount = 6;

        while (true) {
            System.out.println("--- What do you want to do ---?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");

            int command = vehicleScanner.nextInt();

            switch (command) {
                case 1:
                    for (int i = 0; i < vehicleCount; i++) {
                        System.out.println(vehicle[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter vehicle make/model: ");
                    vehicleScanner.nextLine();
                    String searchModel = vehicleScanner.nextLine();
                    for (int i = 0; i < vehicleCount; i++) {
                        if (vehicle[i].getMakeModel().toLowerCase().contains(searchModel.toLowerCase())) {
                            System.out.println(vehicle[i]);
                        }
                        break;
                    }
                case 5:
                    System.out.print("Enter the vehicle ID?");
                    long vehicleId = vehicleScanner.nextLong();
                    vehicleScanner.nextLine();

                    System.out.print("Enter the vehicle Make Model?");
                    String makeModel = vehicleScanner.nextLine();

                    System.out.print("Enter the vehicle color?");
                    String color = vehicleScanner.nextLine();

                    System.out.print("Enter the vehicle Odometer rating?");
                    int odometerReading = vehicleScanner.nextInt();

                    System.out.print("Enter the vehicle Price?");
                    Double price = vehicleScanner.nextDouble();

                    vehicle[vehicleCount] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
                    vehicleCount++;
                    System.out.println("\n---- Your Newly Added Vehicle ---");
                    System.out.println("Vehicle ID: " + vehicle[6].getVehicleId());
                    System.out.println("Make Model: " + vehicle[6].getMakeModel());
                    System.out.println("Color: " + vehicle[6].getColor());
                    System.out.println("Odometer: " + vehicle[6].getOdometerReading());
                    System.out.println("Price: " + vehicle[6].getPrice());
                    System.out.println("-------------------");

                case 6:
                    System.out.println("Goodbye!");
                    return;
            }

            if (command == 6) {
                System.out.println("Goodbye!");
                break;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Vehicle ID: " + vehicle[i].getVehicleId());
            System.out.println("Make Model: " + vehicle[i].getMakeModel());
            System.out.println("Color: " + vehicle[i].getColor());
            System.out.println("Odometer: " + vehicle[i].getOdometerReading());
            System.out.println("Price: " + vehicle[i].getPrice());
            System.out.println("-------------------");
        }

    }

}
