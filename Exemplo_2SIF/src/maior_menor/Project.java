package maior_menor;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetor[] = new int[5];
		lerDados(vetor);
		int numMaior = maiorValor(vetor);
		int numMenor = menorValor(vetor);
		
		System.out.println("                        ");
		System.out.println(" ------------- RESULTADO ------------- ");
		System.out.println("Maior número: "+numMaior);
		System.out.println("Menor número: "+numMenor);
	
	}
	
	public static void lerDados(int[] vetor) {
		Scanner entrada = new Scanner(System.in); 
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = entrada.nextInt();
		}
		
		entrada.close();
	}
	
	public static int maiorValor(int[] vetor) {
		int num = vetor[0];
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] > num) {
				num = vetor[i];
			}
		}
		
		return num;
	}
	
	
	public static int menorValor(int[] vetor) {
		int num = vetor[0];
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] < num) {
				num = vetor[i];
			}
		}
		
		return num;
	}
	
}