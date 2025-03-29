package Problems;

/**
 * This method computes the power of a number.
 * Time complexity: O(n), where n is the exponent.
 * @param a the base number.
 * @param n the exponent.
 * @return the result of raising  to the power of n.
 */

public class Problem_six {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
}