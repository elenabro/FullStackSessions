package Session8.SMS;

import static Session8.SMS.AgeValidationException.validateAge;
import static Session8.SMS.MajorValidationException.validateMajor;


public class Student8 {

    private static int lastAssignedId = 0;
    private int studentId;
    private String firstName;
    private String lastName;
    private int studentAge;
    private String studentMajor;
    private static int newStudentCount = 0;

    Student8() {}

    public Student8(String fName, String lName, int age, String major)  {

        this.studentId = generateId();
        this.setFirstName(fName);
        this.setLastName(lName);
        this.setStudentAge(age);
        this.setStudentMajor(major);
        this.setStudentCount(newStudentCount);
    }
    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public static int getStudentCount() {
        return newStudentCount;
    }

    public void setStudentId(int studentId) {
        this.studentId = generateId();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentAge(int age) {
        try {
            validateAge(age);
            this.studentAge = age;
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage() + " Please enter a valid age between 18 and 150.");
        }
    }

    public void setStudentMajor(String major) {
        try {
            validateMajor(major);
            this.studentMajor = major;
        } catch (InvalidMajorException e) {
            System.out.println(e.getMessage() + " Please enter a valid major (Art, Economics, Math).");
        }
    }

    public static synchronized int generateId() {
        return ++lastAssignedId;
    }

    public static void setStudentCount(int newStudentCount) {
        Student8.newStudentCount = newStudentCount;
        System.out.println("Number of students: " + newStudentCount);
    }

    public String toString() {
        return String.format("ID: %d, First name: %s, Last name: %s, Age: %d, Major: %s",
                studentId,
                lastName,
                firstName,
                studentAge,
                studentMajor);
    }
}




