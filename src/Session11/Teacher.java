package Session11;

public class Teacher extends Person {

    String subject;

    public void teach() {
        System.out.println(" I am  teaching....");
    }

    @Override
    public void introduce() {
        System.out.println("Hi , I'm a teacher " +
                "and my name is " + super.name);

    }
}
