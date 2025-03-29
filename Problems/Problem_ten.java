package Problems;

/**
 * This method computes the Greatest Common Divisor (GCD) of two integers using the Euclidean algorithm.
 * Time complexity: O(log(min(a, b))) in the average case.
 * @param a the first integer.
 * @param b the second integer.
 * @return the greatest common divisor of a and b.
 */

public class Problem_ten {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}