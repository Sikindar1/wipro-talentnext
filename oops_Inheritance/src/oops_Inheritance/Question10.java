package oops_Inheritance;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Scanner sc=new Scanner(System.in);
     StringJoiner s1=new StringJoiner("-","[","]");
     s1.add("Kolkata");
     s1.add("Banglore");
     StringJoiner s2=new StringJoiner("-","[","]");
     s2.add("Delhi");
     s2.add("Mumbai");
     StringJoiner s1copy=new StringJoiner("-","[","]");
     s1copy.merge(s1);
     s1copy.merge(s2);
     System.out.println(s1copy);
     StringJoiner s2copy=new StringJoiner("-","[","]");
     s2copy.merge(s2);
     s2copy.merge(s1);
     System.out.println(s2copy);
	}
}
