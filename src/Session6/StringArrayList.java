package Session6;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Elena");
        strList.add("Artem");
        strList.add("Vlad");
        strList.add("Gegam");
        strList.add("Vitalii");
        strList.add("Nastia");
        strList.add("Vlad");
        System.out.println(strList);
        strList.remove(0);    // removing index (index number of the objects) , not value
        System.out.println(strList);
        strList.remove("Vlad");  // removing value
        System.out.println(strList);
//        if there are two the same objects in the list, the first one will be removed
//        strList.remove(567) ; // removing index outside current bounds -
        // there will be an exception
//        if removing by value - no exception will be thrown
        strList.remove("Anton");
        System.out.println(strList);

        System.out.println(strList.size());  // size of the list
    }
}
