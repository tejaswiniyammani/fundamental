package fndamentals;

import java.util.Scanner;

public class maxandmin {
public static void main(String args[]) {
		
		int i,max=0,k=0,min=0;
		Scanner sc=new Scanner (System.in);
		int []a=new int[]{6,2,3,4,5,1,7,0,-1};
		k=a.length;
		min=a[0];
		for(i=0;i<k;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		for(i=0;i<k;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println(min);
}
}

