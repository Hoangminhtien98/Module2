package Mang.BaiTap;

import java.util.Scanner;

public class MaxMinArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = creatArray(scanner);
        System.out.println("Phan tu co gia tri lon nhat la: " + maxElement(array)[0][0] + ", co vi tri la: " + maxElement(array)[1][0] + "va" + maxElement(array)[1][1]);
        System.out.println("Phan tu co gia tri nho nhat la: " + minElement(array)[0][0] + ", co vi tri la: " + minElement(array)[1][0] + "va" + minElement(array)[1][1]);

    }
    public static int[][] maxElement(int[][] array){
        int[] max = {array[0][0]};
        int[] index = {0, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max[0]) {
                    max[0] = array[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return new int[][]{max, index};
    }

    public static int[][] minElement(int[][] array){
        int[] min = {array[0][0]};
        int[] index = {0, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min[0]) {
                    min[0] = array[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return new int[][]{min, index};
    }

    public static int[][] creatArray(Scanner scanner) {
        System.out.println("Nhap vao do dai mang: ");
        int length = scanner.nextInt();
        int[][] array = new int[length][];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap vao do dai phan tu cua mang: ");
            int lengthE = scanner.nextInt();
            array[i] = new int[lengthE];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap vao phan tu thu " + (j + 1) + " cua phan tu thu" + (i + 1) + ":");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}
