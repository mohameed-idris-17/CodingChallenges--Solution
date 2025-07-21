import java.util.*;

public class Problem_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length() - 1;

        for (char digit : str.toCharArray()) {
            if (digit != '0') {
                System.out.print(digit + "0".repeat(len) + " ");
            }
            len--;
        }

        System.exit(0);
    }
}
