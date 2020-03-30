/*
Number is given in a LinkedList (where each node has one digit), 
find if it is jumper number, 
where the absolute difference consecutive digits is 1

Input: 2->3->4->5->4->3->4->3->2->1->NULL
Output: true
Input: 2->3->4->5->3->4->NULL
Output: false
*/

public class Jumper{
	public boolean func(SintNode num)
	{
		int i=0,k=0;
		if(num==null){
		    return false;
		}
		int[] a= new int[1001];
		while(num!=null){
		    a[k++]=num.num;
		    num=num.nextNode;
		}
		for(i=0;i<k-1;i++){
		    if(Math.abs(a[i]-a[i+1])!=1){
		        return false;
		    }
		}
		return true;
	}
} 
