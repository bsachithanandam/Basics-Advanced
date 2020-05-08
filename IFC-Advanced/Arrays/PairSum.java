/*
Count the number of pairs in integer array whose sum equals given sum (all elements are unique)

Input: [0, 2, 5, 7, 4, 6, 10, 20, -10]
Sum: 10
Output : 3
Explanation:
The pairs are:
  [(0, 10), (4, 6), (20, -10)]
*/

import java.io.*;
import java.util.*;

class PairSum{
	public static void main(String args[]){
		int n=0,n1=0,i,j,k=0,c=0,max;
		int sum;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		n1 = sc.nextInt();
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]>a[j]){
					int temp = a[i];
					a[i] =  a[j];
					a[j] = temp;
				}
			}
		}
		int lp = 0;
		int rp = n-1;
		while(lp<rp){
			if(a[lp]+a[rp]==n1){
				c++;
				lp++;
				rp--;
			}
			else if(a[lp]+a[rp]<n1){
				lp++;
			}
			else{
				rp--;
			}

		}
	System.out.print(c);
}
}
