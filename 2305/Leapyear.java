import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Year:");
        int a = sc.nextInt();
        leap(a);
        sc.close();
    }

    public static void leap(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("It is the leap year");
        } else {
            System.out.println("It is not the leap year");
        }
    }

}
