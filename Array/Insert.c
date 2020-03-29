/*Given a string (array of characters) ,write a function to insert a given character at the specified location 
Input: 
Input String: "Hello"
Location: 3 (if the location is beyond string length, ignore)
CharacterToInsert: 'm'
Output: "Hemllo"
*/
#include "common.h"
#include <string.h>

char * func(char * str, int index,  char ch){
   int l;
    int i;
    char *g;
    if(str==NULL){
        return NULL;
    }
    else{
        l=strlen(str);
    g=(char *)malloc((l+1)*sizeof(char));
    for(i=0;i<l;i++){
        if(i<index-1){
            *(g+i)=*(str+i);
            
        }
        else if(i==index-1){
            *(g+i)=ch;
            *(g+(i+1))=*(str+i);
        }
        if(i>index-1){
            *(g+(i+1))=*(str+i);
        }
        if(index==l+1){
            *(g+l)=ch;
        }
    }
	return g;
    }
}
