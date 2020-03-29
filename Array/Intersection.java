/*Find the intersection of two given string. Return the string which has character which appears in both string (same sequence order as string1). 
Input: String1: "Hello"  String2: "world"
Output: "lo"
Input: String 1: "hi" String2: "bye"
Output: null
*/

public class Intersection {

  public String func (String inputStr1, String inputStr2){
      int i=0,n1,n2,j=0,c=0;
      String s="";
      int[] count = new int[256];
      n1=inputStr1.length();
      n2=inputStr2.length();
      if(inputStr1==null && inputStr2==null){
          return null;
      }
      else{
      for(i=0;i<n2;i++){
          count[inputStr2.charAt(i)]++;
      }
      for(i=0;i<n1;i++){
          if(count[inputStr1.charAt(i)]>0){
              s=s+inputStr1.charAt(i);
              count[inputStr1.charAt(i)]--;
          }
      }
      }

      return s;

    }
}

