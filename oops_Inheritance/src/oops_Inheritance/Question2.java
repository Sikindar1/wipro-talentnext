package oops_Inheritance;
class Calculator{
	
	public static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(Calculator.powerInt(3,4));
      System.out.println(Calculator.powerDouble(3.0,4.0));
	}

}
