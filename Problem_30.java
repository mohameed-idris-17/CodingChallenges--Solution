import java.util.*;
public class Problem_30 {

public static void main(String[] args) { 
    Scanner sc = new Scanner (System.in); 
    int n = sc.nextInt();

int[] arr = new int[n];

for (int i=0;i<n;i++){ arr[i] = sc.nextInt();

}

Boolean bool = false; 
for(int i=0;i<n-2;i++){

for(int j=i+1;j<n-1;j++){ 
    int val = arr[j] - arr[i];
     for(int k=j+1;k<n;k++) { 
        if(val==(arr[k]-arr[j])){
             bool = true;

            System.out.print(arr[i]+" "+arr[j]+" " +arr[k]);

System.out.println();

}

}}}

if(bool==false) System.out.println(-1); }}
    

