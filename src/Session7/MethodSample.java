package Session7;

public class MethodSample {
    public static void main(String[] args) {
        printMessage();
        showGreeing("John");
        getMessage();
        System.out.println(getMessage());
    }

    public static void printMessage(){
        System.out.println("Message");
    }

    public static void showGreeing(String name){
        System.out.println("Hello " + name);
    }

    public static String getMessage()
    {

        return "Hello";
    }

    public static void showMessage(){
        System.out.println("This is a message");
    }
}

