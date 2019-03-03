package sumadorLOL;
/**
 * Asumar es una clase creada para sumar los dígitos de un número entero
 * Está formada por un entero, y tiene los métodos para dividir este entero 
 * en dígitos y realizar la suma de los mismos. 
 * @author Laura Ortiz Luque
 * @version 1.0
 *
 */
public class ASumar {

	private String valor_inicial;
	
	/**
	 * ASumar es el constructor de la clase. 
	 * @param valor_inicial es el número entero del que queremos sumar los dígitos
	 * 
	 */
	public ASumar(String valor_inicial) {
		this.valor_inicial=valor_inicial;
	}

	/**
	 * mostrar imprime el resultado de la suma
	 * 
	 * @return	la capacidad (en litros) del depÃ³sito
	 * */
	public String mostrar() {
		int i=0;
		String resultado="";
		int suma=0;
		char[] digitos=this.valor_inicial.toCharArray();
		if(digitos[0]=='-') {
			resultado="";
		}
		else {
			for (i=0;i<this.valor_inicial.length();i++) {
				if (i>0) {
					resultado= resultado +" + ";
				}
				suma=suma+Character.getNumericValue(digitos[i]);
				resultado= resultado+digitos[i];	
			}
			resultado = resultado +" = "+suma;
		}
		return resultado;
	}
}
