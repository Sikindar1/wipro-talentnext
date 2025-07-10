package oops_Inheritance;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[]p=s.split(",");
		String w=p[0];
		int n=Integer.parseInt((p[1]));
		s=s.substring(w.length()-n, w.length());
		for(int i=0;i<n;i++) {
			System.out.print(s);
		}
	}

}
