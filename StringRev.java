import java.util.*;
class StringRev {
	public static void main(String args[]) { 
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			System.out.println("Char at: "+s.charAt(i)); 
		}		
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		System.out.println("Reverse of String : "+rev);
	} 
}
