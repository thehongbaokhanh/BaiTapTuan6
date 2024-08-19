package thuchanh2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        thuchanh readfileEx = new thuchanh();
        readfileEx.readFileText(path);
    }
}
