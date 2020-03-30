/*
Given a LinkedList (where each node has a character) 
insert a given character at the specified location 
Input: 
Input : H->e->l->l->o->NULL
Location: 3 (if the location is beyond LinkedList length, ignore)
CharacterToInsert: 'm'
Output: H->e->m->l->l->o->NULL

*/

public class Insert {

	public SchNode func(SchNode head, int index, char ch)
	{
		SchNode new_n = new SchNode(ch);
		SchNode temp=head;
		int i=1;
		new_n.ch=ch;
		while(i<index-1 &&temp!=null){
		    temp=temp.nextNode;
		    i++;
		}
		
		if(index==1 && head==null){
		    new_n.nextNode = head;
		    head=new_n;
		}
		else if(index==1 && head!=null){
		    new_n.nextNode = head;
		    head=new_n;
		}
		else if(temp==null){
		    return head;
		}
		
		else{
		new_n.nextNode=temp.nextNode;
		temp.nextNode=new_n;
		}
		return head ; 
	}
}
