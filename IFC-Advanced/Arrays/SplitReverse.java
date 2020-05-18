/*
Given a string (array of character), split the string to half and reverse each half

Input: 
Input String: "Mike"
Output: "iMek"

Input String: "break"
Output: "rbeka"

*/
import java.io.*;
import java.util.*;

class Test{
  public static String func(String a){
    int n = a.length();
    int i, j = 0,m=2,h = 0,k = n/2;
    String res="";
    for(i=n/2-1;i>=0;i--){
      res += a.charAt(i);
    }
    if(n%2!=0){
      res += a.charAt(n/2);
      k = n/2+1;
    }
    for(i=n-1;i>=k;i--){
      res+=a.charAt(i);
    }
    return res;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k;
    String s,res;
    s = sc.nextLine();
    res = func(s);
    System.out.print(res);
  }
}
