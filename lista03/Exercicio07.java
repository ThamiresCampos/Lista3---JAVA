package lista03;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado o quadrado da soma dos três valores lidos.");
		System.out.println();
		
		System.out.println("Dígite um valor : ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite outro valor : ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite mais um valor : ");
		int valor3 = sc.nextInt();
		System.out.println();
		
		int soma = valor1 + valor2 + valor3;
		
		float quadrado = (float) (Math.pow(soma,2));
		
		System.out.printf("O resultado da soma elevado ao quadrado é : " + "%.0f" , quadrado);
		sc.close();
		
	}
}
