package Session11;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Character> chars = new Stack<>();
        System.out.println();
        chars.push('{');
        chars.push('}');
        chars.push('[');
        System.out.println(chars);
        chars.pop();
        System.out.println(chars);

    }
}
