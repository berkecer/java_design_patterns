/**
 * @author Berk Ecer - ABSTRACT FACTORY DESIGN PATTERN
 *
 */

// This is our abstract factory which client calls the factory methods which implements this abstract class
public interface AnimalAbstractFactory { 
	
	// Method that sub factory classes need to implement
	public Animal createAnimal();
}

