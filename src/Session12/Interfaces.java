package Session12;


interface Flyable {
    void fly();
}

interface Liftable {
    void lift();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies in the sky");
    }
}

class Plane implements Flyable, Liftable {
    @Override
    public void fly() {
        System.out.println("Plane flies in the sky");
    }
    @Override
    public void lift() {
        System.out.println("Plane lifts off the ground");
    }
}


public class Interfaces {

    public static void main(String[] args) {

        Flyable bird = new Bird();
        bird.fly();

        Plane plane = new Plane();
        plane.fly();
        plane.lift();

    }
}
