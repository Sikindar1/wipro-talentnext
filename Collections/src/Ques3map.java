import java.util.*;
public class Ques3map {

	public static void main(String[] args) {
		
		Properties stateCapitals = new Properties();

        stateCapitals.setProperty("Andhra Pradesh", "Amaravati");
        stateCapitals.setProperty("Karnataka", "Bengaluru");
        stateCapitals.setProperty("Tamil Nadu", "Chennai");
        stateCapitals.setProperty("Maharashtra", "Mumbai");
        stateCapitals.setProperty("West Bengal", "Kolkata");

        Set<Object> keys = stateCapitals.keySet();
        Iterator<Object> iterator = keys.iterator();

        while (iterator.hasNext()) {
            Object state = iterator.next();
            String capital = stateCapitals.getProperty((String) state);
            System.out.println(state + " - " + capital);
        }

	}

}