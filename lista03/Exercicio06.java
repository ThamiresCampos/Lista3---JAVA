package lista03;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado à soma dos quadrados dos três valores lidos.");
		System.out.println();
		
		System.out.println("Insira um valor : ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira outro valor : ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira mais um valor : ");
		int valor3 = sc.nextInt();
		System.out.println();
		
		float quadrado1 = (float) (Math.pow(valor1,2));
		float quadrado2 = (float) (Math.pow(valor2,2));
		float quadrado3 = (float) (Math.pow(valor3,2));
		
		float soma = quadrado1 + quadrado2 + quadrado3;
		
		System.out.printf("O resultado da soma dos valores lidos é : " + "%.0f" , soma);
		
		
	}

}
