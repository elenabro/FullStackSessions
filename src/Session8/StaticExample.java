package Session8;

public class StaticExample {
    public static void main(String[] args) {

//        example of static property name in Person1 class

        // access to name property without creating an object of Person1 class
        System.out.println(Person1.name);

//        Person1 p = new Person1();
//        Person1 p2 = new Person1();
//        System.out.println(p.name);
//        p2.name = "test";
//        System.out.println(p.name);
    }
}


        class Person1 {
    public static String name = "Elena Brommer";   // this property is static
//            we can call it on class level(see line 5) without creating an instance
//            (object) of Person1 class
}


//  access to name property with creating an object p of Person1 class,
//  but it's considered a bad practice. This will be return Elena Brommer and test
//        Person1 p = new Person1();
//        Person1 p2 = new Person1();
//        System.out.println(p.name);
//        p2.name = "test";
//        System.out.println(p.name);
