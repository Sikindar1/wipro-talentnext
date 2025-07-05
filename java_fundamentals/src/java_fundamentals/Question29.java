package java_fundamentals;
import java.util.*;
public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int p=0;	
		for(int i=0;i<n;i++) {
			if(a[i]==10) {
				a[i]=0;
				p=i;
				break;
			}
		}
		int q=p+1;
		while(p<q&&q<n) {
			if(a[q]==10) {
				a[q]=0;
				q++;
			}
			if(a[p]==0) {
				swap(a,p,q);
				p++;
				q++;
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
