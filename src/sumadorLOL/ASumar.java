package sumadorLOL;
/**
 * Asumar es una clase creada para sumar los d�gitos de un n�mero entero
 * Est� formada por un entero, y tiene los m�todos para dividir este entero 
 * en d�gitos y realizar la suma de los mismos. 
 * @author Laura Ortiz Luque
 * @version 1.0
 *
 */
public class ASumar {

	private String valor_inicial;
	
	/**
	 * ASumar es el constructor de la clase. 
	 * @param valor_inicial es el n�mero entero del que queremos sumar los d�gitos
	 * 
	 */
	public ASumar(String valor_inicial) {
		this.valor_inicial=valor_inicial;
	}

	/**
	 * mostrar imprime el resultado de la suma
	 * 
	 * @return	la capacidad (en litros) del depósito
	 * */
	public String mostrar() {
		int i=0;
		String resultado="";
		int total=0;
		char[] numeros=this.valor_inicial.toCharArray();
		if(numeros[0]=='-') {
			resultado="";
		}
		else {
			for (i=0;i<this.valor_inicial.length();i++) {
				if (i>0) {
					resultado= resultado +" + ";
				}
				total=total+Character.getNumericValue(numeros[i]);
				resultado= resultado+numeros[i];	
			}
			resultado = resultado +" = "+total;
		}
		return resultado;
	}
}
