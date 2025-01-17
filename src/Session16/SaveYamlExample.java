package Session16;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SaveYamlExample {

    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>() ;
//        studentList.add(new Student(1,"John",20,3.5));
//        studentList.add(new Student(1,"John",20,3.5));
//        studentList.add(new Student(2,"Jane",21,3.6));
//        studentList.add(new Student(3,"Jim",22,3.7));
//
//        saveYaml(studentList);

        for (Student student : loadFromYaml()){
            System.out.println(student);
        }

    }


    public static void saveYaml (List<Student> students){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            mapper.writeValue(new File("students.yaml"), students);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static List<Student> loadFromYaml(){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        List<Student> result = new ArrayList<>();
        try {
            result = mapper.readValue(new File("students.yaml"), mapper.getTypeFactory().constructCollectionType(List.class, Student.class));
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

}
