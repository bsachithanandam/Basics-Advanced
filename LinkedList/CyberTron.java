/*
An original message is sent from planet Earth to planet Cybertron in the form of a string. However, the letter position is very important whereas string size is not important. So the original string which is sent to Cybertron is encrypted in the new string which comprises of additional special characters at random positions. These letters do not occur in the original message. The set of special characters which are used for encryption are sent as a separate string. Your task is to decrypt the message by removing the special characters. 

The strings are represented as linked lists.

Input Description:

First line of the input contains the encrypted message.
Second line of the input contains the new string with the special characters.

Eg: 
  Encrypted message : A->B->T->X->T->Y->Z->A->C->I->K
  Special message : Z->Y->B->X
  Decrypted message : A->T->T->A->C->K

Explanation:
The special message contains the characters Z,Y,B,X.Those characters are removed from the encrypted message.
*/

public class CyberTron{
public SchNode func(SchNode inputStr1, SchNode inputStr2){
    int count[] = new int[256];
    int k=0,i;
    while(inputStr2!=null){
        count[inputStr2.ch]++;
        inputStr2=inputStr2.nextNode;
    }
    
    char[] c = new char[1001];
    while(inputStr1!=null){
        if(count[inputStr1.ch]==0){
           c[k++]=inputStr1.ch;
        }
        inputStr1=inputStr1.nextNode;
    }
    if(c.length==0){
        return null;
    }
    
    SchNode a = new SchNode(c[0]);
    SchNode b = a;
    
    for(i=1;i<k;i++){
        a.nextNode=new SchNode(c[i]);
        a=a.nextNode;
    }
    
    if(b.nextNode==null){
        return null;
    }
    else{
        return b;
    }
    
    
	}
}
 
