/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author trant
 */
import java.util.Scanner;
public class Exercise {
    // Commit Message: Giải bài tập 4,5,6 về [kiểu dữ liệu - DataType] int, char, double, float
    /*
    * Bài tập 4: Viết chương trình, cho phép người dùng nhập vào 3 ký tự, sau đó hiển thị đảo ngược các ký tự
    * Ví dụ: Nhập ký tự: A
    * Nhập ký tự: B
    * Nhập ký tự: C
    * Hiển thị ra màn hình: C B A
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bài tập 4");

        System.out.print("Nhập ký tự: ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Nhập ký tự: ");
        char char2 = scanner.next().charAt(0);

        System.out.print("Nhập ký tự: ");
        char char3 = scanner.next().charAt(0);

        System.out.print("Hiển thị ra màn hình: ");
        System.out.println(char3 + " " + char2 + " " + char1);

    /*
    Bài tập 5:
    Viết chương trình cho phép người dùng nhập vào 2 giá trị số, và hiển thị các nội dung sau:
    - Tổng của 2 số
    - Hiệu của 2 số
    - Tích của 2 số
    - Giá trị trung bình của 2 số
    - Số lớn nhất trong 2 số
    - Số nhỏ nhất trong 2 số
     */
        System.out.println("Bài tập 5");

        System.out.print("Hãy nhập số đầu tiên: ");
        double num1 = scanner.nextDouble();

        System.out.print("Hãy nhập số tiếp theo: ");
        double num2 = scanner.nextDouble();

        // Sum of 2 numbers
        double sum = num1 + num2;
        System.out.println("Tổng: " + sum);

        // Difference of 2 numbers
        double difference = num1 - num2;
        System.out.println("Hiệu: " + difference);

        // Product of 2 numbers
        double product = num1 * num2;
        System.out.println("Tích: " + product);

        // Average value of 2 numbers
        double average = (num1 + num2) / 2;
        System.out.println("Giá trị trung bình: " + average);

        // Largest of 2 numbers
        double largest = Math.max(num1, num2);
        System.out.println("Số lớn nhất: " + largest);

        // Smallest of 2 numbers
        double smallest = Math.min(num1, num2);
        System.out.println("Số nhỏ nhất: " + smallest);
    /*
    Bài tập 6: Viết chương trình cho phép người dùng nhập vào 1 số, và in ra từng ký tự của số đó
    - Ví dụ: Hãy nhập vào 1 số: 123456
    - Kết quả mong muốn: 1 2 3 4 5 6
     */

        System.out.println("Bài tập 6");
        Scanner input_1 = new Scanner(System.in);


        System.out.print("Hãy nhập vào 1 số: ");
        String number_1 = input_1.nextLine();

        System.out.print("Kết quả: ");
        for (int i = 0; i < number_1.length(); i++) {
            System.out.print(number_1.charAt(i) + " ");
        }
    }
}
