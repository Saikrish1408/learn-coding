import java.util.*;

public class Swapwithouttemp {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("the value of a is:" + a);
        System.out.println("the value of b is:" + b);
    }

}
