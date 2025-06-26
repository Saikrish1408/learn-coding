import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(lastDigitOddCount(arr));
        scannerObject.close();
    }

    public static int lastDigitOddCount(int[] arr) {
        int lastDigitOddNumbersCount = 0;
        for(int i : arr) {
            if(isOdd((i%10))) {
                lastDigitOddNumbersCount += 1;
            }
        }
        return lastDigitOddNumbersCount;
    }

    public static boolean isOdd(int n) {
        return (n%2 == 1) ? true : false;
    }
}
