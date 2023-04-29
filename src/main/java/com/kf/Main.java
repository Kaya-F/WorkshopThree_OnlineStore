package com.kf;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Create static variable called inventory. It will be an ArrayList of Products
    // Create static variable called cart. It will be an ArrayList of Products
    // Create static scanner instance
    static ArrayList<Product> inventory = new ArrayList<>();
    static ArrayList<Product> cart = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        loadProductsFromFile();
        // Initialize variable for user input
        String input;

        // Create do-while loop that runs unless the user enters "3"
        do { // Create main menu:
            // Show prompt for user showing the possible options and asking for an input
            System.out.println("Home Screen | Enter your command!");
            System.out.println("\t1. Show all Products");
            System.out.println("\t2. Show cart ");
            System.out.println("\t3. Exit.");
            System.out.print("Command: ");

            input = scanner.nextLine();
            // Initialize variable for user input
            // Create switch statement that handles cases related to each menu item
            switch (input){
                // Case "1": Show Products
                case "1":
                    showProducts();
                // Runs custom static method called showProducts
                    break;
                // Case "2": Show Cart
                case "2":
                    showCart();
                // Runs custom static method called showCart
                    break;
                // Case "3": Exit
                case "3":
                    System.out.println("Exiting...");
                // Print message that says "Exiting"
                    break;
                // Default:
                default:
                    System.out.println("Input command not found.");
                // Show message "Input command not found"
            }

        } while(!input.equalsIgnoreCase("3"));


    }

    // Create static method called loadProductsFromFile that return nothing
    public static void loadProductsFromFile(){
        // Read data from file: From WorkingWithFileIO >> BufferedReaderExercise example
        try { // Create a try/catch statement to handle file import
            // Create an instance of FileReader with an approximate path of "./src/main/java/com/<YourInitial>/inventory.txt"
            FileReader inventoryFile = new FileReader("./src/main/java/com/kf/inventory.txt");
            // Create an instance of BufferedReader that takes in the FileInputStream instance above
            BufferedReader bufferedReader = new BufferedReader(inventoryFile);

            String input;

            // Create a variable that stores a Product instance using the data from the current line
            while((input = bufferedReader.readLine())!= null){
                // Parse/Split the line on "|" and store in variable: Hint .split("\\|");
                String[] splitInput = input.split("\\|");
                // Create variables that stores each property
                String productIdInput = splitInput[0];
                String productNameInput = splitInput[1];
                float productPriceInput = Float.parseFloat(splitInput[2]);
                // Create a variable that stores a Product instance using the data from the current line
                Product currentProduct = new Product(productIdInput, productNameInput, productPriceInput);
                // Add the variable to the static inventory variable
                inventory.add(currentProduct);
            }
            // Close the scanner instance
            bufferedReader.close();
            // Handle catch/exception
        } catch(IOException e){
            System.out.println("From the catch statement");
            e.printStackTrace();
        }


    }

    // Create static method called showProducts that return nothing
    public static void showProducts(){
        // iterate through the inventory
        // Print each product one at a time
        for (Product currentProduct : inventory) { // an enhanced for?
            System.out.println(currentProduct);
        }



    }

    public static void checkout(){

    }

    // Create static method called showCart that return nothing
    public static void showCart(){
        // Display total number of items in the cart
        // Iterate through the cart
        // Print each item in cart one at a time
        for (Product currentProduct : cart) {
            System.out.println(currentProduct);
         // Initialize variable for productIdInput


        }

        String subInput;

        do{
            System.out.println("\tC. Checkout");
            System.out.println("\tX. Go Back To Home Screen");
            System.out.print("Command: ");

            subInput = scanner.nextLine();

            // Create switch statement that handles cases related to each menu item
            switch (subInput){
                // Case "c": Checkout
                case "C":
                    // Runs custom static method called checkout
                    checkout();
                    break;
                // Case "x": Go Back To Home Screen
                case "X":
                    // Print message that says "Going back to home screen"
                    System.out.println("Going back to Home Screen...");
                    break;
                // Default:
                // Show message "Input command not found"
                default:
                    System.out.println("Input command not found.");

            }

        } while (!subInput.equalsIgnoreCase("X"));

    }

}
