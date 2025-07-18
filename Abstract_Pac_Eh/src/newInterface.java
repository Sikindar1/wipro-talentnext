@FunctionalInterface
interface Test{
	int myf(int a,int b,int c);
}
public class newInterface {
   
	public static void main(String[] args) {
		Test p1=(a,b,c)->a+b+c;
		Test p2=(a,b,c)->a*b*c;
		int r1=p1.myf(4, 5, 6);
		int r2=p2.myf(6, 7, 8);
     System.out.println(r1+" "+r2);
	}

}
