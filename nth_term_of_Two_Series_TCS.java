/*
# TCS written round Ninja Coding Nov 2018.
Q. Find the Nth term of the followinfg Series.
		0,0,7,6,14,12,21,18....Nth term
	
*/
import java.util.*;
class Maze{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int j=0,k=0;
		for(int i=0;i<n;i++){
			if(i%2==0){
				arr[i]=7*j;
				j+=1;
			}
			else{
				arr[i]=6*k;
				k+=1;
			}
		}
		System.out.println(arr[n-1]);// nth term only			
		/*
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+", "); // printing complete array upto nth term 
			
		}
		*/
	}
}