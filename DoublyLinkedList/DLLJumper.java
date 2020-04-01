/*

Number is given in a DoubleLinkedList (where each node has one digit), 
find if it is jumper number, 
where the absolute difference consecutive digits is 1

Input: NULL<-2<=>3<=>4<=>5<=>4<=>3<=>4<=>3<=>2<=>1->NULL
Output: true
Input: NULL<-2<=>3<=>4<=>5<=>3<=>4->NULL
Output: false

*/

public class DLLJumper {
	
	public boolean func(DintNode num)
	{
		int[] a = new int[101];
		int i=0,j;
		while(num!=null){
		    a[i++]=num.num;
		    num=num.nextNode;
		}
		System.out.print(i);
		for(j=0;j<i-1;j++){
		    if(Math.abs(a[j]-a[j+1])!=1){
		        return false;
		    }
		}
		return true; 
	}
} 
