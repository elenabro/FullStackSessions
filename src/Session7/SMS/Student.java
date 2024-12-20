package Session7.SMS;

public class Student {

    int studentId;
    String firstName;
    String lastName;
    int studentAge;

    Student(int id, String fName, String lName, int age) {
        this.studentId = id;
        this.firstName = fName;
        this.lastName = lName;
        this.studentAge = age;
    }

    public String toString() {
//            return this.studentId + " "
//                    + this.lastName + " "
//                    + this.firstName + " "
//                    + this.studentAge;
        return String.format("ID: %d, First name: %s, Last name: %s, Age: %d",
                studentId,
                lastName,
                firstName,
                studentAge);
//        The String.format method in Java is used
//        to create a formatted string using specified format specifiers
//        %d: A placeholder for an integer value (student ID and age).
//        %s: A placeholder for a string value (first name and last name).
    }
}

