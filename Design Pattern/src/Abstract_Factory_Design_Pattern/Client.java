package Abstract_Factory_Design_Pattern;

public class Client {
	
	public static void main(String args[]) {
		
		Employee e1=FactoryMethod.getEmployee(new WebDeveloperFactoryMethod());
		System.out.println(e1.name()+" "+e1.salary());
		
		
		Employee e2=FactoryMethod.getEmployee(new AndroidDeveloperFactoryMethod());
		System.out.println(e2.name()+" "+e2.salary());
		
		
	}

}
