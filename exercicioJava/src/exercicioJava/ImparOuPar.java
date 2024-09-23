package exercicioJava;

public class ImparOuPar {
	public static void main(String [] args) {
		// + - / * %
		int numero = 15024444;
		if ( (numero % 2) == 0) {
			System.out.println("O resto da divisão é PAR: "+(numero %2));
		} else {
			System.out.println("O resto da divisão é IMPAR: "+ (numero % 2));
		}
	
	}
}
