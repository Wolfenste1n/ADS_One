public class Main {
    //1
    /**
     * This method finds the minimum value in an array of integers.
     * Time complexity: O(n), where n is the number of elements in the array.
     * @param arr the array of integers.
     * @param index the current index in the recursion.
     * @return the minimum integer value found in the array.
     */
    private static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int minRest = findMin(arr, index + 1);
        if (arr[index] < minRest) {
            return arr[index];
        } else {
            return minRest;
        }
    }
//2
    /**
     * This method calculates the sum of elements in an array.
     * Time complexity: O(n), where n is the number of elements in the array.
     * @param arr the array of integers.
     * @param index the current index in the recursion.
     * @return the sum of the array's elements.
     */

    private static int sumArrayRec(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArrayRec(arr, index + 1);
    }
//3
    /**
     * This method checks if a number is prime.
     * Time complexity: O(n) in the worst-case scenario, where n is the number.
     * @param n the number to be checked.
     * @param divisor the current divisor being tested.
     * @return true if the number is prime, false otherwise.
     */
    private static boolean isPrime(int n, int divisor) {
        if (n <= 2) {
            if (n == 2) {
                return true;
            } else {
                return false;
            }
        }
        if (divisor > n / 2) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }

//4
    /**
     * This method Calculates the factorial of a given number recursively.
     * Time complexity: O(n), where n is the input number.
     * @param n the number for which the factorial is calculated.
     * @return the factorial of n.
     */
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

//5
    /**
     * This method calculates the n-th Fibonacci number.
     * Time complexity: Exponential in n (O(2^n)), as the recursion tree grows exponentially.
     * @param n the index in the Fibonacci sequence.
     * @return the n-th Fibonacci number.
     */
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

//6

    /**
     * This method computes the power of a number.
     * Time complexity: O(n), where n is the exponent.
     * @param a the base number.
     * @param n the exponent.
     * @return the result of raising  to the power of n.
     */
    private static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    //7
    /**
     * This method prints the elements of an array in reverse order.
     * Time complexity: O(n), where n is the number of elements in the array.
     * @param arr the array of integers.
     * @param index the current index for printing.
     */
    private static void printReverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }
    //8


    /**
     * This method checks if a string consists solely of digit characters.
     * Time complexity: O(n), where n is the length of the string.
     * @param s the string to be checked.
     * @param index the current index in the recursion.
     * @return true if the string consists only of digits, false otherwise.
     */
    private static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        char ch = s.charAt(index);
        if (ch < '0' || ch > '9') {
            return false;
        }
        return isAllDigits(s, index + 1);
    }

    //9
    /**
     * This method calculates the binomial coefficient C(n, k).
     * Time complexity: Exponential in n (O(2^n)) in the worst-case due to overlapping subproblems.
     * @param n the total number of items.
     * @param k the number of items to choose.
     * @return the binomial coefficient C(n, k).
     */
    private static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

//10
    /**
     * Recursively computes the Greatest Common Divisor (GCD) of two integers using the Euclidean algorithm.
     * Time complexity: O(log(min(a, b))) in the average case.
     * @param a the first integer.
     * @param b the second integer.
     * @return the greatest common divisor of a and b.
     */
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
// 1
        int[] array1 = {10, 1, 32, 3, 45};
        double startTime = System.nanoTime();
        int minResult = findMin(array1, 0);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 1: Minimum is: " + minResult);
        System.out.println("Time taken: " + duration + " milliseconds");

//2
        int[] array2 = {3, 2, 4, 1};
        startTime = System.nanoTime();
        int sum = sumArrayRec(array2, 0);
        double avgResult = sum / (double) array2.length;
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 2: Average is: " + avgResult);
        System.out.println("Time taken: " + duration + " milliseconds");

//3
        int testPrime1 = 7;
        int testPrime2 = 10;
        startTime = System.nanoTime();
        boolean isPrime1 = isPrime(testPrime1, 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.print("Problem 3: " + testPrime1 + " is ");
        if (isPrime1) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        System.out.println("Time taken: " + duration + " milliseconds");

        startTime = System.nanoTime();
        boolean isPrime2 = isPrime(testPrime2, 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.print("Problem 3: " + testPrime2 + " is ");
        if (isPrime2) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        System.out.println("Time taken: " + duration + " milliseconds");


        //4
        int factorialInput = 5;
        startTime = System.nanoTime();
        int factResult = factorial(factorialInput);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 4: Factorial of " + factorialInput + " is: " + factResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        //5
        int fibInput1 = 5;
        int fibInput2 = 17;
        startTime = System.nanoTime();
        int fibResult1 = fibonacci(fibInput1);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 5: Fibonacci of " + fibInput1 + " is: " + fibResult1);
        System.out.println("Time taken: " + duration + " milliseconds");

        startTime = System.nanoTime();
        int fibResult2 = fibonacci(fibInput2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 5: Fibonacci of " + fibInput2 + " is: " + fibResult2);
        System.out.println("Time taken: " + duration + " milliseconds");

        //6

        int base = 2;
        int exponent = 10;
        startTime = System.nanoTime();
        int powerResult = power(base, exponent);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 6: " + base + "^" + exponent + " is: " + powerResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        //7
        int[] array7 = {1, 4, 6, 2};
        System.out.print("Problem 7: Reversed array is: ");
        startTime = System.nanoTime();
        printReverse(array7, array7.length - 1);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println();
        System.out.println("Time taken: " + duration + " milliseconds");


        //8
        String s1 = "123456";
        String s2 = "123a12";
        startTime = System.nanoTime();
        boolean digitsResult1 = isAllDigits(s1, 0);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.print("Problem 8: String \"" + s1 + "\" is ");
        if (digitsResult1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("Time taken: " + duration + " milliseconds");

        startTime = System.nanoTime();
        boolean digitsResult2 = isAllDigits(s2, 0);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.print("Problem 8: String \"" + s2 + "\" is ");
        if (digitsResult2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("Time taken: " + duration + " milliseconds");

        //9
        int n1 = 2, k1 = 1;
        int n2 = 7, k2 = 3;
        startTime = System.nanoTime();
        int binom1 = binomialCoefficient(n1, k1);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 9: C(" + n1 + "," + k1 + ") is: " + binom1);
        System.out.println("Time taken: " + duration + " milliseconds");

        startTime = System.nanoTime();
        int binom2 = binomialCoefficient(n2, k2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 9: C(" + n2 + "," + k2 + ") is: " + binom2);
        System.out.println("Time taken: " + duration + " milliseconds");

        //10
        int a1 = 32, b1 = 48;
        int a2 = 10, b2 = 7;
        startTime = System.nanoTime();
        int gcd1 = gcd(a1, b1);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 10: GCD(" + a1 + "," + b1 + ") is: " + gcd1);
        System.out.println("Time taken: " + duration + " milliseconds");

        startTime = System.nanoTime();
        int gcd2 = gcd(a2, b2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;
        System.out.println("Problem 10: GCD(" + a2 + "," + b2 + ") is: " + gcd2);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

}
