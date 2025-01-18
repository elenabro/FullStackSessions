package SMS.SMS;

public class GraduatedStudent extends Student {
    private double GPA;
    public GraduatedStudent(String fName, String lName, int age, String major, double GPA) {
        super(fName, lName, age, major);
        this.GPA = GPA;
    }
    public GraduatedStudent(){
        super();
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String display(){
        return String.format("ID: %d, First name: %s, Last name: %s, Age: %d, Major: %s, GPA: %.2f",
                getStudentId(),
                getFirstName(),
                getLastName(),
                getStudentAge(),
                getStudentMajor(),
                getGPA());
    }
}


