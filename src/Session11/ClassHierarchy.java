package Session11;

public class ClassHierarchy {
    public static void main(String[] args) {
        Person student = new Student();
        student.name = "Student";

        Person teacher = new Teacher();
        teacher.name = "Teacher";

        Person gradstudent = new GraduateStudent();
        gradstudent.name = "Graduated Student";

        Person [] persons = {student, teacher, gradstudent};


        for (Person person : persons) {
            person.introduce();
        }
    }
}
