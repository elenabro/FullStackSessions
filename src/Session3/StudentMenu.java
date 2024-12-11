package Session3;

import java.util.Scanner;

public class StudentMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentId = 0;
        String firstName = "";
        String lastName= "";
        int studentAge= 0;


        while (true) {
            System.out.println("=====Student Menu=====");
            System.out.println("1. Add Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    studentId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter student first name: ");
                    firstName = scanner.nextLine();

                    System.out.println("Enter student last name: ");
                    lastName = scanner.nextLine();

                    System.out.println("Enter student age: ");
                    studentAge = scanner.nextInt();

                    System.out.println("Information saved successfully");
                    break;

                case 2:
                    System.out.println("\n=======Student details=======\n");
                    System.out.println("Student ID: " + studentId);
                    System.out.println("Student First Name: " + firstName);
                    System.out.println("Student Last Name: " + lastName);
                    System.out.println("Student Age: " + studentAge);
                    System.out.println("\n=======End of Student details=======\n");
                    break;

                case 3:
                    studentId = 0;
                    firstName = "";
                    lastName = "";
                    studentAge = 0;
                    System.out.println("Student data reset successfully");
                    break;

                case 4:
                    System.out.println("Exit");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
                }
            }
        }
    }
