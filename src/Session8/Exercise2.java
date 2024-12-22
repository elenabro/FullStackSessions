package Session8;


//    write a method that calculate sum of all even numbers from 1 to 50 using for loop

public class Exercise2 {
    public static void main(String[] args) {

        System.out.println(sumOfEven());
    }


    public static int sumOfEven() {
        int sum = 0;
        for (int i = 0; i<= 50; i++) {
            if (i % 2 == 0) {
                sum = sum + i ;
            }
        }
            return sum;
        }
    }



