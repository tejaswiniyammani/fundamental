package fndamentals;

import java.util.Scanner;

public class arraysearch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int key=5,i,k=-1,n;
		System.out.println("enter array size");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				k=i;
				break;
			}
		}
		if(k>0)
			System.out.println(k);
		else
			System.out.println(k);
			
	}

}
