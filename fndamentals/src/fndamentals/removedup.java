package fndamentals;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class removedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
				Scanner sc=new Scanner(System.in);
				
				int temp,i,j=0;
				int []a=new int[]{20,10,1,3,5,20,6,5,2,1};
				int n1=a.length;
				Arrays.sort(a);
				int t[]=new int[n1];
				 for (i = 0; i < n1-1; i++) 
			        {
					 if(a[i]!=a[i+1])
					 {
						 t[j++]=a[i];
			         }
			 
			        }
				 t[j++]=a[n1-1];
				 		 
		for(i=0;i<j;i++)
		{
			System.out.println(t[i]+" ");
		}
		}
		
	}


