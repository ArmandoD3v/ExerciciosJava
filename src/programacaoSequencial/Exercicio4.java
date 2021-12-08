package programacaoSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a, b, c, r, s, d;
		
		System.out.println("Digite três numeros inteiros positivos: ");
		System.out.println("Valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Valor de C: ");
		c = leia.nextInt();
		
		r = Math.pow((a +b), 2.0);
		s = Math.pow((b+ c), 2.0);
		
		d = (r + s) / 2;
		
		System.out.println("O valor de D é: " + d); 
		leia.close();
	}
}
