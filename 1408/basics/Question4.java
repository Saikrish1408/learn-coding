import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(determineWithLength(inputString));
        scannerObject.close();
    }

    public static String determineWithLength(String string) {
        return (string.length() < 10) ? "Less than 10 Characters" : "More than 10 Characters";
    }
}
