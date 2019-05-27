import java.util.*;
class BubbleSortDemo{
	static void sorted(int[] arr){
		int n=arr.length;
		int temp=0;
		for(int i=0; i<n; i++){
			for(int j=1;j<(n-i);j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}					
			}
		}
		//return arr[];
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int i;
		int l=sc.nextInt();
		int arr[]=new int[l];
		System.out.println("Enter the Array");
		for(i=0;i<l;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("You hav enter the following array");
		for(i=0;i<l;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		sorted(arr);
		System.out.println("After Bubble Sort :");
		for(i=0;i<l;i++){
			System.out.print(" "+arr[i]);
		}
	}
}