package Session11;


//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//Example 2:
//Input: s = "()[]{}"
//Output: true
//Example 3:
//Input: s = "(]"
//Output: false

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println( "() " + isValid("()")); // true
        System.out.println("()[]{} " + isValid("()[]{}")); // true
        System.out.println( "([)] " + isValid("([)]")); // false
        System.out.println( "] " + isValid("]")); // false
    }

    public static boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                chars.push(c);
            } else {
                if (chars.isEmpty()) {
                    return false;
                }
                char top = chars.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }
}
