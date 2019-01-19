/*
Write a proframm to print the format in java
 1
 2*3
 4*5*6
 4*5*6
 7*8
 9
 if you have to print the N number of rows where 1<=N<=100?
*/
import java.util.*;
class pattern2{
	public static void main(String args[]){		
		System.out.println("Enter the Number of Rows : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			for(int j=1; j<=i;j++){
				count+=1;								
				System.out.print(count);
				if(j!=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		count-=n;
		for(int i=n;i>=0;i--){
			for(int j=1; j<=i;j++){
				count+=1;								
				System.out.print(count);
				if(j!=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}