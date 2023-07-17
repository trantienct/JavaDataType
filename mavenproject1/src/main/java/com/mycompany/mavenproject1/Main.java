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
        Scanner input = new Scanner(System.in);
       /*
       Vòng lặp do while
       - Sự khác biệt giữa do while và while
       + While: Kiểm tra điều kiện thỏa mãn thì mới bắt đầu thực hiện các khối bên trong vòng lặp
       + Do while: Thực hiện các khối trước 1 lần rồi mới kiểm tra tới điều kiện
       + Về cơ  bản, while có thể có hoặc ko thực hiện lần lặp nào, trong khi do while sẽ thực hiện vòng lặp ít nhất 1 lần.
       Cú pháp:
       do{
            //execute some codes
       }while (condition)
        */
//        whileExample(); // Nothing is print
//        doWhileExample(); // Print 10 then end
//        int number = input.nextInt();
//        // In ra kết quả vừa nhập
//        System.out.println("Your input number is: " + number);
    }

    //While
    static void whileExample(){
        int i = 10;
        while (i > 10){
            System.out.println(i);
            i--;
        }
    }
    static void doWhileExample(){
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while (i > 10);
    }
    /* Thao tác màn hình
    Type your name: Bao
    Your name is not correct. Do you want to try again - Y/N? Y
    Type your name: Chuong
    Welcome back, Chuong
     */
    static void doWhileWithInput(){
        char choice;
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            System.out.print("Type your name: ");
            input = scanner.next();
            if(input.equals("Chuong")){
                System.out.println("Welcome back, " + input);
                choice = 'N';
            }
            else {
                System.out.print("Your name is not correct. Do you want to try again - Y/N? ");
                choice = scanner.next().charAt(0);
            }
        }while (choice == 'Y');
    }

    static void whileWithInput(){
        char choice = 'Y';
        Scanner scanner = new Scanner(System.in);
        String input;
        while (choice == 'Y'){
            System.out.print("Type your name: ");
            input = scanner.next();
            if(input.equals("Chuong")){
                System.out.println("Welcome back, " + input);
                choice = 'N';
            }
            else {
                System.out.print("Your name is not correct. Do you want to try again - Y/N? ");
                choice = scanner.next().charAt(0);
            }
        }
    }
}
