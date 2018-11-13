/**
 * @author Berk Ecer - ABSTRACT FACTORY DESIGN PATTERN
 *
 */
public class DogFactory implements AnimalAbstractFactory{
	private String body;
	private String soul;

	public DogFactory(String body, String soul) {
		this.body = body;
		this.soul = soul;
	}

	@Override
	public Animal createAnimal() { // Must be overrided, it comes from abstract factory
		return new Dog(body, soul);
	}
}
