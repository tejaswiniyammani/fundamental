package fndamentals;

public class e5 {

public static void main(String[]args){
int n=Integer.parseInt(args[0]);
int s=0,r;
while(n>0)
{
 r=n%10;
 s=s+r;
 n=n/10;
}
System.out.println(+s);
}
}

