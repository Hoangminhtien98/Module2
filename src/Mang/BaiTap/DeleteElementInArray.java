package Mang.BaiTap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);
        System.out.println("Nhap gia tri muon xoa: ");
        int element = scanner.nextInt();
        deleteElement(array, element);
        System.out.println("Cac phan tu cua mang la: ");
        for (int e : array){
            System.out.println(e);
        }
    }

    public static void deleteElement(int[] array, int element) {
        while (checkElement(element, array) != -1) {
            int index = checkElement(element, array);
            for (int i = index; i < array.length; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
        }
    }
    public static int[] createArray(Scanner scanner) {
        System.out.println("Nhap vao do dai cua mang: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int checkElement(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
