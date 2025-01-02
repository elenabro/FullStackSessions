package Session10;

class Vehicle {
    protected String type;


    public Vehicle(String type) {
        this.type = type;
    }

    protected String getType() {
        return type;
    }
}

    class Car extends Vehicle{

        public Car(String type) {
            super(type);
        }

        public void displayType(){
            System.out.println("Type of vehicle: " + getType());
        }
    }


public class ProtectedDemo {


    public static void main(String[] args) {
Car car = new Car ("Sedan");
car.type = "SUV";
car.displayType();
    }
}
