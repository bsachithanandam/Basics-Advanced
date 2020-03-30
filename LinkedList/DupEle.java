/*
In a given LinkedList (where each node has a character), 
there is one character which appears twice. 
Find a function to find the character and return it. 

Input: h->e->l->l->o->NULL
Output : 'l'
Input: a->s->d->f->g->h->j->a->NULL
Output: 'a'
*/



public class DupEle {

  public char func(SchNode head){
      int[] count=new int[256];
      int i;
      char a=' ';
      while(head!=null){
          count[head.ch]++;
          head=head.nextNode;
    }
    for(i=0;i<256;i++){
        if(count[i]==2){
            a=(char)i;
            break;
        }

    }
    return a;
  }
}
