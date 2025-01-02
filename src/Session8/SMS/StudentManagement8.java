package Session8.SMS;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManagement8 {

        public static void main(String[] args) throws InvalidMajorException {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Student8> students = new ArrayList<>();

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
                    case 1:                            // Add Student Details

                        Student8 newStudent = new Student8();

                        System.out.println("Enter student first name: ");
                        String firstName = scanner.next();
                        newStudent.setFirstName(firstName);

                        System.out.println("Enter student last name: ");
                        String lastName = scanner.next();
                        newStudent.setLastName(lastName);

                        System.out.println("Enter student age: ");
                        int studentAge = scanner.nextInt();
                        newStudent.setStudentAge(studentAge);
                        scanner.nextLine();


                        System.out.println("Enter student major: ");
                        String studentMajor = scanner.next();
                        newStudent.setStudentMajor(studentMajor);

                        int studentId = newStudent.generateId();
                        newStudent.setStudentId(studentId);

                        students.add(newStudent);

                        System.out.println("Information saved successfully: " + newStudent.toString());
                        break;

                    case 2:                   // Display Student Details
                        System.out.println("==================Students Details==================");
                        System.out.printf("%-5s %-15s %-15s %-5s %-15s%n",
                                "ID",
                                "First Name",
                                "Last Name",
                                "Age",
                                "Major");
                        System.out.println("====================================================");

                        for (Student8 s : students) {
                            System.out.printf("%-5d %-15s %-15s %-5d %-15s%n",
                                    s.getStudentId(),
                                    s.getFirstName(),
                                    s.getLastName(),
                                    s.getStudentAge(),
                                    s.getStudentMajor());
                        }

                        System.out.println("====================================================");
                        Student8.setStudentCount(students.size());
                        System.out.println("====================================================");
                    break;

                    case 3:                // Delete Student Details
                        System.out.println("Enter student ID to delete: ");
                        int idToDelete = scanner.nextInt();
                        scanner.nextLine();
                        boolean found1 = false;
                        for (Student8 s : students) {
                            if (s.getStudentId() == idToDelete) {
                                students.remove(s);
                                System.out.println("Student deleted successfully");
                                found1 = true;
                                break;
                            }
                        }

                        if (!found1) {
                            System.out.println("Student with id " + idToDelete + " does not exist");
                        }
                        break;

                    case 4:             // Edit Student Details
                        System.out.println("Enter student ID to edit: ");
                        int idToEdit = scanner.nextInt();
                        scanner.nextLine();

                        boolean found = false;
                        for (Student8 s : students) {
                            if (s.getStudentId() == idToEdit) {

                                System.out.println("Enter new first name: ");
                                s.setFirstName( scanner.nextLine());
                                System.out.println("Enter new last name: ");
                                s.setLastName( scanner.nextLine());
                                System.out.println("Enter new age: ");
                                s.setStudentAge( scanner.nextInt());
                                scanner.nextLine();
                                System.out.println("Enter new major: ");
                                s.setStudentMajor(scanner.nextLine());

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



