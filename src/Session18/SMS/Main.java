package Session18.SMS;

import Session18.SMS.Menu.MainMenu;

import java.util.List;
import java.util.Scanner;

/**
 * The Main class is the entry point for the Student Management System application.
 * It initializes the necessary components and displays the main menu.
 */
public class Main {
    /**
     * The main method initializes the StudentRepository, StudentService, and Scanner,
     * then creates and displays the MainMenu.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRepository studentRepository = new FileStudentRepository("students19.csv") {
            @Override
            public List<Student> findAll() {
                return List.of();
            }
        };


        StudentService studentService = new StudentService(studentRepository);
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(studentService, scanner);
        mainMenu.displayMenu();
    }
    }
