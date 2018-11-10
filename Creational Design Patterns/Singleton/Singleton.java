/* BERK ECER - SINGLETON DESIGN PATTERN */

public class Singleton {
	private static Singleton instance;
	
	private Singleton(){}
	
	public static Singleton getInstance() {  // getInstance method checks the static instance if was created before returns it 
		if(instance == null) {				 // or if it is not create new one.
			instance = new Singleton();
		}
		return instance;
	}
}


/*
 
  Example Thread Safe Singleton
  
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
}

*/

