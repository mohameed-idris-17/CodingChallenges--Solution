import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        char[] arr = str.toCharArray();
        int count = 0, total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                count++;
            } else if (arr[i] == ')') {
                count--;
            } else if (Character.isDigit(arr[i])) {
                int inte = 0;

                while (i < arr.length && Character.isDigit(arr[i])) {
                    inte = inte * 10 + (arr[i] - '0');
                    i++;
                }

                i--; // step back for the for-loop
                total += count * inte;
            }
        }

        System.out.print(total);
    }
}
