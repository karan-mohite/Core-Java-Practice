package StaticSynchronization;

class BookTheaterSeat {
    static int total_seats = 20;

    static synchronized void bookSeat(int seats) {
        if (total_seats > seats) {
            System.out.println(seats + " Seat booked successfully..!!");
            total_seats = total_seats - seats;
            System.out.println(seats + "Seat Left:" + total_seats);
        } else {
            System.out.println("Seat Cannot be booked");
            System.out.println("Seat Left:" + total_seats);
        }
    }
}

class MyThread1 extends Thread {
    BookTheaterSeat b;
    int seats;

    MyThread1(BookTheaterSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread {
    BookTheaterSeat b;
    int seats;

    MyThread2(BookTheaterSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

public class MovieBookApp {
    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();

        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();

        MyThread1 t2 = new MyThread1(b1, 6);
        t2.start();

        // -------------------------------------

        BookTheaterSeat b2 = new BookTheaterSeat();

        MyThread1 t3 = new MyThread1(b1, 5);
        t3.start();

        MyThread1 t4 = new MyThread1(b1, 9);
        t4.start();

    }
}
