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




    public static void main(String[] args) {
//1
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
    }
}
