package lista03;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado o quadrado da soma dos tr�s valores lidos.");
		System.out.println();
		
		System.out.println("D�gite um valor : ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite outro valor : ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite mais um valor : ");
		int valor3 = sc.nextInt();
		System.out.println();
		
		int soma = valor1 + valor2 + valor3;
		
		float quadrado = (float) (Math.pow(soma,2));
		
		System.out.printf("O resultado da soma elevado ao quadrado � : " + "%.0f" , quadrado);
		sc.close();
		
	}
}
