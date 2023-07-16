/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/*
 *
 * @author trant
 */


public class Exercise {
    // Commit Message: Bài tập về các toán tử, vòng lặp và điều kiện
   /*

   Bài tập 17: Định nghĩa 1 method để tính tổng các số từ số nhập vào bàn phím
   - Ví dụ: Nhập vào 1 số: 12345
   - Kết quả mong muốn: Tổng của số đó là 15;
   - Định nghĩa 1 method static int sumDigitNumber(int number)
   - Trong method main,
   + Sử dụng scanner để nhập 1 giá trị từ bàn phím
   + Đưa giá trị vào method sumDigitNumber
   + Lấy kết quả trả về và in ra màn hình
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào một số: ");
        int number = scanner.nextInt();
        int sum = sumDigitNumber(number);
        System.out.println("Tổng của số đó là: " + sum);
    }

    public static int sumDigitNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
