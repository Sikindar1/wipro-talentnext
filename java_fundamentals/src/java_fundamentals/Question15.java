package java_fundamentals;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int c=0;
     for(int i=1;i<Math.sqrt(num);i++) {
    	if(num%i==0) {
    		if(num%num/i==0) {
    			c++;
    		}
    		c++;
    	}	
     }
     if(c==2) {
    	 System.out.println("Prime");
     }else {
    	 System.out.println("Not prime");
     }
	}
}
