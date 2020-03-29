/*
Find the character which appeared the maximum time. If you have multiple character as result return the first character in that list.  

Input: "hello world"
Output : 'l'
Input: "ye haha"
Output: 'h'
*/

public class Major {
@Override
public char  func (String s){
    int[] count = new int[256];
    int i,n,max=0;
    char l=' ';
    n=s.length();
    for(i=0;i<n;i++){
        count[s.charAt(i)]++;
    }
    for(i=0;i<n;i++){
        if(max<count[s.charAt(i)]){
            max=count[s.charAt(i)];
            l=s.charAt(i);
        }
     }
     return l;
	}
}
