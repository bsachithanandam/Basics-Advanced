/*
Given a string (array of characters) remove the given character 

Input: 
Input String: "Hello"
CharacterToRemove: 'l'
Output: "Heo"

*/

public class RemoveGiven{
	public String func(String str, char ch)
	{
		String a="";
		int i,n;
		if(str==null){
		    return null;
		}
		n=str.length();
		for(i=0;i<n;i++){
		    if(str.charAt(i)!=ch){
		        a=a+str.charAt(i);
		    }
		}
		return a; 
	}
}
