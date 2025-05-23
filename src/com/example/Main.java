package com.training.example.JacocoExample;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Clean and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check for palindrome
        boolean isPalindrome = isPalindrome(cleanedInput);

        // Output
        if (isPalindrome) {
            System.out.println("Yes, it's a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
