import com.automobile.twowheeler.*;
public class TestVehicle {

	public static void main(String[] args) {
		
		 Hero heroBike = new Hero("Hero Splendor", "AP01AB1234", "Ravi Kumar", 65);
	     Honda hondaBike = new Honda("Honda Activa", "TS09CD5678", "Anjali Sharma", 70);
	        System.out.println(heroBike.getModelName());
	        System.out.println( heroBike.getRegistrationNumber());
	        System.out.println(heroBike.getOwnerName());
	        System.out.println( heroBike.getSpeed());
	        heroBike.radio();
	        System.out.println(hondaBike.getModelName());
	        System.out.println( hondaBike.getRegistrationNumber());
	        System.out.println(hondaBike.getOwnerName());
	        System.out.println( hondaBike.getSpeed());
	        hondaBike.cdplayer();
	}

}
