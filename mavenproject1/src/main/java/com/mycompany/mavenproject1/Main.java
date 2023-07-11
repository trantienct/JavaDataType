/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
// Sử dụng thư viện bằng cú pháp import + tên thư viện
// Thư viện Scanner cho phép nhận giá trị input
import java.util.Scanner;
/**
 *
 * @author trant
 */
public class Main {
/* Get input and  */
    public static void main(String[] args) {
        // Khởi tạo 1 đối tượng Scanner có tên là input. System.in là tham số đầu vào mặc định (Bàn phím)
        Scanner input = new Scanner(System.in);
        System.out.println("Your number: ");
        // Khởi tạo giá trị nhập vào kiểu int
        // float number = input.nextFloat() - Kiểu dữ liệu float
        // long number = input.nextLong() - Kiểu dữ liệu long
        // boolean number = input.nextBoolean() - Kiểu dữ liệu long
        // String name = input.nextLine() - Kiểu dữ liệu string
        /* String name = input.next() - Kiểu dữ liệu string 
        Đọc tới ký tự khoảng trắng thì dừng, in ra màn hình. Ví dụ tran van tien -> kết quả trả về của name là tran */
        int number = input.nextInt();
        // In ra kết quả vừa nhập
        System.out.println("Your input number is: " + number);
    }
}
