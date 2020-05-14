/*
Given a input two string (inputStr1) and  (inputStr2), merge these two string by combining elements of same index

Input String: "Hello" 
Deletion String: "123"
Output String: "H1e2l3lo"
*/
import java.io.*;
import java.util.*;

class ShuffleMerge{
	public static void main(String args[]){
		String s1,s2;
		String res="";
		int i=0,j=0,n,m;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		n = s1.length();
		m = s2.length();
		while(i<n && j<m){
			System.out.print(s1.charAt(i));
			System.out.print(s2.charAt(j));
			i++;
			j++;
		}
		while(i<n){
			System.out.print(s1.charAt(i));
			i++;
		}
		while(j<m){
			System.out.print(s2.charAt(j));
			j++;
		}
	}
}
