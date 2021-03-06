package BTVN;

import java.time.LocalDate;
import java.util.Scanner;

public class ManagerBook {

    public static void displayListBook(Book[] bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    public static Science createScienceBook(Scanner scanner) {
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
        return new Science(name, price, quantity, date, category);
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
    public static double totalPriceListBooks(Book[] lists) {
        double totalPrice = 0;
        for (Book b : lists) {
            totalPrice += b.getPrice() * b.getQuantity();
        }
        return totalPrice;
    }

    public static void findHighestPriceBook(Book[] lists) {
        double maxPrice = lists[0].getPrice();
        int index = 0;
        for (int i = 1; i < lists.length; i++) {
            if (lists[i].getPrice() > maxPrice) {
                maxPrice = lists[i].getPrice();
                index = i;
            }
        }
        System.out.println(lists[index]);
    }

    public static void findLowestPriceBook(Book[] lists) {
        double minPrice = lists[0].getPrice();
        int index = 0;
        for (int i = 1; i < lists.length; i++) {
            if (lists[i].getPrice() < minPrice) {
                minPrice = lists[i].getPrice();
                index = i;
            }
        }
        System.out.println(lists[index]);
    }

    public static void findAnyBook(Scanner scanner, Book[] lists) {
        System.out.println("Nhập thể loại muốn tìm: ");
        String category = scanner.nextLine();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] instanceof Science) {
                if (((Science) lists[i]).getCategory().equals(category)) {
                    System.out.println(lists[i]);
                }
            }
        }
    }
    public static void findAuthorBook(Scanner scanner, Book[] lists){
        System.out.println("Nhap tac gia muon tim: ");
        String author = scanner.nextLine();
        for (int i = 0; i < lists.length; i++){
            if (lists[i] instanceof Novel) {
                if (((Novel) lists[i]).getAuthor().equals(author)) {
                    System.out.println(lists[i]);
                }
            }
        }
    }
    public static double avgScienceBooks(Book[] lists) {
        double sumScience = 0;
        double count = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] instanceof Science) {
                sumScience += lists[i].getPrice();
                count++;
            }
        }
        return (sumScience/count);
    }
    public static void findAllScienceBook(Book[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if(lists[i] instanceof Science) {
                System.out.println(lists[i]);
            }
        }
    }

    public static void findAllNovelBook(Book[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] instanceof Novel){
                System.out.println(lists[i]);
            }
        }
    }
    public static void findAllBookHasSamePrice(Scanner scanner, Book[] lists){
        System.out.println("Nhập giá tiền sách: ");
        double price = scanner.nextDouble();
        for (Book b : lists){
            if (b.getPrice() == price) {
                System.out.println(b);
            }
        }
    }
    public static void findAllBookRangePrices(Scanner scanner, Book[] lists) {
        System.out.println("Nhập khoảng giá từ: ");
        double range1 = scanner.nextDouble();
        System.out.println("=> đến: ");
        double range2 = scanner.nextDouble();
        for (Book b : lists) {
            if (b.getPrice() >= range1 && b.getPrice() <= range2){
                System.out.println(b);
            }
        }
    }
}
