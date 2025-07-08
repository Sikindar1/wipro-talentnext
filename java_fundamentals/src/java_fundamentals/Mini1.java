package java_fundamentals;
//import java.util.*;
class Employee{
	int empno,basic,hra,it;
	String empname,dept,date;
	char dc;
	public Employee(int empno,String empname,String date,char dc,String dept,int basic,int hra,int it) {
		this.empno=empno;
		this.empname=empname;
		this.date=date;
		this.dc=dc;
		this.dept=dept;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
	}
	
}

public class Mini1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee[]emp= new Employee[]{new Employee(1001,"Ashish","01/04/2009",'e',"R&D",2000,8000,3000),
    		 new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
             new Employee(1003, "Rahul",  "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
             new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
             new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
             new Employee(1006, "Suman",  "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),
             new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)};
     int input=Integer.parseInt(args[0]);
     boolean found=false;
     for(Employee em:emp) {
    	 if(em.empno==input) {
    		 found =true;
    		 int da=0;
      String desig=" ";
      switch(em.dc) {
      case 'e':
    	   desig="Engineer";
    	   da=20000;
    	   break;
      case 'c':
   	   desig="Consultant";
   	   da=32000;
   	   break;
      case 'k':
   	   desig="Clerk";
   	   da=12000;
   	   break;
      case 'r':
   	   desig="Receptionist";
   	   da=15000;
   	   break;
      case 'm':
   	   desig="Manager";
   	   da=40000;
   	   break;
    	 }
      int sal=em.basic+em.hra+da-em.it;
      System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
      System.out.println(em.empno + "\t" + em.empname + "\t\t" + em.dept + "\t\t" + desig + "\t" + sal);
      break;
     }
      }if(!found) {
    	  System.out.println("There is no employee with empid : "+input);
     }
	}

}
