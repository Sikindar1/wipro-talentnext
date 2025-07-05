package java_fundamentals;
import java.util.*;
public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean h=true;
		for(int i:a) {
			if(i!=1&&i!=4) {
				h=false;
				break;
			}
		}
		System.out.println(h);
	}

}
