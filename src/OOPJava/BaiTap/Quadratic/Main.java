package OOPJava.BaiTap.Quadratic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        int heSoA = scanner.nextInt();
        System.out.println("Nhap he so b: ");
        int heSoB = scanner.nextInt();
        System.out.println("Nhap he so c: ");
        int heSoC = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(heSoA, heSoB, heSoC);
        displayRoot(heSoA, heSoB, heSoC, quadraticEquation);
    }
    public static void displayRoot(int heSoA, int heSoB, int heSoC, QuadraticEquation quadraticEquation) {
        if (heSoA == heSoB && heSoB == heSoC && heSoA == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (heSoA == 0 && heSoB != 0 && heSoC != 0) {
            System.out.println("Nghiem cua phuong trinh la: " + ((-quadraticEquation.getC()) / quadraticEquation.getB()));
        } else if ((heSoA == 0 && heSoB == 0) || quadraticEquation.getDelta() < 0) {
            System.out.println("Phuong tring vo nghiem");
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("Phuong trinh co nghiem kep la: " + quadraticEquation.getRoot());
        } else {
            System.out.println("Phuong trinh co 2 nghiem la: " + quadraticEquation.getRoot1() + "; " + quadraticEquation.getRoot2());
        }
    }
}

