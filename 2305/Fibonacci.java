import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }

    public static void fib(int n) {
        int a = 0;
        int b = 1;
        System.out.println("fibonacci series for the given number range is: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;

        }

    }
}
