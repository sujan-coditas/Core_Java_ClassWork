package March_2023.Week1_01_march_2023.CafeAllocationSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static March_2023.Week1_01_march_2023.CafeAllocationSystem.Menu.showMenu;

public class PlaceOrder {
    static int totalBill = 0;
    static char again;
    static int quantity;
    static int ch;
    private ArrayList<Integer> quantities = new ArrayList<Integer>();
    ArrayList<String> menuItems = new ArrayList<String>() {{
        add("French Fries");
        add("Burger ");
        add("Pastry ");
        add("Coffee ");
        add("Cold Drinks");
    }};

    ArrayList<Integer> prices = new ArrayList<Integer>() {{
        add(150);
        add(130);
        add(80);
        add(50);
        add(30);
    }};

    public void Order() {

        boolean hasCoffee = false;
        do {
            showMenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Choice ");
              ch = sc.nextInt();

            if (ch >= 1 && ch <= 5) {
                System.out.println("Enter Quantity :");
                quantity = sc.nextInt();
                quantities.add(quantity);
                totalBill += quantity * prices.get(ch - 1);
            } else {
                System.out.println("Enter valid option");
            }
            System.out.println("Do you want to order anything else (Y/N)? ");
            again = sc.next().charAt(0);
            if (ch == 4) { // 4 is the index of "Coffee" in the menuItems list
                hasCoffee = true;
            }

        }
        while (again == 'Y' || again == 'y');
        if(hasCoffee) {
            orderSummary();
            generateBill();
        }

        else
        {
            if(!hasCoffee) {
                try {
                    throw new InvalidOrderException();
                } catch (InvalidOrderException e) {
                    System.out.println();
                }
            }
        }


    }
    public void generateBill() {
        System.out.println("**********THANKS FOR ORDERING*********");
        Random random = new Random();
        int billNumber = random.nextInt(1000) + 1;
        System.out.println("Bill No: " + billNumber);
        int finalBill=totalBill;
        System.out.println("Your total bill for table no : "  + " is : " + finalBill );

    }

    public void orderSummary() {
        System.out.println("Order Summary:");
        System.out.println("===============");
        for (int i = 0; i < menuItems.size(); i++) {
            if (quantities.get(i) > 0) {
                System.out.println(menuItems.get(i) + " - " + quantities.get(i) + " - " + prices.get(i) + " - " + (quantities.get(i) * prices.get(i)));
            }
        }
        System.out.println("===============");
        System.out.println("Enjoy your meal");
    }
}
