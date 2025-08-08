include <stdio.h>

#include <stdlib.h>

int count ShoePairs(int N, int *arr)

{

int count =0;

for(int i=0;i<N;i++){

for(int j=i+1;j<N;j++){

if((arr[i]==arr[j])&&(arr[i]!=0

)) {

arr[j]=0;

count++;

break;

}

}

}

return count;

}

int main()

{

int N;

scanf("%d", &N);

int arr[N];

for(int index = 0; index < N; index++)

{

scanf("%d", &arr[index]);

}

printf("%d", countShoePairs (N, arr));

return 0;

}
