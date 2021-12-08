package Mang.BaiTap;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = creatArray(scanner);

        int index;
        do {
            System.out.println("Nhap vao vi tri muon them: ");
            index = scanner.nextInt();
            if (index < 0 || index > array.length - 1) {
                System.out.println("Vi tri khong nam trong mang, moi nhap lai!!!");
            }
        } while (index < 0 || index > array.length - 1);
        System.out.println("Nhap gia tri phan tu muon them: ");
        int element = scanner.nextInt();

        array = addElement(array, index, element);
        System.out.println("Cac phan tu cua mang la: ");
        for (int e : array) {
            System.out.println(e);
        }
    }

    public static int[] addElement(int[] array, int index, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i - 1];
            }
        }
        newArray[index] = element;
        return newArray;
    }

    public static int[] creatArray(Scanner scanner) {
        System.out.println("Nhap vao do dai mang: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap vao phan tu thu: " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
