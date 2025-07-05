package java_fundamentals;
import java.util.*;
public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter 4 integer numbers");
     Scanner sc=new Scanner(System.in);
     int[][]a=new int[2][2];
     for(int i=0;i<2;i++) {
    	 for(int j=0;j<2;j++) {
    		 a[i][j]=sc.nextInt();
    	 }
     }
     for(int i=0;i<2;i++) {
    	 if(i==0) {
    		swap(a,0,0,1,1);
    	 }else {
    		 swap(a,0,1,1,0);
    	 }
     }
     for(int i=0;i<2;i++) {
    	 for(int j=0;j<2;j++) {
    		 System.out.print(a[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}
    public static void swap(int[][]a,int i1,int j1,int i2,int j2) {
    	int temp=a[i1][j1];
    	a[i1][j1]=a[i2][j2];
    a[i2][j2]=temp;
    }
}
