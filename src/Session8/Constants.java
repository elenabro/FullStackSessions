package Session8;

public class Constants {

//constants are variables that can't be reassigned - with word "final"
    public static final double PI = 3.14159;
    public static final int Number = 156;
    public static final String Name = "John";

    public static void main(String[] args) {
//        PI = 3.14; reassigning is not allowed because PI is a constant final variable
        System.out.println("the value of PI: "  + PI);
        System.out.println("the value of Number: "  + Number);
        System.out.println("the value of Name: "  + Name);

    }
}
