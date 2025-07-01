import java.util.Scanner;

public class Printnumbers1_toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        num(n);
        sc.close();
    }

    public static void num(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }

}
