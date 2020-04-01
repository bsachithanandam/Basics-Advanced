/*

Given a DoubleLinkedList (where each node has a character) remove the given character 
Input: 
Input String: NULL<-H<=>e<=>l<=>l<=>o->NULL
CharacterToRemove: 'l'
Output: NULL<-H<=>e<=>o->NULL

*/

public class DLLRemoveGivenChar{

  public DchNode func(DchNode head, char ch){
      DchNode head1=null;
      DchNode newd = null;
      while(head!=null){
          if(head.ch!=ch){
              DchNode node = new DchNode(head.ch);
              if(head1==null){
                  head1 = node;
                  head1.prevNode = null;
                  head1.nextNode = null;
                  newd = head1;
              }
              else{
                  while(head1.nextNode != null){
                      head1=head1.nextNode;
                  }
                  node.prevNode = head1;
                  head1.nextNode = node;
                  node.nextNode = null;
              }
          }
          head=head.nextNode;
      }
      return newd;
    }
}
