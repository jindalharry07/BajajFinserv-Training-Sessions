import java.util.Scanner;

public class ValidPalindrome125 {

    static class PalindromeEngine {
        /**
         * Validates if a string is a palindrome after ignoring non-alphanumeric characters 
         * and case sensitivity.
         */
        public boolean checkIfSymmetrical(String text) {
            int leftPtr = 0;
            int rightPtr = text.length() - 1;

            while (leftPtr < rightPtr) {
                // Skip non-alphanumeric characters from the left
                while (leftPtr < rightPtr && !Character.isLetterOrDigit(text.charAt(leftPtr))) {
                    leftPtr++;
                }

                // Skip non-alphanumeric characters from the right
                while (leftPtr < rightPtr && !Character.isLetterOrDigit(text.charAt(rightPtr))) {
                    rightPtr--;
                }

                // Compare characters after converting to lowercase
                char leftChar = Character.toLowerCase(text.charAt(leftPtr));
                char rightChar = Character.toLowerCase(text.charAt(rightPtr));

                if (leftChar != rightChar) {
                    return false;
                }

                leftPtr++;
                rightPtr--;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeEngine engine = new PalindromeEngine();

        System.out.println("--- Palindrome Checker ---");
        System.out.print("Please provide a string to verify: ");
        String userInput = scanner.nextLine();

        if (engine.checkIfSymmetrical(userInput)) {
            System.out.println("The input is a valid palindrome.");
        } else {
            System.out.println("The input is NOT a palindrome.");
        }

        scanner.close();
    }
}
