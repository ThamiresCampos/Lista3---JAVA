package lista03;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em real. ");
		System.out.println();
		
		System.out.print("Insira qual � a cota��o do d�lar de hoje: ");
		float cotacao = sc.nextFloat();
		System.out.println();
		
		System.out.println("Insira a quantidade de reais que voc� possui : ");
		float quantidade = sc.nextFloat();
		System.out.println();
		
		 float conversao = (float) cotacao * quantidade;
		System.out.printf("A convers�o fica em : " + "R$ %.2f" , conversao);
		sc.close();
		
	}	
}
