/*

Given an DoubleLinkedList (where each node has integer) find the second largest element 
(where array has only distinct elements)

Input: NULL<-2<=>10<=>11<=>20<=>-5<=>40<=>60<=>90<=>1<=>100->NULL

Output: 90

*/

public class DLLSecondMax{

	public int func(DintNode arr)
	{
		int max,i,j,temp,k=0;
		int[] ar = new int[101];
		while(arr!=null){
		    ar[k++]=arr.num;
		    arr= arr.nextNode;
		}
		for(i=0;i<k;i++){
		    for(j=i+1;j<k;j++){
		        if(ar[i]<ar[j]){
		            temp=ar[i];
		            ar[i]=ar[j];
		            ar[j]=temp;
		        }
		    }
		}
		max=ar[1];
		return max; 
	}
  
} 
