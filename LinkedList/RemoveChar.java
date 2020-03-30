/*
Given a LinkedList (where each node has a character) remove the given character 
Input: 
Input String: H->e->l->l->o->NULL
CharacterToRemove: 'l'
Output: H->e->o->NULL

*/

public class RemoveChar{
public SchNode func(SchNode head, char ch){
    char[] a = new char[1001];
    if(head==null){
        return null;
    }
    int k=0;
    while(head!=null){
        if(head.ch!=ch){
            a[k++]=head.ch;
        }
        head=head.nextNode;
    }
    
    SchNode n = new SchNode(a[0]);
    SchNode b = n;
    
    for(int i=1;i<k;i++){
        n.nextNode=new SchNode(a[i]);
        n=n.nextNode;
    }
    if(b.nextNode==null)
    return null;
    else
    return b;
	}
}
