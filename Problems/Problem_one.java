package Problems;

/**
 * This method finds the minimum value in an array of integers.
 * Time complexity: O(n), where n is the number of elements in the array.
 * @param arr the array of integers.
 * @param index the current index in the recursion.
 * @return the minimum integer value found in the array.
 */

public class Problem_one {
    public static int findMin(int[] arr, int index) {
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
}