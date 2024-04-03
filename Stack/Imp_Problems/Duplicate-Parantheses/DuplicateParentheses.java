import java.util.*;

public class DuplicateParentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the current character is a closing parenthesis
            if (ch == ')') {
                // Check for duplicate parentheses
                if (stack.peek() == '(') {
                    return true; // Found duplicate
                } else {
                    // Pop until we find the matching opening parenthesis
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        stack.pop();
                    }
                    // Pop the opening parenthesis
                    stack.pop();
                }
            } else {
                stack.push(ch); // Push other characters onto the stack
            }
        }
        
        return false; // No duplicate found
    }
    
    public static void main(String[] args) {
        String str = "((a+ (b)) + (c+d))";
        System.out.println(isDuplicate(str)); // Output: true
    }
}
