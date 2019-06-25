package fndamentals;

public class t88 {

public static void main(String[]args){
char colour = args[0].charAt(0);
switch(colour) {
case 'R':
          System.out.println("Red");
          break;
case 'G':
          System.out.println("Green");
          break;
case 'O':
          System.out.println("Orange");
          break;
case 'Y':
          System.out.println("Yellow");
          break;
case 'W':
          System.out.println("White");
          break;
default:
          System.out.println("Invalid code");
          break;
}
}
}
