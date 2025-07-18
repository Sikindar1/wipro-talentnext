//import java.util.*;
class Employee implements Cloneable{
	 int id;
	 String name;
	 double salary;
	 Employee(int id,String name,double salary){
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 
	 }
	 @Override
	 protected Object clone() throws CloneNotSupportedException{
		 return super.clone();
	 }
	 void display() {
		 System.out.println(id+" "+name+" "+" "+salary);
	 }
	
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Employee emp1=new Employee(101,"sikki",45000);
    	  System.out.println("Org before chng");
    	  emp1.display();
    	  Employee emp2=(Employee)emp1.clone();
    	  emp1.name="sunnu";
    	  emp1.salary=35000;
    	  System.out.println("org after chng");
    	  emp1.display();
    	  System.out.println("clone");
    	  emp2.display();
      }catch(CloneNotSupportedException e) {
    	  e.printStackTrace();
      }
	}

}
