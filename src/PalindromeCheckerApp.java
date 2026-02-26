import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop
            if (fromQueue != fromStack) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== UC6: Queue + Stack Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}


