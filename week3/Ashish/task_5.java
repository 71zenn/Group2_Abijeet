        //1. Write a Java program using a for loop and if statement to
        //   print all numbers between 1 and 50 that are divisible by 
        //   either 3 or 5, but not both.
        public class divisible {
        public static void main(String[] args) {
        System.out.println("Numbers between 1 and 50 divisible by 3 or 5 but not both:");
        for (int i = 1; i <= 50; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                System.out.print(i + " ");
                }
              }  
            }
        }



        //2. Write a Java program that takes a number from the user and 
        //   prints all numbers from 1 to that number, but skips printing
        //   multiples of 4 using an if condition inside a for loop.     
        import java.util.Scanner;

        public class Skip {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                for (int i = 1; i <= num; i++) {
                    if (i % 4 == 0) {
                        continue;
                    }
                    System.out.print(i + " ");
                }
                sc.close();
            }
        }


        //3. Write a Java program using a for loop and if statements to print  
        //   “Fizz” for numbers divisible by 3, “Buzz” for numbers divisible 
        //   by 5, and “FizzBuzz” for numbers divisible by both, between 1 and 30.
        public class FizzBuzz {
            public static void main(String[] args) {
                 for (int i = 1; i <= 30; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
              }
          }

        
        //4. Write a Java program that asks for 10 integers and 
        //   prints only those that are even and greater than 20 
        //   using if and for loops.
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter 10 numbers. ");
        int number;
        for (int i = 1; i<11; i++){
            System.out.print("Input " + i + " -> ");
            number = newobj.nextInt();
            if (((number%2)==0) && (number>20)){
                System.out.println(number + " is even and greater than 20.");
            }
        }
        newobj.close(); 

        //5. Write a Java program that prints the sum of even numbers
        //   and the product of odd numbers between 1 and 10
        //   using a for loop and if condition.
        int sum = 0;
        int product = 1;
        for (int i = 2; i<10; i++){
            if ((i%2) == 0){
                sum += i;
            } else{
                product *= i;
            }
        }
        System.out.printf("The sum of even numbers between 1 and 10 is %d.\n", sum);
        System.out.printf("The product of odd numbers between 1 and 10 is %d.", product); */

        //6. Write a Java program using a for loop that prints numbers from 1 to 30, but:
        //   Prints “skip” instead of 15,
        //   Doubles any number divisible by 4 before printing,
        //   And prints “done” at the end.

        for (int i = 1; i<=30; i++){
            if ((i%4) == 0){
                System.out.print(i*2 + ", ");
            } else if (i == 15){
                System.out.println("Skip!");
            }else if (i == 30){
                System.out.println("30.");
            }else{
                System.out.print(i + ", ");
            }
        }
        System.out.println("Done.");
        
        //7. Write a Java program that simulates an ATM PIN verification system.
        //   The program should have a correct PIN stored (for example, 1234) 
        //   and allow the user up to three attempts to enter the correct PIN.
        //   If the user enters the correct PIN, print "Access Granted" and stop the program.
        //   If the user enters the wrong PIN, print "Incorrect PIN, try again".
        //   After three incorrect attempts, print "Account locked".

        Scanner inputobj = new Scanner(System.in);
        int PIN = 7777;
        for (int i = 0; i<3; i++){
            System.out.print("Enter the pin: ");
            int user_input = inputobj.nextInt();
            if (PIN == user_input){
                System.out.println("Acess Granted!");
                break;
            } else if (i ==2){
                System.err.println("Incorrect PIN.");
                System.out.println("Account locked.");
            }else{
            System.err.println("Incorrect PIN, try again.");
            System.out.println((2-i) + " chance left.\n" );
            }
        }
        inputobj.close();
    }   

}
