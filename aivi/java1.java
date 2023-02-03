import java.util.*;

public class java1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int[] aDigits = getDigits(a);
        int[] bDigits = getDigits(b);

        // Find the first digit in a that is greater than the corresponding digit in b
        int index = -1;
        for (int i = 0; i < aDigits.length; i++) {
            if (aDigits[i] > bDigits[i]) {
                index = i;
                break;
            }
        }

        // if no digit found in a greater than b 
        if (index == -1) {
            System.out.println(-1);
            return;
        }

        // swap the digits at the found index
        int temp = aDigits[index];
        aDigits[index] = bDigits[index];
        bDigits[index] = temp;

        // Sort the remaining digits in a
        Arrays.sort(aDigits, index + 1, aDigits.length);

        int result = 0;
        for (int i = 0; i < aDigits.length; i++) {
            result = result * 10 + aDigits[i];
        }

        System.out.println(result);
    }

    private static int[] getDigits(int number) {
        String str = Integer.toString(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }
}
