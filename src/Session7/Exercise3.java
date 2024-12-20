package Session7;
//write a method that takes array of integers and finds the max integer from the array
public class Exercise3 {
    public static void main(String[] args) {
        int[] input = {4, 3, 65, 76, 23, 110};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }

        System.out.println("The maximum value is: " + max);
        }
    }

