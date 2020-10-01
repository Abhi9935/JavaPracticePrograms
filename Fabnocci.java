import java.util.*;
class Fabnocci{
public static void main(String[] args){
	int a=0,b=1,c,i,count=100;
	System.out.println(a);
	System.out.println(b);
	for(i=2;i<=count;i++){
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
}
}
