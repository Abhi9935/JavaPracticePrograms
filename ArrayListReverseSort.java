/*
Sort an ArrayList and then Reverse Sort it.
	Collections.reverse(al);
			or
	Collections.sort(al,Collections.reverseOrder());
*/
import java.util.*;
class ArrayListReverseSort{
	public static void main(String args[]){
		ArrayList al=new ArrayList();
		al.add(56);
		al.add(15);
		al.add(2);
		al.add(75);
		al.add(4);
		al.add(9);
		al.add(9);
		System.out.println("Given ArrayList : "+al);
		Collections.sort(al);
		System.out.println("Sorted ArrayList : "+al);
		Collections.reverse(al);
		System.out.println("Reverse Sorted ArrayList : "+al);
		/*Collections.sort(al,Collections.reverseOrder());
		System.out.println("Reverse Sorted ArrayList : "+al);
		*/
	}
}