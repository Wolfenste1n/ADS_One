package Problems;

/**
 * This method calculates the n-th Fibonacci number.
 * Time complexity: Exponential in n (O(2^n)), as the recursion tree grows exponentially.
 * @param n the index in the Fibonacci sequence.
 * @return the n-th Fibonacci number.
 */

public class Problem_five {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}