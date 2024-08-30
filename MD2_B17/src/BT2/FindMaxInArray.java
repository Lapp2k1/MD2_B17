package BT2;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();


        int[] array = new int[size];


        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        try {

            int maxValue = findMax(array);

            System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }


    public static int findMax(int[] array) throws Exception {
        if (array.length == 0) {

            throw new Exception("Lỗi: Mảng rỗng, không thể tìm số lớn nhất.");
        }


        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
