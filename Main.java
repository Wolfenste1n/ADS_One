
import Problems.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double startTime, endTime, duration;
        do {
            System.out.println("\nSelect a problem (1-10) or 0 to exit:");
            System.out.println("Problem num.1.");
            System.out.println("Problem num.2.");
            System.out.println("Problem num.3.");
            System.out.println("Problem num.4.");
            System.out.println("Problem num.5.");
            System.out.println("Problem num.6.");
            System.out.println("Problem num.7.");
            System.out.println("Problem num.8.");
            System.out.println("Problem num.9.");
            System.out.println("Problem num.10.");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter " + n + " numbers: ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    startTime = System.nanoTime();
                    int min = Problem_one.findMin(arr, 0);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("Minimum value is " + min);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 2: {
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter " + n + " numbers: ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    startTime = System.nanoTime();
                    int sum = Problem_two.sumArrayRec(arr, 0);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    double avg = sum / (double) n;
                    System.out.println("Average of array is " + avg);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 3: {
                    System.out.print("Enter a number to check for prime: ");
                    int number = scanner.nextInt();
                    startTime = System.nanoTime();
                    boolean prime = Problem_three.isPrime(number, 2);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println(number + (prime ? " is prime" : " is composite"));
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 4: {
                    System.out.print("Enter a number to calculate factorial: ");
                    int n = scanner.nextInt();
                    startTime = System.nanoTime();
                    int fact = Problem_four.factorial(n);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("Factorial of " + n + " is " + fact);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 5: {
                    System.out.print("Enter a number to find its Fibonacci element: ");
                    int n = scanner.nextInt();
                    startTime = System.nanoTime();
                    int fib = Problem_five.fibonacci(n);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println(n + "th Fibonacci number is " + fib);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 6: {
                    System.out.print("Enter the base: ");
                    int base = scanner.nextInt();
                    System.out.print("Enter the exponent: ");
                    int exponent = scanner.nextInt();
                    startTime = System.nanoTime();
                    int result = Problem_six.power(base, exponent);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println(base + " raised to the power of " + exponent + " is " + result);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 7: {
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter " + n + " numbers: ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    System.out.print("Reversed array: ");
                    startTime = System.nanoTime();
                    Problem_seven.printReverse(arr, n - 1);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\nTime taken: " + duration + " milliseconds");
                    break;
                }
                case 8: {
                    System.out.print("Enter a string: ");
                    String s = scanner.next();
                    startTime = System.nanoTime();
                    boolean onlyDigits = Problem_eight.isAllDigits(s, 0);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("The string \"" + s + "\" " + (onlyDigits ? "contains" : "does not contain") + " only digits");
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 9: {
                    System.out.print("Enter n and k (separated by space): ");
                    int n = scanner.nextInt();
                    int k = scanner.nextInt();
                    startTime = System.nanoTime();
                    int binom = Problem_nine.binomialCoefficient(n, k);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("Binomial coefficient C(" + n + "," + k + ") is " + binom);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 10: {
                    System.out.print("Enter two numbers a and b for GCD (separated by space): ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    startTime = System.nanoTime();
                    int gcd = Problem_ten.gcd(a, b);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("GCD(" + a + "," + b + ") is " + gcd);
                    System.out.println("Time taken: " + duration + " milliseconds");

                    System.out.print("Enter another two numbers a and b for GCD (separated by space): ");
                    int a2 = scanner.nextInt();
                    int b2 = scanner.nextInt();
                    startTime = System.nanoTime();
                    int gcd2 = Problem_ten.gcd(a2, b2);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("GCD(" + a2 + "," + b2 + ") is " + gcd2);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 0: {
                    System.out.println("Exiting program.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            }
        } while (choice != 0);
        scanner.close();
    }
}
