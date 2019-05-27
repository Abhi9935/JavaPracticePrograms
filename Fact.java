import java.util.*;
class Fact{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.");
	int a=sc.nextInt();
	int fact=1;
	for(int i=1; i<=a;i++){
		fact=fact*i;
	}
	System.out.println("factorial of "+a+" is : "+fact);
	
}
}