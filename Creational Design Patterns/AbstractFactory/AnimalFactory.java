/**
 * @author Berk Ecer - ABSTRACT FACTORY DESIGN PATTERN
 *
 */
public class AnimalFactory {
	// Create a consumer class that will provide the entry point for the client classes to create sub-classes.
	public static Animal getAnimal(AnimalAbstractFactory factory) {
		return factory.createAnimal();
	}
}
