import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  the number u want");
        int num = sc.nextInt();
        sumnumbers(num);

        sc.close();

    }

    public static void sumnumbers(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += num;
        }
        System.out.println(sum);
    }
}
