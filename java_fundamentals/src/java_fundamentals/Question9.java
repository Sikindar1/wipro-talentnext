package java_fundamentals;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String gen=sc.next().toLowerCase();
      int age=sc.nextInt();
      if(gen=="male") {
    	  if(age>1&age<58) {
    	  System.out.println("the rate of percentage is 8.4%");
      }else {
    	  System.out.print("the rate of percentage is 10.5%");
      }
	}else {
		if(age>1&age<58) {
	    	  System.out.println("the rate of percentage is 8.2%");
	      }else {
	    	  System.out.print("the rate of percentage is 9.2%");
	      }
	}

}
}
