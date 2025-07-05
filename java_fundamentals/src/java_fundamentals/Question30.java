package java_fundamentals;
import java.util.*;
public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values evenOdd");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int p=0;
		int q=a.length-1;
		while(p<q){
			if(a[q]%2!=0) {
				q--;
			}
			if(a[p]%2==0) {
				p++;
			}else {
				swap(a,p,q);
				p++;
				q--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void swap(int[]a,int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
