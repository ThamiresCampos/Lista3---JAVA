package lista03;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real. ");
		System.out.println();
		
		System.out.print("Insira qual é a cotação do dólar de hoje: ");
		float cotacao = sc.nextFloat();
		System.out.println();
		
		System.out.println("Insira a quantidade de reais que você possui : ");
		float quantidade = sc.nextFloat();
		System.out.println();
		
		 float conversao = (float) cotacao * quantidade;
		System.out.printf("A conversão fica em : " + "R$ %.2f" , conversao);
		sc.close();
		
	}	
}
