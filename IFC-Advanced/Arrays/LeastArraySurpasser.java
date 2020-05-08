/*

Sample Input:
9
10 12 5 40 21 70 1 49 37

Sample Output:
12 21 21 49 37 70 37 49 37

*/


import java.io.*;
import java.util.*;

class LeastArraySurpasser{
	public static void main(String args[]){
		int n,i,j,k=0,c,max;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int maxa=0;
		for(i=0;i<n;i++){
			if(a[i]>maxa){
				maxa = a[i];
			}
		}
		System.out.println(maxa+" ");
		int flag = 0;
		max = maxa;
		int[] res = new int[n];
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]<a[j] && max>=a[j]){
					max = a[j];
					flag = 1;
				}
			}
			if(flag == 1){
				res[k++]=max;
				
			}
			else{
				res[k++] = a[i];
			}
			max=maxa;
			flag = 0;
		}
		for(i=0;i<n;i++){
			System.out.print(res[i]+" ");
		}
	}
}
