import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n<1||n>255) {
    	   System.out.println("Enter valid number");
    	   return;
       }
       String bs=Integer.toBinaryString(n);
       String pb=String.format("%8s",bs).replace(' ','0');
       System.out.println(pb);
	}

}
