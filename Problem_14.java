import java.util.*;

public class Problem_14 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int num sc.nextInt();

int[] arr = new int[num];

for(int i=0;i<num; i++){

arr[i] = sc.nextInt();

}

Arrays.sort(arr);

int end_negative = 0;

for(int i=0;i<num;i++){

if(0<arr[i]){

end_negative = i;

break;

}

}

if((end_negative-1) == num) {

System.out.println(-1);

}

int strt = 0, end= num-1;

for(int i=0;i<=end_negative;i++){

if((arr[strt]*-1) == arr[end]){

System.out.println(arr[end]);

System.exit(0);

}

else if((arr[strt]-1) <arr[end]){

end;

}

else{

strt++;

1

}

}

System.out.println(-1);