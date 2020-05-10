/*

For a given string, which has character and the number of times the character appeared, decode to the full string. 
During encoding if the character appear only once, then no number will be next to that character. 

Input: "a5br3"
Output: "aaaaabrrr"
Input: "a10br3a3"
Output: "aaaaaaaaaabrrraaa"

*/


import java.io.*;
import java.util.*;

class ArrayDecode{
	public static void main(String args[]){
		int n=0,i,j,k=0,flag =0;
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
    char c=a.charAt(0);
    for(i=1;i<a.length();i++){
      //System.out.print("*");
      if(Character.isDigit(a.charAt(i))) {
        n = (n*10)+(a.charAt(i)-'0');
        flag =1;
      }
      else if(!Character.isDigit(a.charAt(i))){
        c = a.charAt(i);
      }
      if(i!=a.length()-1 && Character.isDigit(a.charAt(i+1))) {
        flag =0;
      }
      if(flag ==0 && n==0){
        if(!Character.isDigit(a.charAt(i))){
          System.out.print(a.charAt(i));
        }
      }
      if(flag==1){
        while(n>0){
          System.out.print(c);
          n--;
        }
        flag = 0;
      }
    }
  }
}
