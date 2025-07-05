package java_fundamentals;
import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Intialize values ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]a=new int[n];
	for(int i=0;i<n;i++) {
		   a[i]=sc.nextInt();
	}
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<n;i++) {
		  if(max<a[i]) {
			  max=a[i];
		  }
		  if(min>a[i]) {
			  min=a[i];
		  }
	}
	System.out.println(min);
	System.out.println(max);
	}

}
