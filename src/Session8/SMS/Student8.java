package Session8.SMS;

public class Student8 {

    private static int lastAssignedId = 0;
    private int studentId;
    private String firstName;
    private String lastName;
    private int studentAge;
    private String studentMajor;
    private static int studentCount = 0;

    Student8() {}

    public Student8(String fName, String lName, int age, String major) {

        this.studentId = ++lastAssignedId;
        this.setFirstName(fName);
        this.setLastName(lName);
        this.setStudentAge (age);
        this.setStudentMajor(major);
        this.studentCount++;
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

    public void setStudentAge(int age) {
        if (age < 18 || age > 150) {
            throw new IllegalArgumentException("Invalid age." +
                    "Please enter a valid age between 18 and 150.");
        }
        this.studentAge = age;
    }

    public void setStudentMajor(String major) {
            if (!isValidMajor(major)) {
                throw new IllegalArgumentException("Invalid major. " +
                        "Please enter a valid major (Art, Economics, Math).");
            }
            this.studentMajor = major;
        }

        private boolean isValidMajor(String major) {
            return major.equalsIgnoreCase("Art")
                    || major.equalsIgnoreCase("Economics")
                    || major.equalsIgnoreCase("Math");
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




