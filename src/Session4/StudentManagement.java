package Session4;

import java.util.Scanner;

public class StudentManagement {

    static class Student {
        int studentId;
        String firstName;
        String lastName;
        int studentAge;

        Student (int id, String fName, String lName, int age) {
            this.studentId = id;
            this.firstName = fName;
            this.lastName = lName;
            this.studentAge = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student [] students = new Student[5];
        int studentCount = 0;

        while (true) {
            System.out.println("=====Student Menu=====");
            System.out.println("1. Add Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Delete Student Details");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
//To handle exceptions when the student list crashes after add/delete operations,
// using a try-catch block around the code that modifies the student list.
                case 1:
                    try {
                        System.out.println("Enter student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine();

                        // Check for uniqueness of student ID
                        boolean idExists = false;
                        for (int i = 0; i < studentCount; i++) {
                            if (students[i] != null && students[i].studentId == studentId) {
                                idExists = true;
                                break;
                            }
                        }

                        if (idExists) {
                            System.out.println("Student ID already exists. Please enter a unique ID.");
                        } else {
                            System.out.println("Enter student first name: ");
                            String firstName = scanner.nextLine();

                            System.out.println("Enter student last name: ");
                            String lastName = scanner.nextLine();

                            System.out.println("Enter student age: ");
                            int studentAge = scanner.nextInt();

                            Student student = new Student(studentId, firstName, lastName, studentAge);
                            students[studentCount] = student;
                            studentCount++;

                            System.out.println("Information saved successfully");
                        }
                    } catch (Exception e) {
                        System.out.println("An error occurred while adding the student: " + e.getMessage());
                    }
                    break;
//                     Show message when Student list is empty
                case 2:
                    if (studentCount == 0) {
                        System.out.println("The student list is empty.");
                    } else {

                        for (int i = 0; i < studentCount; i++) {
                            Student s = students[i];
                            System.out.println("=====Student Details=====");
                            System.out.println("Student ID: " + s.studentId);
                            System.out.println("Student First Name: " + s.firstName);
                            System.out.println("Student Last Name: " + s.lastName);
                            System.out.println("Student Age: " + s.studentAge);
                            System.out.println("===== End of Student Details=====");
                        }
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Enter student ID to delete: ");
                        int id = scanner.nextInt();
                        boolean found = false;
                        for (int i = 0; i < studentCount; i++) {
                            if (students[i] != null && students[i].studentId == id) {
                                students[i] = null;
                                System.out.println("Student details deleted successfully");
                                found = true;
                                break;
                            }
                        }
//  Show message when user request to delete non existent student by id
                        if (!found) {
                            System.out.println("Student ID not found.");
                        }
                    } catch (Exception e) {
                        System.out.println("An error occurred while deleting the student: " + e.getMessage());
                    }
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
