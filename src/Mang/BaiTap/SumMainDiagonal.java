package Mang.BaiTap;

import java.util.Scanner;

public class SumMainDiagonal { // Mảng 2 chiều - tính tổng các số ở dường chéo chính của ma trận vuông
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = creatArray(scanner);
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i][i];
        }
        System.out.println("Tổng đường chéo chính ma trận vuông là: " + sum);
    }
    public static int[][] creatArray(Scanner scanner) {
        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ " + (j + 1) + " của phần tử thứ " + (i + 1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}
