package VetoreseMatrizes;

import java.util.Scanner;

// 1 Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[5];
		int maiorNum = 0;
		
		for (int i = 0; i < numeros.length; i++){ 
			System.out.println("Digite um numero: ");
		numeros[i] = entrada.nextInt();
		
		if (numeros [i] > maiorNum) {
			maiorNum = numeros [i];		
		}
		
		}
		System.out.println("O maior valor apresentado �: " + maiorNum);
		entrada.close();
	}
}
