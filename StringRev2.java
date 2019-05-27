import java.util.*;
class StringRev2{
   public static void main(String args[]){
      String s;
	  StringBuilder reverse;
      Scanner sc = new Scanner(System.in);     
      System.out.println("Enter a string to reverse");
      s = sc.nextLine();
	  
      StringBuilder s1=new StringBuilder();
	  s1.append(s);
	  reverse=s1.reverse();
      System.out.println("Reverse of the string: " + reverse);
   }
}