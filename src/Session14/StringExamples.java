package Session14;

public class StringExamples {
    public static void main(String[] args) {
        String s = " Portnov computer school";
        String[] splitted = s.split(" ");
        for (String string : splitted) {
            System.out.println(string);
        }
    }
}
//we can choose criteria for splitting
//if s.split "computer" - we will have two strings portnov and school
//        when we split with space " ", we split into words
//        when we split without space "", we split into characters