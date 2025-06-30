import java.util.Arrays;
import java.util.Scanner;
// Same Question as Question 11 but here its in-place
public class Question12 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int uniqueCount = new Question12().removeDuplicatesInPlace(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Unique Elements: " + uniqueCount);
        scannerObject.close();
    }

    public int removeDuplicatesInPlace(int[] arr) {
        int uniqueIndex = 0;
        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }
}
