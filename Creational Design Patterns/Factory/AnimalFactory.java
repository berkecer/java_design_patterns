/**
 * @author Berk Ecer - FACTORY DESIGN PATTERN
 *
 */

public class AnimalFactory {
	
	public static Animal getAnimal(String kind, String body, String soul) { 
		if ("human".equalsIgnoreCase(kind)) {		//Notice that based on the input parameter, different subclass is created and returned
			return new Human(body, soul);
		} else if ("dog".equalsIgnoreCase(kind)) {  // Our factory decides which sub class object to create.
			return new Dog(body, soul);
		}
		return null;
	}
}

