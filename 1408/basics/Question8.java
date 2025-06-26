import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(lastDigitEvenCount(arr));
        scannerObject.close();
    }   

    public static int lastDigitEvenCount(int[] arr) {
        int lastDigitEvenNumbersCount = 0;
        for(int i : arr) {
            if(isEven((i%10))) {
                lastDigitEvenNumbersCount += 1;
            }
        }
        return lastDigitEvenNumbersCount;
    }

    public static boolean isEven(int n) {
        return (n%2 == 0) ? true : false;
    }
}
