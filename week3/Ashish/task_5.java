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
        import java.util.Scanner;

        public class integers {
                public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] numbers = new int[10];

                System.out.println("Enter 10 integers:");
                for (int i = 0; i < 10; i++) {
                    numbers[i] = sc.nextInt();
                }

                System.out.println("Even numbers greater than 20:");
                for (int i = 0; i < 10; i++) {
                    if (numbers[i] % 2 == 0 && numbers[i] > 20) {
                        System.out.print(numbers[i] + " ");
                    }
                }

                sc.close();
            }
        }


        //5. Write a Java program that prints the sum of even numbers
        //   and the product of odd numbers between 1 and 10
        //   using a for loop and if condition.
        public class evensum {
            public static void main(String[] args) {
                int sumEven = 0;
                int productOdd = 1;

                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0) {
                        sumEven += i;
                    } else {
                        productOdd *= i;
                    }
                }

                System.out.println("Sum of even numbers: " + sumEven);
                System.out.println("Product of odd numbers: " + productOdd);
            }
        }


        //6. Write a Java program using a for loop that prints numbers from 1 to 30, but:
        //   Prints “skip” instead of 15,
        //   Doubles any number divisible by 4 before printing,
        //   And prints “done” at the end.

        public class done {
            public static void main(String[] args) {
                for (int i = 1; i <= 30; i++) {
                    if (i == 15) {
                        System.out.println("skip");
                    } else if (i % 4 == 0) {
                        System.out.println(i * 4); 
                    } else {
                        System.out.println(i);
                    }
                }
                System.out.println("done");
            }
        }

        
        //7. Write a Java program that simulates an ATM PIN verification system.
        //   The program should have a correct PIN stored (for example, 1234) 
        //   and allow the user up to three attempts to enter the correct PIN.
        //   If the user enters the correct PIN, print "Access Granted" and stop the program.
        //   If the user enters the wrong PIN, print "Incorrect PIN, try again".
        //   After three incorrect attempts, print "Account locked".

        import java.util.Scanner;

        public class ATM {
            public static void main(String[] args) {
                final int CORRECT_PIN = 1234;
                Scanner sc = new Scanner(System.in);
                int attempts = 0;
                boolean accessGranted = false;

                while (attempts < 3) {
                    System.out.print("Enter your PIN: ");
                    int enteredPIN = sc.nextInt();

                    if (enteredPIN == CORRECT_PIN) {
                        System.out.println("Access Granted");
                        accessGranted = true;
                        break;
                    } else {
                        attempts++;
                        if (attempts < 3) {
                            System.out.println("Incorrect PIN, try again.");
                        }
                    }
                }

                if (!accessGranted) {
                    System.out.println("Account locked");
                }

                sc.close();
            }
        }

