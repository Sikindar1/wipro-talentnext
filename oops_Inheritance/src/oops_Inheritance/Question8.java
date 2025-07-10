package oops_Inheritance;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer p=new StringBuffer(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				p.delete(i-1, i+2);
				break;
			}
		}
		System.out.println(p.toString());
	}

}
