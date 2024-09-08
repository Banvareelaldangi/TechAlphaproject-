import java.util.Scanner;

 class Airlinereservationsystem {
    // array to store the seats
    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            // display menu
            System.out.println("1. Reserve a seat");
            System.out.println("2. View all seats");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            if (choice == 1) {
                reserveSeat();
            } else if (choice == 2) {
                viewSeats();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }

    private static void reserveSeat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seat number: ");
        int seatNum = input.nextInt();
        if (seats[seatNum - 1] == false) {
            seats[seatNum - 1] = true;
            System.out.println("Seat reserved. Thank you.");
        } else {
            System.out.println("Sorry, this seat is already reserved.");
        }
    }

    private static void viewSeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Seat " + (i + 1) + ": ");
            if (seats[i] == true) {
                System.out.println("Reserved");
            } else {
                System.out.println("Available");
            }
        }
    }
}
