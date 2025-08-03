import java.util.*;

public class Problem_24 {

  public static void main(String[] args) 
    {

  Scanner sc = new Scanner(System.in);

  String str1 = sc.nextLine(),str2=sc.nextLine();

  int max_depth=0, depth=0,max_index=0;

  for(int i=0;i<str1.length();i++){

      if(str1.charAt(i)=='(') {

      depth++;

    }

    else depth--;

    if(depth>max_depth) {

      max_depth=depth;

      max_index=i+1;

    }

    }

    
      for(int i=0;i<max_index;i++){
        System.out.print(str1.charAt(i)); 
    }

      for(int i=0;i<str2.length();i++){ System.out.print(str2.charAt(i));

    }

    for(int i=max_index;i<strl.length();i++){ System.out.print(str1.charAt(i));

    }



}}

}
