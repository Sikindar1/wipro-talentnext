package Exceptionhandling;
import java.util.*;
 class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super("User Outside India cannot be registered");
    }
    public InvalidCountryException(String message) {
        super(message);
    }
}
public class Question3 {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Question3 ur = new Question3();
        String usern=sc.nextLine();
        String userc=sc.nextLine();
        try {
        	ur.registerUser(usern, userc);
        }catch(InvalidCountryException e){
        	  System.out.print(e.getMessage());
        }
	}
}
