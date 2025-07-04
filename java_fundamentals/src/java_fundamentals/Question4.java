package java_fundamentals;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       if(n1>0) {
        System.out.println("Positive");
       }else if(n1<0) {
    	   System.out.println("Negative");
       }else {
    	   System.out.println("Zero");
       }
       int b1=sc.nextInt();
       int b2=sc.nextInt();
       if(b1%10==b2%10) {
    	   System.out.println("true");
       }else {
    	   System.out.println("false"); 
       }
	}

}
