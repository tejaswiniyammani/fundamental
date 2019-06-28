package fndamentals;

public class revofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		if(a==0 || b==0 || c==0|| d==0)
		{
			System.out.println("please enter 4 integers");
		}
		int array[][]=new int[2][];
		array[0]=new int[] {a,b};
		array[1]=new int[] {c,d};
		for(i=0;i<2;i++)
		{
			for( j=0;j<2;j++)
			{
				System.out.print(array[i][j]+" ");

			}
                             System.out.println(" ");
			
		}
                System.out.println("The reverse of array is:");
    for(i=1;i>=0;i--)
    {
        for( j=1;j>=0;j--)
        {
        System.out.print(array[i][j]+" ");
        }
        System.out.println();
        
    }
		
				}

	}


