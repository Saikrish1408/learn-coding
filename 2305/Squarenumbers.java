
import java.util.Scanner;

public class Squarenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        square(a);
        sc.close();

    }

    public static void square(int a) {
        int b = a * a;
        System.out.println(b);

    }

}
