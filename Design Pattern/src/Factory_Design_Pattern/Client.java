package Factory_Design_Pattern;

public class Client {
	public static void main(String args[]) {

		Employee e = FactoryMethod.createObject("android developer");
		System.out.println(e.name() + " : " + e.salary());

		Employee e1 = FactoryMethod.createObject("web developer");
		System.out.println(e1.name() + " : " + e1.salary());

	}
}
