/*
Given a input string (inputStr1) and reference string (inputStr2), remove all the occurrence of character of reference string in the input string 

Input String: "Hello world hi" 
Deletion String: "lhe"
Output String: "Ho word i"
*/

public class RemoveStr{
  public String func (String inputStr1, String inputStr2){
      String a="";
      int[] str_count = new int[256];
      int i,n1,n2;
      if(inputStr1==null && inputStr2==null){
          return null;
      }
      n1=inputStr1.length();
      n2=inputStr2.length();
      for(i=0;i<n2;i++){
          str_count[inputStr2.charAt(i)]++;
      }
      for(i=0;i<n1;i++){
          if(str_count[inputStr1.charAt(i)]==0){
              a=a+inputStr1.charAt(i);
          }
      }
      return a;
    }
}
