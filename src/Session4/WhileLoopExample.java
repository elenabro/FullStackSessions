package Session4;

public class WhileLoopExample {
    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        while (counter < 5) {
            {
                System.out.println("This is an infinite loop");
                Thread.sleep(1000); // This will pause the execution for 1 second
                counter++;
            }

        }
    }
}
