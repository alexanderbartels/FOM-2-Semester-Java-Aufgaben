package de.bartels.fom.flugzeuge;

public class Sitzplatzbelegung {
	
	private final long id;
	private final Flug flug;
	private Passagier passagier;
	
	public Sitzplatzbelegung(final long id, final Flug flug) {
		this.id = id;
		this.flug = flug;
	}
	
	public boolean istLeer() {
		return passagier == null;
	}
	
	public Flug getFlug() {
		return flug;
	}
	
	public void setPassagier(Passagier passagier) {
		this.passagier = passagier;
	}
	
	public Passagier getPassagier() {
		return passagier;
	}
	
	public long getId() {
		return id;
	}
}
