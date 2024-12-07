package Session2;

import java.util.Scanner;

public class StudentDetails
{
    public static void main(String[] args) {
        // student IDENTifier
        // STUDENT firstNAME
        // STUDENT last name
        // STUDENT age

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student identifier");
        int studentId = scanner.nextInt();
        System.out.println("enter student first name");
        String studentFirstName = scanner.next();
        System.out.println("enter student last name");
        String studentLastName = scanner.next();
        System.out.println("enter student age");
        int studentAge = scanner.nextInt();
        System.out.println("\n=======Student details=======\n");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student First Name: " + studentFirstName);
        System.out.println("Student Last Name: " + studentLastName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("\n=======Student details=======\n");
        scanner.close();




    }
}
