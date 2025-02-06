package Synchronization;

class BookTheaterSeat {
    int total_seats = 10;

       /*synchronized*/void bookSeat(int seats) {
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(seats + "seat booked successfully..!!");
                total_seats = total_seats - seats;
                System.out.println("Seat Left:" + total_seats);
            } else {
                System.out.println("sorry Seat Cannot be booked..!!");
                System.out.println("Seat Left:" + total_seats);
            }
        }
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
        System.out.println("Hi :"+Thread.currentThread().getName());
    }
}

public class MovieBookApp extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        MovieBookApp karan = new MovieBookApp();
        karan.seats = 7;
        karan.start();

        MovieBookApp vishal = new MovieBookApp();
        vishal.seats = 6;
        vishal.start();
    }
}
