import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.bartels.fom.flugzeuge.Flugbelegung;
import de.bartels.fom.flugzeuge.Passagier;


public class FlugbelegungTest {
	private static final int ANZAHL_SITZPLAETZE = 10;
	
	private Flugbelegung flugbelegung;
	
	@Before
	public void before() {
		flugbelegung = new Flugbelegung(ANZAHL_SITZPLAETZE, null);
	}
	
	@Test
	public void testEmptyCreation() {
		// noch kein Sitzplatz ist belegt
		assertEquals(ANZAHL_SITZPLAETZE, flugbelegung.leereSitzplaetze());
	}
	
	@Test
	public void testAddPassagier() {
		boolean added = flugbelegung.addPassagier(new Passagier("Erwin"));
		assertTrue(added);
		assertEquals(ANZAHL_SITZPLAETZE - 1, flugbelegung.leereSitzplaetze());
		
		added = flugbelegung.addPassagier(new Passagier("Hans"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Klaus"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Peter"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Kai"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Dieter"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Dante"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Tom"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Robert"));
		assertTrue(added);
		
		added = flugbelegung.addPassagier(new Passagier("Buddy"));
		assertTrue(added);
		assertEquals(0, flugbelegung.leereSitzplaetze());
		
		added = flugbelegung.addPassagier(new Passagier("Buz"));
		assertFalse(added);
		assertEquals(0, flugbelegung.leereSitzplaetze());
	}

}
