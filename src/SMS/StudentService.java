package SMS;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * The StudentService class provides methods to manage students, including adding, deleting, and saving students.
 */
public class StudentService {
    private StudentRepository studentRepository;
    private List<Student> students;

    /**
     * Constructs a StudentService with the specified StudentRepository.
     *
     * @param studentRepository the StudentRepository to manage student data
     */
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        this.students = studentRepository.loadStudents();
    }

    /**
     * Gets the list of students.
     *
     * @return the list of students
     */
    public List<Student> getStudents() {

        return students;
    }

    /**
     * Adds a student to the list.
     *
     * @param student the student to add
     */
    public void addStudent(Student student) {

        students.add(student);
    }

    /**
     * Deletes a student by their ID.
     *
     * @param id the ID of the student to delete
     */
    public void deleteStudent(int id) {

        students.removeIf(student -> student.getId() == id);
    }

    /**
     * Saves the list of students to the repository.
     */
    public void saveStudents() {

        studentRepository.saveStudents(students);
    }

//    /**
//     * Exports the list of students to a CSV file.
//     *
//     * @param fileName the name of the CSV file to export to
//     */
//    public void exportStudentsToCSV(String fileName) {
//        List<Student> students = studentRepository.findAll();
//        try (FileWriter writer = new FileWriter(fileName)) {
//            writer.append("Type,ID,First Name,Last Name,Age,Major,Email,GPA\n");
//            for (Student student : students) {
//                if (student instanceof GraduateStudent) {
//                    GraduateStudent gradStudent = (GraduateStudent) student;
//                    writer.append("GraduateStudent,")
//                            .append(String.valueOf(gradStudent.getId())).append(",")
//                            .append(gradStudent.getFirstName()).append(",")
//                            .append(gradStudent.getLastName()).append(",")
//                            .append(String.valueOf(gradStudent.getAge())).append(",")
//                            .append(gradStudent.getMajor().toString()).append(",")
//                            .append(gradStudent.getEmail()).append(",")
//                            .append(String.valueOf(gradStudent.getGPA())).append("\n");
//                } else if (student instanceof UndergradStudent) {
//                    UndergradStudent undergradStudent = (UndergradStudent) student;
//                    writer.append("UndergradStudent,")
//                            .append(String.valueOf(undergradStudent.getId())).append(",")
//                            .append(undergradStudent.getFirstName()).append(",")
//                            .append(undergradStudent.getLastName()).append(",")
//                            .append(String.valueOf(undergradStudent.getAge())).append(",")
//                            .append(undergradStudent.getMajor().toString()).append(",")
//                            .append(undergradStudent.getEmail()).append("\n");
//                }
//            }
//            System.out.println("Students exported to CSV file successfully.");
//        } catch (IOException e) {
//            System.out.println("Error exporting students to CSV file: " + e.getMessage());
//        }
//    }
}