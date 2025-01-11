package Session13;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("List: " + list);

        list.addFirst("Zero");
        System.out.println("List after addFirst: " + list);

        list.addLast("Four");
        System.out.println("List after addLast: " + list);

        for (String item : list) {
            System.out.println(item);
        }
    }
}
