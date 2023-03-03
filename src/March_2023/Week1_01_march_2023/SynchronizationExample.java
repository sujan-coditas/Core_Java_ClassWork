package March_2023.Week1_01_march_2023;

class BookMovieTicket {
    int totalTicketCount = 10;

     void bookTicket(int seats) {
        if ( totalTicketCount >=seats) {
            System.out.println(seats+" Tickets booked");
            totalTicketCount-=seats;
            System.out.println("You can book " + totalTicketCount + " more tickets");
        } else {
            System.out.println(" ur tickets can't be  booked");
            System.out.println("remaining tickets :"+totalTicketCount);
        }
    }
}

public class SynchronizationExample extends Thread {
    static BookMovieTicket bmt;
    int seats;

    public void run() {
        bmt.bookTicket(seats);
    }

    public static void main(String[] args) {
        bmt = new BookMovieTicket();
        SynchronizationExample sujan = new SynchronizationExample();
        sujan.seats = 6;
        sujan.start();

        SynchronizationExample yash=new SynchronizationExample();
        yash.seats=7;
        yash.start();
    }
}
