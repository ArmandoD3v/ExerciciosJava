 package Lacoscondicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int idade;

		System.out.println("Insira sua idade: ");

		idade = in.nextInt();

		if (idade < 10) {
			System.out.println("\nIdade menor que 5! Não há categoria.");
		} else if (idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria: Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria: Juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("\nCategoria: Adulto");
		}
		
		in.close();
	}
	
}
