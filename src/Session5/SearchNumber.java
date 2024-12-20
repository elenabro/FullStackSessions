package Session5;

import java.util.Scanner;
//using scanner accept number to search for user provided value in array

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int[] array = {24, 54, 67, 32, 33, 47, 39};
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    System.out.println("Number " + number + " is in the array at index " + i);
                    break;
                }else {
                    System.out.println("Number " + number + " is not in the array");
                    break;
                }
            }
        }
        scanner.close();}
}