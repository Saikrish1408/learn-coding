import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int input = scannerObject.nextInt();
        System.out.println(checkContraints(input));
        scannerObject.close();
    }

    public static String checkContraints(int n) {
        if(n%3 == 0 && n%5 == 0) {
            return "Divisible by Both.";
        } else if(n%3 == 0) {
            return "Divisible by only 3.";
        } else if(n%5 == 0) {
            return "Divisible by only 5";
        }
        return "Cannot Divisible by 3, 5, and both as well";
    }
}
