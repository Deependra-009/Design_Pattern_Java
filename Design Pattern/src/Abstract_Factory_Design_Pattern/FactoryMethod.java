package Abstract_Factory_Design_Pattern;

public class FactoryMethod {

	
	public static Employee getEmployee(AbstractFactoryMethod method) {
		// TODO Auto-generated method stub
		return method.createEmployee();
	}

}
