/*

Given a DoubleLinkedList (where each node has a character) 
remove duplicates characters and maintain the same order

Input: NULL<-H<=>e<=>l<=>l<=>o<=>w<=>o<=>r<=>l<=>d<=>h<=>i->NULL 
Output: NULL<-H<=>e<=>l<=>o<=>w<=>r<=>d<=>h<=>i->NULL

*/

public class DLLRemoveDupCha{
public DchNode func(DchNode str){
    int i;
    DchNode head = str;
    DchNode head1=null;
    DchNode newd = null;
    int[] count = new int[256];
    while(head!=null){
        count[head.ch]++;
        head=head.nextNode;
    }
    while(str!=null){
        if(count[str.ch]>0){
            DchNode node = new DchNode(str.ch);
            if(head1==null){
                head1 = node;
                head1.prevNode=null;
                head1.nextNode=null;
                newd = head1;
            }
            else{
                while(head1.nextNode!=null){
                    head1=head1.nextNode;
                }
                node.prevNode = head1;
                head1.nextNode = node;
                node.nextNode = null;
                
            }
            count[str.ch]=0;
        }
        str=str.nextNode;
    }
    return newd;
	}
}
 
