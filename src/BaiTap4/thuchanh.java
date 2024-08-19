package BaiTap4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class thuchanh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Nhập đường dẫn và tên file muốn tạo
        System.out.print("Nhập vào đường dẫn và tên file muốn tạo: ");
        String filePath = input.nextLine();

        // Bước 2: Tạo đối tượng File
        File file = new File(filePath);

        try {
            // Bước 3: Kiểm tra xem file có tồn tại hay không
            if (file.exists()) {
                System.out.println("File đã tồn tại.");
            } else {
                // Tạo file mới nếu file không tồn tại
                if (file.createNewFile()) {
                    System.out.println("File mới đã được tạo: " + file.getName());
                } else {
                    System.out.println("Không thể tạo file.");
                }
            }

            // Bước 4: Kiểm tra xem file có phải là thư mục hay không
            if (file.isDirectory()) {
                System.out.println(file.getName() + " là một thư mục.");
            } else {
                System.out.println(file.getName() + " không phải là một thư mục.");
            }

            // Bước 5: Hiển thị đường dẫn của file
            System.out.println("Đường dẫn của file: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}

