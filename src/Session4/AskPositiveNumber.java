package Session4;

import java.util.Scanner;

public class AskPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a  number: ");
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Please enter a positive number");
            } else {
                System.out.println("You entered a positive number: " + num);
            }
        } while  (num <= 0) ;
            scanner.close();
        }
    }



