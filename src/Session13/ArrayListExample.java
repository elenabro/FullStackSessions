package Session13;

import java.util.ArrayList;
import java.util.List;

//you create a mutable List that you can change.
// you can remove elements from the list,
// add elements to the list

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("List: " + list);

//        Get by index
        System.out.println("Element of index 1:  " + list.get(1));

//        Delete  element
        list.remove("Two");
        System.out.println("List after remove element: " + list);

        for (String number : list) {
            System.out.println(number );

        }


    }
}
