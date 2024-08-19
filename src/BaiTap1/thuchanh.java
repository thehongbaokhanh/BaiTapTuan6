package BaiTap1;

// bài 1:
// https://docs.oracle.com/javase/8/docs/api/

// bài 2:
//Lớp FileReader kế thừa trực tiếp từ lớp InputStreamReader, và gián tiếp từ lớp Reader.

//bài 3:
//Lớp FileReader thực thi các interface Closeable, AutoCloseable, và Readable
// thông qua lớp cha InputStreamReader.

//bài 4:
//Lớp FileReader được sử dụng để đọc dữ liệu ký tự từ các file,chủ yếu là các file văn bản (text file).
//Nó là một cách đơn giản để đọc các ký tự từ file trong hệ thống,
// đặc biệt hữu ích khi bạn muốn đọc các file chứa nội dung dưới dạng chuỗi ký tự.

//bài 5:
//Lớp FileReader có ba phương thức khởi tạo:
//
//FileReader(String fileName)
//
//Mục đích: Khởi tạo đối tượng FileReader để đọc dữ liệu từ file được chỉ định bởi đường dẫn fileName.
//Tham số đầu vào:
//fileName: Đường dẫn của file cần đọc (dưới dạng chuỗi).
//FileReader(File file)
//
//Mục đích: Khởi tạo đối tượng FileReader để đọc dữ liệu từ file đại diện bởi đối tượng File.
//Tham số đầu vào:
//file: Đối tượng File đại diện cho file cần đọc.
//FileReader(FileDescriptor fd)
//
//Mục đích: Khởi tạo đối tượng FileReader để đọc dữ liệu từ file được chỉ định bởi FileDescriptor.
//Tham số đầu vào:
//fd: Đối tượng FileDescriptor đại diện cho mô tả file.

//bài 6:
//Một số phương thức thường dùng trong lớp FileReader:
//
//int read()
//
//Mục đích: Đọc một ký tự từ file và trả về mã số nguyên của ký tự đó.
//Tham số đầu vào: Không có.
//Kết quả trả về: Mã số nguyên của ký tự đã đọc hoặc -1 nếu đến cuối file.
//int read(char[] cbuf, int offset, int length)
//
//Mục đích: Đọc một lượng ký tự từ file và lưu trữ vào mảng 'cbuf'
// bắt đầu từ vị trí offset với số lượng ký tự là length.
//
//Tham số đầu vào:
//cbuf: Mảng ký tự để lưu trữ dữ liệu đọc được.
//offset: Vị trí bắt đầu ghi vào mảng 'cbuf'.
//length: Số lượng ký tự cần đọc.
//Kết quả trả về: Số lượng ký tự thực tế đã đọc hoặc -1 nếu đến cuối file.
//void close()'\
//
//Mục đích: Đóng luồng FileReader và giải phóng mọi tài nguyên liên quan.
//Tham số đầu vào: Không có.
//Kết quả trả về: Không có.

//bài 7:
// Tạo đối tượng FileReader sử dụng một trong các phương thức khởi tạo ở trên:
// FileReader fileReader = new FileReader("example.txt");

//bài 8:
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FileReaderExample {
//    public static void main(String[] args) {
//        try {
//            FileReader fileReader = new FileReader("example.txt");
//            int character;
//
//            while ((character = fileReader.read()) != -1) {
//                System.out.print((char) character);
//            }
//
//            fileReader.close();
//        } catch (IOException e) {
//            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
//        }
//    }
//}