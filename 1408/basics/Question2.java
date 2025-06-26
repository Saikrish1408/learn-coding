import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int input = scannerObject.nextInt();
        System.out.println(factorial(input));
        scannerObject.close();
    }

    public static int factorial(int n) {
        int factorialValue = 1;
        for(int i = n ; i > 1 ; i--) {
            factorialValue *= i;
        }
        return factorialValue;
    }
}
