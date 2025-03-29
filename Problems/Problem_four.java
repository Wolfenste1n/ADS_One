package Problems;

/**
 * This method Calculates the factorial of a given number recursively.
 * Time complexity: O(n), where n is the input number.
 * @param n the number for which the factorial is calculated.
 * @return the factorial of n.
 */

public class Problem_four {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}