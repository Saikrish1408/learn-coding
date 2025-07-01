import java.util.Scanner;

public class MissingNumberTwoPointer {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(missingNumber(arr));
        scannerObject.close();
    }

    public static int missingNumber(int[] arr) {
        if(arr.length == 0) {
            return 1;
        } else if(arr[0] != 1) {
            return 1;
        } else if(arr[arr.length - 1] == (arr.length - 1)) {
            return arr.length;
        } else {
            int leftCheck = arr[0], rightCheck = arr[arr.length - 1];
            for(int left = 1, right = arr.length - 2 ; left < right ; left++, right--, leftCheck++, rightCheck--) {
                if(arr[left] != leftCheck) {
                    return leftCheck;
                }
                if(arr[right] != rightCheck) {
                    return rightCheck;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
