package Session7;
//write the function that reverse the word
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(reversed("Portnov"));
    }

        static String reversed(String original) {
        String result = "";
        for (int i = original.length() -1 ; i >= 0; i--) {
            result  += original.charAt(i);
        }
        return result;
        }
    }

