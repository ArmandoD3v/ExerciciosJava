package VetoreseMatrizes;

import java.util.Scanner;

public class Exercicio4 {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] dado = new int[10];
		int soma = 0, maior = 0, media = 0, cont = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			dado[i] = input.nextInt();
			soma = soma + dado[i];
			media = soma / 10;
			if(dado[i] > maior) {
				maior = dado[i];
			}
		}
		
		for(int i = 0; i < dado.length; i++) {
			if(dado[i] == maior) {
				cont++;
			}
		}
		
		System.out.print("Os valores lidos foram ");
		for(int i = 0; i < 10; i++) {
			if(i == 9) {
				System.out.print(dado[i] + ".");
			}
			else {
				System.out.print(dado[i] + ", ");
			}
		}
		
		
		System.out.println("\nA média dos valores lidos é " + media);
		if(cont == 1) {
			System.out.println(maior + " foi o maior número lido e apareceu " + cont + " vez.");
		}
		else {
			System.out.println(maior + " foi o maior número lido e apareceu " + cont + " vezes.");			
		}
		
		input.close();
	}

}