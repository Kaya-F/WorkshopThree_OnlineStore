import java.io.FileInputStream;
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
            System.out.println("Enter your command!");
            System.out.println("\t1. Show all Products");
            System.out.println("\t2. Show cart ");
            // Initialize variable for user input
            input = scanner.nextLine();
            // Create switch statement that handles cases related to each menu item
            switch (input){
                // Case "1": Show Products
                case "1":
                    showProducts();
                // Runs custom static method called showProducts
                    break;
                // Case "2": Show Cart
                case "2":
                    showCart
                // Runs custom static method called showCart
                // Case "3": Exit
                case "3":
                    System.out.println("Exiting...");
                // Print message that says "Exiting"
                // Default:
                default:
                    System.out.println("Invalid Input.");
                // Show message "Input command not found"
            }

        } while(!input.equalsIgnoreCase("3"));


    }
//    public static void loadProductsFromFile(){
//        FileInputStream inventoryFile =  new FileInputStream("./src")
//        Scanner scanner = new Scanner(inventoryFile);
//    }
}
