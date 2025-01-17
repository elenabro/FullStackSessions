package Session16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println(mergedList(list1, list2));
    }

    public static List<Integer> mergedList(List<Integer> list1, List<Integer> list2) {

        List<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        Collections.sort(result);
        return result;

    }
}
//    }
//    first list of integers
//    List<Integer> list1 = new ArrayList<>();
//    list1.add(1);
//    list1.add(2);
//    list1.add(3);
//second list of integers
//List<Integer> list2 = new ArrayList<>();
//list2.add(4);
//list2.add(5);
//list2.add(6);


