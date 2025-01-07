package Session11;

public class GraduateStudent extends Student {

    String researchTopic    ;

    @Override
    public void introduce () {
        System.out.println("I am researching..." + researchTopic);
    }
}
