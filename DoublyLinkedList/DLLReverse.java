/*

Given a string as  DoubleLinkedList (where each node has a character), reverse the LinkedList

Input: 
Input String: NULL<-M<=>i<=>k<=>e->NULL
Output: NULL<-e<=>k<=>i<=>M->NULL

Input String: NULL<-b<=>r<=>e<=>a<=>k->NULL
Output: NULL<-k<=>a<=>e<=>r<=>b->NULL

*/





public class DLLReverse{

  public DchNode func(DchNode str){
      DchNode head = str;
      DchNode temp = null;

      while(head!=null){
          temp = head.prevNode;
          head.prevNode = head.nextNode;
          head.nextNode = temp;
          head = head.prevNode;
      }
      if(temp!=null){
          str=temp.prevNode;
      }
     return str;
    }
    
}
