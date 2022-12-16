package lista03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.");
		System.out.println();
		
		System.out.println("Insira um valor: ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira mais um valor: ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		int diferenca = valor1 - valor2;
		
		float quadrado = (float) (Math.pow(diferenca,2));
		
		System.out.println("O quadrado da diferença é: "+ quadrado);
		sc.close();
	
	}
}
