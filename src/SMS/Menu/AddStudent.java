package SMS.Menu;

import SMS.*;

import java.util.Scanner;

public class AddStudent {
    private StudentService studentService;
    private Scanner scanner;

    public AddStudent(StudentService studentService, Scanner scanner) {
        this.studentService = studentService;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter student type (1 for Undergraduate, 2 for Graduate): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

//        System.out.print("Enter age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter major (ART, ECONOMICS, MATH): ");
//        String majorStr = scanner.nextLine();
//        Major major = Major.valueOf(majorStr.toUpperCase());

        Student student;
        if (type == 1) {
            student = new UndergradStudent(studentService.getStudents().size() + 1, firstName, lastName, 0, Major.ART," ");
            System.out.print("Enter major (ART, ECONOMICS, MATH): ");
            String majorStr = scanner.nextLine();
            try {
                Major.valueOf(majorStr.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid major: " + e.getMessage());
                return;
            }

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            try {
                student.setAge(age);
            } catch (IllegalAgeException e) {
                System.out.println("Invalid age: " + e.getMessage());
                return;
            }
            scanner.nextLine();

            System.out.println("Enter your email: ");
            String email = scanner.nextLine();
            try {
                student.setEmail(email);
            } catch (IllegalEmailException e) {
                System.out.println("Invalid email: " + e.getMessage());
                return;
            }

        } else if (type == 2) {
            SMS.GraduateStudent gradStudent = new SMS.GraduateStudent(studentService.getStudents().size() + 1, firstName, lastName, 0, Major.ART, " ");
            System.out.print("Enter major (ART, ECONOMICS, MATH): ");
            String majorStr = scanner.nextLine();
            try {
                SMS.Major.valueOf(majorStr.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid major: " + e.getMessage());
                return;
            }

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            try {
                gradStudent.setAge(age);
            } catch (SMS.IllegalAgeException e) {
                System.out.println("Invalid age: " + e.getMessage());
                return;
            }
            scanner.nextLine();

            System.out.println("Enter your email: ");
            String email = scanner.nextLine();
            try {
                gradStudent.setEmail(email);
            } catch (Session17.SMS.IllegalEmailException e) {
                System.out.println("Invalid email: " + e.getMessage());
                return;
            }

            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
//            GraduateStudent gradStudent = new GraduateStudent(studentService.getStudents().size() + 1, firstName, lastName, 0, Major.ART,"email");
            try {
                gradStudent.setGPA(gpa);
            } catch (IllegalGpaException e) {
                System.out.println("Invalid GPA: " + e.getMessage());
                return;
            }
            student = gradStudent;
        } else {
            System.out.println("Invalid student type.");
            return;
        }

        studentService.addStudent(student);
        System.out.println("Student added successfully.");
    }
}