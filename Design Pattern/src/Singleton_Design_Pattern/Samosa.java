package Singleton_Design_Pattern;

public class Samosa {
	
	private static Samosa object=null;
	
	private Samosa() {
		
	}
	
	public static Samosa getObject() {
		
		if(object==null) {
			synchronized (Samosa.class) {
				if(object==null) {
					object=new Samosa();
				}
			}
		}
		
		
		return object;
	}

}
