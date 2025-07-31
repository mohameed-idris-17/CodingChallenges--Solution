mport java.util.*; public class Problem_20

{

  public static void main(String[] args) { 
    int num = new Scanner(System.in).nextInt(),p=1; System.out.println(p++);
  
    for(int i=1;i<num-1;i++){ 
        for(int j=0;j<i;j++){
    
          System.out.print("*");
    
    }
    
      System.out.print(p++); System.out.println();
    
    }
  
    for(int i=(num+(num-1));i>=num;i--){ 
        System.out.print(i);p++;
  
  }
  
  System.out.println();
  
  for(int i=1;i<num;i++){
  
      for(int j=0;j<i;j++){ 
      System.out.print('*');
  
  }
  
  System.out.print(p++); System.out.println();
  
  }
