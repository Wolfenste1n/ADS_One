package Problems;

/**
 * This method checks if a string consists solely of digit characters.
 * Time complexity: O(n), where n is the length of the string.
 * @param s the string to be checked.
 * @param index the current index in the recursion.
 * @return true if the string consists only of digits, false otherwise.
 */

public class Problem_eight {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        char ch = s.charAt(index);
        if (ch < '0' || ch > '9') {
            return false;
        }
        return isAllDigits(s, index + 1);
    }
}
