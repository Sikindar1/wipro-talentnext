package Exceptionhandling;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       try {
    	   System.out.println("Enter the number of elements in the array");
    	   int s=Integer.parseInt(sc.nextLine());
    	   int[]a=new int[s];
    	   System.out.println("Enter the elements in the array");
           for (int i = 0; i < s; i++) {
               a[i] = Integer.parseInt(sc.nextLine());
           }
           System.out.println("Enter the index of the array element you want to access");
           int ind = Integer.parseInt(sc.nextLine());
           System.out.println("The array element at index " + ind + " = " + a[ind]);
           System.out.println("The array element successfully accessed");
           
       }
       catch(ArrayIndexOutOfBoundsException e){
    	    System.out.println("java.lang.ArrayIndexOutOfBoundsException");
    	   
       }
       catch(NumberFormatException e){
    	    System.out.println("java.lang.NumberFormatException");
       }
	}

}
