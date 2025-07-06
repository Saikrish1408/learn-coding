import java.util.Scanner;

public class ReverseanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        reversearray(n, arr);
        sc.close();
    }

    public static void reversearray(int n, int[] arr) {
        System.out.println("the reversed array are:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");

        }
    }

}
