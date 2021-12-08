package OOPJava.BaiTap.Quadratic;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB() {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC() {
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot() {
        return (-this.b) / (2 * this.a);
    }
    public double getRoot1() {
        return (-this.b - Math.sqrt(this.getDelta())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b + Math.sqrt(this.getDelta())) / (2 * this.a);
    }
}
