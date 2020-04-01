/*
In a given DoubleLinkedList (where each node has a character), 
there is one character which appears twice. 
Find a function to find the character and return it. 

Input: NULL<-h<=>e<=>l<=>l<=>o->NULL
Output : 'l'
Input: NULL<-a<=>s<=>d<=>f<=>g<=>h<=>j<=>a->NULL
Output: 'a'

*/

public class DupEle{
public char func(DchNode head){
    int[] count = new int[256];
    
    while(head!=null){
        count[head.ch]++;
        head=head.nextNode;
    }
    
    char a =' ';
    
    for(int i=0;i<256;i++){
        if(count[i]==2){
            a=(char)i;
        }
    }
    return a;
	}
}
