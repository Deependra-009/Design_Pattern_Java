package Singleton_Design_Pattern;

public class Jalebi {
	private static Jalebi object=new Jalebi();
	
	private Jalebi() {
		
	}
	
	public static Jalebi getObject() {
		return object;
	}
	
}
