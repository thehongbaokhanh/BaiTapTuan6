package BaiTap6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import java.io.FileWriter;
import java.io.IOException;

public class SaveStudent {

    public static boolean saveStudent(Student student, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(student.toString() + "\n");
            return true; // Successfully saved
        } catch (IOException e) {
            System.out.println("Error occurred while saving student to file: " + e.getMessage());
            return false; // Failed to save
        }
    }
}

