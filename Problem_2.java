import java.util.*;

public class Problem_2 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String str = sc.next(), sub = sc.next();

int[] arr = new int[sub.length()];

for(int j=0;j<sub.length();j++){

for(int i=0;j<str.length();i++){

if(sub.charAt(j)==str.charAt(i)){

arr[j]=i;

break;

}

}

}

Arrays.sort(arr);

int end = arr[sub.length()-1];

for(int i=arr[0]; i<end+1;i++){

System.out.print(str.charAt(i));

}

}

}
