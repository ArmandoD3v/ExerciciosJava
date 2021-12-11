package ExercicioDeRepetição;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int idade, sexo, opcoes, cont=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;
		
		while(cont!=1) {
			System.out.println("escreva sua idade: ");
			idade=entrada.nextInt();
			
			System.out.println("escolha para seu sexo: \n 1:feminino \n 2:masculino \n 3:outros ");
			System.out.println("");
			sexo=entrada.nextInt();
			
			System.out.println("escolha para sua caracteristica psicologica: \n 1:calma \n 2:nervosa \n 3:agressiva ");
			System.out.println("");
			opcoes=entrada.nextInt();
			
			if(opcoes==1) {
				cont2++;
			}
			if(sexo==1 && opcoes==2){
				cont3++;
			}
			if(sexo==2 && opcoes==3) {
				cont4++;
			}
			if(sexo==3 && opcoes==1) {
				cont5++;
			}
			if(idade>40 && opcoes==2) {
				cont6++;
			}
			if(idade<18 && opcoes==1) {
				cont7++;
			}
			cont++;
		}
		System.out.println("numero de pessoas calmas: "+cont2+""
				+ "\n numero de mulheres nervosas: "+cont3
				+"\n numero de homens agressivos: "+cont4
				+"\n numero de outros calmos: "+cont5
				+"\n numero de pessoas nervosas com mais de 40 anos: "+cont6
				+"\nnumero de pessoas calmas com menos de 18 anos: "+cont7);
		entrada.close();
	}

}