package Problems;

/**
 * This method calculates the binomial coefficient C(n, k).
 * Time complexity: Exponential in n (O(2^n)) in the worst-case due to overlapping subproblems.
 * @param n the total number of items.
 * @param k the number of items to choose.
 * @return the binomial coefficient C(n, k).
 */

public class Problem_nine {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
