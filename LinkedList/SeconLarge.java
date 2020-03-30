/*
Given an LinkedList (where each node has integer) find the second largest element 
(where array has only distinct elements)

Input: 2->10->11->20->-5->40->60->90->1->100->NULL
Output: 90

*/

public class SecondLarge{
	public int func(SintNode arr)
	{
		int[] a = new int[1001];
		int k=0,i,j,temp;
		
		while(arr!=null){
		    a[k++]=arr.num;
		    arr=arr.nextNode;
		}
		for(i=0;i<k;i++){
		    for(j=0;j<k;j++){
		      if(a[i]>a[j]){
		          temp=a[i];
		          a[i]=a[j];
		          a[j]=temp;
		      }  
		    }
		}
		return a[1]; 
	}
} 
