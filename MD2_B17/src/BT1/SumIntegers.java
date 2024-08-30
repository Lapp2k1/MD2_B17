package BT1;

import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 0;
        boolean validInput = false;


        while (!validInput) {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                number1 = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên. Vui lòng thử lại.");
            }
        }

        validInput = false;


        while (!validInput) {
            try {
                System.out.print("Nhập số nguyên thứ hai: ");
                number2 = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên. Vui lòng thử lại.");
            }
        }


        int sum = number1 + number2;


        System.out.println("Tổng của hai số là: " + sum);
    }
}
