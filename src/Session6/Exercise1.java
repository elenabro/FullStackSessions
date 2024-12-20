package Session6;
//write a method that accept integer and
//        return "odd" and "even" on a input number
public class Exercise1 {
    public static void main(String[] args) {
       String result = oddOrEven(57);
        System.out.println(result);
    }

     public static  String oddOrEven (int inputNumber){

            if (inputNumber % 2 == 0) {
                System.out.println("Result " + inputNumber % 2);
              return "even";
            } else {
                System.out.println("Result " + inputNumber % 2);
                return "odd";

            }
        }
    }


