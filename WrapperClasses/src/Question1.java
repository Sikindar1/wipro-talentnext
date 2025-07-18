
public class Question1 {
public static void main(String[]args) {
	if(args.length!=1) {
		System.out.println("Usage: java Test <integer>");
        return;
	}
	try {
		int num=Integer.parseInt(args[0]);
		System.out.println(num);
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num).toUpperCase());
	}
	catch(NumberFormatException e) {
		System.out.println("provide a valid Integer");
	}
}
}
