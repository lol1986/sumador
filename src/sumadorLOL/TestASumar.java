package sumadorLOL;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * ASumar es el constructor de la clase. 
 * @param valor_inicial es el número entero del que queremos sumar los dígitos
 * 
 */
public class TestASumar {

	/**
	 * mostrar imprime el resultado de la suma
	 * 
	 * @return	la capacidad (en litros) del depÃ³sito
	 * */
	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar("5");
		String resultado = sumi.mostrar();
		assertEquals("5 = 5",resultado );
	}

	/**
	 * Método de prueba para cifra negativa
	 */
	@Test
	public void testCifraNegativa() {
		ASumar sumi = new ASumar("-3433");
		String resultado = sumi.mostrar();
		assertEquals("",resultado );
	}
	
	/**
	 * Método de prueba para varias cifras
	 */
    @Test
    public void testVariasCifras() {
        ASumar sumi = new ASumar("3433");
        String resultado = sumi.mostrar();
        assertEquals("3 + 4 + 3 + 3 = 13",resultado );
    }
}
