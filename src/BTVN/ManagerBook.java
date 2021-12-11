package BTVN;

import java.time.LocalDate;
import java.util.Scanner;

public class ManagerBook {

    public static void displayListBook(Book[] bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    public static Science createScienceBook(Scanner scanner){
        scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.println("Nhập thể loại: ");
        String category = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        return new Science(name, price, quantity,date, category);
    }
    public static Novel createNovelBook(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên sách : ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền : ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng : ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tác giả : ");
        String author = scanner.nextLine();
        return new Novel(name, price, quantity, date, author);
    }

    public static void createListBooks(Scanner scanner, Book[] lists) {
        for (int i = 0; i < lists.length; i++) {
            System.out.println("Nhập thể loại sách thứ " + (i + 1) + ": ");
            System.out.println("1. Sách khoa học");
            System.out.println("2. Sách tiểu thuyết");
            int type = scanner.nextInt();
            if (type == 1) {
                lists[i] = createScienceBook(scanner);
            } else if (type == 2) {
                lists[i] = createNovelBook(scanner);
            } else {
                System.out.println("Nhập sai!!");
            }
        }
    }
}
