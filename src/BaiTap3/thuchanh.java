package BaiTap3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class thuchanh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Nhập đường dẫn của file cần lưu dữ liệu
        System.out.print("Nhập vào đường dẫn của file (bao gồm tên file): ");
        String filePath = input.nextLine();

        // Bước 2: Nhập chuỗi dữ liệu muốn lưu vào file
        System.out.print("Nhập chuỗi dữ liệu bạn muốn lưu vào file: ");
        String data = input.nextLine();

        // Bước 3: Lưu dữ liệu vào file
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(data);
            System.out.println("Dữ liệu đã được lưu thành công vào file " + filePath);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi dữ liệu vào file: " + e.getMessage());
        }
    }
}
