
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Singleton s1 = Singleton.getInstance();
		@SuppressWarnings("unused")
		Singleton s2 = Singleton.getInstance();  
		
		
		// We called getInstance two times
		// But program created it once (Hint: Output "Creating New Instance" x 1 NOT x 2)
	}

}
