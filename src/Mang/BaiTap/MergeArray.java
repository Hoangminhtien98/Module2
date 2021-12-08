package Mang.BaiTap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tao mang 1: ");
        int[] array1 = creatArray(scanner);
        System.out.println("Tao mang 2: ");
        int[] array2 = creatArray(scanner);
        int[] array3 = new int[(array1.length + array2.length)];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        System.out.println("Cac phan tu cua mang la: ");
        for (int e : array3) {
            System.out.println(e);
        }
    }

    public static int[] creatArray(Scanner scanner) {
        System.out.println("Nhap vao do dai mang: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
