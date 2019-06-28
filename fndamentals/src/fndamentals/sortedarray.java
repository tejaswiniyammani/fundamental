package fndamentals;

import java.util.Scanner;

public class sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		int temp,i,j;
		int []a=new int[]{12,23,10,2,5,6,25};
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
		 for (i=0;i<n1;i++)
		 {
			 System.out.print(a[i]);
		 }

}

	}


