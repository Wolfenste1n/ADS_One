import Problems.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double startTime, endTime, duration;
        do {
            System.out.println("\nSelect a problem (1-10) or 0 to exit:");
            System.out.println("Problem num.1. ");
            System.out.println("Problem num.2. ");
            System.out.println("Problem num.3. ");
            System.out.println("Problem num.4. ");
            System.out.println("Problem num.5. ");
            System.out.println("Problem num.6. ");
            System.out.println("Problem num.7. ");
            System.out.println("Problem num.8. ");
            System.out.println("Problem num.9. ");
            System.out.println("Problem num.10. ");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    int[] arr = {10, 1, 32, 3, 45};
                    startTime = System.nanoTime();
                    int min = Problem_one.findMin(arr, 0);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 1: Minimum value is " + min);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 2: {
                    int[] arr = {3, 2, 4, 1};
                    startTime = System.nanoTime();
                    int sum = Problem_two.sumArrayRec(arr, 0);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    double avg = sum / (double) arr.length;
                    System.out.println("\n");
                    System.out.println("Problem 2: Average of array is " + avg);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 3: {
                    int number = 7;
                    startTime = System.nanoTime();
                    boolean prime = Problem_three.isPrime(number, 2);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 3: " + number + (prime ? " is prime" : " is composite"));
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 4: {
                    int n = 5;
                    startTime = System.nanoTime();
                    int fact = Problem_four.factorial(n);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 4: Factorial of " + n + " is " + fact);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 5: {
                    int n = 5;
                    startTime = System.nanoTime();
                    int fib = Problem_five.fibonacci(n);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 5: " + n + "th Fibonacci number is " + fib);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 6: {
                    int base = 2, exponent = 10;
                    startTime = System.nanoTime();
                    int result = Problem_six.power(base, exponent);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 6: " + base + " raised to the power of " + exponent + " is " + result);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 7: {
                    int[] arr = {1, 4, 6, 2};
                    System.out.print("Problem 7: Reversed array: ");
                    startTime = System.nanoTime();
                    Problem_seven.printReverse(arr, arr.length - 1);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println();
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 8: {
                    String s = "123456";
                    startTime = System.nanoTime();
                    boolean onlyDigits = Problem_eight.isAllDigits(s, 0);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 8: The string \"" + s + "\" " + (onlyDigits ? "contains" : "does not contain") + " only digits");
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 9: {
                    int n = 7, k = 3;
                    startTime = System.nanoTime();
                    int binom = Problem_nine.binomialCoefficient(n, k);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 9: Binomial coefficient C(" + n + "," + k + ") is " + binom);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                }
                case 10: {
                    int a = 32, b = 48;
                    startTime = System.nanoTime();
                    int gcd1 = Problem_ten.gcd(a, b);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 10: GCD(" + a + "," + b + ") is " + gcd1);
                    System.out.println("Time taken: " + duration + " milliseconds");

                    int a2 = 10, b2 = 7;
                    startTime = System.nanoTime();
                    int gcd2 = Problem_ten.gcd(a2, b2);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000.0;
                    System.out.println("\n");
                    System.out.println("Problem 10: GCD(" + a2 + "," + b2 + ") is " + gcd2);
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