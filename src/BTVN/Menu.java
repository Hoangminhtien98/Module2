package BTVN;

import java.util.Map;
import java.util.Scanner;
import java.util.jar.Manifest;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách: ");
        int size = scanner.nextInt();
        Book[] listBooks = new Book[size];
        int choice = -1;
        do {
            menu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    ManagerBook.createListBooks(scanner, listBooks);
                    break;
                case 2:
                    System.out.println("Tổng giá tất cả sách = " + ManagerBook.totalPriceListBooks(listBooks));
                    break;
                case 3:
                    System.out.println("Danh sách: ");
                    ManagerBook.displayListBook(listBooks);
                    break;
                case 4:
                    ManagerBook.findAnyBook(scanner, listBooks);
                    break;
                case 5:
                    ManagerBook.findAuthorBook(scanner, listBooks);
                    break;
                case 6:
                    System.out.println("Giá trung bình Sách khoa học =" + ManagerBook.avgScienceBooks(listBooks));
                    break;
                case 7:
                    ManagerBook.findAllBookRangePrices(scanner, listBooks);
                    break;
                case 8:
                    ManagerBook.findAllScienceBook(listBooks);
                    break;
                case 9:
                    ManagerBook.findAllNovelBook(listBooks);
                    break;
                case 10:
                    ManagerBook.findAllBookHasSamePrice(scanner, listBooks);
                    break;
                case 11:
                    System.out.println("Sách có giá cao nhất là: ");
                    ManagerBook.findHighestPriceBook(listBooks);
                    break;
                case 12:
                    System.out.println("Sách có giá thấp nhất là: ");
                    ManagerBook.findLowestPriceBook(listBooks);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("Kho quản lí sách");
        System.out.println("---------------------");
    }
}
