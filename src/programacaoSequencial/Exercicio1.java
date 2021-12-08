package programacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos, mes, dia;
		int idadeEmDias;
		
		System.out.println("Digite sua idade em anos anos: ");
		anos = leia.nextInt();

		System.out.println("Digite o mes que você nasceu: ");
		mes = leia.nextInt();
		
		System.out.println("Digite o dia que você nasceu: ");
		dia = leia.nextInt();
		

		idadeEmDias = anos * 365 + mes * 30 + dia;
				
				System.out.println("Sua idade em dias é: " + idadeEmDias);
				leia.close();
	}

}
