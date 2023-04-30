package com.learntocode;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

public class OnlineStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int choice = -1;
        while (choice != 3) {

            // Menu
            System.out.println("Store Home Screen");
        System.out.println("------------------");
        System.out.println("1. Show Products");
        System.out.println("2. Show Cart");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");

        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                ArrayList<Product> inventory = loadInventory() {
                break;
            case 2:

                break;
            case 3:
                System.out.println("Exiting the application. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }


        public static ArrayList<Product> loadInventory () {
            ArrayList<Product> inventory = new ArrayList<Product>();

            String line;
            try {
                BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));

                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    inventory.add(new Product(id, name, price));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return inventory;
        }
    }







