package de.bartels.fom.person;

public class Start {

	
	public static void main(final String[] args) {
		Person alex = new Person();
		alex.setGeburtsdatum(07, 07, 1987);
		alex.setVorname("Alex");
		alex.setNachname("B.");
		System.out.println("Ich: " + alex);
		
		Person klaus = new Person();
		klaus.setGeburtsdatum("07.07.1987");
		klaus.setVorname("Klaus");
		klaus.setNachname("Bärbel");
		System.out.println("Du: " + klaus);
	}
}
