/*
Write a proframm to print the format in java
 1*2*3*4 
 9*10*11*12
 13*14*15*16
 5*6*7*8 
 if you have to print the N number of rows where 1<=N<=100?
*/
import java.util.*;
class pattern{
	public static void main(String args[]){
		int n;
		System.out.println("Enter the Number of Rows : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int p=n;
		if(n>=1 && n<=100){
			for(int i=1;i<=n;i+=2){
				int k=(i-1)*n+1;
				for(int j=0;j<n-1;j++){
					System.out.print(k+" ");
					k++;
				}
				System.out.print(k+" ");
				System.out.println();
			}
			if(n%2!=0){
				p=n-1;
			}
			for(int i=p;i>0;i-=2){
				int k=(i-1)*n+1;
				for(int j=0;j<n-1;j++){
					System.out.print(k+" ");
					k++;
				}
				System.out.print(k+" ");
				System.out.println();
			}
		}
		else{
			System.out.println("Enter a Valid Input(1-100)! ");
		}
		
	}
}