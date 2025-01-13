package Session13;

import java.util.HashSet;


//HashSet is a set of  values without unique key. Order is not preserved
//you can not rely on the order of the things in HashSet

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>(); // Create a HashSet object

        names.add("John"); // Add elements to the HashSet
        names.add("Jane");
        names.add("Alice");
        names.add("Jane"); // Duplicate element

        System.out.println("Names: " + names); // Display the HashSet


        boolean  isAdded = names.add("Jane"); // Add an element that already exists
        System.out.println( "Duplicate added: " + isAdded); // Display the result

        boolean exists = names.contains("Jane"); // Check if an element exists
        System.out.println("Jane exists: " + exists); // Display the result

        for (String name : names) { // Loop through the HashSet
            System.out.println(name); // Display each element
        }
    }
}
