package Session7.SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("=====Student Menu=====");
            System.out.println("1. Add Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Delete Student Details");
            System.out.println("4. Edit Student Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
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

                    System.out.println("Information saved successfully: " + student.toString());
                    break;

                case 2:
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        System.out.printf("%-10d %-20s %-20s %-5d%n",
                                s.studentId,
                                s.firstName,
                                s.lastName,
                                s.studentAge);
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
                    // define student to edit
                    // search for student by id
                    // found/not found
                    // set new values

                    System.out.println("Enter student ID to edit: ");
                    int idToEdit = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;
                    for (Student s : students) {
                        if (s.studentId == idToEdit) {

                            System.out.println("Enter new first name: ");
                            s.firstName = scanner.nextLine();
                            System.out.println("Enter new last name: ");
                            s.lastName = scanner.nextLine();
                            System.out.println("Enter new age: ");
                            s.studentAge = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Student details updated successfully");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with id " + idToEdit + " does not exist");
                    }

                    break;


                case 5:
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