package java_fundamentals;
import java.util.*;
public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the 9 integer numbers");
		Scanner sc=new Scanner(System.in);
		int[][]a=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is "+max);
	}

}
