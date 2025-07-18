package Exceptionhandling;
import java.util.*;
class NegativeValueException extends Exception{
	public NegativeValueException(String msg) {
	super(msg);
}
}
class OutOfRangeException extends Exception{
	public OutOfRangeException(String msg) {
	super(msg);
}
}

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 final int studc=sc.nextInt();
		final int subc=sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= studc; i++) {
            try {
                System.out.println("Enter the name of Student " + i + ":");
                String name = sc.nextLine();

                int total = 0;

                for (int j = 1; j <= subc; j++) {
                    System.out.println("Enter marks for subject " + j + ":");
                    String input = sc.nextLine();

                    int marks = Integer.parseInt(input); 

                    if (marks < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (marks > 100) {
                        throw new OutOfRangeException("Marks should be in range 0 to 100.");
                    }

                    total += marks;
                }

                double average = total / subc;
                System.out.println("Average marks for " + name + " = " + average);

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Please enter valid integer marks.");
            } catch (NegativeValueException e) {
                System.out.println("NegativeValueException: " + e.getMessage());
            } catch (OutOfRangeException e) {
                System.out.println("OutOfRangeException: " + e.getMessage());
            }

            System.out.println(); 
        }

	}

}
