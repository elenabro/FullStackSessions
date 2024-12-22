package Session8;

public class StaticExample2 {

//     example of static class

//    static class is a class that is a member of another class and marked with the static keyword.
//    inner class
   static   class Person1 {
        public static String name = "Elena Brommer";   // this property is static
    }

    public static void main(String[] args) {
        Person1 p = new Person1();
        System.out.println(p.name);


    }
}

//static key word applayed to the inner class
