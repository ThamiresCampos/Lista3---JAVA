package lista03;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em d�lar. ");
		System.out.println();
		
		System.out.println("Insira a cota��o do d�lar de hoje : ");
		float cotacao = sc.nextFloat();
		System.out.println();
		
		System.out.println("D�gite a quantidade de dolares que voc� possui : ");
		float quantidade = sc.nextFloat();
		System.out.println();
		
		float conversao = cotacao / quantidade;
		System.out.printf("A convers�o ficar� em  : " + "R$ %.2f" , conversao);
		
	
		
	}
	
}
