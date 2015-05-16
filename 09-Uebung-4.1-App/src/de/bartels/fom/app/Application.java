package de.bartels.fom.app;

public class Application {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Person person = new Person("Xander");
		person.printInfo();
		
		Mitarbeiter alex = new Mitarbeiter("Alex", 123456);
		alex.printInfo();
		
		Angestellter angestellterAlex = new Angestellter(alex, Long.MAX_VALUE);
		angestellterAlex.printInfo();
	}
}
