package thuchanh1;
//Bài 5: Hiểu tổng quan lớp File:
//
//Lớp File được kế thừa từ lớp nào?
//Lớp File được kế thừa từ lớp Object, là lớp gốc của mọi lớp trong Java.
//
//Lớp File được thực thi từ interface nào?
//Lớp File thực thi từ các interface Serializable và Comparable<File>.

//Bài 6: Hiểu về mục đích chung của lớp File là gì?
//
//Lớp File trong Java đại diện cho một đường dẫn (path) trỏ đến một file hoặc thư mục trong hệ thống file.
// Lớp này không chỉ cung cấp cách để kiểm tra các thuộc tính của file như tên, độ dài,
// quyền truy cập mà còn cung cấp các phương thức để tạo, xóa, và thao tác với file hoặc thư mục.

//Bài 7: Lớp File gồm có mấy phương thức khởi tạo?
//
//Lớp File có bốn phương thức khởi tạo (constructor):
//
//1. File(String pathname)
//
//2. Mục đích: Khởi tạo một đối tượng File đại diện cho đường dẫn được chỉ định bởi chuỗi pathname.
//Tham số đầu vào: pathname là một chuỗi chỉ định đường dẫn của file hoặc thư mục.
//File(String parent, String child)
//
//3. Mục đích: Khởi tạo một đối tượng File dựa trên chuỗi đường dẫn cha và tên con (file hoặc thư mục) được cung cấp.
//Tham số đầu vào: parent là chuỗi đường dẫn cha, child là chuỗi tên của file hoặc thư mục con.
//File(File parent, String child)
//
//4. Mục đích: Khởi tạo một đối tượng File dựa trên một đối tượng File đại diện cho đường dẫn cha và tên con (file hoặc thư mục) được cung cấp.
//Tham số đầu vào: parent là đối tượng File đại diện cho đường dẫn cha, child là chuỗi tên của file hoặc thư mục con.
//File(URI uri)
//
//5. Mục đích: Khởi tạo một đối tượng File dựa trên đối tượng URI.
//Tham số đầu vào: uri là đối tượng URI đại diện cho đường dẫn.

//Bài 8: Phân tích một số các phương thức thường dùng của lớp File
//
//Phân tích hai phương thức getName() và getPath():
//
//Phương thức getName()
//
//Mục đích: Lấy tên của file hoặc thư mục mà đối tượng File đại diện.
//Tên phương thức: getName()
//Tham số đầu vào: Không có.
//Giá trị trả về: Chuỗi tên của file hoặc thư mục.
//Phương thức getPath()
//
//Mục đích: Lấy đường dẫn của file hoặc thư mục mà đối tượng File đại diện dưới dạng chuỗi.
//Tên phương thức: getPath()
//Tham số đầu vào: Không có.
//Giá trị trả về: Chuỗi đường dẫn của file hoặc thư mục.

//Bài 9: Tạo đối tượng file bằng cách sử dụng phương thức khởi tạo có 1 tham số là tên file:
//
//File file = new File("example.txt");

//Bước 10: Sử dụng phương thức getName() và getPath() của đối tượng vừa tạo trên
//
//String name = file.getName();
//String path = file.getPath();
//
//System.out.println("Tên file: " + name);
//System.out.println("Đường dẫn file: " + path);
//
//Khi chạy đoạn code trên, bạn sẽ thấy tên và đường dẫn của file example.txt được in ra màn hình.