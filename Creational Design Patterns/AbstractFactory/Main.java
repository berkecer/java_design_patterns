/**
 * @author Berk Ecer - ABSTRACT FACTORY DESIGN PATTERN
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// Abstract factory will delegate the jobs by looking their factories.
		Animal humanoid = AnimalFactory.getAnimal(new HumanFactory("Model MK23", "Artificial Intelligence"));
		Animal cutedog = AnimalFactory.getAnimal(new DogFactory("Cute Model MC3", "Life long friend"));
		System.out.println("AbstractFactory Human Properties => " + humanoid);
		System.out.println("AbstractFactory Dog Properties => " + cutedog);
	}
}
