package March_2023.Week1_01_march_2023.CafeAllocationSystem;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("!!! WELCOME TO OUR CAFE !!!!!!!");
        int selectOption=1;
       do {
            System.out.println("Choose your option: \n 0. EXIT \n 1. BOOK TABLE \n 2.PRINT MENU \n 3.ORDER COFFEE");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    selectOption = 0; // set selectOption to 0 to exit the loop
                    break;

                case 1:
                    TableBooking tableBooking=new TableBooking();
                    tableBooking.check();
                    break;

                case 2:
                    // code for printing menu
                    Menu menu=new Menu();
                    menu.showMenu();
                    break;

                case 3:
                    // code for ordering coffee

                    if(TableBooking.IsReserved == false){
                        try{
                            throw new ReservationNotFoundException();
                        } catch (ReservationNotFoundException e) {
                        }
                    }
                    else {
                        PlaceOrder placeOrder = new PlaceOrder();
                        placeOrder.Order();                    }
                    break;


                default:
                    System.out.println("Enter valid Option ");
                    break;
            }
           if (selectOption != 0) {
               System.out.println("1. Explore other options \n 0. EXIT");
               selectOption = sc.nextInt();
           }

        }while (selectOption == 1);
    }
    }
/*
* !!! WELCOME TO OUR CAFE !!!!!!!
Choose your option:
 0. EXIT
 1. BOOK TABLE
 2.PRINT MENU
 3.ORDER COFFEE
1
Enter name:
sujan
Enter the seats required
4
sujan Table no : 1 has been booked  for you .
1. Explore other options
 0. EXIT
1
Choose your option:
 0. EXIT
 1. BOOK TABLE
 2.PRINT MENU
 3.ORDER COFFEE
2
**************** Welcome To our Cafe ****************
=====================================================
           1.French Fries          150/-
           2.Burger                130/-
           3.Pastry                80/-
           4. Coffee               50/-
           5. Cold Drinks          30/-
======================================================
          What Do you Want to Order Today??
1. Explore other options
 0. EXIT
1
Choose your option:
 0. EXIT
 1. BOOK TABLE
 2.PRINT MENU
 3.ORDER COFFEE
3
**************** Welcome To our Cafe ****************
=====================================================
           1.French Fries          150/-
           2.Burger                130/-
           3.Pastry                80/-
           4. Coffee               50/-
           5. Cold Drinks          30/-
======================================================
          What Do you Want to Order Today??
Enter your Choice
1
Enter Quantity :
2
Do you want to order anything else (Y/N)?
y
**************** Welcome To our Cafe ****************
=====================================================
           1.French Fries          150/-
           2.Burger                130/-
           3.Pastry                80/-
           4. Coffee               50/-
           5. Cold Drinks          30/-
======================================================
          What Do you Want to Order Today??
Enter your Choice
3
Enter Quantity :
2
Do you want to order anything else (Y/N)?
y
**************** Welcome To our Cafe ****************
=====================================================
           1.French Fries          150/-
           2.Burger                130/-
           3.Pastry                80/-
           4. Coffee               50/-
           5. Cold Drinks          30/-
======================================================
          What Do you Want to Order Today??
Enter your Choice
4
Enter Quantity :
3
Do you want to order anything else (Y/N)?
n
Order Summary:
===============
French Fries - 2 - 150 - 300
Burger  - 2 - 130 - 260
Pastry  - 3 - 80 - 240
u must  order coffee
1. Explore other options
 0. EXIT
1
Choose your option:
 0. EXIT
 1. BOOK TABLE
 2.PRINT MENU
 3.ORDER COFFEE
3
**************** Welcome To our Cafe ****************
=====================================================
           1.French Fries          150/-
           2.Burger                130/-
           3.Pastry                80/-
           4. Coffee               50/-
           5. Cold Drinks          30/-
======================================================
          What Do you Want to Order Today??
Enter your Choice
5
Enter Quantity :
3
Do you want to order anything else (Y/N)?
n
u must  order coffee
1. Explore other options
 0. EXIT
0

Process finished with exit code 0*/