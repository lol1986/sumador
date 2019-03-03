package sumadorLOL;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar("5");
		String resultado = sumi.mostrar();
		assertEquals("5 = 5",resultado );
		}

}
