import java.util.Scanner;

public class Searchelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the search element");
        int search = sc.nextInt();
        int a = search(arr, search);
        if (a != -1) {
            System.out.println("element is found at the index:" + a);
        } else {
            System.out.println("the element is not found");
        }

        sc.close();

    }

    public static int search(int arr[], int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;

            }

        }
        return -1;
    }

}
