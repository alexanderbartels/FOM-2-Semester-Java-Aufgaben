package de.fom.bartels.ggt;

import javax.swing.JOptionPane;

public class GGT {

	public static void main(String[] args) {
		int x, y;
		
		// x einlesen 
		String xAsString = JOptionPane.showInputDialog("x: ");
		x = Integer.parseInt(xAsString);
		
		// x einlesen 
		String yAsString = JOptionPane.showInputDialog("x: ");
		y = Integer.parseInt(yAsString);
		
		int ggt = berechneGGT(x, y);
		JOptionPane.showMessageDialog(null, "GGT ist: " + ggt);
		System.exit(0);
	}
	
	private static int berechneGGT(int x, int y) {		
		if (x == y) {
			return x;
		}
		
		if (x > y) {
			x = x - y;
		} else {
			y = y - x;
		}
		return berechneGGT(x, y);
	}
}
