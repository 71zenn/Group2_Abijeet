import java.util.Scanner; 

public class ATMpin {
    public static void main(String[] args){
        final int Pin = 1234;
        int attempt = 0;
        boolean accessGranted = false;
        try (Scanner scanner = new Scanner(System.in)) {
            while(attempt < 3 && !accessGranted){
                System.out.print("Enter your 4-digit PIN: ");
                int userPin = scanner.nextInt();
                if(userPin == Pin){
                    accessGranted = true;
                    System.out.println("Access Granted.");
                } else {
                    attempt++;
                    System.out.println("Incorrect PIN. Try again.");
                }
            }
        }       
    }
}