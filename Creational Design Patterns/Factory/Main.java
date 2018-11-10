/**
 * @author Berk Ecer - FACTORY DESIGN PATTERN
 *
 */
public class Main {

	public static void main(String[] args) {
		Animal humanoid = AnimalFactory.getAnimal("human", "Model MK23", "Artificial Intelligence");
		Animal cutedog = AnimalFactory.getAnimal("dog", "Cute Model MC3", "Life long friend");

		
		System.out.println("(FACTORY) Human Model: " + humanoid.toString());
		
		System.out.println("(FACTORY) Dog Model: " + cutedog.toString());
		
	}

}
