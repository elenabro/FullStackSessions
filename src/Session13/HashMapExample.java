package Session13;

import java.util.HashMap;

//you deal with key, value pairs. Keys have to be unique
//you can save any value along with the key
//use HashMap to store characters, words, etc

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> studentGrades = new HashMap<>();
        studentGrades.put(1, "A");
        studentGrades.put(2, "B");
        studentGrades.put(3, "C");

        System.out.println("Grades " + studentGrades);

        studentGrades.put(1, "A+");
        System.out.println("Grades " + studentGrades);
        studentGrades.put(null, "Empty");
        System.out.println("Grades " + studentGrades);

//      Retrieve data
        System.out.println("Grade of student 1: " + studentGrades.get(1));

//      Check if a key exists
        System.out.println("Does student 1 exist? " + studentGrades.containsKey(1));
        System.out.println("Does student 4 exist? " + studentGrades.containsKey(4));

//      Delete
        studentGrades.remove(1);
        System.out.println("Grades " + studentGrades);

        for (HashMap.Entry<Integer, String> student : studentGrades.entrySet()) {
            System.out.println(student.getValue());
        }
    }
}
