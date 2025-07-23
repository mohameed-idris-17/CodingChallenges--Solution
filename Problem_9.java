import java.util.*; import java.math.*;
 public class Problem_9 {

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); 
int num = sc.nextInt();
 String[] str = new String[num];
 for(int i=0;i<num;i++){

str[i] = sc.next();

}

int[] arr = new int[num]; 
for(int i=0;i<num;i++)
{ BigInteger bigint = new BigInteger(str[i],2); 
arr[i] = bigint.intValue();

}

int second = 0; for(int ch:arr){ second+=ch;

}

System.out.println(String.format("%02d:%02d:%02d" , second/3600, (second%3600)/60, second%60));
