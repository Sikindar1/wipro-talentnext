package oops_Inheritance;

public class Employee extends Person {
   private double as;
   private int ys;
   private String In;
  
   public Employee(String name,double as,int ys,String In) {
	   super(name);
	   this.as=as;
	   this.ys=ys;
	   this.In=In;
   }
   public void setas(double as) {
	   this.as=as;
   }
   public void setys(int ys) {
	   this.ys=ys;
   }
   public void setIn(String In) {
	   this.In=In;
   }
   public double getas() {
	   return as;
   }
   public int getys() {
	   return ys;
   }
   public String getIn() {
	   return In;
   }

}
