package Session11;

public class ValidParenthesesNoStack {
    public static void main(String[] args) {
        System.out.println("() " + isValid("()")); // true
//        System.out.println("()[]{} " + isValid("()[]{}")); // true
//        System.out.println("([)] " + isValid("([)]")); // false
//        System.out.println("] " + isValid("]")); // false
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] chars = new char[s.length()];
        int x = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                chars[x++] = c;
            } else if (x == 0) {
                return false;
            } else if (c == ')' && chars[--x] != '(') {
                return false;
            } else if (c == '}' && chars[--x] != '{') {
                return false;
            } else if (c == ']' && chars[--x] != '[') {
                return false;
            }
        }

        return x == 0;
    }
}

// Time complexity: O(n) where n is the length of the string
// Space complexity: O(n) where n is the length of the string
