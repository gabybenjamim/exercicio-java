package estruturascondicionais;
/*
 Dado um determinado salario 
 se o salario for maior que 4500 imprima 30% do valor
 senão imprima 15% do valor
 Utilize apenas uma variavel para guardar o resultado e imprimir no final
 Fale na impressão se é 30% ou 10%
 */

public class ImpostoCondicional {
	public static void main(String [] args) {
		float salario = 900.00F;
		float resultado = 0F;
		String porcentagem = "";
		if(salario > 4500) {
			resultado = salario * 0.3F;
			porcentagem = "30% do salario ";
		} else {
			resultado = salario * 0.10F;
			porcentagem = "10% do salario ";
		}
		System.out.println("o valor final convertido em porcentagem de "+porcentagem+"é de "+resultado);
		
	}

}
