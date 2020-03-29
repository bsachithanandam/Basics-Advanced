/*
Given an integer array find the second largest element (where array has only distinct elements)

Input: [2, 10, 11, 20, -5, 40, 60, 90, 1, 100]
Output: 90
*/

public class SecondMax {
  public int func (int [] arr){
      int first=0,second=-20;
      int i,n;
      n=arr.length;
      for(i=0;i<n;i++){
          if(arr[i]>first){
              second=first;
              first=arr[i];
          }
          else if(arr[i]<first && arr[i]>second){
              second=arr[i];
          }
      }
      return second;
      }
}
