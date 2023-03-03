package March_2023.Week1_01_march_2023.CafeAllocationSystem;

import java.util.Scanner;

public class TableBooking implements Runnable {

    static int RequiredSeats = 0;
    static int tablefor2 = 8;
    static int tablefor4 = 4;
    static int tablefor6 = 2;
    static int tablefor8 = 2;
    static int TableNo = 1;

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String CustomerName = sc.nextLine();
        System.out.println("Enter the seats required");
        int RequiredSeats = sc.nextInt();


        if (RequiredSeats <= 2) {
            if (tablefor2 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor2--;
                TableNo++;
            } else if (tablefor4 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else if (tablefor6 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else if (tablefor8 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else {
                System.out.println(" Seats not Available");
            }
        } else if (RequiredSeats <= 4) {
            if (tablefor4 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else if (tablefor6 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else if (tablefor8 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            }
        } else if (RequiredSeats <= 6) {
            if (tablefor6 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else if (tablefor8 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else {
                System.out.println(" Seats not Available");
            }
        } else if (RequiredSeats <= 8) {
            if (tablefor8 != 0) {
                System.out.println( CustomerName + " Table no : " + TableNo + " has been booked  for you .");
                tablefor4--;
                TableNo++;
            } else {
                System.out.println(" Seats not Available");
            }
        }


    }
}


