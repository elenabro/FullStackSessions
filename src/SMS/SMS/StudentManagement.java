package SMS.SMS;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Type;


public class StudentManagement {

        public static void main(String[] args) throws InvalidMajorException {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Student> students = new ArrayList<>();

            while (true) {
                System.out.println("=====Student Menu=====");
                System.out.println("1. Add Student Details");
                System.out.println("2. Display Student Details");
                System.out.println("3. Delete Student Details");
                System.out.println("4. Edit Student Details");
                System.out.println("5. Save to JSON");
                System.out.println("6. Load from JSON");
                System.out.println("7. Exit");
                System.out.println("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:                            // Add Student Details
                        System.out.println("Enter student type (1 for Graduate, 2 for Undergraduate): ");
                        int type = scanner.nextInt();
                        scanner.nextLine();


                        Student student = new UndergraduatedStudent();

                        System.out.println("Enter student first name: ");
                        String firstName = scanner.next();
                        student.setFirstName(firstName);

                        System.out.println("Enter student last name: ");
                        String lastName = scanner.next();
                        student.setLastName(lastName);

                        System.out.println("Enter student age: ");
                        int studentAge = scanner.nextInt();
                        student.setStudentAge(studentAge);
                        scanner.nextLine();

                        System.out.println("Enter student major: ");
                        String studentMajor = scanner.next();
                        student.setStudentMajor(studentMajor);


                        if (type == 1) {
                            System.out.println("Enter student GPA: ");
                            double GPA = scanner.nextDouble();
                            student = new GraduatedStudent(firstName, lastName, studentAge, studentMajor, GPA);
                        } else if (type == 2) {
                            student = new UndergraduatedStudent(firstName, lastName, studentAge, studentMajor);
                        } else {
                            System.out.println("Invalid student type.");
                            break;
                        }

                        int studentId = student.generateId();
                        student.setStudentId(studentId);
                        students.add(student);

                        System.out.println("Information saved successfully: " + student.display());
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

                        for (Student s : students) {
                            System.out.printf("%-5d %-15s %-15s %-5d %-15s%n",
                                    s.getStudentId(),
                                    s.getFirstName(),
                                    s.getLastName(),
                                    s.getStudentAge(),
                                    s.getStudentMajor());
                        }

                        System.out.println("====================================================");
                        Student.setStudentCount(students.size());
                        System.out.println("====================================================");
                    break;

                    case 3:                // Delete Student Details
                        System.out.println("Enter student ID to delete: ");
                        int idToDelete = scanner.nextInt();
                        scanner.nextLine();
                        boolean found1 = false;
                        for (Student s : students) {
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
                        for (Student s : students) {
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

                    case 5: // Save to JSON
                        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                        try (FileWriter writer = new FileWriter("students.json")) {
                            gson.toJson(students, writer);
                            System.out.println("Student details saved to students.json");
                        } catch (IOException e) {
                            System.out.println("An error occurred while saving to JSON: " + e.getMessage());
                        }
                        break;

                    case 6: // Load from JSON
                        gson = new Gson();
                        try (FileReader reader = new FileReader("students.json")) {
                            Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
                            students = gson.fromJson(reader, studentListType);
                            System.out.println("Student details loaded from students.json");
                        } catch (IOException e) {
                            System.out.println("An error occurred while loading from JSON: " + e.getMessage());
                        }
                        break;

                    case 7:
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



