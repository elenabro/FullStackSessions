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
