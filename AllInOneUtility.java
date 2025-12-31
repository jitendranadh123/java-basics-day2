import java.util.*;
public class AllInOneUtility {
    // ---------- MATH UTILITIES ----------
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++)
            result *= base;
        return result;
    }
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // ---------- STRING UTILITIES ----------
    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(reverseString(s));
    }
    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        return count;
    }
    static String removeDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray())
            set.add(c);

        StringBuilder result = new StringBuilder();
        for (char c : set)
            result.append(c);

        return result.toString();
    }
    // ---------- ARRAY UTILITIES ----------
    static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
    static int searchArray(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max)
                max = x;
        return max;
    }
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr)
            if (x < min)
                min = x;
        return min;
    }
    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // ---------- TESTING ALL METHODS ----------
    public static void main(String[] args) {

        System.out.println("===== MATH UTILITIES =====");
        System.out.println("Power(2, 5): " + power(2, 5));
        System.out.println("Factorial(6): " + factorial(6));
        System.out.println("Is 29 Prime?: " + isPrime(29));
        System.out.println("GCD(48, 18): " + gcd(48, 18));

        System.out.println("\n===== STRING UTILITIES =====");
        String text = "programming";
        System.out.println("Original: " + text);
        System.out.println("Reverse: " + reverseString(text));
        System.out.println("Is Palindrome (madam): " + isPalindrome("madam"));
        System.out.println("Vowel Count: " + countVowels(text));
        System.out.println("Remove Duplicates: " + removeDuplicates(text));

        System.out.println("\n===== ARRAY UTILITIES =====");
        int[] arr = {8, 3, 1, 9, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.println("Search 9 Index: " + searchArray(arr, 9));
        System.out.println("Maximum: " + findMax(arr));
        System.out.println("Minimum: " + findMin(arr));

        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
