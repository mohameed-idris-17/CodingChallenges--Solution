char asciiToString(int SIZE, int *arr) { char *arr1 = (char*)malloc(sizeof(char) SIZE); for(int i=0;i<SIZE;i++){

arr1[i] = (char)arr[i];

}

return arr1;