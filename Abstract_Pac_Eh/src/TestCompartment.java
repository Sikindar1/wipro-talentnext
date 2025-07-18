import java.util.*;



abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {
	@Override
	public String notice() {
		return "FirstclassCompartment";
	}

}

class Ladies extends Compartment {
	@Override
	public String notice() {
		return "LadiesCompartment";
	}
}

class General extends Compartment {
	@Override
	public String notice() {
		return "GeneralCompartment";
	}
}

class Luggage extends Compartment {
	@Override
	public String notice() {
		return "LuggageCompartment";
	}
}
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] a = new Compartment[10];
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			int t = rand.nextInt(4) + 1;
			switch (t) {
			case 1:
				a[i] = new FirstClass();
				break;
			case 2:
				a[i] = new Ladies();
				break;
			case 3:
				a[i] = new General();
				break;
			case 4:
				a[i] = new Luggage();
				break;
			}
			System.out.println(a[i].notice()); 
		}
	}
}