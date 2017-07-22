package Guvi;
import java.util.*;
public class Repeating_elements {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int i,j,n;
	int flag=0;
	System.out.println("enter the no of elements:");
	n=in.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++)
		arr[i]=in.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i!=j){
			if(arr[i]!=arr[j])
			{
			flag=1;
		}
			else{
				flag=0;
				break;
			}}}
	
			if(flag==1){
				System.out.println(arr[i]);
			}
			
		}
	
	
	}

}
