package March_2023.Week1_01_march_2023.CafeAllocationSystem;

import java.util.Scanner;

public class TableBooking  {

    static int tableFor2=8, tableFor4= 4, tableFor6= 2, tableFor8=2;

     static  boolean IsReserved = false;
         static  int Tableno;
        public void check ()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name: ");
            String CustomerName = sc.nextLine();
            System.out.println("Enter the seats required");
            int capacity = sc.nextInt();

            if(capacity<=2){
                if (tableFor2 != 0) {
                    tableFor2 -= 1;
                    IsReserved = true;
                    System.out.println("Booking has been Done! Max occupancy::"+2);
                }
            }

            if(capacity<=4 && !IsReserved){
                if(tableFor4 !=0){
                    tableFor4 -= 1;
                    IsReserved = true;
                    System.out.println("Booking has been done! Max occupancy::"+4);
                }
            }

            if(capacity<=6 && !IsReserved){
                if(tableFor6 !=0){
                    tableFor6 -= 1;
                    IsReserved = true;
                    System.out.println("Booking has been done! Max occupancy::"+6);
                }
            }

            if(capacity<=8 && !IsReserved){
                if(tableFor8 !=0){
                    tableFor8 -= 1;
                    IsReserved = true;
                    System.out.println("Your seat is booked with occupancy::"+8);
                }
            }

            if(!IsReserved){
                System.out.println("Sorry ! no seats Available ");
            }


            System.out.println("*********** Remaining Seats Available ************");
            System.out.println();
            System.out.println("Seats of 2 Occupancy::"+tableFor2);
            System.out.println("Seats of 4 Occupancy::"+tableFor4);
            System.out.println("Seats of 6 Occupancy::"+tableFor6);
            System.out.println("Seats of 8 Occupancy::"+tableFor8);
            System.out.println();
        }
    }



