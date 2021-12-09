package Lacoscondicionais;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, numero3, numerof = 0;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextDouble();
				
		System.out.println("Digite o segundo numero: ");
		numero3 = ler.nextDouble();
				
		if (numero1 > numerof) {
		numerof = numero1;
		}
		
		if (numero2 > numerof) {
			numerof = numero2;		
		}
		if (numero3 > numerof) {
			numero3 = numerof;
				
		}
		System.out.println(" O mair numero é: " + numerof);
		
		
		

		
}
}
