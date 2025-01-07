package Session11;

public class GraduateStudentSample {

    static void describeStudent(Student student) {
        if (student instanceof GraduateStudent) {
            System.out.println("This is a graduate student.");
        } else {
            System.out.println("This is a student.");
        }
    }

    public static void main(String[] args) {


        Student student = new Student();
        student.name = "Jane";
        student.age = 20;
        student.studentId = "12345";


        GraduateStudent graduateStudent = new GraduateStudent();
        graduateStudent.name = "John";
        graduateStudent.age = 25;
        graduateStudent.studentId = "12345";
        graduateStudent.researchTopic = "Machine Learning";


        student.introduce();
        graduateStudent.introduce();

        describeStudent(student);
        describeStudent(graduateStudent);
    }
}
