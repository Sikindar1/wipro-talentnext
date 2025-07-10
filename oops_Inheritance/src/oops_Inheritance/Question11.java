package oops_Inheritance;
import java.util.*;
//class InvalidEmployeeException extends RuntimeException{
//	public InvalidEmployeeException (String msg) {
//		super(msg);
//	}
//}
//class Employeee{
//	String name;
//	public Employeee(String name) {
//		this.name=name;
//	}
//}
public class Question11 {
    String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Employeee emp=null;
//        Optional<Employeee>h=Optional.ofNullable(emp);
//        Employeee val=h.orElseThrow(() -> new InvalidEmployeeException("Employee Object is null"));
//        System.out.println(val.name);
		Question11 emp=new Question11();
		Optional<String>h=Optional.ofNullable(emp.name);
		System.out.println(h.orElseThrow(InvalidEmployeeException::new));
	}

}
class InvalidEmployeeException extends RuntimeException{
	public InvalidEmployeeException () {
		super("Employee object is null");
	}
}
