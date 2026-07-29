package Construtores;

/*
Vamos considerar um exemplo mais complexo para ilustrar o uso de construtores 
em um cenário do mundo real. Suponha que você esteja desenvolvendo 
um sistema para gerenciar informações de alunos.
*/

public class Student {
    String name;
    int studentId;
    String major;
    double gpa;

    // Default constructor
    public Student() {
        this("Unknown", 0, "Undecided", 0.0);
        System.out.println("Default Student constructor called");
    }

    // Parameterized constructor with name and studentId
    public Student(String name, int studentId) {
        this(name, studentId, "Undecided", 0.0);
        System.out.println("Parameterized Student constructor (name, studentId) called");
    }

    // Parameterized constructor with name, studentId, and major
    public Student(String name, int studentId, String major) {
        this(name, studentId, major, 0.0);
        System.out.println("Parameterized Student constructor (name, studentId, major) called");
    }

    // Parameterized constructor with all attributes
    public Student(String name, int studentId, String major, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
        System.out.println("Parameterized Student constructor (all attributes) called");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayDetails();

        Student student2 = new Student("Alice Smith", 12345);
        student2.displayDetails();

        Student student3 = new Student("Bob Johnson", 67890, "Computer Science");
        student3.displayDetails();

        Student student4 = new Student("Charlie Brown", 13579, "Engineering", 3.75);
        student4.displayDetails();
    }
}