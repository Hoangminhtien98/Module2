package OOPJava.BaiTap.Fan;

public class Main {
    public static void main(String[] args) {
        BuildFan fan1 = new BuildFan();
        BuildFan fan2 = new BuildFan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("fan1: " + fan1.toString());

        fan2.setSpeed(fan2.fast);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(true);
        System.out.println("fan2: " + fan2.toString());
    }
}
