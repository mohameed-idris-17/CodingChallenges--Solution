import java.util.*;

public class Hello {

public static void main(String[] args) {

String str = new Scanner(System.in).nextLine();

char[] arr = str.toCharArray();

int count =0;

int len = arr.length;

Set<Integer> set = new TreeSet<>();

loop1: for(int i=0;i<arr.length;i++){

int value=0;

int a = Character.getNumericValue(arr[i]);

value =value*10+a;

loop2: for(int j=i+1;j<len;j++){

int x = arr[j]-'0';

if(a==x){

value value*10+x;

for(int k=j+1;k<len;k++){ int y = arr[k]-'0'; if((x+1)==y){ value value*10+y; for(int m=k+1;m<len;m++){ int z = arr[m]-'0'; if(y==z){ value value *10+z; set.add(value); } }

break loop2;
}
}
}
}
}
}
System.out.println(set.size());
}}