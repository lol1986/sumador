package sumadorLOL;

public class LOLFunciona {

	public static void main(String[] args) {
		ASumar sumi = new ASumar(args[0]);
		String resultado = sumi.mostrar();
		System.out.println(resultado);
	}
}
