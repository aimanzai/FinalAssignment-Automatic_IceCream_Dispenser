package assignment_UPDATED_VER;
import static assignment_UPDATED_VER.IceCream_UPDATED.getBalance;
import static assignment_UPDATED_VER.IceCream_UPDATED.menu;
import static assignment_UPDATED_VER.IceCream_UPDATED.placeOrder;
import java.util.*;
import java.io.*;

public class TestIceCream_UPDATED {
    public static void main (String[] args) throws IOException{
        options();
    }
    
    public static void options() throws IOException{
        
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        
        double totalCost = 0;
        File filename = new File("Receipt Order.txt"); //To create a file with the name of receipt order.txt
        PrintWriter write = new PrintWriter(new FileWriter(filename, true));
        if(!filename.exists()) {
            filename.createNewFile();
        }

        // Initialize availability of casing, flavor and topping
        int[] casingAvailability = {1, 5, 5};
        int[] flavorAvailability = {1, 5, 5, 5};
        int[] toppingAvailability = {1, 5, 5, 5, 5};
        boolean continueInput = true;
        do {
                System.out.println("--------------------------");
                System.out.println("Welcome to IIAOIIAO RAHMAH");
                System.out.println("--------------------------");
                System.out.println("1) Menu");
                System.out.println("2) Place an order");
                System.out.println("3) Payment");
                System.out.println("4) Exit");
                System.out.println("--------------------------");
                
                System.out.print("\nEnter your choice: "); // Asking user to enter the choice 1/2/3/4
                String choice = input.nextLine();

                switch (choice) {
                    case "1": //To show the entire
                        menu();
                        break;
                case "2"://To place an order and get the total cost/order cost/update availaibility for the ice cream
                    try {
                        double orderCost = placeOrder(casingAvailability, flavorAvailability, toppingAvailability, write, filename);
                        totalCost += orderCost;
                        System.out.println("Total Cost: RM " + totalCost);
                        write.println();
                        System.out.println();
                    } catch (IOException e) {
                        System.out.println("An error occurred while placing the order: " + e.getMessage());
                    }
                        break;
                case "3":// To show the total amount that customer need to pay of their order/s and if it's more than it supposed to be than it will show the balance as well as the amount that customer needs to pay if he/she pays isufficient amount
                    try {
                        double balance = getBalance(totalCost, filename, write); // to get the balance of customer's payment
                        break;
                    } catch (IOException e) {
                        System.out.println("An error occurred while opening the payment page: " + e.getMessage());
                    }
                    break;
                case "4":// To exit the program
                    System.out.print("Do you want to exit without making an order/payment? (Y/N): ");
                    String ans = input.nextLine();
                    if (ans.equalsIgnoreCase("Y")) {
                        write = new PrintWriter(filename);
                        exit = true;
                        System.exit(0);
                    } else if (ans.equalsIgnoreCase("N")) {
                        options();
                        System.out.println();
                    } else {
                        while (!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N")) {
                            System.out.println("Invalid input, Please insert the correct input (Y/N)!");
                            System.out.print("Do you want to exit without making an order/payment? (Y/N): ");
                            ans = input.nextLine();
                            System.out.println();
                        }
                    }
                        break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                }
        } while (!exit);

    }  
}

    
