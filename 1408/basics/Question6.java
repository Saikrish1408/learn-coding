import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(swappingFirstLast(inputString));
        scannerObject.close();
    }

    public static String swappingFirstLast(String string) {
        StringBuilder returningStringBuilder = new StringBuilder(string);
        returningStringBuilder.replace(0, 1, Character.toString(string.charAt(string.length() - 1)));
        returningStringBuilder.replace(string.length() - 1, string.length(), Character.toString(string.charAt(0)));
        return returningStringBuilder.toString();
    }
}