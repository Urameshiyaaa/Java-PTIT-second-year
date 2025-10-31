import java.util.Scanner;
import java.lang.Math; 

class Point {
    private double x;
    private double y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point secondPoint) {
        double dx = this.x - secondPoint.x;
        double dy = this.y - secondPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            double c1 = p1.distance(p2);
            double c2 = p1.distance(p3);
            double c3 = p2.distance(p3);

            if (c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1) {
                double chuVi = c1 + c2 + c3;
                System.out.printf("%.3f%n", chuVi);
            } 
            else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}