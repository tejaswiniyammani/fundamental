package fndamentals;

public class e8 {
  
	 public static void main(String args[]){  
	  int r,sum=0,temp;    
	  int n=Integer.parseInt(args[0]);  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println(args[0]+" is a palindrome ");    
	  else    
	   System.out.println(args[0]+" is not a palindrome");    
	}  
	}