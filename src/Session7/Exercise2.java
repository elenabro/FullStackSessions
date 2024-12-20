package Session7;

import java.util.Scanner;

//write the method that print out multiplication table
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + "=" + num * i);
        }
        scanner.close();
    }
}




