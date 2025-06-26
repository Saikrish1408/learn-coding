import java.lang.Math;
import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int radius = sc.nextInt();
        Circle(radius);
        sc.close();
    }

    public static void Circle(int radius) {

        double area = Math.PI * radius * 2;
        System.out.println(area);

    }
}
