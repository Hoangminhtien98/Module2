package Inheritance.BaiTap.ThietKeVaTrienKhaiLopTriangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("Perimeter is: " + triangle.getPerimeter());

        System.out.println("Area is: " + triangle.getArea());

        System.out.println(triangle.toString());
    }
}
