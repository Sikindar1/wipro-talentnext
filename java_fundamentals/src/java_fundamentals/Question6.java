package java_fundamentals;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine().replace(" ", ",");
    if(s.length()==0) {
    	System.out.println("No values");
    }else {
    	System.out.print(s);
    }
	}

}
