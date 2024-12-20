package Session5;

import java.util.Scanner;

public class AcceptNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int[] arr = {24,54,67,32,33,47,39};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Number " + number + " is in the array at index " + i);
                return;
            }else  {
                System.out.println("Number " + number + " is not in the array");
                return;
            }
        }
        scanner.close();


    }
}
