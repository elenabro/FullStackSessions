package Session6;

public class Exercise3 {
    public static void main(String[] args) {
//        create a method that accept 2 strings and return concatinated string with
//        space character between

        String str1 ="Hello";
        String str2 = "world";
        System.out.println(concatString(str1, str2));
    }
    public static String concatString(String str1, String str2){
        String result = str1 + " " + str2;
           return result;
    }
}
