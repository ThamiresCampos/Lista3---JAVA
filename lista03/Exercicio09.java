package lista03;
import java.util.Scanner;

public class Exercicio09 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).");
		System.out.println();
		
		System.out.println("Dígite o valor do seu salário mensal : ");
		float salarioM = sc.nextFloat();
		System.out.println();
		
		System.out.println("Dígite o valor do seu reajuste : ");
		float reajuste = sc.nextFloat();
		System.out.println();

		float percentualR = salarioM * 5 / 100;
		float salarioN = salarioM + percentualR;
		
		System.out.println("O seu novo salário ficará em : " + "R$" + salarioN);
		sc.close();
	}
}
