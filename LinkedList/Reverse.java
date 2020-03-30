/*
Given a string as  LinkedList (where each node has a character), reverse the LinkedList
Input: 
Input String: M->i->k->e->NULL
Output: e->k->i->M->NULL

Input String: b->r->e->a->k->NULL
Output: k->a->e->r->b->NULL

*/

public class Reverse
public SchNode func(SchNode str){
    
    SchNode prev = null;
    SchNode curr = str;
    SchNode next = null;
    
    if(curr==null){
        return null;
    }
    
    while(curr!=null){
        next = curr.nextNode;
        curr.nextNode = prev;
        prev = curr;
        curr = next;
        
    }
    curr=prev;
    
    return curr;
	}
}
 
