package Session11;

public class ExtendsKeyword {
    public static void main(String[] args) {

        Person person = new Person();

        person.name = "John";
        person.age = 25;
        person.introduce();

        Student student = new Student();
        student.name = "Jane";
        student.age = 20;
        student.studentId = "12345";
        student.introduce();
        student.study();

    }
}
