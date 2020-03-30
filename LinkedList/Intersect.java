/*
Find the intersection of two given LinkedList (where each node has a character). 
Return the LinkedList which has character which appears in both LinkedList (same sequence order as LinkedList1). 
Input: LinkedList1: H->e->l->l->o->NULL  
LinkedList2: w->o->r->l->d->NULL
Output: l->o->NULL

Input: LinkedList1: h->i->NULL 
LinkedList2: b->y->e->NULL
Output: null
*/

public class Intersect {
	
	public SchNode func(SchNode head1, SchNode head2)
	{
		if(head1==null && head2==null){
		    return null;
		}
		SchNode head = null;
	    int[] count= new int[256];
		while(head2!=null){
		    count[head2.ch]++;
		    head2=head2.nextNode;
		}
		while(head1!=null){
		    if(count[head1.ch]>0){
		        SchNode newnode = new SchNode(head1.ch);
		        newnode.nextNode=null;
		        if(head==null){
		            head = newnode;
		            //return ;
		      }
		      else{  
		        
		        SchNode last = head;
		        while(last.nextNode!=null){
		        last=last.nextNode;
		        }
		       last.nextNode=newnode;
		      }
		       count[head1.ch]--;
		    }
		    head1=head1.nextNode;
		}
		return head; 
	}
}
