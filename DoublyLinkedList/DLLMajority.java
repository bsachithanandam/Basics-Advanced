/*

Given a Doublelinkedlist, where each node has a character, 
find the character which appeared the maximum time. 
If you have multiple character as result, return the first character in that list.  

Input: NULL<-h<=>e<=>l<=>l<=>o<=> <=>w<=>o<=>r<=>l<=>d->NULL
Output : 'l'
Input: NULL<-y<=>e<=>l<=>h<=>a<=>h<=>a->NULL
Output: 'h'

*/

public class DLLMajority{
	public char func(DchNode str)
	{
		
		DchNode d = str;
		int[] count = new int[256];
		int i,max=0;
		char res=' ';
		
		while(str!=null){
		    count[str.ch]++;
		    str=str.nextNode;
		}
		
		for(i=0;i<256;i++){
		    if(max<count[i]){
		        max=count[i];
		        res=(char)i;
		    }
		}
		if(max==0){
		    res=d.ch;
		}
		return res; 
	}
} 
