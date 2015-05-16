package de.bartels.fom.app;

public class Mitarbeiter extends Person {
	
	private int personalNr;
	
	public Mitarbeiter(final String name, final int personalNr) {
		super(name);
		this.personalNr = personalNr;
	}
	
	public int getPersonalNr() {
		return personalNr;
	}
}
