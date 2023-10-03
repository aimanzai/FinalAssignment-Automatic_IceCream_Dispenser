package assignment_UPDATED_VER;
import static assignment_UPDATED_VER.TestIceCream_UPDATED.options;
import java.util.*;
import java.io.*;

public class IceCream_UPDATED{
    public static void menu(){ //This method is to show the menu table of ice cream, which are casings, sizes, scoops and prices.
        String[][] table = {
                {"Casing", "Size", "Scoops", "Price"},
                {"--------", "--------------------", "-------", "------"},
                {"Cone (RM 2.00)", "Small", "1 scoop", "RM 2.00"},
                {"", "Regular (+RM 1.00)", "2 scoop", "RM 3.00"},
                {"", "Large (+RM 2.00)", "3 scoop", "RM 4.00"},
                {"Bowl (RM 6.00)", "Small", "1 scoop", "RM 6.00"},
                {"", "Regular (+RM 2.00)", "2 scoop", "RM 8.00"},
                {"", "Large (+RM 4.00)", "3 scoop", "RM 10.00"},
                {"Cup (RM 4.00)", "Small", "1 scoop", "RM 4.00"},
                {"", "Regular (+RM 1.50)", "2 scoop", "RM 5.50"},
                {"", "Large (+RM 3.00)", "3 scoop", "RM 7.00"}
        };
        
        int[] maxColumnLengths = new int[table[0].length];
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        for (String[] row : table) {
            for (int i = 0; i < row.length; i++) {
                if (row[i].length() > maxColumnLengths[i]) {
                    maxColumnLengths[i] = row[i].length();
                }
            }
        }

        for (String[] row : table){
            for (int i = 0; i < row.length; i++){
                System.out.printf("| %-" + (maxColumnLengths[i] + 2) + "s", row[i]);
            }
            System.out.println("|");
        }

        System.out.println("----------------------------------------------------------------");

        String[][] icecream = {
                {"Flavour", "Toppings", "Add-On Topping"},
                {"-----------------", "-------------------", "---------------"},
                {"Chocolate", "Caramel", "+RM 2.00"},
                {"Strawberry", "Peanut", "+RM 2.00"},
                {"Vanilla", "Chocolate Syrup", "+RM 2.00"},
                {"Neapolitan", "Sprinkle", "+RM 2.00"},
                {"", "Chocolate Chip", "+RM 2.00"}
        };

        int[] maxColumnsLengths = new int[table[0].length];
        
        for (String[] row : icecream){
            for (int i = 0; i < row.length; i++){
                if (row[i].length() > maxColumnLengths[i]){
                    maxColumnLengths[i] = row[i].length();
                }
            }
        }

        for (String[] row : icecream){
            for (int i = 0; i < row.length; i++){
                System.out.printf("| %-" + (maxColumnLengths[i] + 2) + "s", row[i]);
            }
            System.out.println("|");
        }
        System.out.println("----------------------------------------------------------------");
    }
    public static void tableCasing(int[] casingAvailability){//To display casing table with the each of casing availability 
        
        String[][] table = {
                        {" Casing ", "Price", "Availability"},
                        {"--------", "-------", "------------"},
                        {"1. Cone", "RM2.00", casingAvailability[0] > 0 ? Integer.toString(casingAvailability[0]) : "SOLD OUT"},
                        {"2. Bowl", "RM6.00", casingAvailability[1] > 0 ? Integer.toString(casingAvailability[1]) : "SOLD OUT"},
                        {"3. Cup", "RM4.00", casingAvailability[2] > 0 ? Integer.toString(casingAvailability[2]) : "SOLD OUT"}
                    };
        System.out.println("----------------------------------------");
        int[] maxColumnLengths = new int[table[0].length];
        for(String[] row : table){
            for (int i = 0; i < row.length; i++){
                if (row[i].length() > maxColumnLengths[i]){
                    maxColumnLengths[i] = row[i].length();
                }
            }
        }       
        for(String[] row : table){
            for(int i = 0; i < row.length; i++){
                System.out.printf("| %-" + (maxColumnLengths[i] + 2) + "s", row[i]);
            }
            System.out.println("|");
        }       
        System.out.println("----------------------------------------");
    }
    public static void tableSize(String selectCasing){//To display specific size table based on the casing tha customer choose 
        
        switch(selectCasing){
            case "1": //Display the details about cone casing
                {
                    String[][] table = {
                        {"Casing", "Size", "Scoops", "Price"},
                        {"--------", "--------------------", "-------", "------"},
                        {"Cone (RM 2.00)", "Small", "1 scoop", "RM 2.00"},
                        {"", "Regular (+RM 1.00)", "2 scoop", "RM 3.00"},
                        {"", "Large (+RM 2.00)", "3 scoop", "RM 4.00"}
                    };
                    System.out.println();
                    int[] maxColumnLengths = new int[table[0].length];
                    System.out.println("----------------------------------------------------------------");
                    for(String[] row : table){
                        for (int i = 0; i < row.length; i++){
                            if (row[i].length() > maxColumnLengths[i]){
                                maxColumnLengths[i] = row[i].length();
                            }
                        }
                    } 
                    for(String[] row : table){
                        for(int i = 0; i < row.length; i++){
                            System.out.printf("| %-" + (maxColumnLengths[i] + 2) + "s", row[i]);
                        }
                        System.out.println("|");
                    }       
                    System.out.println("----------------------------------------------------------------");
                    break;
                }
            case "2": //Display the details about bowl casing
                {
                    String[][] table = {
                        {"Casing", "Size", "Scoops", "Price"},
                        {"--------", "--------------------", "-------", "------"},
                        {"Bowl (RM 6.00)", "Small", "1 scoop", "RM 6.00"},
                        {"", "Regular (+RM 2.00)", "2 scoop", "RM 8.00"},
                        {"", "Large (+RM 4.00)", "3 scoop", "RM 10.00"}
                    };
                    System.out.println();
                    System.out.println("----------------------------------------------------------------");
                    int[] maxColumnLengths = new int[table[0].length];
                    for(String[] row : table){
                        for (int i = 0; i < row.length; i++){
                            if (row[i].length() > maxColumnLengths[i]){
                                maxColumnLengths[i] = row[i].length();
                            }
                        }
                    }       
                    for(String[] row : table){
                        for(int i = 0; i < row.length; i++){
                            System.out.printf("| %-" + (maxColumnLengths[i] + 2) + "s", row[i]);
                        }
                        System.out.println("|");
                    }       
                    System.out.println("----------------------------------------------------------------");
                    break;
                }
            case "3": //Display the details about cup casing
                {
                    String[][] table = {
                        {"Casing", "Size", "Scoops", "Price"},
                        {"--------", "--------------------", "-------", "------"},
                        {"Cup (RM 4.00)", "Small", "1 scoop", "RM 4.00"},
                        {"", "Regular (+RM 1.50)", "2 scoop", "RM 5.50"},
                        {"", "Large (+RM 3.00)", "3 scoop", "RM 7.00"}
                    };
                    System.out.println();
                    System.out.println("--------------------------------------------------------------");
                    int[] maxColumnLengths = new int[table[0].length];
                    for(String[] row : table){
                        for (int i = 0; i < row.length; i++){
                            if (row[i].length() > maxColumnLengths[i]){
                                maxColumnLengths[i] = row[i].length();
                            }
                        }
                    }       for(String[] row : table){
                        for(int i = 0; i < row.length; i++){
                            System.out.printf("| %-" + (maxColumnLengths[i] + 2) + "s", row[i]);
                        }
                        System.out.println("|");
                    }       
                    System.out.println("--------------------------------------------------------------");
                    break;
                }
            default:
                break;
        }
    }
    public static void tableFlavor(int[] flavorAvailability){ //To display flavor table with the each of flavor availability
        
        System.out.println("-------------------------------------");
        
        String[][] icecream = {
                {"Flavour", "Availability"},
                {"---------------", "-------------"},
                {"Chocolate", flavorAvailability[0] > 0 ? Integer.toString(flavorAvailability[0]) : "SOLD OUT"},
                {"Strawberry", flavorAvailability[1] > 0 ? Integer.toString(flavorAvailability[1]) : "SOLD OUT"},
                {"Vanilla", flavorAvailability[2] > 0 ? Integer.toString(flavorAvailability[2]) : "SOLD OUT"},
                {"Neapolitan", flavorAvailability[3] > 0 ? Integer.toString(flavorAvailability[3]) : "SOLD OUT"}
        };

        int[] maxColumnsLengths = new int[icecream[0].length];
        
        for (String[] row : icecream) {
            for (int i = 0; i < row.length; i++){
                if (row[i].length() > maxColumnsLengths[i]){
                    maxColumnsLengths[i] = row[i].length();
                }
            }
        }

        for (String[] row : icecream){
            for (int i = 0; i < row.length; i++){
                System.out.printf("| %-" + (maxColumnsLengths[i] + 2) + "s", row[i]);
            }
            System.out.println("|");
        }
        System.out.println("-------------------------------------");
    
    }
    public static void tableTopping(int[] toppingAvailability){//To display topping table with the each of topping availability
        
        System.out.println("-----------------------------------------------------------");
        
        String[][] icecream = {
                {"Toppings", "Add-On Topping", "Availability"},
                {"-------------------", "---------------", "------------"},
                {"Caramel", "+RM 2.00", toppingAvailability[0] > 0 ? Integer.toString(toppingAvailability[0]) : "SOLD OUT"},
                {"Peanut", "+RM 2.00", toppingAvailability[1] > 0 ? Integer.toString(toppingAvailability[1]) : "SOLD OUT"},
                {"Chocolate Syrup", "+RM 2.00", toppingAvailability[2] > 0 ? Integer.toString(toppingAvailability[2]) : "SOLD OUT"},
                {"Sprinkle", "+RM 2.00", toppingAvailability[3] > 0 ? Integer.toString(toppingAvailability[3]) : "SOLD OUT"},
                {"Chocolate Chip", "+RM 2.00", toppingAvailability[4] > 0 ? Integer.toString(toppingAvailability[4]) : "SOLD OUT"}
        };

        int[] maxColumnsLengths = new int[icecream[0].length];
        
        for (String[] row : icecream){
            for (int i = 0; i < row.length; i++){
                if (row[i].length() > maxColumnsLengths[i]){
                    maxColumnsLengths[i] = row[i].length();
                }
            }
        }

        for (String[] row : icecream){
            for (int i = 0; i < row.length; i++){
                System.out.printf("| %-" + (maxColumnsLengths[i] + 2) + "s", row[i]);
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------------------------------------");        
    }
    public static double placeOrder(int[] casingAvailability, int[] flavorAvailability, int[] toppingAvailability, PrintWriter write, File filename)throws IOException{
        Scanner input = new Scanner(System.in);
                      
        System.out.println();
        tableCasing(casingAvailability);//To show table of casing
        System.out.print("Select a casing (1/2/3): ");
        String selectCasing = input.nextLine();
        while(!selectCasing.equalsIgnoreCase("1") && !selectCasing.equalsIgnoreCase("2") && !selectCasing.equalsIgnoreCase("3")){ 
                System.out.println("Invalid Casing, Please insert the correct casing(1/2/3)!");
                System.out.print("select a casing (1/2/3) : ");
                selectCasing = input.nextLine();
                while((selectCasing.equalsIgnoreCase("1") && casingAvailability[0] == 0) || (selectCasing.equalsIgnoreCase("2") && casingAvailability[1] == 0) || (selectCasing.equalsIgnoreCase("3") && casingAvailability[2] == 0)){
                    System.out.println("Already Sold Out! Please choose another option");
                    System.out.print("select a casing (1/2/3) : ");
                    selectCasing = input.nextLine();
                }
        }
        while((selectCasing.equalsIgnoreCase("1") && casingAvailability[0] == 0) || (selectCasing.equalsIgnoreCase("2") && casingAvailability[1] == 0) || (selectCasing.equalsIgnoreCase("3") && casingAvailability[2] == 0)){
            System.out.println("Already Sold Out! Please choose another option");
            System.out.print("select a casing (1/2/3) : ");
            selectCasing = input.nextLine();
            
            while(!selectCasing.equalsIgnoreCase("1") && !selectCasing.equalsIgnoreCase("2") && !selectCasing.equalsIgnoreCase("3")){
                System.out.println("Invalid Casing, Please insert the correct casing(1/2/3)!");
                System.out.print("select a casing (1/2/3) : ");
                selectCasing = input.nextLine();
            }
        }               
        
        tableSize(selectCasing); //To show table of size based on the casing that customer choose
        System.out.print("Select a size (S/R/L): ");
        String selectSize = input.nextLine();
        while(!selectSize.equalsIgnoreCase("S") && !selectSize.equalsIgnoreCase("R") && !selectSize.equalsIgnoreCase("L")){
            System.out.println("Invalid Size, Please insert the correct size (S/R/L)!");
            System.out.print("Select a size (S/L/R): ");
            selectSize = input.nextLine();
        }
        System.out.println();
        
        tableFlavor(flavorAvailability);
        System.out.print("Which flavor do you want?: ");
        String selectFlavor = input.nextLine();
        while(!selectFlavor.equalsIgnoreCase("Chocolate") && !selectFlavor.equalsIgnoreCase("Vanilla") && !selectFlavor.equalsIgnoreCase("Strawberry") && !selectFlavor.equalsIgnoreCase("Neapolitan")){
                System.out.println("Invalid flavor, Please enter the correct flavor!");
                System.out.print("Enter new flavor: ");
                selectFlavor = input.nextLine();
                while((selectFlavor.equalsIgnoreCase("Chocolate") && flavorAvailability[0] == 0) || (selectFlavor.equalsIgnoreCase("Vanilla") && flavorAvailability[1] == 0) || (selectFlavor.equalsIgnoreCase("Strawberry") && flavorAvailability[2] == 0) || (selectFlavor.equalsIgnoreCase("Neapolitan") && flavorAvailability[3] == 0)){
                    System.out.println("Already Sold Out! Please choose another option");
                    System.out.print("Enter new flavor: ");
                    selectFlavor = input.nextLine();
                 }
        }
        while((selectFlavor.equalsIgnoreCase("Chocolate") && flavorAvailability[0] == 0) || (selectFlavor.equalsIgnoreCase("Vanilla") && flavorAvailability[1] == 0) || (selectFlavor.equalsIgnoreCase("Strawberry") && flavorAvailability[2] == 0) || (selectFlavor.equalsIgnoreCase("Neapolitan") && flavorAvailability[3] == 0)){
            System.out.println("Already Sold Out! Please choose another option");
            System.out.print("Enter new flavor: ");
            selectFlavor = input.nextLine();
            
            while(!selectFlavor.equalsIgnoreCase("Chocolate") && !selectFlavor.equalsIgnoreCase("Vanilla") && !selectFlavor.equalsIgnoreCase("Strawberry") && !selectFlavor.equalsIgnoreCase("Neapolitan")){
                System.out.println("Invalid flavor, Please enter the correct flavor!");
                System.out.print("Enter new flavor: ");
                selectFlavor = input.nextLine();
            }
        }

        System.out.print("Do you want to add toppings? (Y/N): "); //To ask customer if he/she wants to add topping for the ice cream
        String addToppings = input.nextLine();
        while(!addToppings.equalsIgnoreCase("Y") && !addToppings.equalsIgnoreCase("N")){
            System.out.println("Invalid Choice, Please enter the correct answer(Y/N)!");
            System.out.print("Do you want to add toppings? (Y/N): ");
            addToppings = input.nextLine();
        }
        System.out.println();
        
        //To write all the details that we got from customer to txt file
        if(selectCasing.equalsIgnoreCase("1")){
            write.println("Casing: Cone");
        }
        else if(selectCasing.equalsIgnoreCase("2")){
            write.println("Casing: Bowl");
        }
        else if(selectCasing.equalsIgnoreCase("3")){
            write.println("Casing: Cup");
        }
        
        if(selectSize.equalsIgnoreCase("S")){
            write.println("Size: Small");
        } 
        else if(selectSize.equalsIgnoreCase("R")){
            write.println("Size: Regular");
        } 
        else if(selectSize.equalsIgnoreCase("L")){
            write.println("Size: Large");
        }

        write.println("Flavor: " + selectFlavor);
        
        if(addToppings.equalsIgnoreCase("Y")){
            write.println("Is there any topping?: Yes");
        } 
        else if(addToppings.equalsIgnoreCase("N")){
            write.println("Is there any topping?: No");
        }      
        
        //To get the order cost by adding calcCasing method and calcTopping method
        double orderCost = calcCasing(selectCasing, selectSize, casingAvailability) + calcTopping(addToppings, toppingAvailability, write);
        
        System.out.print("Are you confirm with the order? (Y/N): ");
        String confirm = input.nextLine();
        while(!confirm.equalsIgnoreCase("Y") && !confirm.equalsIgnoreCase("N")){
            System.out.println("Invalid Choice, Please enter the correct answer(Y/N)!");
            System.out.print("Are you confirm with the order? (Y/N): ");
            addToppings = input.nextLine();
        }
        if(confirm.equalsIgnoreCase("Y")){ //if customer input y, it will update the availability and display order cost
            // Update flavor availability
            for(int i = 0; i < flavorAvailability.length; i++){
                if(selectFlavor.equalsIgnoreCase(getFlavor(i + 1))) {
                    flavorAvailability[i]--;
                    break;
                }
            }
            System.out.println();
            System.out.println("Order cost: RM " + orderCost); //It will show cost of the order
            write.println("Order Cost: RM " + orderCost); //To write order cost in txt
        }
        else if(confirm.equalsIgnoreCase("N")){ //If customer input n, it will bring back to the option
            write = new PrintWriter(filename); //to clear all the data in txt
            System.out.println();
            options();
        }
        return orderCost;
    }
    public static double calcCasing(String selectCasing, String selectSize, int[] casingAvailability) {
        //This method is to calculate the price the casing and update the avaibality of the casing
        double[] priceCone = {2.00, 3.00, 4.00};
        double[] priceBowl = {6.00, 8.00, 10.00};
        double[] priceCup = {4.00, 5.50, 7.00};

        double price = 0;
        
        if(selectCasing.equalsIgnoreCase("1")){
            if(selectSize.equalsIgnoreCase("S")){
                price = priceCone[0];
                casingAvailability[0]--;
            } 
            else if(selectSize.equalsIgnoreCase("R")){
                price = priceCone[1];
                casingAvailability[0]--;
            }
            else if(selectSize.equalsIgnoreCase("L")){
                price = priceCone[2];
                casingAvailability[0]--;
            }
        }
        else if(selectCasing.equalsIgnoreCase("3")){
            if(selectSize.equalsIgnoreCase("S")){
                price = priceCup[0];
                casingAvailability[2]--;
            } 
            else if(selectSize.equalsIgnoreCase("R")){
                price = priceCup[1];
                casingAvailability[2]--;
            }
            else if(selectSize.equalsIgnoreCase("L")){
                price = priceCup[2];
                casingAvailability[2]--;
            }
        }
        else if(selectCasing.equalsIgnoreCase("2")){
            if(selectSize.equalsIgnoreCase("S")){
                price = priceBowl[0];
                casingAvailability[1]--;
            } 
            else if(selectSize.equalsIgnoreCase("R")){
                price = priceBowl[1];
                casingAvailability[1]--;
            } 
            else if(selectSize.equalsIgnoreCase("L")){
                price = priceBowl[2];
                casingAvailability[1]--;
            }
        } 
        return price; //it will return the price of casing
    }
    public static double calcTopping(String addToppings, int[] toppingAvailability, PrintWriter write)throws IOException{       
        Scanner input = new Scanner(System.in);
        
        double[] pricePerTopping = {2.00, 2.00, 2.00, 2.00, 2.00};
        double price = 0;
        int count = 1;
        
         
            if(addToppings.equalsIgnoreCase("Y")){        
                tableTopping(toppingAvailability);
                boolean continueInput = true;
                do{               
                    try {
                    System.out.print("How many toppings do you want?: ");
                    int numToppings = input.nextInt();
                 continueInput = false;
                while(numToppings <= 0){
                    System.out.println("Invalid Casing, Please insert the correct input");
                    System.out.print("How many toppings do you want?: ");
                    numToppings = input.nextInt();
                } //If the customer input other than quantity topping, it will ask customer to input a correct choice 
                input.nextLine(); // Consume the newline character

                write.println("Number Of Topping/s: " + numToppings);//To write number of topping/s in txt
                String[] selectTopping = new String[numToppings];
                for(int i = 0; i < numToppings; i++){
                    System.out.print("Select a topping: "); //To ask customer about the topping that they want for their ice cream
                    selectTopping[i] = input.nextLine();
                    
                    while(!selectTopping[i].equalsIgnoreCase("Caramel") && !selectTopping[i].equalsIgnoreCase("Peanut") && !selectTopping[i].equalsIgnoreCase("Chocolate Syrup") && !selectTopping[i].equalsIgnoreCase("Sprinkle") && !selectTopping[i].equalsIgnoreCase("Chocolate Chip")){
                        System.out.println("Invalid topping selected!");
                        System.out.print("Select a topping: ");
                        selectTopping[i] = input.nextLine();
                        while((selectTopping[i].equalsIgnoreCase("Caramel") && toppingAvailability[0] == 0) || (selectTopping[i].equalsIgnoreCase("Peanut") && toppingAvailability[1] == 0) || (selectTopping[i].equalsIgnoreCase("Chocolate Syrup") && toppingAvailability[2] == 0) || (selectTopping[i].equalsIgnoreCase("Sprinkle") && toppingAvailability[3] == 0) || (selectTopping[i].equalsIgnoreCase("Chocolate Chip") && toppingAvailability[4] == 0)){
                            System.out.println("Already Sold Out! Please choose another option");
                            System.out.print("Select a topping: ");
                            selectTopping[i] = input.nextLine();
                        }//To make sure if the availability is 0 then customer cannot choose it
                    }//To make sure if customer enter a correct topping if not then it will ask to enter a valid input
                    while((selectTopping[i].equalsIgnoreCase("Caramel") && toppingAvailability[0] == 0) || (selectTopping[i].equalsIgnoreCase("Peanut") && toppingAvailability[1] == 0) || (selectTopping[i].equalsIgnoreCase("Chocolate Syrup") && toppingAvailability[2] == 0) || (selectTopping[i].equalsIgnoreCase("Sprinkle") && toppingAvailability[3] == 0) || (selectTopping[i].equalsIgnoreCase("Chocolate Chip") && toppingAvailability[4] == 0)){
                            System.out.println("Already Sold Out! Please choose another option");
                            System.out.print("Select a topping: ");
                            selectTopping[i] = input.nextLine();
            
                        while(!selectTopping[i].equalsIgnoreCase("Caramel") && !selectTopping[i].equalsIgnoreCase("Peanut") && !selectTopping[i].equalsIgnoreCase("Chocolate Syrup") && !selectTopping[i].equalsIgnoreCase("Sprinkle") && !selectTopping[i].equalsIgnoreCase("Chocolate Chip")){
                            System.out.println("Invalid topping selected!");
                            System.out.print("Select a topping: ");
                            selectTopping[i] = input.nextLine();
                        }//To make sure if customer enter a correct topping if not then it will ask to enter a valid input
                    }//To make sure if the availability is 0 then customer cannot choose it
                    for(int j = 0; j < toppingAvailability.length; j++) {
                        if(selectTopping[i].equalsIgnoreCase(getTopping(j + 1))) {
                            price += pricePerTopping[j];//To caculate total price of topping
                            toppingAvailability[j]--; // Decrease the availability of topping
                            break;
                        }
                    }
                    write.println("Topping " + count++ + ": " + selectTopping[i]);//To write topping in txt
                }
                }catch (InputMismatchException ex) {  
            System.out.println("Try again. (" + "Incorrect input: an integer is required for the topping)");
            System.out.println();
            input.nextLine();  
        }
        }while(continueInput);
            }
            else{
                write.println("Number Of Topping: 0"); // Write 0 as the number of toppings if none selected to the txt
            }
        
        return price;//return the total price of topping
    }
    public static String getFlavor(int index){
        String[] flavors = {"Chocolate", "Strawberry", "Vanilla", "Neapolitan"};
        return flavors[index - 1]; //return the flavor of the ice cream
    }
    public static String getTopping(int index){
        String[] toppings = {"Caramel", "Peanut", "Chocolate Syrup", "Sprinkle", "Chocolate Chip"};
        return toppings[index - 1]; //return the topping of the ice cream
    }
    public static double getBalance(double totalCost, File filename, PrintWriter write)throws IOException{
        Scanner input = new Scanner(System.in);
        double balance = 0.0;
        
        if(totalCost == 0){
            System.out.println("You do not order yet, please make an order first!");
            System.out.println();
            options();
        }//if the customer want to make a payment without ordering an ice cream than it will show an error message while bring it customer to the option
        else{
            System.out.println();
            System.out.println("Total that you need to pay: RM " + totalCost); //it will show the total price of the ice cream
            do{
                System.out.print("Enter your payment: RM "); //Asking customer to make a payment
                double payment = input.nextDouble();
                input.nextLine();

                balance = payment - totalCost; //To caculate balance of the payment
            
                if(balance >= 0){
                    // Sufficient payment
                    System.out.println("Payment successful...");
                    System.out.println();
                    printReceipt(totalCost, filename, write, payment, balance); //it will display the receipt
                    System.out.println();
                
                    System.out.print("Next Customer (Y/N)?: "); //To ask if there is next customer or not
                    String choice = input.nextLine();
                    if(choice.equalsIgnoreCase("Y")){
                        write.close();
                        write = new PrintWriter(filename); //To clear all the data in txt
                        options(); //To show the option
                    } 
                    else if(choice.equalsIgnoreCase("N")){
                        write.close();
                        input.close();
                        System.exit(0); //It will end the program
                    }
                }
                else{
                    // Insufficient payment
                    System.out.println("Insufficient payment. Additional amount of " + Math.abs(balance) + " is required."); //Demand customer to pay the balance amount
                    totalCost -= payment; // Reduce the total cost by the payment made by customer
                    balance = totalCost; // Update the balance to the remaining cost
                }
            } while (balance != 0); // Repeat until the payment is sufficient
        }
        return balance; //return the balance of the price
    }
    public static void printReceipt(double totalCost, File filename, PrintWriter write, double payment, double balance) throws IOException{
        //To display all the ice cream that customer order/s
        System.out.println();
        System.out.println("Preparing your order.....");
        System.out.println("It will take a while, please be patience :)");
        System.out.println("Preparing casing.....");
        System.out.println("Filling flavor.....");
        System.out.println("Filling topping.....");
        System.out.println();
        System.out.println("Here is your order, enjoy!");
        System.out.println();
        System.out.println("        ^       -------");
        System.out.println("     (/////)    |  :D  | ");
        System.out.println("    (*******)   -------     ");
        System.out.println("   (/////////)  |         ");
        System.out.println("  (           ) |             ");
        System.out.println("-----------------");
        System.out.println("|               |  ");
        System.out.println("|   IIAOIIAO    |  ");
        System.out.println("|   RAHMAH      |  ");
        System.out.println("|               |   ");        
        System.out.println("-----------------") ;
        System.out.println();
        
        write.close();
        Scanner obj = new Scanner(filename); 
        System.out.println("Here is your receipt: \n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\tIIAOIIAO RAHMAH");
        System.out.println("---------------------------------------------------------------");
        
        int max = 200, min = 100;
        System.out.println("Order Number: " + (int) (1 + Math.random() * (max - min))); //Randomly generate the order number
        
        while (obj.hasNextLine()) { 
            String line = obj.nextLine();
            System.out.println(line); //To display all the data in txt
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total Cost: RM " + totalCost); //To show the total cost all of the ice cream
        System.out.println("Cash: RM " + payment); //To show how much that customer has paid
        System.out.println("Balance: RM " + balance); //To show the balance of the payment
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tThank you for buying with us,\n\t\tHope you enjoy the ice-cream/s");
        System.out.println("---------------------------------------------------------------");
    }
}