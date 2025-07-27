import java.util.*;

public class Problem_15 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String str = sc.nextLine();

String[] arr = str.split(" ");|

boolean bool = false;

for(int i=0;i<arr.length;i++) {

if(arr[i].equals("Ctrl+C")){

bool = true;

} else if((arr[i].equals("Ctrl+V"))&&(bool==false )) {

continue;

}

else if(((arr[i]).equals("Ctrl+V"))&&(bool==true )) {

for(int j=0;j<i;j++){

if((arr[j].equals("Ctrl+C"))||(arr[j]

.equals("Ctrl+V"))){

continue;

}

else{

System.out.print(arr[j]+" ");

}

}

}

else{

System.out.print(arr[i]+" ");

}

}

}

}