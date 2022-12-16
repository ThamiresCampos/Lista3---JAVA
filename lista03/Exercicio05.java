package lista03;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar. ");
		System.out.println();
		
		System.out.println("Insira a cotação do dólar de hoje : ");
		float cotacao = sc.nextFloat();
		System.out.println();
		
		System.out.println("Dígite a quantidade de dolares que você possui : ");
		float quantidade = sc.nextFloat();
		System.out.println();
		
		float conversao = cotacao / quantidade;
		System.out.printf("A conversão ficará em  : " + "R$ %.2f" , conversao);
		
	
		
	}
	
}
