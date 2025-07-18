package Exceptionhandling;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
        super(message);
    }
}
public class Question4 {

	public static void main(String[] args) {
	 try {
		 if(args.length!=2) {
			 System.out.println(" Please provide name and age as command-line arguments.");
             return;
		 }
	   String name=args[0];
	   int age;
	   try {
		   age = Integer.parseInt(args[1]);
	   }catch (NumberFormatException e) {
           System.out.println("Age must be a valid number.");
           return;
       }
	   if (age < 18 || age >= 60) {
           throw new InvalidAgeException("Age must be between 18 and 59.");
       }
	   System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Validation successful!");

   } catch (InvalidAgeException e) {
       System.out.println(e.getMessage());
   }
	}

}

