package BaiTap6;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new student
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter math score: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Enter physics score: ");
        double physicsScore = scanner.nextDouble();
        System.out.print("Enter chemistry score: ");
        double chemistryScore = scanner.nextDouble();
        scanner.nextLine();  // Consume newline character

        Student student = new Student(studentId, studentName, mathScore, physicsScore, chemistryScore);

        // Save student to file
        System.out.print("Enter the file path to save the student: ");
        String filePath = scanner.nextLine();
        if (SaveStudent.saveStudent(student, filePath)) {
            System.out.println("Student saved successfully.");
        } else {
            System.out.println("Failed to save student.");
        }

        // Read and display student list from file
        System.out.println("\nReading student list from file:");
        List<Student> studentList = ReadStudent.readStudents(filePath);
        if (studentList != null) {
            for (Student s : studentList) {
                System.out.println(s);
            }
        } else {
            System.out.println("No students found in the file.");
        }

        scanner.close();
    }
}

