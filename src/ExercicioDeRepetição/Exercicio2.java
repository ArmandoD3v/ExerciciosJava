package ExercicioDeRepetição;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		double par = 0, impar = 0, numeros;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int A = 1; A <= 10; A++) {
			System.out.println("Quais os valores? ");
			numeros = scanner.nextDouble();
			
			if (numeros %2 == 0) {
				par++;
				
		}
			else {
				impar++;
			}
			
		}
		
		System.out.println("O total de numeros pares são: " + par);
		System.out.println("O total de numeros impares são: " + impar);
		
		scanner.close();
	}

}