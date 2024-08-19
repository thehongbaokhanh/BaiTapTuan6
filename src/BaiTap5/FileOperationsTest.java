package BaiTap5;

import java.util.Scanner;

public class FileOperationsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập đường dẫn file để đọc dữ liệu
        System.out.print("Nhập đường dẫn của file cần đọc: ");
        String filePath = input.nextLine();

        // Đọc và hiển thị nội dung của file
        String fileContent = FileOperations.readFile(filePath);
        System.out.println("Nội dung của file:");
        System.out.println(fileContent);

        // Nhập dữ liệu để ghi vào file
        System.out.print("Nhập dữ liệu cần ghi vào file: ");
        String dataToWrite = input.nextLine();

        // Ghi dữ liệu vào file
        boolean isWritten = FileOperations.writeFile(filePath, dataToWrite);
        if (isWritten) {
            System.out.println("Dữ liệu đã được ghi thành công.");
        } else {
            System.out.println("Ghi dữ liệu không thành công.");
        }
    }
}
