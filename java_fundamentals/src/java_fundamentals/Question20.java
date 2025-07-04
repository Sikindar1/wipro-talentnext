package java_fundamentals;
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int org=num;
      int rev=0;
      while(num!=0) {
   	 int rem=num%10;
   	 rev=rev*10+rem;
   	 num=num/10;
      }
	if(org==rev) {
		System.out.println(org+" is a palindrome");
	}else {
		System.out.println(org+" is not a palindrome");
	}

}
}

