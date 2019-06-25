package fndamentals;

public class e7 {

public static void main(String[]args){
int n=Integer.parseInt(args[0]);
int s=0,r;
do
{
 r=n%10;
 s=(s*10)+r;
 n=n/10;
}while(n>0);
System.out.println(+s);
}
}

