import java.util.Scanner;
import java.util.Arrays;

public class LongestSubStringWithoutRepeated {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.next();
        System.out.println(longestSubStringWithoutRepeated(string));
        scannerObject.close();
    }

    public static int longestSubStringWithoutRepeated(String string) {
        int maxLength = 0;
        int left = 0, right = 0;
        int[] storage = new int[256];
        Arrays.fill(storage, -1);
        while(right < string.length()) {
            if(storage[right] != -1) {
                if(storage[right] >= left) {
                    left = storage[right] + 1;
                }
            }
            maxLength = (maxLength > (right - left + 1)) ? maxLength : (right - left + 1);
            storage[right] = right;
            right++;
        }
        return maxLength;
    }
}
