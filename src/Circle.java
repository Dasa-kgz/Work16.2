import java.util.Scanner;

public class Circle {
    Scanner sc = new Scanner(System.in);
    public static final double PI = 3.14;
    static double radius;

    public static void area(double radius){
        double v = PI * (radius * radius);
        System.out.println(v);
    }
    public static void circumference(double radius){
        double z = PI * 2 * radius;
        System.out.println(z);
    }

}
