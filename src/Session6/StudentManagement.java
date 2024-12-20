package Session6;

import java.util.ArrayList;
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

//    private static int lastAssignedId = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("=====Student Menu=====");
            System.out.println("1. Add Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Delete Student Details");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
//                    int studentId = ++lastAssignedId;
                    boolean idExists = false;
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        students.get(studentId);
                        idExists = true;
                        break;
                    } catch (IndexOutOfBoundsException e) {

                    }
                    if (idExists) {
                        System.out.println("Student ID " + studentId + " already exists.");
                        break;
                    }

                    System.out.println("Enter student first name: ");
                    String firstName = scanner.next();

                    System.out.println("Enter student last name: ");
                    String lastName = scanner.next();

                    System.out.println("Enter student age: ");
                    int studentAge = scanner.nextInt();

                    Student student = new Student(studentId, firstName, lastName, studentAge);

                    students.add(student);

                    System.out.println("Information saved successfully");
                    break;

                case 2:
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        System.out.println("=====Student Details=====");
                        System.out.println("Student ID: " + s.studentId);
                        System.out.println("Student First Name: " + s.firstName);
                        System.out.println("Student Last Name: " + s.lastName);
                        System.out.println("Student Age: " + s.studentAge);
                        System.out.println("===== End of Student Details=====");
                    }
                    break;
                case 3:

                        System.out.println("Enter student ID to delete: ");
                        int id = scanner.nextInt();
                        idExists = false;
                        students.remove(id);
                        System.out.println("Student deleted successfully");
                        if (!idExists) {
                            System.out.println("Student with id " + id + " does not exist");
                        }
                        break;

                        case 4:
                            System.out.println("Exit");
                            scanner.close();
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Invalid choice.");


            }
        }
    }
}
