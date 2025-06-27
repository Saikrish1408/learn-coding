import java.util.Scanner;

public class Multiplicationofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the multiply of the number u want");
        int mul = sc.nextInt();
        multiply(mul);
        sc.close();

    }

    public static void multiply(int mul) {
        for (int i = 1; i <= 10; i++) {
            int n = mul * i;
            System.out.println(mul + " * " + i + " = " + n);
        }

    }

}
