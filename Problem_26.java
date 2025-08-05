import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] mat = new char[4][6]; // 4 rows, 6 columns for HHMMSS

        // Read input for 4 rows and 6 columns
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 6; c++) {
                String s = sc.next(); // Read something like "00"
                mat[r][c] = s.charAt(1); // Take the second character
            }
        }

        StringBuilder sb = new StringBuilder();

        // Build the time from binary to decimal
        for (int j = 0; j < 6; j++) {
            StringBuilder binary = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                binary.append(mat[i][j]);
            }
            int value = Integer.parseInt(binary.toString(), 2);
            if (j == 2 || j == 4) {
                sb.append(String.format("%02d:", value));
            } else if (j == 5) {
                sb.append(String.format("%02d", value));
            }
        }

        System.out.println(sb.toString());
    }
}