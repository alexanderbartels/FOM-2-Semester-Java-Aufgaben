package de.bartels.fom.flugzeuge;

import java.util.ArrayList;
import java.util.List;

public class Flugbelegung {
	
	private List<Sitzplatzbelegung> sitzplatzbelegungen;
	private final Flug flug;
	
	public Flugbelegung(final int anzSB, final Flug flug) {
		this.flug = flug;
		this.sitzplatzbelegungen = machVoll(new ArrayList<>(anzSB), anzSB);
	}
	
	private List<Sitzplatzbelegung> machVoll(final List<Sitzplatzbelegung> sb, int count) {
		if (count <= 0) {
			return sb;
		}
		sb.add(new Sitzplatzbelegung(sb.size(), flug));
		return machVoll(sb, --count);
		
	}
	
	public boolean addPassagier(final Passagier passagier) {
		for (Sitzplatzbelegung sb : sitzplatzbelegungen) {
			if (sb.istLeer()) {
				sb.setPassagier(passagier);
				return true;
			}
		}
		return false;
	}
	
	public int leereSitzplaetze() {
		int count = 0;
		for (Sitzplatzbelegung sb : sitzplatzbelegungen) {
			count = sb.istLeer() ? count + 1 : count;
		}
		return count;
	}
}
