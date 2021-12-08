package Mang.BaiTap;

import java.util.Scanner;

public class SumColumnInArray { // Tính tổng các số ở một cột xác định
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = creatArray(scanner);
        System.out.println("Nhap vao cot muon tinh tong: ");
        int column = scanner.nextInt();
        int sum = sumColumn(array, column);
        System.out.println("Tong cac phan tu trong cot la: " + sum);
    }

    public static int sumColumn(int[][] array, int column) {
        int sum = 0;
        for (int[] e : array) {
            if (column < e.length) {
                sum += e[column - 1];
            }
        }
        return sum;
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
                System.out.println("Nhap vao phan tu thu " + (j + 1) + " cua phan tu thu " + (i + 1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}
