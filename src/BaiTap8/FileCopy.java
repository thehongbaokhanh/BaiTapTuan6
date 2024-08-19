package BaiTap8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn tập tin nguồn và tập tin đích
        System.out.print("Enter source file path: ");
        String sourceFilePath = scanner.nextLine();
        System.out.print("Enter target file path: ");
        String targetFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);
        File targetFile = new File(targetFilePath);

        // Kiểm tra tập tin nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // Kiểm tra tập tin đích đã tồn tại chưa
        if (targetFile.exists()) {
            System.out.println("Target file already exists.");
            return;
        }

        // Sao chép nội dung từ tập tin nguồn vào tập tin đích
        try (FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(targetFile)) {

            int character;
            int charCount = 0;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                charCount++;
            }

            // Hiển thị số ký tự trong tập tin đích
            System.out.println("File copied successfully.");
            System.out.println("Number of characters in target file: " + charCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
