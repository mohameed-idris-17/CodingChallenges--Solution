#include <stdio.h>

#include <stdlib.h>

#include<string.h>

long long int formIntegerFromDigits(char *str)

long long int total=0;

int t = 0;

for(int i=0;str[i]!='\0';i++){

if(isdigit(str[i])){ total = total*10+str[i]-'0';

if(str[i]==){ t = 1;

}

if(t==1){

return -1*total;

else{

return total;

int main()

char str[101]; scanf("%s", str); printf("%1ld", formIntegerFromDigits(str)); return 0;

}

