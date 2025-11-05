import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {
        final int correctPIN = 1234;
        int attempts = 0;
        boolean accessGranted = false;

        try (Scanner sc = new Scanner(System.in)) {
            while (attempts < 3) {
                System.out.print("Enter PIN: ");
                int enteredPIN = sc.nextInt();

                if (enteredPIN == correctPIN) {
                    System.out.println("Access Granted");
                    accessGranted = true;
                    break;
                } else {
                    System.out.println("Incorrect PIN, try again");
                    attempts++;
                }
            }
        }

        if (!accessGranted) {
            System.out.println("Account locked");
        }
    }
}
