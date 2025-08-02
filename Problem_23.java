import java.util.*; public class Problem_23{

T

public static void main(String[] args) { int n = new Scanner(System.in).nextInt(); char[][] mat = new char[n*n] [n*n];

for(int i=0;i<n*n;i++){

}

}

if(i%2==0){ mat[0][i]='*';

}

else{

mat[0][i]='-';

}

}

}

for(int i=1;i<n*n;i++){ mat[i][0] = mat[i-1][n*n-1]; for(int j=0;j<n*n-1;j++){ mat[i][j+1] = mat[i-1][j];

}

for(int i=0;i<n*n;i++){ for(int j=0;j<n*n;j++){ System.out.print(mat[i][j]+" ");

}

System.out.println();