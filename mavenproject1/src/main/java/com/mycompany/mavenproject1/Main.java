/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
// Sử dụng thư viện bằng cú pháp import + tên thư viện
// Thư viện Scanner cho phép nhận giá trị input
import java.util.Scanner;
/**
 * @author trant
 */
public class Main {
/* Get input and  */
    public static void main(String[] args) {
        // Message
        // Khởi tạo 1 đối tượng Scanner có tên là input. System.in là tham số đầu vào mặc định (Bàn phím)
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập độ C: ");
        // Khởi tạo giá trị nhập vào kiểu int
        // float number = input.nextFloat() - Kiểu dữ liệu float
        // long number = input.nextLong() - Kiểu dữ liệu long
        // boolean number = input.nextBoolean() - Kiểu dữ liệu long
        // String name = input.nextLine() - Kiểu dữ liệu string
        /* String name = input.next() - Kiểu dữ liệu string 
        Đọc tới ký tự khoảng trắng thì dừng, in ra màn hình. Ví dụ tran van tien -> kết quả trả về của name là tran */
        double number = input.nextInt();
//        // In ra kết quả vừa nhập
//        System.out.println("Your input number is: " + number);
        /*
        Bài tập 1:
        - Xem ví dụ về cách nhập dữ liệu từ bàn phím trong file Main.java
        - Viết chương trình nhập vào độ C, sau đó in ra kết quả là độ F
        - Công thức chuyển: độ F = ( 1.8 * độ C ) + 32
        - Ví dụ: Hãy nhập độ C: 37
        - Kết quả mong muốn (In ra màn hình): 37 độ C tương ứng với 98.6 độ F
        */
        double fDegree = (1.8 * number) + 32;
        System.out.println( number + " độ C tương ứng với " + String.format("%.2f", fDegree) + " độ F");
        // Tương tự cho các bài tập tiếp theo

        /* Bài tập 2: Viết chương trình cho phép nhập vào phút, và in ra màn hình năm và ngày
        - Ví dụ: Hãy nhập số phút: 1440
        - Kết quả mong muốn: 1440 phút tương đương với 0 năm 1 ngày
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập số phút: ");
        int minutes = scanner.nextInt();

        int minutesInYear = 60 * 24 * 365;
        int minutesInDay = 60 * 24;

        int years = minutes / minutesInYear;
        // Hãy phân biệt giữa / và %. Kết quả trả về của mỗi toán tử là gì?
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " phút tưởng đương với " + years + " năm và " + days + " ngày.");

        /* Bài tập 3: Viết chương trình tính toán chỉ số cơ thể BMI, với các giá trị nhập vào là height (inches) và weight (pounds)
        Kết quả trả về là chỉ số BMI
        - Ví dụ: Your height (inches): 72
             Your weight (pounds): 160
             - Kết quả mong muốn: Your BMI is 21.7
         */

        /* Lưu ý: Biến không nên đặt tên theo kiểu viết hoa, có thể đặt theo quy tắc:
        - 1: camelCase: viết thường chữ đầu, các chữ tiếp theo viết hoa. Ví dụ: yourNumber
        - 2: viết thường, kèm theo dấu _. Ví dụ your_number
        Biến Scanner được con khai báo nhưng không sử dụng. Biến này chú chưa thấy có tác dụng gì cả.
        */
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Chiều cao của bạn (inches): ");
        // Tại sao lại sử dụng Double mà không phải Float hoặc các kiểu dữ liệu khác?
        double heightInInches = scanner.nextDouble();

        System.out.print("Cân nặng của bạn (pounds): ");
        double weightInPounds = scanner.nextDouble();
        // Tại sao cần chuyển đổi thành đơn vị mét và kg trong khi giá trị nhập vào là pound và inch
        double heightInMeters = heightInInches * 0.0254;
        double weightInKilograms = weightInPounds * 0.453592;

        // Chúng ta có công thức tính theo pound và inch, con hãy áp dụng công thức này
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        double roundedBMI = Math.round(bmi * 10.0) / 10.0;

        System.out.println("Chỉ số BMI của bạn là " + roundedBMI);


    }
}
