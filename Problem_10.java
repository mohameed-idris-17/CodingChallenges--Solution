import java.util.*;
public class Problem_10 {

    public static void main(String[] args) {
		String str = new Scanner(System.in).next();
		String[] arr = str.split("\\."); 
	    String str1= arr[0],str2=arr[1];
	    int le1= str1.length(),le2=str2.length(),j=le1-1,p=1;
	    
	    for(int i=0;i<le1;i++){
	        if(str1.charAt(i)=='0'){
	            System.out.print("0 ");
	        }
	        else{
	            System.out.print(str1.charAt(i)+"0".repeat(j)+" ");
	           j--; 
	        }
	        
	    } 
	    for(int i=0;i<le2;i++){
	        if(str2.charAt(i)=='0'){
	            System.out.print("0 ");
	        }
	        else{
	            System.out.print(str2.charAt(i)+"/"+"1"+"0".repeat(p)+" ");
	        }
	        p++;
	    }

	}
}