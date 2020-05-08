/*
Given two numbers, which are given as Strings, return us a string which is the sum of these two numbers. 
Please DO NOT convert to integers using inbuilt string functions.

Input: String 1: "145" String: "39"
Output: "184"
*/

import java.io.*;
import java.util.*;

class EXPat{
	public static void main(String args[]){
		int n1=0,n2=0,i,j,k=0,c,max;
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		//n = sc.nextInt();
		int[] a = new int[1001];
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		for(i=0;i<s1.length();i++){
			n1 = 10*n1+(s1.charAt(i)-'0');
			

		}
		System.out.println(n1);
		for(i=0;i<s2.length();i++){
			n2 = 10*n2+(s2.charAt(i)-'0');	
		}
		int n3 = n1+n2;
		String n = n3+"";
		System.out.print(n);
	}
}
