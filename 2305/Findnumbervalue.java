
import java.util.Scanner;

public class Findnumbervalue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        findnumbers(a);
        sc.close();

    }

    public static void findnumbers(int a) {
        if (a > 0) {
            System.out.println("The given number is positive");
        } else if (a < 0) {
            System.out.println("The given number is negative");

        } else {
            System.out.println("The given number is neutral");
        }
    }

}
