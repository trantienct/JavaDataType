/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/*
 *
 * @author trant
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise {
    // Commit Message: Bài tập về các toán tử, vòng lặp và điều kiện
    /*
    * Bài tập 7: Viết chương trình hoán đổi giá trị 2 biến số, yêu cầu không sử dụng biến thứ 3
    * Ví dụ: Tạo 2 biến a, b
    * a = 15
    * b = 20
    * Hiển thị ra màn hình:
    * Giá trị trước khi hoán đổi của biến a là 15, biến b là 20
    * Giá trị sau khi hoán đổi của biến a là 20, biến b là 15
    * */

    public static void main(String[] args) {
        System.out.println("Bài tập 7");

        int a = 15;
        int b = 20;

        System.out.println("Giá trị trước khi hoán đổi của biến a là " + a + ", biến b là " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Giá trị sau khi hoán đổi của biến a là " + a + ", biến b là " + b);

    /*
    Bài tập 8:
    Viết chương trình lấy ngày hiện tại, sau đó hiển thị theo các định dạng:
    - DD/MM/YYYY : 14/07/2023
    - YYYY-MM-DD : 2023-07-14
    - E, dd MMM yyyy HH:mm:ss : Fri, 14 Jul 2023 09:00:00
     */
        System.out.println("Bài tập 8");

        Date currentDate = new Date(); //Get current Date

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy"); // DD/MM/YYYY
        String formattedDate1 = format1.format(currentDate);
        System.out.println("DD/MM/YYYY: " + formattedDate1);


        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); // YYYY-MM-DD
        String formattedDate2 = format2.format(currentDate);
        System.out.println("Formatted date (YYYY-MM-DD): " + formattedDate2);


        SimpleDateFormat format3 = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss"); // E, dd MMM yyyy HH:mm:ss
        String formattedDate3 = format3.format(currentDate);
        System.out.println("Formatted date (E, dd MMM yyyy HH:mm:ss): " + formattedDate3);

    /*
    Bài tập 9: Viết chương trình kiểm tra số nhập vào là số chẵn hay số lẻ
    - Ví dụ: Hãy nhập vào 1 số: 10
    - Kết quả mong muốn: Số 10 là số chẵn
     */
        System.out.println("Bài tập 9");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào 1 số: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }
    /*
    Bài tập 10: Viết chương trình in ra các số lẻ từ số 0 đến số nhập vào từ bàn phím
    - Ví dụ: Hãy nhập vào 1 số: 6
    - Kết quả mong muốn:
    Các số lẻ từ 0 đến 6 là:
    1
    3
    5
     */
            System.out.println("Bài tập 10");

            System.out.print("Hãy nhập vào 1 số: ");
            int limit = scanner.nextInt();
            System.out.println("Các số lẻ từ 0 đến " + limit + " là:");
            for (int i = 1; i <= limit; i += 2) {
                System.out.println(i);
            }


    /*
    Bài tập 11: Viết chương trình nhập vào 1 số (kiểu double) và in ra giá trị trên màn hình theo các trường hợp:
    - In ra Zero nếu nhập vào số 0
    - Nếu số lớn hơn 0, thì in ra số dương
    - Nếu số nhỏ hơn 0, thì in ra số âm
    - Bỏ qua dấu, nếu nhỏ hơn 1 thì thêm vào chữ Nhỏ, lớn hơn 1 triệu thì thêm vào chữ Lớn
    Ví dụ: Nhập vào 1 số: 1000000.5
    - Kết quả mong muốn: Số 1000000.5 là số dương lớn
    - Nhập vào 1 số: -0.4
    - Kết quả mong muốn: Số -0.4 là số âm nhỏ
     */
            System.out.println("Bài tập 11");
            System.out.print("Hãy nhập 1 số: ");
            double inputNumber = scanner.nextDouble();
            String numberInfo;
            if (inputNumber == 0) {
                numberInfo = "0";
            } else if (inputNumber > 0) {
                numberInfo = "số dương";
            } else {
                numberInfo = "số âm";
            }
            if (Math.abs(inputNumber) < 1) {
                numberInfo += " nhỏ";
            } else if (Math.abs(inputNumber) > 1000000) {
                numberInfo += " lớn";
            }
            System.out.println("Số " + inputNumber + " là " + numberInfo + ".");

    /*
    Bài tập 12:
    In ra 1 tháp các chữ số theo số hàng nhập vào từ bàn phím. Mỗi số sẽ cách nhau 1 đơn vị. Giải thích cách in ra kết quả
    Ví dụ: Nhập vào số hàng: 5
    Kết quả mong muốn:
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */

        System.out.println("Bài tập 12");
        System.out.print("Nhập vào số hàng: ");
        int rows = scanner.nextInt();
        int currentNumber = 1;
        for (int i = 1; i <= rows; i++) {
            // Vòng lặp bên ngoài lặp qua các hàng của tháp, bắt đầu từ 1 và đi lên giá trị hàng
             for (int j = 1; j <= i; j++) {
                 //vòng lặp bên trong lặp qua các cột trong mỗi hàng. Số cột trong mỗi hàng bằng số hàng (i)
                System.out.print(currentNumber + " ");
                //in số hiện tại theo sau là khoảng trắng
                currentNumber++;
                //Sau khi in số, tăng số hiện tại lên 1
            }
            System.out.println();
        }

    /*
    Bài tập 13:
    In ra 1 kim tự tháp theo số hàng nhập vào từ bàn phím. Mỗi số sẽ cách nhau 1 đơn vị. Giải thích cách in ra kết quả
    Ví dụ: Nhập vào số hàng: 4
    Kết quả mong muốn:
          1
         2 2
        3 3 3
       4 4 4 4
     */

        System.out.println("Bài tập 13");
        System.out.print("Nhập vào số hàng: ");
        int pyramidRows = scanner.nextInt();
        for (int i = 1; i <= pyramidRows; i++) {
            //một vòng lặp bên ngoài lặp qua các hàng của kim tự tháp, bắt đầu từ 1 và đi lên giá trị của kim tự tháp
            //Bên trong vòng lặp bên ngoài có hai vòng lặp bên trong.
            // Vòng lặp bên trong đầu tiên chịu trách nhiệm in các khoảng trắng trước các số, tạo ra hình dạng kim tự tháp được căn trái.
            for (int j = 1; j <= pyramidRows - i; j++) {
                System.out.print(" ");
            }
            //Vòng lặp này chịu trách nhiệm in các số. Nó lặp từ 1 cho đến số hàng hiện tại là (i)
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
