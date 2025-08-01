public class PrecedenciaOperadoresAtribuicao {
	public static void main (String [] args) {

		int numero = 5;
		numero++;

		int b = ++numero;
		int c = numero++;

		int d = --numero;
		int e = numero--;

		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}