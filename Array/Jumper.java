/*Find if the given number in a string, find if it is jumper number, where the absolute difference consecutive digits is 1

Input: 2345434321
Output: true
Input: 234534
Output: false
*/

public class Jumper {
  public boolean func (String str){
      int i=0,c=0,n=str.length();
      while(i<n-1){
          if(Math.abs((int)str.charAt(i)-(int)str.charAt(i+1))==1){
              c++;
          }
          i++;
      }
      if(c+1==n){
          return true;
      }
      else{
          return false;
      }
    }
}
