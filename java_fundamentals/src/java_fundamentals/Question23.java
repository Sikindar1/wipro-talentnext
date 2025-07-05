package java_fundamentals;
import java.util.*;
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Values of Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			   a[i]=sc.nextInt();
		}
		int f=sc.nextInt();
		System.out.println(BinarySearch(a,f));
	}
	public static int BinarySearch(int[]a,int f) {
		int n=a.length-1;
		int s=0;
		int e=n;
		while(s<e) {
			int mid=s+(e-s)/2;
			if(a[mid]==f) {
				return mid;
			}else if(a[mid]<f) {
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		return -1;
	}

}
