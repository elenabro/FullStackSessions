package Session8;


//        find  the biggest number out of 25,30,45 using if operator

public class Exercise1 {
    public static void main(String[] args) {

//        System.out.println(maxNumber());

//        there are two ways to solve this problem
//        the first way is without int max and the method

        int a = 25;
        int b = 30;
        int c = 45;
         if (a > b && a > c ) {
             System.out.println("The biggest number is: " + a);
         } else if (b > a && b > c) {
             System.out.println("The biggest number is: " + b);
         } else {
             System.out.println("The biggest number is: " + c);
         }
        System.out.println();

    }
// the second way is with int max and maxNumber method
//        public static int maxNumber() {
//            int a = 25;
//            int b = 30;
//            int c = 45;
//            int max = 0;
//            if (a > b && a > c) {
//                max = a;
//            } else if (b > a && b > c) {
//                max = b;
//            } else {
//                max = c;
//            }
//            return max;
//        }
    }





