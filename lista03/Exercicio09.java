package lista03;
import java.util.Scanner;

public class Exercicio09 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador e tamb�m o valor do percentual de reajuste (vari�vel PR) a ser atribu�do. Apresentar o valor do novo sal�rio (vari�vel NS).");
		System.out.println();
		
		System.out.println("D�gite o valor do seu sal�rio mensal : ");
		float salarioM = sc.nextFloat();
		System.out.println();
		
		System.out.println("D�gite o valor do seu reajuste : ");
		float reajuste = sc.nextFloat();
		System.out.println();

		float percentualR = salarioM * 5 / 100;
		float salarioN = salarioM + percentualR;
		
		System.out.println("O seu novo sal�rio ficar� em : " + "R$" + salarioN);
		sc.close();
	}
}
