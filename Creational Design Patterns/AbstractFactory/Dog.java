/**
 * @author Berk Ecer - ABSTRACT FACTORY DESIGN PATTERN
 *
 */
public class Dog extends Animal{
	private String body;
	private String soul;
	
	public Dog(String body, String soul) {
		this.body = body;
		this.soul = soul;
	}

	@Override
	public String getBody() {
		return this.body;
	}

	@Override
	public String getSoul() {
		return this.soul;
	}
	
	
}
