/*Given a string remove duplicates characters and maintain the same order

Input: "Hello world hi" 
Output String: "Helo wrdhi"
*/

public class Remove {
	@Override
	public String func(String str)
	{   
	    if(str==null){
	        return null;
	    }
		String a="";
		int n,i;
		n=str.length();
		int[] count = new int[256];
		for(i=0;i<n;i++){
		    count[str.charAt(i)]++;
		    if(count[str.charAt(i)]==1){
		        a=a+str.charAt(i);
		    }
		}
		
		return a ; 
	}
}
