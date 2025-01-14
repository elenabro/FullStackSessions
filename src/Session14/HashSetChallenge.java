package Session14;


import java.util.HashSet;

// Given = {3,6,2,8,6,4,8,1};
//Using HashSet create a method that detect if array contains duplicates
public class HashSetChallenge {


    public static void main(String[] args) {

        int[] numbers = {2, 5, 2, 1, 6, 4, 8, 1};
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {

//            this is the equals ways to solve the task
//
//            1.
//            we save the result into boolean- method add() returns true or false
//        boolean added = duplicates.add(numbers[i]);
//        if (!added) {
//            System.out.println("Duplicate found, for  " + numbers[i]);
//        }
//      }
//            2.
            if (!duplicates.add(numbers[i])) {
                System.out.println("duplicates found " + numbers[i]);
            }
        }
    }
}
