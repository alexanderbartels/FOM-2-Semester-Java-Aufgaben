package de.bartels.fom.kreis;

public class Kreis {

	private double radius;
	private double umfang;
	private double flaeche;

	public Kreis(double radius) {
		this.radius = radius;

		this.flaeche = Math.PI * radius * radius;
		this.umfang = Math.PI * radius * 2;
	}

	public double getUmfang() {
		return umfang;
	}

	public double getFlaeche() {
		return flaeche;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("Radius: ").append(radius)
				.append(", Umfang: ").append(umfang).append(", Flaeche: ")
				.append(flaeche).toString();
	}
}
