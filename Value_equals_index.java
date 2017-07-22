package Guvi;
import java.util.*;
public class Value_equals_index {

	public static void main(String[] args) {
		int input;
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		int arr[]=new int[input];
		int i;
		for(i=0;i<input;i++)
		arr[i]=sc.nextInt();
		for(i=0;i<input;i++)
		{
		if(arr[i]==i)
		System.out.println("the number"+arr[i]+"is equals to its index"+i);
		}
		}

	}


