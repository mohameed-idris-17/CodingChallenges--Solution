- import java.util.*;

- public class Problem_6 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int r=sc.nextInt(),c=sc.nextInt();

int[][] mat = new int[r][c];

for(int i=0;i<r;i++){

for(int j=0;j<c;j++){ mat[i][j] = sc.nextInt(); }}

String str = sc.next();

char[] arr1 = str.toCharArray();

char[] dum = str.toCharArray();

for(int i=0;i<r;i++){

for(int j=i+1;j<r;j++){ if(arr1[i]==arr1[j]){ dum[i] = '0'; dum[j] = '0'; for(int n=0;n<c;n++){ if(mat[i][n] != mat[j][n]){ System.out.print("NO"); System.exit(0);

I

for(int i=0;i<r;i++){ if(dum[i]!='0'){ for(int m=0;m<r;m++){ int count =0; for(int n=0;n<c;n++){ if((mat[i][n]==mat[m][n])&&(m!=i)){ count++;

}} if(count==c){ System.out.println("NO"); System.exit(0);

System.out.print("YES");

}}
