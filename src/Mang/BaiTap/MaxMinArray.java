package Mang.BaiTap;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = creatArray(scanner);
        System.out.println("Phan tu co gia tri lon nhat la: " + maxElement(array)[0] + ", co vi tri la : " + maxElement(array)[1]);
        System.out.println("Phan tu co gia tri nho nhat la: " + minElement(array)[0] + ", co vi tri la: " + minElement(array)[1]);

    }
    public static int[] maxElement(int[] array){
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }

    public static int[] minElement(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return new int[]{min, index};
    }

    public static int[] creatArray(Scanner scanner) {
        System.out.println("Nhap vao do dai mang: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ":");
        }
        return array;
    }
}
