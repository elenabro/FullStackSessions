package Session5;

public class ReversedArray {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int reversedArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}