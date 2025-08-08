
//     Word - Split & Merge

// The program must accept a string S and an integer K as the input. The string S contains multiple words. The integer K represents the position of a word in the string

// The program must modify the Kth word in S based on the following conditions.

// The program must split the Kth word into two equal halves. If the word length is

// odd, then consider the middle character for both halves.

// Then the program must reverse the first half and then merge the second half and first half into a single word.

// -Then the program must replace the Kth word with the obtained word in the string S. Finally, the program must print the revised string S

// Boundary Condition(s):

// 1 <= Length of S <= 1000

// 1 <= K <= Number of words in S.

// Input Format:

// The first line contains S.

// The second line contains K.

// Output Format:

// The first line contains the revised string S.

// Example Input/Output 1: Input:

// This is the right choice

// 4

// Output:

// This is the ghtgir choice

// Explanation:

// Here K = 4.

// The 4th word is right, whose length is odd.
import java.util.*; 
public class Problem_31 {

public static void main(String[] args) { 
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();

int num = sc.nextInt();

String[] arr = str.split(" ");

String word =arr[num-1];

int len_word = word.length();

StringBuilder final1 = new StringBuilder("");

if(len_word%2==1){


String split_1 = word.substring(0,(len_word/2)+1);

StringBuilder sb_1 = new StringBuilder(split_1); sb_1.reverse();

String split_2 = word.substring((len_word/2 ),len_word);

final1.append(split_2);final1.append(sb_1);

for(int i=0;i<arr.length;i++){ if(i!=(num-1)){ System.out.print(arr[i]+" ");} else{System.out.print(final1+" ");}}}
else{
String splite_1 = word.substring(0,(len_word)/2);
StringBuilder sbe_1 = new StringBuilder(splite_1)

sbe_1.reverse();

String splite_2 = word.substring((len_word/2 ),len_word);

final1.append(splite_2);final1.append(sbe_1); for(int i=0;i<arr.length;i++){

if(i!=(num-1)){

System.out.print(arr[i]+" "); }

else{

System.out.print(final1+" ");

}}}}}

