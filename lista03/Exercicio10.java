package lista03;
import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantidade de votos v�lidos do candidato A :");
		int votoA = sc.nextInt();
		System.out.println();
		
		System.out.println("Quantidade de votos v�lidos do candidato B :");
		int votoB = sc.nextInt();
		System.out.println();
		
		System.out.println("Quantidade de votos v�lidos do candidato C :");
		int votoC = sc.nextInt();
		System.out.println();
		
		System.out.println("Quantidade de votos brancos :");
		int votosBrancos = sc.nextInt();
		System.out.println();
		
		System.out.println("Quantidade de votos nulos :");
		int votosNulos = sc.nextInt();
		System.out.println();
		
		int eleitores = votoA + votoB + votoC + votosBrancos + votosNulos;
		
		
		float porcentagemA = 100 * votoA / eleitores; 
		System.out.println("A porcentagem de votos v�lidos do candidato A � : "+porcentagemA);
		
		float porcentagemB = 100 * votoB / eleitores; 
		System.out.println("A porcentagem de votos v�lidos do candidato B � : "+porcentagemB);
		
		float porcentagemC = 100 * votoC / eleitores; 
		System.out.println("A porcentagem de votos v�lidos do candidato C � : "+porcentagemC);
		
		float porcentagemNulos = 100 * votosNulos / eleitores; 
		System.out.println("A porcentagem de votos nulos � : "+porcentagemNulos);
		
		float porcentagemBrancos = 100 * votosBrancos / eleitores; 
		System.out.println("A porcentagem de votos v�lidos � : "+porcentagemBrancos);
		
		
		
	}
	

}
