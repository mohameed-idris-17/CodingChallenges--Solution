import java.util.*; public class Problem_27{

public

static void main(String[] args) { Scanner sc = new Scanner(System.in); int num = sc.nextInt(), count_H = 0, count_T =0; int[] arr = new int[num]; for(int i=0;i<num;i++){

arr[i] = sc.nextInt();

sc.nextLine();

char F = sc.next().charAt(0);

int initial = (F=='H')? 1:2;

for(int ch:arr){

initial+=ch;

if(initial%2==0){

count_T++;

}

else{

count_H++;

}

}

System.out.println(count_H+" "+count_T);

}