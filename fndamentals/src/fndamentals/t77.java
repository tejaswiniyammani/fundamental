package fndamentals;

public class t77 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c=args[0].charAt(0);
		
		if(c>=65&&c<=90)
			System.out.println(args[0]+"->"+args[0].toUpperCase());
		
		if(c>=97&&c<=122)
			System.out.println(args[0]+"->"+args[0].toLowerCase());
	}

}