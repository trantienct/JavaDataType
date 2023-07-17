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
    // Commit Message: Bài tập về Method và Loop
   /*
   Bài tập 18: Định nghĩa 1 method để đảo ngược số nhập vào từ bàn phím
   - Ví dụ: Nhập vào 1 số: 12345
   - Kết quả mong muốn: Số đảo ngược của 12345 là 54321
    */

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bài tập 18");
        System.out.print("Nhập vào một số: ");
        int number = scanner.nextInt();
        int reversedNumber = reverseNumber(number); // dùng với biến 'number' để đảo ngược
        System.out.println("Số đảo ngược của " + number + " là " + reversedNumber);
        // Bài 19
        doWhileWithInput();
        whileWithInput();
        // Bài 20
        int passcode = 998877;
        checkPasscode(passcode);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // chia dư cho 10 để lấy từng chữ số cuối cùng của số ban đầu
            reversedNumber = reversedNumber * 10 + digit; // tạo số đảo ngược khi nhân cho 10 và cộng với số vừa lấy
            number /= 10; // cập nhật số ban đầu
        }
        return reversedNumber;
    }


    /*
   Bài tập 19: Xem các ví dụ trong file main.java về các cách sử dụng 2 vòng lặp while và do while
   - Thực hiện từng Method doWhileWithInput và whileWithInput, sau đó cho chú biết
   + Sự khác nhau của 2 method này
     */

    public static void doWhileWithInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Bài tập 19");

        do {
            System.out.print("Nhập vào một giá trị ('exit' để thoát): ");
            input = scanner.nextLine();
            System.out.println("Bạn đã nhập: " + input);
        } while (!input.equals("exit"));
    }

    public static void whileWithInput() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("Nhập vào một giá trị ('exit' để thoát): ");
            input = scanner.nextLine();
            System.out.println("Bạn đã nhập " + input);
        }
    }
    //Vòng lặp while: Điều kiện được kiểm tra trước và nếu ban đầu nó sai, phần thân của vòng lặp sẽ bị bỏ qua.
    //Vòng lặp do-while: Phần thân vòng lặp được thực hiện trước, sau đó điều kiện được kiểm tra.
    // Nó đảm bảo ít nhất một lần thực hiện thân vòng lặp.


    /*
    Bài tập 20: Viết 1 Method cho phép người dùng nhập vào passcode và kiểm tra xem passcode có hợp lệ không
    - Yêu cầu: Passcode là 1 number đã được thiết lập sẵn: int passcode = 998877
    - Người dùng chỉ được nhập tối đa 3 lần, sau lần thứ 4 thì thoát khỏi chương trình. Nếu nhập đúng, in ra màn hình dòng chữ: Welcome back, user!
    - Ví dụ:
    + Please enter your passcode? 123456
    + Wrong passcode. 2 attempts left. Please try again: 134567
    + Wrong passcode. 1 attempts left. Please try again: 456789
    + Wrong passcode. 0 attempts left. Please try again in 10 minutes.
    Exit program
     */



    public static void checkPasscode(int passcode) {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = 3;
        System.out.println("Bài tập 20");

        while (remainingAttempts > 0) {
            System.out.print("Please enter your passcode? ");
            int inputPasscode = scanner.nextInt();

            if (inputPasscode == passcode) {
                System.out.println("Welcome back, user!");
                return;
            } else {
                remainingAttempts--;
                System.out.println("Wrong passcode. " + remainingAttempts + " attempts left. Please try again.");
            }
        }
        System.out.println("Wrong passcode. 0 attempts left. Please try again in 10 minutes.");
        System.out.println("Exit program");
    }
}
