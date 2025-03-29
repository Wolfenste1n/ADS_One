package Problems;

/**
 * This method checks if a number is prime.
 * Time complexity: O(n) in the worst-case scenario, where n is the number.
 * @param n the number to be checked.
 * @param divisor the current divisor being tested.
 * @return true if the number is prime, false otherwise.
 */

public class Problem_three {
    public static boolean isPrime(int n, int divisor) {
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
}