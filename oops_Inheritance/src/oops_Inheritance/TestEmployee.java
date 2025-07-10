package oops_Inheritance;

public class TestEmployee  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp=new Employee("John Doe", 75000.0, 2015, "NI123456D");
       emp.setname("Jane Smith");
       emp.setas(82000.0);
       emp.setys(2018);
       emp.setIn("NI654321Z");
       System.out.println(emp.getname());
       System.out.println(emp.getas());
       System.out.println(emp.getys());
       System.out.println(emp.getIn());
	}

}
