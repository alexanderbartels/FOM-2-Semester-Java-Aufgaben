import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.bartels.fom.flugzeuge.Flugbelegung;
import de.bartels.fom.flugzeuge.Passagier;
import de.bartels.fom.flugzeuge.Sitzplatzbelegung;


public class SitzplatzbelegungsTest {

	private Sitzplatzbelegung sitzplatzbelegung;
	
	@Before
	public void before() {
		sitzplatzbelegung = new Sitzplatzbelegung(1, null);
	}
	
	@Test
	public void test() {
		assertTrue(sitzplatzbelegung.istLeer());
		
		sitzplatzbelegung.setPassagier(new Passagier("Hans-Peter"));
		assertFalse(sitzplatzbelegung.istLeer());
	}

}
