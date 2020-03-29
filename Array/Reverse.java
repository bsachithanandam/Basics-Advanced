/*
Given a string (array of character), reverse the string

Input: 
Input String: "Mike"
Output: "ekiM"

Input String: "break"
Output: "kaerb"
*/

public class Reverse{
	public String func(String str)
	{
		String a="";
		int n,i;
		if(str==null){
		    return null;
		}
		n=str.length();
		for(i=n-1;i>=0;i--){
		    a=a+str.charAt(i);
		}
		return a; 
	}
}
