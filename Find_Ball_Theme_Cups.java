// DAILY CHALLENGE

// ProgramID-14370

// Skill Rack

// Find the Ball-Theme Cups

// There are three cups on a table, at the positions 1, 2, and 3. Initially, there is a ball hidden under the cup at the position P. The program must accept N pairs of integers and the value of P as the input. Each pair (X, Y) represents the positions of two cups to be swapped. After performing N swaps on the three cups, the program must print the position of the ball as the output

// Boundary Condition(s):

// 1<= N < 1000

// 1<=PXY3

// Input Format:

// The first line contains N and P separated by a space.

// The next N lines, each contains a pair (X, Y) represents the positions of two cups to be swapped

// Output Format:

// The first line contains the position of the ball after performing N swaps on the three cups

// Example Input/Output 1:

// Input

// 42

// 12

// 31

// 12

// 31

// Output
// 1
import java.util.*;

 public class Find_Ball_Theme_Cups {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int row= sc.nextInt();

            int in = sc.nextInt();

            int[][] mat = new int[row][2];

            for(int i=0;i<row; i++){

            mat[i][0] = sc.nextInt(); mat[i][1] = sc.nextInt ();

            if(in== mat[i][0]) in = mat[i][1];


            else if(in == mat[i][1]) in = mat[i][0];

            System.out.print(in);
        }
    }
}
