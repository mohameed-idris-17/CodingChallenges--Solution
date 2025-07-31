/* The program must accept N sorted (in ascending order) integers as the
Input. The program must print the missing range of values as the output
If none of the values are missing the program must print -1 as the
output
Boundary Condition(s):
Input Format:
The first line contains N,
The second line contains N integer values separated by a space.
Output Format:
The first line contains -1 or the missing range of values separated by a
space,
Example Input/Output I:
Input:
5
125612
Output:
3-4 7-11
Explanation:
The trussing values are 3.4. Hence the range is printed as 34
The next missing values are Hence the range is printed as 7-11
*/

import java.util.*; 
public class Hello { 

  public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 
        int num sc.nextInt(); 
        
        int[] arr = new int[num]; 
        
        for(int i=0;i<num;i++){ 
        
            arr[i] = sc.nextInt(); 
        
        } 
    
        boolean bo = false; 
        
        if(arr[0] != 1){ 
        
          System.out.print("1-"+(arr[0]-1)+" "); 
          
          bo=true; 
        
        } 
        
        for(int i=0;i<num-1;i++)
        { 
        int st =0,en=0; 
           if(arr[i]+1 == arr[i+1])
             { 
                continue; 
               } 
        
            else{ 
                bo = true; 
                st = arr[i]+1; 
                 en = arr[i+1]-1; 
            } 
        
           System.out.print(st+"-"+en+" "); 
        } 
         if(bo false)
            { 
              System.out.print("-1"); 
            } 

         } 
  }
