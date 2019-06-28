package fndamentals;

import java.util.Scanner;

public class suceeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		int i,j,c = 0,b=0,s=0;
		int []a=new int[]{1,6,4,7,9};
		int n1=a.length;
		 for (i = 0; i < n1; i++) 
	        {
			 	if(a[i]==6)
			 	{
			 		c=i;
			 	}
			 	if(a[i]==7)
			 	{
			 		b=i;
			 	}
	 
	            }
		 if(c<b) {
		 for(i=0;i<n1;i++)
		 {
			 if(i<c || i>b)
			 {
				 s=s+a[i];
			 }
		 }
		 }
		 else {
		 for(i=0;i<n1;i++)
		 {
			 s=s+a[i];
		 }
		 }
		 System.out.println(s);
	 
	        
	}


	}


