package Session6;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<>();
        studentList.put(1,"Elena");
        studentList.put(26,"Artem");
        studentList.put(3,"Nastia");
        studentList.put(4,"Gegam");

        System.out.println(studentList);
        studentList.put(2, "Anton");

        System.out.println(studentList);

        System.out.println(studentList.get(3));
        System.out.println(studentList.containsValue("Artem"));
    }
}
