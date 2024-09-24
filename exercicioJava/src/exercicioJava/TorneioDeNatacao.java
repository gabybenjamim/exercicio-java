package exercicioJava;

public class TorneioDeNatacao {
	public static void main(String [] args) {
		String nome = "João";
		int idade = 19;
		if (idade <= 10) {
			System.out.println(nome + " participará da categoria Infantil");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println(nome + " participará da categiria Juvenil");
		} else if (idade >= 16 && idade <= 19) {
			System.out.println(nome + " participará da categoria Pré-adulto");
		} else {
			System.out.println(nome + " participará da categoria Adulto");
		}
	}
}
