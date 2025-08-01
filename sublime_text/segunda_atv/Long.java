public class Long {
	public static void main (String[] args) {
		int a = 10;
		long b = 15L;
		long c = a + b; // é promovido para Long

		System.out.println("Valor de c = " + c); 
	}
}