package SMS.SMS;

import static SMS.SMS.AgeValidationException.validateAge;
import static SMS.SMS.MajorValidationException.validateMajor;


public abstract class Student {

    private static int lastAssignedId = 0;
    private int studentId;
    private String firstName;
    private String lastName;
    private int studentAge;
    private String studentMajor;
    private static int newStudentCount = 1;

    public Student() {}

    public Student(String fName, String lName, int age, String major)  {

        this.studentId = generateId();
        this.setFirstName(fName);
        this.setLastName(lName);
        this.setStudentAge(age);
        this.setStudentMajor(major);
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

    public void setLastName(String lastName)    {
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
        Student.newStudentCount = newStudentCount;
        System.out.println("Number of students: " + newStudentCount);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, First name: %s, Last name: %s, Age: %d, Major: %s",
                studentId,
                lastName,
                firstName,
                studentAge,
                studentMajor);
    }

    public abstract String display();
}




