package Session6;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        declaration of the ArrayList
//        Arraylist contains only objects not primitive data types
//        to use integer we have to use Integer with Upper case
//        ArrayList<Type> listName = new ArrayList<>();

        ArrayList<Integer>  intArrayList =  new ArrayList<>();
//        <> diamond operator is used to specify the type of the object,
//        the type of objects shown on the left side only
//        this is the list of multiple objects
        intArrayList.add(43);
        intArrayList.add(12);
        System.out.println(intArrayList);
        intArrayList.add(33);
        System.out.println(intArrayList);
        intArrayList.remove(0); //        removing index (number of the objects) , not value
        System.out.println(intArrayList);
        intArrayList.remove(Integer.valueOf(33)); //        removing value
        System.out.println(intArrayList);
    }
}
