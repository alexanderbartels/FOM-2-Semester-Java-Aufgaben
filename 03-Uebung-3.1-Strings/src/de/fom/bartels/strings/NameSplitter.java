package de.fom.bartels.strings;

import javax.swing.JOptionPane;

public class NameSplitter {
	
	public static void main(String[] args) {
		// einlesen des Namens
		String name = JOptionPane.showInputDialog("Vor- und Nachname: ").trim();
		
		// Ausgabe in Großbuchstaben
		System.out.println("NAME: " + name.toUpperCase());
		
		// Namen in Vor- und Nachnamen trennen
		String[] nameArr = name.split(" ");
		if (nameArr.length != 2) {
			throw new IllegalArgumentException("Vor- und Nachname muss eingegeben werden");
		}
		
		String vorname = nameArr[0].trim();
		String nachname = nameArr[1].trim();
		
		// Wie lang ist der Name?
		System.out.println("Länge des Vornamens: " + vorname.length() + " Zeichen");
		System.out.println("Länge des Nachnamens: " + nachname.length() + " Zeichen");
		
		// An welcher Stelle findet sich ein "n" oder ein "x" ?
		findChar(name, 'n', 0);
		findChar(name, 'x', 0);
		
		// Vor- und Nachnamen ausgeben 
		System.out.println("Vorname: " + vorname);
		System.out.println("Nachname: " + nachname);
		
	}
	
	private static void findChar(String str, char searchChar, int fromIndex) {
		int index = str.indexOf(searchChar, fromIndex);
		if (index > -1) {
			index++; // Maschine zählt von 0 und Menschen von 1;
			System.out.println(searchChar + " an Stelle " + index + " gefunden.");
			// Da der index bereits um eins erhöht wurde, 
			// verhindern wir das endlose finden des selben treffers
			findChar(str, searchChar, index);
		}
	}
	
}
