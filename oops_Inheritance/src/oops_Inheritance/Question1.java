package oops_Inheritance;

class Box{
	int w,h,d;
	public Box(int w,int h,int d) {
		this.w=w;
		this.h=h;
		this.d=d;
	}
	public int volume() {
		return w*h*d;
	}
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Box b=new Box(3,4,5);
      System.out.println(b.volume());
	}

}
