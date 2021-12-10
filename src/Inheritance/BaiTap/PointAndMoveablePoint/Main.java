package Inheritance.BaiTap.PointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point =new Point();

        point.setX(0);
        point.setY(3);
        System.out.println("Point: " + point.toString());

        point.setXY(0, 4);
        System.out.println("Point: " + point.toString());

        MoveablePoint moveablePoint = new MoveablePoint();

        moveablePoint.setX(point.getX());
        moveablePoint.setY(point.getY());

        moveablePoint.setxSpeed(3);
        moveablePoint.setySpeed(2);

        moveablePoint.move();
        //Example x = 0+3; y = 4+2
        System.out.println(moveablePoint.toString());
    }
}
