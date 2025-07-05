package java_fundamentals;
import java.util.*;
public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values");
		Scanner sc=new Scanner(System.in);
		int n=3;
		int[]a=new int[n];
		int[]b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		int[]ans=new int[2];
		int s=0;
		int e=a.length-1;
	    int mid=(s+e)/2;
	    ans[0]=a[mid];
	    ans[1]=b[mid];
		System.out.println(Arrays.toString(ans));
	}
	

}
