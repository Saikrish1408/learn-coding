import java.util.Scanner;

public class Factoriol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the given number:");
        int n = sc.nextInt();
        fact(n);
        sc.close();
    }

    public static void fact(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;

        }
        System.out.println("The factorial of " + n + " is " + facto);
    }

}
