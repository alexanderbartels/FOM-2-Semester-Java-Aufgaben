package de.bartels.fom.app;

public class Angestellter extends Mitarbeiter {
	private long salary;
	
	public Angestellter(Mitarbeiter m, final long salary) {
		super(m.getName(), m.getPersonalNr());
		this.salary = salary;
	}
	
	public long getSalary() {
		return salary;
	}
}
