package de.bartels.fom.flugzeuge;

public class Flug {
	
	private Flugbelegung flugbelegung;
	
	public Flug(final int anzSB) {
		this.flugbelegung = new Flugbelegung(anzSB, this);
	}
	
	public Flugbelegung getFlugbelegung() {
		return flugbelegung;
	}
}
