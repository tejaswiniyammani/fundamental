package fndamentals;

public class e6 {

public static void main(String[]args){
if(args.length==0)
System.out.print("Please enter an integer number");
else
{
int n=Integer.parseInt(args[0]);
for(int i=1;i<=n;i++)
 { 
 for(int j=1;j<=i;j++)
   {
 System.out.print(" * ");
   }
 System.out.println( );
  }
 }
}
}


