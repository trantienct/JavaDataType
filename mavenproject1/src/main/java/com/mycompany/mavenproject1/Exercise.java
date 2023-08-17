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
    // Commit Message: Bài tập về vòng lặp, string
   /*
   Bài tập 1: Write a method to calculate factorial of number
   Ví dụ: 5! = 1 * 2 * 3 * 4 * 5 = 120
   Input: Type your number: 10
   Output: Factorial of 10 is: 3628800
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number: ");
        int number = scanner.nextInt();
        scanner.close();

        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /*
    Bài tập 2: Write a method that returns the nth element of the Fibonacci Sequence
    Fibonacci: F(n)=F(n–1)+F(n–2)
    Ví dụ: Dãy Fibonacci có cấu trúc như sau 0 1 1 2 3 5 8 13; tức là số thứ 1 + số thứ 2 = số thứ 3; số thứ 2 + số thứ 3 = số thứ 4 ....
    Input: Fibonacci - number of elements: 10
    Output: Your Fibonacci with 10 elements: 0 1 1 2 3 5 8 13 21 34
     */
    public class Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Fibonacci - number of elements: ");
            int n = scanner.nextInt();
            scanner.close();

            System.out.print("Your Fibonacci with " + n + " elements: ");
            for (int i = 0; i < n; i++) {
                System.out.print(calculateFibonacci(i) + " ");
            }
        }

        public static int calculateFibonacci(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
            }
        }
    }

    /*
    Bài tập 3: Calculate Simple Interest and Compounding Interest by year, month
    Compound Interest = P(1 + R/100)^t
    P is principal amount, R is the rate and T is the time span (year); ^ for power: 2^2 = 2*2 = 4; 2^3 = 2*2*2 = 8
     */
    public class InterestCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Rate of interest (%): ");
            double rate = scanner.nextDouble();

            System.out.print("Time span (years): ");
            double years = scanner.nextDouble();

            scanner.close();

            double simpleInterest = principal * rate * years / 100;
            double compoundInterest = principal * (Math.pow(1 + rate / 100, years)) - principal;

            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
        }
    }
    /*
    Bài tập 4: Write a program that prompts user for an integer between 0-5 or 45-50.
    The program  will repeat until the user enters a valid input.
    Input:
    Enter the number between 0-5 or 45-50: 10
    Invalid number, try again...
    Enter the number between 0-5 or 45-50: 20
    Invalid number, try again...
    Enter the number between 0-5 or 45-50: 3
    You entered: 3
    Exit
     */
    public class NumberValidator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int input;
            boolean isValid = false;

            while (!isValid) {
                System.out.print("Enter the number between 0-5 or 45-50: ");
                input = scanner.nextInt();

                if ((input >= 0 && input <= 5) || (input >= 45 && input <= 50)) {
                    isValid = true;
                    System.out.println("You entered: " + input);
                } else {
                    System.out.println("Invalid number, try again...");
                }
            }

            System.out.println("Exit");
            scanner.close();
        }
    }
    /*
    Bài tập 5: Create a matrix table
    Input: Enter size: 5
    Output:
     * |   1   2   3   4   5
    ------------------------
     1 |   1   2   3   4   5
     2 |   2   4   6   8  10
     3 |   3   6   9  12  15
     4 |   4   8  12  16  20
     5 |   5  10  15  20  25
     */
    public class SimpleMatrixTable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter size: ");
            int size = scanner.nextInt();

            System.out.println("   * |" + " ".repeat(4) + "12345");
            System.out.println("-----" + "-".repeat(20));

            for (int i = 1; i <= size; i++) {
                System.out.printf("%4d |", i);
                for (int j = 1; j <= size; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }

            scanner.close();
        }
    }
    /*
    Bài tập 6: Caesar Cipher
    The Caesar cipher is a simple encryption technique that was used by Julius Caesar to send secret messages to his allies.
    It works by shifting the letters in the plaintext message by a certain number of positions, known as the "shift" or "key".
    Promt user to type a string (mix-case letters) and return Caesar Cipher in uppercase
    Input: Type your string: HeLLo
    Assume key = 3 (Fixed in code)
    Caesar Cipher: KHOOR
     */
    public class ExtraEasyCaesarCipher {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type your string: ");
            String input = scanner.nextLine();
            scanner.close();

            String cipherText = encrypt(input);
            System.out.println("Caesar Cipher: " + cipherText);
        }

        public static String encrypt(String text) {
            StringBuilder result = new StringBuilder();

            for (char character : text.toCharArray()) {
                if (Character.isLetter(character)) {
                    character += 3;
                    if (character > 'Z' && character < 'a' || character > 'z') {
                        character -= 26;
                    }
                }
                result.append(character);
            }

            return result.toString();
        }
    }
    /*
    Bài tập 7: Caesar Decipher
    Input: Type your string: KHooR
    Assume key = 3 (Fixed in code)
    Caesar Decipher: HELLO
     */
    public class SimplestCaesarDecipher {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Type your string: ");
            String input = scanner.nextLine();

            int key = 3; // Fixed key

            String plainText = decrypt(input);
            System.out.println("Caesar Decipher: " + plainText);

            scanner.close();
        }

        public static String decrypt(String text) {
            StringBuilder result = new StringBuilder();

            for (char character : text.toCharArray()) {
                if (Character.isLetter(character)) {
                    character -= 3;
                    if (character < 'A' && character > 'Z' || character < 'a') {
                        character += 26;
                    }
                }
                result.append(character);
            }

            return result.toString();
        }
    }
    /*
    Bài tập 8: Double char
    Input: hello
    Output: hheelllloo
     */
    public class DoubleChar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input: ");
            String input = scanner.nextLine();

            String doubledString = doubleCharacters(input);
            System.out.println("Output: " + doubledString);

            scanner.close();
        }

        public static String doubleCharacters(String text) {
            StringBuilder result = new StringBuilder();

            for (char character : text.toCharArray()) {
                result.append(character).append(character);
            }

            return result.toString();
        }
    }
    /*
    Bài tập 9:  Count the occurrences of a string (case sensitive).
    Input: Input first string: Hello World
    Input string to check: orld
    Output: 'Hello World' contains 'orl'
     */
    public class SimpleStringOccurrences {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first string: ");
            String inputString = scanner.nextLine();

            System.out.print("Input string to check: ");
            String searchString = scanner.nextLine();

            int occurrences = countOccurrences(inputString, searchString);
            System.out.println("'" + inputString + "' contains '" + searchString + "' " + occurrences + " times.");

            scanner.close();
        }

        public static int countOccurrences(String text, String searchString) {
            return text.split(searchString, -1).length - 1;
        }
    }
}
