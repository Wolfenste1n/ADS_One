package Problems;

/**
 * This method calculates the sum of elements in an array.
 * Time complexity: O(n), where n is the number of elements in the array.
 * @param arr the array of integers.
 * @param index the current index in the recursion.
 * @return the sum of the array's elements.
 */

public class Problem_two {
    public static int sumArrayRec(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArrayRec(arr, index + 1);
    }
}