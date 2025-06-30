import java.util.Scanner;
import java.util.ArrayList;

// This code adds the elements in an new list not in-place
public class Questions11 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int[] unDuplicated = removeDuplicates(arr);
        if(unDuplicated == null) {
            System.out.println("Give some values");
        } else {
            for (int i : unDuplicated) {
                System.out.print(i + " ");
            }
        }
        scannerObject.close();
    }

    public static int[] removeDuplicates(int[] arr) {
        if(arr.length == 0) {
            return new int[0];
        }
        ArrayList<Integer> unDuplicated = new ArrayList<>();
        for(int left = 0, right = 1 ; right < arr.length ; left++, right++) {
            if(arr[left] != arr[right]) {
                unDuplicated.add(arr[left]);   
            }
        }
        unDuplicated.add(arr[arr.length - 1]);   
        return unDuplicated.stream().mapToInt(i -> i).toArray(); 
    }
}
