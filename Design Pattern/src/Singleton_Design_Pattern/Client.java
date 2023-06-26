package Singleton_Design_Pattern;

import Factory_Design_Pattern.Employee;
import Factory_Design_Pattern.FactoryMethod;

public class Client {

	public static void main(String args[]) {

		// Lazy Singleton Design Pattern

		Samosa s1 = Samosa.getObject();
		System.out.println(s1.hashCode());

		Samosa s2 = Samosa.getObject();
		System.out.println(s2.hashCode());

		System.out.println("--------------");
		//	Eager Singleton Design Pattern

		Jalebi j1 = Jalebi.getObject();
		System.out.println(j1.hashCode());

		Jalebi j2 = Jalebi.getObject();
		System.out.println(j2.hashCode());

	}


}
