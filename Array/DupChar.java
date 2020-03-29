Find duplicate character
In a given string, there is one character which appears twice. Write a function to find the character and return it.
 
Input: "hello"
Output : 'l'
Input: "asdfghja"
Output: 'a'

public class DupChar {
  public char  func (String s){
      int i,n;
      char a='';
      n=s.length();
      int[] count= new int[256];
      for(i=0;i<n;i++){
          count[s.charAt(i)]++;
      }
      for(i=0;i<n;i++){
          if(count[s.charAt(i)]==2){
              a=s.charAt(i);
          }
      }
      return a;
    }
 }
