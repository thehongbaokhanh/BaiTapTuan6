package BaiTap7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountryList {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\theho\\IdeaProjects\\tuan6\\src\\BaiTap7\\SCV.txt"; // Đường dẫn đến file CSV

        Set<String> countries = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Tách các giá trị trong dòng
                String[] values = line.split(",");
                if (values.length >= 6) {
                    // Lấy quốc gia từ cột cuối cùng và loại bỏ dấu ngoặc kép
                    String country = values[5].replaceAll("\"", "").trim();
                    countries.add(country);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Hiển thị danh sách các quốc gia
        System.out.println("List of countries:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}

