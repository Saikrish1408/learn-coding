import java.lang.Math;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if (primenumbers(n)) {
            System.out.println("The given number is the prime number");
        } else {
            System.out.println("The given number is not the prime number");
        }
        sc.close();
    }

    public static boolean primenumbers(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }
}
