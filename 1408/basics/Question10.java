import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(charactersBtwTwoVowels(inputString));
        scannerObject.close();
    }

    public static String charactersBtwTwoVowels(String string) {
        int firstVowelIndex = -1;
        int lastVowelIndex = -1;
        
        // Find first vowel from left
        for (int i = 0; i < string.length(); i++) {
            if ("aeiouAEIOU".indexOf(string.charAt(i)) != -1) {
                firstVowelIndex = i;
                break;
            }
        }
        // Find last vowel from right
        for (int i = string.length() - 1; i >= 0; i--) {
            if ("aeiouAEIOU".indexOf(string.charAt(i)) != -1) {
                lastVowelIndex = i;
                break;
            }
        }
        
        if (firstVowelIndex == -1 || lastVowelIndex == -1 || firstVowelIndex >= lastVowelIndex) {
            return "";
        }

        return string.substring(firstVowelIndex + 1, lastVowelIndex);
    }
}
