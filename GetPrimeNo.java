import java.util.Scanner;
class GetPrimeNo{
	public static void main(String args[]){
		int no, i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no , to check whether it is prime or not");
		no=sc.nextInt();
		if(no==1){
			System.out.println("It is prime...");
		}
		for(i=2;i<=no;i++){
			if(no%i==0){
				System.out.println("Not a prime no...");
				break;
			}			
		}
		if(no==i){
			System.out.println("The no."+no+" is a prime no...");
		}
	}	
}