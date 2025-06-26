import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int input = scannerObject.nextInt();
        System.out.println(updatingNumber(input));
        scannerObject.close();
    }

    public static int updatingNumber(int n) {
        return (n%2 == 0) ? (n + 15) : (n - 10) ;
    }
}