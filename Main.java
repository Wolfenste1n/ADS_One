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
    }
}
