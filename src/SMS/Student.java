package SMS;

import SMS.IllegalAgeException;
import SMS.IllegalEmailException;

/**
 * The abstract Student class represents a student with common attributes and methods.
 * It implements the Printable interface to allow printing student details.
 */
public abstract class Student implements Printable {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    protected Major major;
    private String email;

    private static int nextId = 1;

    /**
     * Constructs a Student with the specified details.
     *
     * @param id the student's ID
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param age the student's age
     * @param major the student's major
     * @param email     the email of the student
     */
    public Student(int id, String firstName, String lastName, int age, Major major, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
        this.email = email;
    }

    /**
     * Gets the student's ID.
     *
     * @return the student's ID
     */
    public int getId() {
        return id; }

    /**
     * Gets the student's first name.
     *
     * @return the student's first name
     */
    public String getFirstName() {
        return firstName; }

    /**
     * Gets the student's last name.
     *
     * @return the student's last name
     */
    public String getLastName() {
        return lastName; }

    /**
     * Gets the student's age.
     *
     * @return the student's age
     */
    public int getAge() {
        return age; }

    /**
     * Gets the student's major.
     *
     * @return the student's major
     */
    public Major getMajor() {
        return major; }

    /**
     * Returns the email of the student.
     *
     * @return the email of the student
     */

    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's first name.
     *
     * @param firstName the student's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName; }

    /**
     * Sets the student's last name.
     *
     * @param lastName the student's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName; }

    /**
     * Sets the age of the student.
     *
     * @param age the age to set
     * @throws SMS.IllegalAgeException the age is not between 18 and 150
     */
    public void setAge(int age) throws SMS.IllegalAgeException {
        if (age < 18 || age > 150) {    // Age validation
            throw new IllegalAgeException("Invalid age. ");
        }
        this.age = age;
    }

    /**
     * Sets the student's major.
     *
     * @param major the student's major
     */
    public void setMajor(Major major) {
        this.major = major; }

    /**
     * Sets the email of the student.
     *
     * @param email the email to set
     * @throws IllegalEmailException the email of the student does not contain '@'
     */

    public void setEmail(String email) throws SMS.IllegalEmailException {
        if (!email.contains("@")) {
            throw new IllegalEmailException("Email must contain '@'.");
        }
        this.email = email;
    }

    /**
     * Sets the next ID to be assigned to a student.
     *
     * @param nextId the next ID to be assigned
     */
    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    /**
     * Prints the details of the student.
     */
    @Override
    public abstract void print();
}