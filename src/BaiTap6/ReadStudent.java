package BaiTap6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadStudent {

    public static List<Student> readStudents(String filePath) {
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 5) {
                    Student student = new Student(
                            data[0].split(": ")[1].trim(), // Student ID
                            data[1].split(": ")[1].trim(), // Student Name
                            Double.parseDouble(data[2].split(": ")[1].trim()), // Math Score
                            Double.parseDouble(data[3].split(": ")[1].trim()), // Physics Score
                            Double.parseDouble(data[4].split(": ")[1].trim())  // Chemistry Score
                    );
                    studentList.add(student);
                }
            }

        } catch (IOException e) {
            System.out.println("Error occurred while reading file: " + e.getMessage());
        }

        return studentList.isEmpty() ? null : studentList;
    }
}

