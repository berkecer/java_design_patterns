/**
 * @author Berk Ecer - FACTORY DESIGN PATTERN
 *
 */
public class Human extends Animal{
	private String body;
	private String soul;
	
	public Human(String body, String soul) {
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
