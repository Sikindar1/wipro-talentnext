package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   char c=sc.next().charAt(0);
   char p;
   if(Character.isLowerCase(c)) {
	  p=Character.toUpperCase(c);  
   }else {
	  p =Character.toLowerCase(c);
   }
	
     	System.out.println(c+"->"+p);
}
}
