package BaiTap2;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class thuchanh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Nhập vào đường dẫn của file
        System.out.print("Nhập vào đường dẫn của file: ");
        String filePath = input.nextLine();

        // Bước 2: Đọc dữ liệu từ file và hiển thị ra màn hình
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }

        input.close();
    }
}