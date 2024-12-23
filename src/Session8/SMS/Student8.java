package Session8.SMS;

public class Student8 {

    private static int lastAssignedId = 0;
    private int studentId;
    private String firstName;
    private String lastName;
    private int studentAge;
    private String studentMajor;

    static int studentCount = 0;


    Student8(String fName, String lName, int age, String major) {

        this.studentId = ++lastAssignedId;
        this.firstName = fName;
        this.lastName = lName;
        this.studentAge = age;
        this.studentMajor = major;
        studentCount++;
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

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public void Student8() {
        studentCount++;
    }

    public static void showCount() {
        System.out.println("Number of students: " + studentCount);
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




