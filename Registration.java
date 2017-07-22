package Guvi;
import java.util.*;
public class Registration {
public static void main(String[] args)
{
		Scanner input=new Scanner(System.in);
		
		int length=input.nextInt();
		int []arr=new int[length];
		System.out.println("enter the elements  : ");
		for(int i=0;i<length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]='%';
					break;
				}
			}
		}
		for(int i=0;i<length;i++)
		{
			if(arr[i]!='%')
			{
				System.out.println(arr[i]);
			}
		}
	}
	

	}


