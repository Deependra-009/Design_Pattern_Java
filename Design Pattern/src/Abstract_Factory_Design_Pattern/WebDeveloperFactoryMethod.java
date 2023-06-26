package Abstract_Factory_Design_Pattern;

public class WebDeveloperFactoryMethod extends AbstractFactoryMethod {

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}

}
