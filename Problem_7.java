class Problem_7 {
    public int maximum69Number (int num){
        
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        boolean bool = true;
        for(int i=0;i<str.length();i++){
            if((arr[i]=='6')&&(bool==true)){
                arr[i]='9';
                bool=false;
                break;
            }
        }
        int result = 0;
        for(char ch : arr){
            
            result = result*10+((int)ch-'0');
        }
        return result;
    }
}
