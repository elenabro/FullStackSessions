package SMS.SMS;

public class UndergraduatedStudent extends Student {
    public UndergraduatedStudent(String fName, String lName, int age, String major) {
        super(fName, lName, age, major);
    }

    public UndergraduatedStudent(){
        super();
    }


    @Override
    public String display(){
        return String.format("ID: %d, First name: %s, Last name: %s, Age: %d, Major: %s",
                getStudentId(),
                getFirstName(),
                getLastName(),
                getStudentAge(),
                getStudentMajor());

    }
}
