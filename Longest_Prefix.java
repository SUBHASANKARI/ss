package Guvi;
import java.util.*;
public class Longest_Prefix {
public static void main(String[] args) {
	
		{
		Scanner sc=new Scanner(System.in);
		int j;
		String input[]=new String[100];
		for(int i=0;i<100;i++)
		{
		input[i]=sc.next();
		}
		String longest = " ",check;
		if(input.length>0)
		longest=input[0];
		for(int i=1;i<input.length;i++)
		{
		check=input[i];
		for(j=0;j<Math.min(longest.length(),input[i].length());j++)
		{
		if(longest.charAt(j)!=check.charAt(j))
		break;
		}
		longest=input[i].substring(0,j);
		}
		System.out.println("longest prefix is:"+longest);
		}
		}
	}


