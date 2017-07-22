package Guvi;
import java.util.*;
public class Largest_elements {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int ar1[]=new int[a];
		for(int i=0;i<a;i++)
		ar1[i]=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		for(int j=i+1;j<a;j++)
		{
		if(ar1[i]>ar1[j])
		{
		c=ar1[i];
		ar1[i]=ar1[j];
		ar1[j]=c;
		}
		}
		}
		for(int i=0;i<a-1;i++)
		{
		if(ar1[i]==ar1[i+1])
		{
		    System.out.println(ar1[i]);
		}
		}
		}
		

}
