/**
 * @author Berk Ecer - ABSTRACT FACTORY DESIGN PATTERN
 *
 */


public class HumanFactory implements AnimalAbstractFactory {
	private String body;
	private String soul;

	public HumanFactory(String body, String soul) {
		this.body = body;
		this.soul = soul;
	}

	@Override
	public Animal createAnimal() {  // Must be over-ride, it comes from abstract factory
		return new Human(body, soul);
	}

}
