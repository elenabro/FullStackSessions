package Session16;

public class Challenge1 {

//You are given a sorted array of strings and a target string.
// Implement a method binarySearchString that returns the index of the target string in the array.
// If the target is not found, return -1.
//
// target string = “cherry”  array of strings = [“apple”, “banana”, “cherry”, “date”, “fig”, “grape”]

    public static void main(String[] args) {


        String[] words = {"apple", "banana", "cherry", "date", "fig", "grape"};

        String target = "date";

        System.out.println(binarySearch(words, target));
    }


    public static int binarySearch(String[] words, String target) {
        int left = 0;
        int right = words.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = target.compareTo(words[mid]);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
