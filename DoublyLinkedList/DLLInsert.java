/*

Given a DoubleLinkedList (where each node has a character) 
insert a given character at the specified location 
Input: 
Input : NULL<-H<=>e<=>l<=>l<=>o->NULL
Location: 3 (if the location is beyond LinkedList length, ignore)
CharacterToInsert: 'm'
Output: NULL<-H<=>e<=>m<=>l<=>l<=>o->NULL

*/

public class DLLInsert {
	public DchNode func(DchNode head, int index, char ch)
	{   
	    DchNode curr = head;
	    DchNode d = head;
		DchNode newd = new DchNode(ch);
		int l=1,c=1;
		if(head==null && index==1){
		    head=newd;
		    return head;
		}
		while(d!=null){
		   c++;
		   d=d.nextNode;
		}
		if(index==1){
		    newd.prevNode = null;
		    head.prevNode = newd;
		    newd.nextNode = head;
		    return newd;
		}
		if(index==c){
		    while(head.nextNode!=null){
		        head=head.nextNode;
		    }
		    newd.nextNode=null;
		    newd.prevNode = head;
		    head.nextNode = newd;
		    return curr;
		}
		if(index>c){
		    return head;
		}
		while(head!=null && l!=index-1){
            l++;
		    head=head.nextNode;
		}
		newd.prevNode = head;
		head.nextNode.prevNode = newd;
		newd.nextNode = head.nextNode;
		head.nextNode = newd;
	   return curr;
	}
}
