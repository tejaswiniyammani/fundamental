package fndamentals;

import java.util.Scanner;

public class smallestof2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int temp,i,j;
		int []a=new int[]{11,55,77,8,22,14,13,45,78,19,15,25};
		int n1=a.length;
		 for (i = 0; i < n1; ++i) 
	        {
	 
	            for (j = i + 1; j < n1; ++j)
	            {
	 
	                if (a[i] > a[j]) 
	                {
	 
	                    temp =  a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	 
	                }
	 
	            }
	 
	        }
			
		System.out.println("largest to numbers are "+a[n1-2]+" "+a[n1-1]);
		System.out.println("smallest to numbers are "+a[0]+" "+a[1]);
	}
	}


