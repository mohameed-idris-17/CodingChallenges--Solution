public class Problem_28{
public static void main(String[] args) { int num = new Scanner (System.in).nextInt(); for(int i=0;i<=num;i++){ int k =0;

if(i==0){

System.out.println("*");

}

else{

for(int j=0;j<=i;j++){

if(j==0){

System.out.print("*");

else{

System.out.print(j);k++;}

for(k=k-1;k>0;k--){ System.out.print(k);

System.out.print("*");

System.out.println();

for(int i=num-1;i>=0;i--){

int k=1;

for(int j=0;j<=2*i-1;j++){ if(j==0){ System.out.print("*");

}

else{

System.out.print(k); k=j<i?k+1:k-1;

System.out.println(); System.out.println("*");