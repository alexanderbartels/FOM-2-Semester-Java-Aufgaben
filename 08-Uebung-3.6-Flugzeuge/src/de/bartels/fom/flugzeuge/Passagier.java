package de.bartels.fom.flugzeuge;

public class Passagier {

	private final String name;
	
	public Passagier(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
}
