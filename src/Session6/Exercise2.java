package Session6;

import static Session6.Exercise1.oddOrEven;

//create a method that takes an array of integers and returns a string that says if the array is odd or even
public class Exercise2 {
    public static void main(String[] args) {

        int[] array = {12, 33, 21, 56, 1, 6, 7};


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
    }






