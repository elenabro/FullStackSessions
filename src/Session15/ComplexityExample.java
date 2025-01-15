package Session15;

import java.util.ArrayList;
import java.util.List;

public class ComplexityExample {

    public static void main(String[] args) {
        System.out.println(getFullName("Elena ", "Brommer"));

        List<String> fname = new ArrayList<>();
        fname.add("John");
        fname.add("Tim");
        fname.add("Pit");

        fname = concat(fname);
        for (String f : fname){
            System.out.println(f);
        }

    }
    //    this complexity of O(1) -  data is a simple String

    public static  String getFullName(String firstName, String lastName){
        return firstName + lastName;
    }

// this complexity of O(n) - data is a List how much data  we put in the method
    public static  List<String> concat(List<String> firstName){

        List<String> concat = new ArrayList<>();
        for (String fname: firstName){
            concat.add("Sr " + fname);
        }
        return concat;
    }
}


//complexity O(n2) - compare ans search using one loop inside another loop (inner loop)

//complexity O(log n) - common complexity for binary search, more efficient then O(n)