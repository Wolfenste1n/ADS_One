package Problems;

/**
 * This method prints the elements of an array in reverse order.
 * Time complexity: O(n), where n is the number of elements in the array.
 * @param arr the array of integers.
 * @param index the current index for printing.
 */

public class Problem_seven {
    public static void printReverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }
}
