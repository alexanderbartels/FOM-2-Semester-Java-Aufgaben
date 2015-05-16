package de.bartels.fom.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
	
	private String nachname;
	private String vorname;
	private long geburtsdatum;

	public void setGeburtsdatum(String geburtsdatum) {
		try {
			this.geburtsdatum = DATE_FORMAT.parse(geburtsdatum).getTime();
		} catch (ParseException e) {
			throw new IllegalArgumentException(
					"Datum im format dd.MM.yyyy wird erwartet", e);
		}
	}
	
	public void setGeburtsdatum(int tag, int monat, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, tag);
		calendar.set(Calendar.MONTH, --monat);
		calendar.set(Calendar.YEAR, year);
		
		this.geburtsdatum = calendar.getTime().getTime();
	}
	
	
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public long getGeburtsdatum() {
		return geburtsdatum;
	}

	public String getNachname() {
		return nachname;
	}

	public String getVorname() {
		return vorname;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(vorname).append(" ").append(nachname)
				.append(", geboren am ")
				.append(DATE_FORMAT.format(new Date(geburtsdatum))).toString();
	}
}
