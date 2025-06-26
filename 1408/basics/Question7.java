import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(printSum(arr));
        System.out.println(arrAverage(arr));
        printReverse(arr);
        System.out.println(addUsingIndices(arr));
        scannerObject.close();
    }

    public static int printSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
       return sum; 
    }

    public static int arrAverage(int[] arr) {
        int sum = printSum(arr);
        return (sum / arr.length); 
    }

    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i > -1 ; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // returns (0, 1) + (1, 2) + (2, 3) + ..... (4, 5) + (5)
    public static int addUsingIndices(int[] arr) {
        int indicesSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            indicesSum += arr[i] + arr[i + 1];
        }
        indicesSum += arr[arr.length - 1];
        return indicesSum; 
     }
}
