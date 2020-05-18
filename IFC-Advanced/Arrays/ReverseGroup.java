/*
Reverse array in a group of given size. 
Every group of string of given size should be reversed.

Input: "hello master"
Size: 3
Output: "leh olsamret"

Input: "thank you bye"
Size: 2
Output: "htna koy uybe"

*/

import java.io.*;
import java.util.*;

class Test{
  public static String func(String a,int k){
    int n = a.length();
    int i, j = 0,l=k-1,m=2,h = 0;
    String res="";
    for(i=0;i<n/k;i++){
      while(j<k){
        res += a.charAt(l);
        h++;
        l--;
        j++;
      }
      j = 0;
      l = k*m-1;
      m++;
    }
    while(h<n){
      res+=a.charAt(h);
      h++;
    }
    return res;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k;
    String s,res;
    s = sc.nextLine();
    k = sc.nextInt();
    res = func(s,k);
    System.out.print(res);
  }
}
