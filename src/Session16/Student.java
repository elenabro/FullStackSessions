package Session16;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public String toCsv(){
        return id + "," + name + "," + age + "," + grade;
    }

    public static Student fromCsv(String csvLine){
       String[] parts =  csvLine.split(",");
         int id = Integer.parseInt(parts[0]);
         String name = parts[1];
         int age = Integer.parseInt(parts[2]);
         double grade = Double.parseDouble(parts[3]);
         return new Student(id, name, age, grade);
    }
}
