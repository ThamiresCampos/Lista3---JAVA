package lista03;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (vari�veis A, B, C e D). Ao final o programa deve apresentar o resultado do produto (vari�vel P) do primeiro com o terceiro valor, e o resultado do produto (vari�vel P) do segundo com o terceiro valor, e o resultado da soma (vari�vel S) do segundo com o quarto valor.");
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
		
		System.out.println("Insira o �ltimo valor : ");
		int valor4 = sc.nextInt();
		System.out.println();
		
		int produto1 = valor1 * valor3;
		int produto2 = valor2 * valor3;
		int soma = valor2 + valor4;
		
		System.out.println("O resultado do produto do primeiro e terceiro valor � : " + produto1);
		System.out.println();
		System.out.println("O resultado do produto do segundo e terceiro valor � : " + produto2);
		System.out.println();
		System.out.println("O resultado da soma do segundo e quarto valor � : " + soma);
		sc.close();
	}
}
