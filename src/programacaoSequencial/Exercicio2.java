package programacaoSequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade, anos, meses, dias;
		
		System.out.println("digite sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = idade / 365;
		meses = (idade % 365) / 30;		
		dias = (idade % 365) % 30;
		
		System.out.printf("Anos: %d, Meses: %d, Dias: %d", anos, meses, dias);
		leia.close();
	}
	
}
