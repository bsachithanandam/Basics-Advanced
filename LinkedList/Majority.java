/*
Given a linkedlist, where each node has a character, 
find the character which appeared the maximum time. 
If you have multiple character as result, return the first character in that list.  

Input: h->e->l->l->o-> ->w->o->r->l->d->NULL
Output : 'l'
Input: y->e->l->h->a->h->a->NULL
Output: 'h'

*/

public class Majority{
	public char func(SchNode str)
	{
		int[] count= new int[256];
		int i,max=0;
		char r=' ';
		
		while(str!=null){
		    count[str.ch]++;
		    str=str.nextNode;
		}
		
		for(i=0;i<256;i++){
		    if(max<count[i]){
		        max=count[i];
		        r=(char)i;
		    }
		}
		
		return r; 
	}
} 
