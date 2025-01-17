package Session16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveCsvExample {
    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>() ;
//           studentList.add(new Student(1,"John",20,3.5));
//            studentList.add(new Student(1,"John",20,3.5));
//            studentList.add(new Student(2,"Jane",21,3.6));
//            studentList.add(new Student(3,"Jim",22,3.7));
//
//
//        saveStudentsToCsv(studentList);
for (Student s: loadStudents()){
    System.out.println(s.toString());
}
    }

    public static void saveStudentsToCsv(List<Student> students){

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"))){
            for(Student s: students){
                bw.write(s.toCsv());
                bw.newLine();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static List<Student> loadStudents(){
        List<Student> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))){
            String line;
            while((line = br.readLine()) != null){
                result.add(Student.fromCsv(line));
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
