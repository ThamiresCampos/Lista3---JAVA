package lista03;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Exercicio02 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que calcule e apresente o volume de uma caixa retangular.");
		System.out.println();
		
		System.out.println("D�gite o comprimento da caixa: ");
		int comprimento = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite a altura da caixa: ");
		int altura = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite a largura da caixa: ");
		int largura = sc.nextInt();
		System.out.println();
		
		int volume = comprimento * altura * largura;
		
		System.out.println("O volume da caixa �: ");
		System.out.println(volume);
	}

}
