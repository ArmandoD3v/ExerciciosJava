package programacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		int tempoTEmSeg, minutos, horas, segundos;
		
		System.out.println("Digite o tempo total em segundos: ");
		tempoTEmSeg = leia.nextInt();
		
		horas = tempoTEmSeg / 3600;
		minutos = (tempoTEmSeg % 3600) / 60;		
		segundos = (tempoTEmSeg % 3600) % 60;
		
		System.out.printf("O tempo total do evento é de %d horas, %d Minutos, %d Segundos", horas, minutos, segundos);
		leia.close();
	
}
	
	
	
}
