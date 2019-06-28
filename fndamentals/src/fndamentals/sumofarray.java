package fndamentals;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,k=0;
		Scanner sc=new Scanner (System.in);
		int []a=new int[]{1,2,3,4,5};
		k=a.length;
		for(i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		

}

	}


