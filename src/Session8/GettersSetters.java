package Session8;

public class GettersSetters {
    public static void main(String[] args) {
        Person p = new Person();
//        p.firstName = "John";   // this is not a good practice
//            because we are directly accessing the instance variable
//        p.lastName = "Doe";     // this is not a good practice
//            System.out.println(p.firstName + " " +  p.lastName);
        p.setFirstName("John");
        p.setLastName("Doe");
        p.setAge(68);
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
    }

}


class Person {
//    private - we can't change the property directly
    private String firstName;
    private String lastName;
    private int age;

//getter returns the value of the property
    public String getFirstName (){
            return firstName;
        }

// setter performs validation before setting the value of the property
    public void setFirstName (String firstName) {
        if (firstName == " ") {
            System.out.println("First name cannot be empty");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName (){
            return lastName;
        }

    public void setLastName (String lastName){
            if (lastName == " ") {
                System.out.println("Last name cannot be empty");
            } else {
                this.lastName = lastName;
            }
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }
 }







