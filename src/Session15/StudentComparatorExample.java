package Session15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;
    private double grade;


    public Student(int id, String name, int age, double grade){
        this.id= id;
        this.name = name;
        this.age = age;
        this.grade= grade;

    }

    public int getId() {return id;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public double getGrade() {return grade;}

}

class NameComparatorAscending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2){
//        int result = 0;
//        String firstStudentName = s1.getName();
//        String secondStudentName = s2.getName();
//        result = firstStudentName.compareTo(secondStudentName);
//        return result;
        return s1.getName().compareTo(s2.getName());
    }
}


class NameComparatorDescending implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2){
        return s2.getName() .compareTo(s1.getName())  ;
    }
}

class GradeComparatorAscending implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2){
        return Double.compare(s1.getGrade(), s2.getGrade());
    }
}


public class StudentComparatorExample {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Rob", 31, 67));
        students.add(new Student (1, "John", 20, 91));
        students.add(new Student(2, "Tim", 35, 78));
        students.add(new Student (1, "Tim", 20, 91));

        Collections.sort(students, new NameComparatorAscending());
        for(Student s : students){
            System.out.println(s.getName() + s.getAge());
        }

        System.out.println("---------------");
        Collections.sort(students, new NameComparatorDescending());
        for(Student s : students){
            System.out.println(s.getName());
        }

        System.out.println("--------------");
        Collections.sort(students, new GradeComparatorAscending());
        for(Student s : students){
            System.out.println(s.getName() + " grade " + s.getGrade());
        }

    }

}
