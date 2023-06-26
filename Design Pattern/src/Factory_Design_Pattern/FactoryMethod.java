package Factory_Design_Pattern;

public class FactoryMethod {
	
	public static Employee createObject(String name) {
		if(name.trim().toUpperCase().equals("ANDROID DEVELOPER")) {
			return new AndroidDeveloper();
		}
		else if(name.trim().toUpperCase().equals("WEB DEVELOPER")) {
			return new WebDeveloper();
		} 
		else return null;
	}
}
