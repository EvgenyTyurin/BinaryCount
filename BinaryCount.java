import java.util.Scanner;

/**
 * Count "1" in binary format of integer, you smarty.
 */

public class BinaryCount {
    public static void main(String[] args) {
        System.out.println("Input integer value");
        int num = Math.abs(new Scanner(System.in).nextInt());
        int binCounter = 0;
        // Division by 2 int->bit conversion cycle
        while (num > 0) {
            // Got one!
            if (num % 2 == 1)
                binCounter++;
            num /= 2;
        }
        System.out.println("Result: " + binCounter);
    }
}
