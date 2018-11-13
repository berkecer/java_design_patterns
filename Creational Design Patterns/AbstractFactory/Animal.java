/**
 * @author Berk Ecer - ABSTRACT FACTORY DESIGN PATTERN
 *
 */

public abstract class Animal {				// This is our super class 
	public abstract String getBody();		// Forces sub classes to override two methods getBody and getSoul
	public abstract String getSoul();
	
	@Override
	public String toString() {				// String override for all classes who has inheritance with animal abstract class
		return "My body: " + this.getBody() + " " + "My Soul: " + this.getSoul();
	}
}
