/*
Given integer array, return new array where each element is replaced 
with the count of number of elements which are greater towards it right

Input:        [10, 12, 5, 40, 21, 70, 1, 49, 37]
Output:      	[6, 5, 5, 2, 3, 0, 2, 0, 0]

*/

import java.io.*;
import java.util.*;

class Test{
  public static int[] func(int[] a){
    int n = a.length;
    int i, j = 0,count = 0,k=0;
    int[] res = new int[n];
    for(i =0;i<n;i++){
      count = 0;
      for(j=i+1;j<n;j++){
        if(a[i]<a[j]){
          count++;
        }
      }
      res[k++] = count;
    }
    return res;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,k;
    n = sc.nextInt();
    int[] a = new int[n];
    int[] res = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    res = func(a);
    for(int i=0;i<n;i++){
      System.out.print(res[i]+" ");
    }
  }
}
