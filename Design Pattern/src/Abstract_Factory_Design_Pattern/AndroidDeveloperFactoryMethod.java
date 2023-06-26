package Abstract_Factory_Design_Pattern;

public class AndroidDeveloperFactoryMethod extends AbstractFactoryMethod {

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
