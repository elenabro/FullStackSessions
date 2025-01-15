package Session14;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

// words counting task
//        TreeMap allows to store data with key/value pairs
//        step1 and 2 - we are preparing our data for processing
        String sample = "Java is a sample and Java is a powerful and simple";
//   1. split
        String[] words = sample.split(" ");
//        when we split with space " ", we split into words
//        when we split without space "", we split into characters


//   2. create TreeMap
        TreeMap<String, Integer> counter = new TreeMap<>();

//   3. count - processing
//        for any word s from string words. Words string splited into separate words
//        getOfDefault will return an object where we can pass default value and provide
//        what to do in case if we got a value . Default value = 0,
//        in case we've got a value +1(incrementing)
//        we retrieve from the counter value of s with default 0 if we find anything,
//        if we found a value we do +1
        for (String s : words) {
            counter.put(s, counter.getOrDefault(s, 0) + 1);
        }
//        check the result
//        this is type of entry for TreeMap
        for(Map.Entry<String,Integer> entry : counter.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
