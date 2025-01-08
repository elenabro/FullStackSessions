package Session12;


abstract class Vehicle{
    abstract void move();

    void fuel(){
        System.out.println("Fuel is required to move the vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car moves on road");
    }
}


class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("Bicycle moves on road");
    }
}
public class AbstractClass {
    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        car.fuel();

        Bicycle bicycle = new Bicycle();
        bicycle.move();
        bicycle.fuel();

    }
}
